/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.image.Image;

public class User {

	private String username;
	private String password;
	/**
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * validats the user login info against the user.csv file to see if user exists
	 * @param name
	 * @param password
	 * @return
	 * @throws FileNotFoundException
	 */
	public User validate( String name, String password) throws FileNotFoundException{
		File file = new File("data/users.csv");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] token = line.split(",");
			
			String username = token[0];
			String pass = token[1];
			
			if(username.equals(name) && pass.equals(password)) {
				setUsername(username);
				setPassword(pass);
				User user = new User(username, pass);
				
				scan.close();
				return user;
				
			}
		}

		scan.close();
		return null;
		
	}
	
	/**loads the Crew members from the personnel file unto a starship
	 * 
	 * @return Starshop
	 * @throws FileNotFoundException
	 */
	public Starship loadCrewmember() throws FileNotFoundException {
		
		ArrayList<CrewMember> crew = new ArrayList<>();
		
		File file = new File("data/personnel.csv");
		Scanner scan = new Scanner(file);
		
		Starship starship = new Starship("aa", "bb", "cc");
		String userRegistry = getUseRregistry(this.getUsername());
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] token = line.split(",");
			
			String name = token[0];
			String position = token[1];
			String rank = token[2];
			String registry = token[3];
			String specie = token[4];
			
			if(userRegistry.equalsIgnoreCase(registry)) {
				
			CrewMember crewMember = new CrewMember(name, position, rank, registry, specie);
			crew.add(crewMember);
			}
			
		}
			starship.setCrewMember(crew);
		
		scan.close();
		
		return starship;
	}
	
	/**
	 * This method is used to know the registry where the logged in user belongs to
	 * @param userName
	 * @return String
	 * @throws FileNotFoundException
	 */
	private String getUseRregistry(String userName) throws FileNotFoundException {
		
		File file = new File("data/personnel.csv");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] token = line.split(",");
			String name = token[0];
			String registry = token[3];
			
			
			if(name.toUpperCase().contains(this.getUsername().toUpperCase())) {
				scan.close();
				return registry;
			}
	
		}
	
		
		scan.close();
		
		return "";
	}
	
	/**
	 * loads the images unto a File to be read
	 * @return File[]
	 */
	public File[] loadImages() {
	        File file = new File("data/images");
	        return file.listFiles();
	    }
	
	/**
	 * scans the loaded image and returns user images in the same registry
	 * @param username
	 * @return Image
	 */
	public Image getImage(String username) {
		File[] loadImages = this.loadImages();
		for(File f: loadImages) {
			String fileName = f.getName().replaceAll(".jpg", "");
			fileName = fileName.replaceAll(".jpeg", "");
			if(username.toUpperCase().contains(fileName.toUpperCase() )) {
				return new Image(f.toURI().toString());
			}
		}
		return null;
		
	}
			
}

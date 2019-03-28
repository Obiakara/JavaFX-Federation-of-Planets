/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.model;
import java.util.ArrayList;

public class Fleet {
	
	private String name;
	
	private ArrayList<Starship> starship = new ArrayList<>();

	public Fleet(String name) {
		super();
		this.name = name;
	}
	/**
	 * This is a getter Method for the name variable
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**This is a setter method for the name variable
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * getStarship method gets a the starship Array of a Fleet object
 * @return Array
 */
	public ArrayList<Starship> getStarship() {
		return starship;
	}
/**
 * This method sets the starship array of a Fleet object
 * @param starship
 */
	public void setStarship(ArrayList<Starship> starship) {
		this.starship = starship;
	}
		

}

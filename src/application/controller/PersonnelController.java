/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import application.model.CrewMember;
import application.model.User;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PersonnelController/* implements Initializable*/{
	@FXML private Button logOutButton;
	@FXML private ImageView image1, image2, image3, image4, image5, image6, image7, image8;
	@FXML private Label labelA, labelB, label1A, label1B, label2A, label2B, label3A, label3B, label4A, label4B;
	@FXML private Label  label5A, label5B, label6A, label6B, label7A, label7B, label8A, label8B;
	
	private User user;
	//private Starship starship;
	
	public void setUser(User user) {
		this.user = user;
		
	}
	
	@FXML
	public void onClickLogOutButton(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Login.fxml") );
		
		Parent root = (Parent) loader.load();
		Scene scene2View = new Scene(root);

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(scene2View);
		window.show();
	}

	@FXML private void initialize() {

	    Platform.runLater(() -> {
	    	ArrayList<CrewMember> crewMembers;
			try {
				crewMembers = user.loadCrewmember().getCrewMember();
			
				switch(crewMembers.get(0).getRegistry()){
					
					case "NCC-1941":
						labelB.setText("USS Bozeman " + crewMembers.get(0).getRegistry());
						
					case "NCC-1941-A":
						labelB.setText("USS Bozeman " + crewMembers.get(0).getRegistry());
						
					case "NCC-71805":
						labelB.setText("USS Endeavour " + crewMembers.get(0).getRegistry());
						
					case "NCC-1701-A":
						labelB.setText("USS Enterprise " + crewMembers.get(0).getRegistry());
						
					case "NCC-1701-D":
						labelB.setText("USS Enterprise " + crewMembers.get(0).getRegistry());
						
					case "NCC-1701-E":
						labelB.setText("USS Enterprise " + crewMembers.get(0).getRegistry());
						
					case "NCC-75689":
						labelB.setText("USS Gibraltar " + crewMembers.get(0).getRegistry());
						
					case "NCC-71854":
						labelB.setText("USS Venture " + crewMembers.get(0).getRegistry());
						
					case "NCC-74656":
						labelB.setText("USS Voyager " + crewMembers.get(0).getRegistry());
				}
	
	    	for(int i=0; i<crewMembers.size(); i++) {
			
				String name = crewMembers.get(i).getName().toUpperCase();
				String lastName = user.getUsername().toUpperCase();
				if(name.contains(lastName)) {
					labelA.setText("Welcome, " + crewMembers.get(i).getRank() + " " +
							user.getUsername());
				}
			}

	   
	        	
				for(int i = 0; i < crewMembers.size(); i++) {
					
					switch(crewMembers.get(i).getPosition()) {
					
					case "Commanding Officer":
						label1A.setText("Commanding Officer");		
						label1B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image1.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "First Officer":
						label2A.setText("First Officer");
						label2B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image2.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Communications Officer":
						label3A.setText("Communications Officer");
						label3B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image3.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Chief Engineering Officer":
						label4A.setText("Chief Engineering Officer");
						label4B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image4.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Helmsman":
						label5A.setText("Helmsman");
						label5B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image5.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Navigator":
						label6A.setText("Navigator");
						label6B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image6.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Chief Medical Officer":
						label7A.setText("Chief Medical Officer");
						label7B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image7.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
						
					case "Nurse":
						label8A.setText("Nurse");
						label8B.setText(crewMembers.get(i).getRank() + " " + crewMembers.get(i).getName());
						image8.setImage(user.getImage(crewMembers.get(i).getName()));
						break;
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	    });

	}
		
		
	

}

/**
 * Lab5 is a JavaFX file
 * 
 * @author kenneth Okorafor (uoo431)
 * UTSA CS 3443 - Lab 5
 * Spring 2019
 */
package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	
	@FXML private Button loginButton;
	@FXML private TextField userTextField;
	@FXML private PasswordField passTextField;
	@FXML private Label labelA;
	
	@FXML
	public void onClickLogin( ActionEvent event) throws IOException {
		
		
		User user = new User(userTextField.getText(), passTextField.getText());
			
		if(user.validate(userTextField.getText(), passTextField.getText()) != null) {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Personell.fxml") );
				
				
				Parent root = (Parent) loader.load();
				
				PersonnelController controller = loader.<PersonnelController>getController();
				controller.setUser(user);
				
				Scene scene2View = new Scene(root);

				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				window.setScene(scene2View);
				window.show();

			}
			
			else {
				labelA.setText("Invalid login details. Try again");
			}
			
		
//			else {
//				Alert alert = new Alert(AlertType.CONFIRMATION);
//			      alert.setTitle("Login Error");
//			      alert.setHeaderText("Invalid username and password combination");
//			      alert.setContentText("Please Check the username and password and try again");
//
//			      alert.showAndWait();
//			}
		
		
		
	}

	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	

}

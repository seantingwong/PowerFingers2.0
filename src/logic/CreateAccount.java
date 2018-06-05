package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class CreateAccount {
	
	public Scene scene;
	
	public CreateAccount(Stage main, Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Create Account");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    
	    Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});

		grid.add(back, 0, 0);
		grid.add(title, 5, 0);
		
		Text username = new Text("Username");
		Text password = new Text("Password");
		Text password2 = new Text("Confirm Password");
		
		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		TextField password2Field = new TextField();
		
		grid.add(username, 1,  10);
		grid.add(password, 1,  15);
		grid.add(password2, 1,  20);

		grid.add(usernameField, 5, 10);
		grid.add(passwordField, 5, 15);
		grid.add(password2Field, 5, 20);
		
		Button createAccount = new Button("Create Account");
//		createAccount.setMaxWidth(100);
		grid.add(createAccount, 5, 23);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

package logic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.stage.Stage;

public class LoginPage {
	
	public Scene scene;
	
	@SuppressWarnings("restriction")
	public LoginPage(Stage main, Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Login");
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
		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		
		grid.add(username, 1,  10);
		grid.add(password, 1,  15);

		grid.add(usernameField, 5, 10);
		grid.add(passwordField, 5, 15);
		
		Button login = new Button("Login");
		login.setMaxWidth(100);
		grid.add(login, 5, 17);
		
		scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, Color.DIMGRAY);

		
	}

}
package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class LoginPage {
	
	private LoginPage(){}
	
	public static Scene login(final Stage stage, final Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Login");
		GridPane.setHalignment(title, HPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    
	    Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(goBack);
			}
		});

		grid.add(back, 0, 0);
		grid.add(title, 3, 0);
		
		Text username = new Text("Username");
		GridPane.setHalignment(username, HPos.RIGHT);
		Text password = new Text("Password");
		GridPane.setHalignment(password, HPos.RIGHT);
		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		
		grid.add(username, 0, 14);
		grid.add(password, 0, 15);

		grid.add(usernameField, 3, 14);
		grid.add(passwordField, 3, 15);
		
		Button login = new Button("Login");
		GridPane.setHalignment(login, HPos.CENTER);
		login.setMaxWidth(100);
		login.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(LoginSuccessfulPage.loginSuccessful(stage));
			}
		});	

		grid.add(login, 3, 17);
		
		Scene scene = new Scene(grid, StartMenu.height, StartMenu.width, StartMenu.backgroundMain);
		return(scene);
	}
}

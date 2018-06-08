package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class CreateAccount {
	
	public static String STYLE = "-fx-background-color: transparent;";
	
	private CreateAccount(){}
	
	public static String getStyle() {
		return STYLE;
	}
	
	public static Scene account(final Stage main, final Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle(STYLE);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Create Account");
	    title.setStyle("-fx-font: 36 arial;");
	    
	    Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});

		grid.add(back, 0, 0);
		grid.add(title, 1, 0);
		
		Text username = new Text("Username");
		GridPane.setHalignment(username, HPos.RIGHT);
		Text password = new Text("Password");
		GridPane.setHalignment(password, HPos.RIGHT);
		Text password2 = new Text("Confirm Password");
		GridPane.setHalignment(password2, HPos.RIGHT);
		
		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		TextField password2Field = new TextField();
		
		grid.add(username, 0,  16);
		grid.add(password, 0,  17);
		grid.add(password2, 0,  18);

		grid.add(usernameField, 1, 16);
		grid.add(passwordField, 1, 17);
		grid.add(password2Field, 1, 18);
		
		Button createAccount = new Button("Create Account");
		createAccount.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(LoginSuccessfulPage.loginSuccessful(main));
			}
		});
		GridPane.setHalignment(createAccount, HPos.CENTER);
		createAccount.setMaxWidth(150);
		grid.add(createAccount, 1, 19);
		
		Scene scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, StartMenu.backgroundMain);
		return(scene);
	}
}

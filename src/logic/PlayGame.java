package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class PlayGame {
	public Scene scene;
	
	Scene log;
	Scene newAcc;
	Scene guestAcc;
	
	public PlayGame(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Play A Game");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		
		Button back = new Button("Back");
		back.setStyle(StartMenu.buttonColor);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Button logIn = new Button("Log In");
		logIn.setStyle(StartMenu.buttonColor);
		
		Button account = new Button("Create Account");
		account.setStyle(StartMenu.buttonColor);
		
		Button guest = new Button("Play As Guest");
		guest.setStyle(StartMenu.buttonColor);
		guest.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//main.setScene(guestAcc);
			}
		});
		
		CreateAccount newCreate = new CreateAccount(main, scene);
		newAcc = newCreate.scene;
		
		LoginPage newLog = new LoginPage(main, scene);
		log = newLog.scene;
		
		grid.add(back, 0, 0);
		grid.add(title, 4, 0);
		grid.add(logIn, 4, 28);
		grid.add(account, 4, 29);
		grid.add(guest, 4, 30);

		logIn.setMaxWidth(150);
		account.setMaxWidth(150);
		guest.setMaxWidth(150);

		GridPane.setHalignment(logIn, HPos.CENTER);
		GridPane.setHalignment(account, HPos.CENTER);
		GridPane.setHalignment(guest, HPos.CENTER);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
		
		logIn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				LoginPage loginPage = new LoginPage(main, scene);
				main.setScene(loginPage.scene);
			}
		});
		
		account.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				CreateAccount createAccount = new CreateAccount(main, scene);
				main.setScene(createAccount.scene);			
			}
		});
	}
}

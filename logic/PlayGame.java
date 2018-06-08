package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;


public class PlayGame {
	
	static Scene log;
	static Scene newAcc;
	static Scene guestAcc;
	
	private PlayGame(){}
	
	public static Scene play(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		Scene scene;
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Play A Game");
	    title.setStyle("-fx-font: 36 arial;");
		
		Button back = new Button("Back");
		back.setStyle(StartMenu.BUTTONCOLOR);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Button logIn = new Button("Log In");
		logIn.setStyle(StartMenu.BUTTONCOLOR);
		
		Button account = new Button("Create Account");
		account.setStyle(StartMenu.BUTTONCOLOR);
		
		Button guest = new Button("Play As Guest");
		guest.setStyle(StartMenu.BUTTONCOLOR);
		guest.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(PlayingGame.game(main, goBack));
			}
		});
		
		newAcc = CreateAccount.account(main, goBack);
		
		log = LoginPage.login(main, goBack);
		
		final ImageView pic = new ImageView(new Image("https://ih1.redbubble.net/image.445781365.8284/flat,800x800,075,f.u2.jpg"));
		
		grid.add(back, 0, 0);
		grid.add(title, 4, 0);
		grid.add(logIn, 4, 25);
		grid.add(account, 4, 26);
		grid.add(guest, 4, 27);
		grid.add(pic, 4, 30);

		logIn.setMaxWidth(150);
		account.setMaxWidth(150);
		guest.setMaxWidth(150);

		GridPane.setHalignment(logIn, HPos.CENTER);
		GridPane.setHalignment(account, HPos.CENTER);
		GridPane.setHalignment(guest, HPos.CENTER);
		
		scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, StartMenu.backgroundMain);
		
		logIn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(LoginPage.login(main, goBack));
			}
		});
		
		account.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(CreateAccount.account(main, goBack));			
			}
		});
		
		return(scene);
	}
}

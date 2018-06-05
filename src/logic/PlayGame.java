package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class PlayGame {
	// macros
	String buttonColor = "-fx-background-color: LightGrey;";
	
	Scene log;
	Scene newAcc;
	Scene guestAcc;
	
	public GridPane showPage(final Stage main, final Scene goBack){
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
		back.setStyle(buttonColor);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Button logIn = new Button("Log In");
		logIn.setStyle(buttonColor);
		logIn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//main.setScene(log);
			}
		});
		
		Button account = new Button("Create Account");
		account.setStyle(buttonColor);
		account.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//main.setScene(newAcc);
			}
		});
		
		Button guest = new Button("Play As Guest");
		guest.setStyle(buttonColor);
		guest.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//main.setScene(guestAcc);
			}
		});
		
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
		
		return grid;
	}
}

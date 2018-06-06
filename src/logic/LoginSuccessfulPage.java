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
public class LoginSuccessfulPage {

	String buttonColor = "-fx-background-color: LightGrey;";
	public Scene scene;

	public LoginSuccessfulPage(final Stage stage, final Scene goBack) {
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Login Successful");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		
		Button back = new Button("Back");
		back.setStyle(buttonColor);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.scene);
			}
		});
		
		Button logout = new Button("Logout");
		logout.setStyle(buttonColor);
		logout.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.playGame);
			}
		});
		
		Button play = new Button("Play");
		play.setStyle(buttonColor);
		play.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				PlayingGame playingGame = new PlayingGame(stage, scene);
				stage.setScene(playingGame.scene);
			}
		});
	
		
		grid.add(back, 0, 0);
		grid.add(title, 4, 0);
		grid.add(logout, 4, 28);
		grid.add(play, 4, 29);

		logout.setMaxWidth(150);
		play.setMaxWidth(150);

		GridPane.setHalignment(play, HPos.CENTER);
		GridPane.setHalignment(logout, HPos.CENTER);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}

}

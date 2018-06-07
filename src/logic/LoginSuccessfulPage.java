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
public class LoginSuccessfulPage {
	
	private LoginSuccessfulPage(){}

	public static Scene loginSuccessful(final Stage stage) {
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
		back.setStyle(StartMenu.BUTTONCOLOR);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.backToMain(stage));
			}
		});
		
		Button logout = new Button("Logout");
		logout.setStyle(StartMenu.BUTTONCOLOR);
		logout.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.playGame);
			}
		});
		
		Button play = new Button("Play");
		play.setStyle(StartMenu.BUTTONCOLOR);
	
		
		grid.add(back, 0, 0);
		grid.add(title, 4, 0);
		grid.add(logout, 4, 28);
		grid.add(play, 4, 29);

		logout.setMaxWidth(150);
		play.setMaxWidth(150);

		GridPane.setHalignment(play, HPos.CENTER);
		GridPane.setHalignment(logout, HPos.CENTER);
		
		final Scene scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, StartMenu.backgroundMain);
		play.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(PlayingGame.game(stage, scene));
			}
		});
		return(scene);
	}

}

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


public class GameOver {
	
	public Scene scene;
	
	@SuppressWarnings("restriction")
	public GameOver(Stage stage, Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("The game is over.");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		grid.add(title, 5, 0);
		
		Text score = new Text("You scored 1337 points!");
		grid.add(score,  5,  8);

		Button goHome = new Button("Go Home");
		goHome.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.scene);
			}
		});
		grid.add(goHome, 5, 18);
		
		
		scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, Color.DIMGRAY);
		
	}

}

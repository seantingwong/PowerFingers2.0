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


public class PlayingGame {
	public Scene scene;
	
	@SuppressWarnings("restriction")
	public PlayingGame(Stage stage, Scene goBack) {

		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("This is a placeholder.");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    
	    Button pause = new Button("Pause");
		pause.setStyle("-fx-background-color: LightGrey;");
		pause.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				PausePage pausePage = new PausePage(stage, scene);
				stage.setScene(pausePage.scene);
			}
		});

		Button endGame = new Button("End Game");
		endGame.setStyle("-fx-background-color: LightGrey;");
		endGame.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GameOver gameOver = new GameOver(stage, scene);
				stage.setScene(gameOver.scene);
			}
		});		
		
		grid.add(pause, 0, 0);
		grid.add(endGame, 0, 5);
		grid.add(title, 2, 0);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, StartMenu.backgroundColor);

	}


}

package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class PlayingGame {
	public Scene scene;
	
	public PlayingGame(final Stage stage, final Scene goBack) {

		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("The quick brown fox jumps over the lazy dog.");
		GridPane.setValignment(title, VPos.CENTER);

		TextField typeField = new TextField();
	    
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
		grid.add(endGame, 3, 5);
		grid.add(typeField, 2, 5);
		grid.add(title, 2, 0);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, StartMenu.backgroundColor);

	}


}

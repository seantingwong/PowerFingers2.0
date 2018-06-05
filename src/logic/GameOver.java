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
import javafx.geometry.Pos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class GameOver {
	public Scene scene;
	
	public GameOver(final Stage stage, final Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setAlignment(Pos.CENTER);
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Game Over");
	    title.setStyle("-fx-font: 36 arial;");
		//grid.add(title, 5, 0);
		
		Text score = new Text("You scored 1337 points!");
		grid.add(score,  5,  8);

		Button goHome = new Button("Go Home");
		goHome.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.scene);
			}
		});
		
		GridPane.setHalignment(title, HPos.CENTER);
		GridPane.setHalignment(goHome, HPos.CENTER);

		grid.add(title, 0, 0);
		grid.add(goHome, 0, 18);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

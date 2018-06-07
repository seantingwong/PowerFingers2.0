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
	
	public static Scene over(final Stage stage) {
		
		GridPane grid = new GridPane();
		
		grid.setAlignment(Pos.CENTER);
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Game Over");
	    title.setStyle("-fx-font: 36 arial;");
		
		Text score = new Text("You scored 72 words/minute!");
		grid.add(score, 0,  8);

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
		
		Scene scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
		return(scene);
	}
}

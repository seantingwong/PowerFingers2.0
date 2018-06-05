package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class PausePage {
	public Scene scene;
	
	public PausePage(Stage stage, Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("The game is paused.");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		grid.add(title, 5, 0);

	    Button back = new Button("Resume");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(goBack);
			}
		});
		grid.add(back, 5, 15);

		Button goHome = new Button("Go Home");
		goHome.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.scene);
			}
		});
		grid.add(goHome, 5, 18);
		
		Button settings = new Button("Settings");
		settings.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.settingsPage);
			}
		});
		grid.add(settings, 5, 21);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

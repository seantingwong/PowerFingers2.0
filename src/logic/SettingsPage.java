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
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;


public class SettingsPage {
	
	public Scene scene;
	
	public SettingsPage(GridPane grid) {
		scene = new Scene(grid, 700, 400, Color.DIMGRAY);
		
		settings = new Button("Settings");
		settings.setStyle("-fx-background-color: LightGrey;");
		settings.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				settings.setText("clicked");
			}
		});
		
	}

}

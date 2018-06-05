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
import javafx.geometry.VPos;
import javafx.stage.Stage;


public class SettingsPage {
	
	@SuppressWarnings("restriction")
	public GridPane showPage(Stage main, Scene goBack){
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Settings");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		
		Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Button blueButton = new Button("Blue");
		blueButton.setStyle("-fx-background-color: LightGrey;");
		blueButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to blue");
			}
		});
		
		Button redButton = new Button("Red");
		redButton.setStyle("-fx-background-color: LightGrey;");
		redButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to red");
			}
		});
		
		Button greenButton = new Button("Green");
		greenButton.setStyle("-fx-background-color: LightGrey;");
		greenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to green");
			}
		});
		
		grid.add(back, 0, 0);
		grid.add(title, 28, 0);
		
		Text theme = new Text("Theme");
		grid.add(theme, 28, 22);
		
		grid.add(blueButton, 28, 28);
		grid.add(redButton, 28, 32);
		grid.add(greenButton, 28, 36);
		
		
		return grid;
	}
	
	

}

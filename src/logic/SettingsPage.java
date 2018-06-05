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
public class SettingsPage {
	public Scene scene;
	
	public SettingsPage(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("Settings");
		GridPane.setValignment(title, VPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    
		Text theme = new Text("Theme");
		GridPane.setValignment(theme, VPos.CENTER);
	    theme.setStyle("-fx-font: 24 arial;");
		
		Button back = new Button("Back");
		back.setStyle(StartMenu.buttonColor);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Button blueButton = new Button("Blue");
		blueButton.setStyle(StartMenu.buttonColor);
		blueButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to blue");
			}
		});
		
		Button redButton = new Button("Red");
		redButton.setStyle(StartMenu.buttonColor);
		redButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to red");
			}
		});
		
		Button greenButton = new Button("Green");
		greenButton.setStyle(StartMenu.buttonColor);
		greenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Change theme to green");
			}
		});
		
		grid.add(back, 0, 0);
		grid.add(title, 11, 0);
		grid.add(theme, 11, 15);
		grid.add(blueButton, 11, 16);
		grid.add(redButton, 11, 17);
		grid.add(greenButton, 11, 18);

		blueButton.setMaxWidth(100);
		redButton.setMaxWidth(100);
		greenButton.setMaxWidth(100);

		GridPane.setHalignment(theme, HPos.CENTER);
		GridPane.setHalignment(blueButton, HPos.CENTER);
		GridPane.setHalignment(redButton, HPos.CENTER);
		GridPane.setHalignment(greenButton, HPos.CENTER);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
	
	

}

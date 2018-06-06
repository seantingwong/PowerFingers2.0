package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
		
		final ToggleGroup group = new ToggleGroup();
		RadioButton blueButton = new RadioButton("Blue");
		blueButton.setTextFill(Color.WHITE);
		blueButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.LIGHTSKYBLUE;
				StartMenu.colorSelected = 0;
			}
		});
		blueButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 0)
		{
			blueButton.setSelected(true);
		}
		
		RadioButton redButton = new RadioButton("Red");
		redButton.setTextFill(Color.WHITE);
		redButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.INDIANRED;
				StartMenu.colorSelected = 1;
			}
		});
		redButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 1)
		{
			redButton.setSelected(true);
		}
		
		RadioButton greenButton = new RadioButton("Green");
		greenButton.setTextFill(Color.WHITE);
		greenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.DARKSEAGREEN;
				StartMenu.colorSelected = 2;
			}
		});
		greenButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 2)
		{
			greenButton.setSelected(true);
		}
		
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

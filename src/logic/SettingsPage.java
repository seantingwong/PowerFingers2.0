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
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class SettingsPage {
	public static int constraint = 150;
	public static String style = "-fx-font: 24 arial;";
	
	private SettingsPage(){}
	
	public static Scene settings(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(constraint));
		
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
		blueButton.setTextFill(Color.BLACK);
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
		redButton.setTextFill(Color.BLACK);
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
		greenButton.setTextFill(Color.BLACK);
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
		
		RadioButton yellowButton = new RadioButton("Yellow");
		yellowButton.setTextFill(Color.BLACK);
		yellowButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.YELLOW;
				StartMenu.colorSelected = 3;
			}
		});
		yellowButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 3)
		{
			yellowButton.setSelected(true);
		}
		
		RadioButton orangeButton = new RadioButton("Orange");
		orangeButton.setTextFill(Color.BLACK);
		orangeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.ORANGE;
				StartMenu.colorSelected = 4;
			}
		});
		orangeButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 4)
		{
			orangeButton.setSelected(true);
		}
		
		RadioButton tanButton = new RadioButton("Tan");
		tanButton.setTextFill(Color.BLACK);
		tanButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.TAN;
				StartMenu.colorSelected = 5;
			}
		});
		tanButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 5)
		{
			tanButton.setSelected(true);
		}
		
		RadioButton purpleButton = new RadioButton("Purple");
		purpleButton.setTextFill(Color.BLACK);
		purpleButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.MEDIUMPURPLE;
				StartMenu.colorSelected = 6;
			}
		});
		purpleButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 6)
		{
			purpleButton.setSelected(true);
		}
		
		RadioButton greyButton = new RadioButton("Grey");
		greyButton.setTextFill(Color.BLACK);
		greyButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				StartMenu.backgroundColor = Color.GREY;
				StartMenu.colorSelected = 7;
			}
		});
		greyButton.setToggleGroup(group);
		if(StartMenu.colorSelected == 7)
		{
			greyButton.setSelected(true);
		}
		
		grid.add(back, 0, 0);
		grid.add(title, 11, 0);
		grid.add(theme, 11, 15);
		grid.add(blueButton, 11, 16);
		grid.add(redButton, 11, 17);
		grid.add(greenButton, 11, 18);
		grid.add(yellowButton, 11, 19);
		grid.add(orangeButton, 11, 20);
		grid.add(tanButton, 11, 21);
		grid.add(purpleButton, 11, 22);
		grid.add(greyButton, 11, 23);

		blueButton.setMaxWidth(100);
		redButton.setMaxWidth(100);
		greenButton.setMaxWidth(100);
		
		Scene scene = new Scene(grid, StartMenu.height, StartMenu.width, StartMenu.backgroundMain);
		return(scene);
	}
	
	

}

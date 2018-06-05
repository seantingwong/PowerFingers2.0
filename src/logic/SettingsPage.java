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
	
	public GridPane grid;
	public Scene scene;
	
	@SuppressWarnings("restriction")
	public SettingsPage(Stage stage, Scene homeScene){
		
		grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Button back = new Button("Back");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				back.setText("clicked");
				System.out.println("OKay!");
				stage.setScene(homeScene);
			}
		});
		grid.add(back, 0, 0);
		
		scene = new Scene(grid, 700, 400, Color.DIMGRAY);

	}
	

}

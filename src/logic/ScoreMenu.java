package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class ScoreMenu {
	public Scene scene;
	
	public ScoreMenu(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		final Button prsn = new Button("Personal");
		final Button top = new Button("Top");
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(100));
		
		//Page Title
		Text title = new Text("High Scores");
		GridPane.setValignment(title, VPos.CENTER);
		GridPane.setHalignment(title, HPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
		
	    //Back Button
		Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		//Toggle Scores Button
		top.setStyle("-fx-background-color: LightGrey;");
		top.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				top.setText("clicked");
				prsn.setText("Personal");
			}
		});
		
		//Personal Scores Button
		prsn.setStyle("-fx-background-color: LightGreay);");
		prsn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				prsn.setText("clicked");
				top.setText("Top");
			}
		});
		
		grid.add(back, 0, 0);
		grid.add(title, 28, 0);
		grid.add(top, 28, 20);
		grid.add(prsn, 29, 20);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

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
	
		prsn.setMaxWidth(200);
		prsn.setMinWidth(200);
		top.setMaxWidth(200);
		top.setMinWidth(200);
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(70));
		
		//Page Title
		Text title = new Text("High Scores");
		GridPane.setValignment(title, VPos.CENTER);
		GridPane.setHalignment(title, HPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    title.maxWidth(100);
	    title.minWidth(100);
	    
	    //High Scores
	    Text subtitle = new Text("Top Scores");
	    subtitle.setStyle("-fx-font: 20 arial;");
	    
		
	    //Back Button
		Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		//Toggle Top Scores Button
		top.setStyle("-fx-background-color: transparent; -fx-font-weight: bold;");
		top.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				top.setStyle("-fx-background-color: transparent; -fx-font-weight: bold;");
				prsn.setStyle("-fx-background-color: LightGrey; -fx-font-weight: bold;");
				subtitle.setText("Top Scores");
			}
		});
		
		//Personal Scores Button
		prsn.setStyle("-fx-background-color: LightGrey;-fx-font-weight: bold;");
		prsn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				prsn.setStyle("-fx-background-color: transparent;-fx-font-weight: bold;");
				top.setStyle("-fx-background-color: LightGrey;-fx-font-weight: bold;");
				subtitle.setText("Your Scores");
			}
		});
		
		grid.add(back, 0, 0);
		grid.add(title, 1, 0, 5,1);
		grid.add(top, 1, 10, 2, 1);
		grid.add(prsn, 3, 10, 1, 1);
		grid.add(subtitle, 1, 12);
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

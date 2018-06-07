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
import javafx.scene.control.ListView;
import java.util.ArrayList;
import javafx.scene.control.TextField;

@SuppressWarnings("restriction")
public class ScoreMenu {
	public Scene scene;
	
	public ScoreMenu(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		ArrayList<String> users = new ArrayList();
		ArrayList<String> userScore = new ArrayList();
		users.add("user1"); userScore.add("120");
		users.add("FireUser"); userScore.add("119");
		users.add("user1"); userScore.add("115");
		users.add("user1"); userScore.add("99");
		users.add("user1"); userScore.add("98");
		users.add("FireUser"); userScore.add("78");
		users.add("Guest"); userScore.add("72");
		users.add("Falessi"); userScore.add("72");
		users.add("Guest"); userScore.add("68");
		users.add("FakeUser"); userScore.add("66");
		
		final Button prsn = new Button("Personal");
		final Button top = new Button("Top");
		float scoreNum = 10;
	
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
	    
	    //top scores
	    Text scores[] = new Text[10]; 
	    for (int i = 0; i < 10; i++) {
	    	scores[i] = new Text(" ");
	    }
		
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
				//set top
				for (int i = 0; i < 10; i++) {
					scores[i].setText(i+1 + ".\t" + users.get(i)+ "\t...................................................... " + userScore.get(i) + " wpm");
					scores[i].setStyle("-fx-font: 15 arial;");
				}
			}
		});
		
		//Personal Scores Button
		prsn.setStyle("-fx-background-color: LightGrey;-fx-font-weight: bold;");
		prsn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				prsn.setStyle("-fx-background-color: transparent;-fx-font-weight: bold;");
				top.setStyle("-fx-background-color: LightGrey;-fx-font-weight: bold;");
				subtitle.setText("Your Scores");
				//personal scores
				for (int i = 0; i < 10; i++) {
					if (i < 3) 
						scores[i].setText(i+1 + ".\t" + "CoolUser"+ "\t...................................................... " + (55-i) + "wpm");
					else
						scores[i].setText(" ");
					scores[i].setStyle("-fx-font: 15 arial;");
				}
			}
		});
		
		grid.add(back, 0, 0);
		grid.add(title, 1, 0, 5,1);
		grid.add(top, 1, 10, 2, 1);
		grid.add(prsn, 3, 10, 1, 1);
		grid.add(subtitle, 1, 12);
		
		for (int i = 0; i < 10; i++) {
			grid.add(scores[i], 1, 14+i*2, 5, 1);
		}
		top.fire();
		
		scene = new Scene(grid, StartMenu.height, StartMenu.width, Color.DIMGRAY);
	}
}

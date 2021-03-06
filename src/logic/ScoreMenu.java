// Jessi Trieu

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
import java.util.ArrayList;

public class ScoreMenu {
	
	public static final  int WIDTH = 200;
	public static final Color TEXT = Color.BLACK;

	private ScoreMenu(){}
	
	public static Scene score(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		final ArrayList<String> users = new ArrayList<String>();
		final ArrayList<String> userScore = new ArrayList<String>();
		String user = "user1";
		users.add(user); userScore.add("120");
		users.add("FireUser"); userScore.add("119");
		users.add(user); userScore.add("115");
		users.add(user); userScore.add("99");
		users.add(user); userScore.add("98");
		users.add("FireUser"); userScore.add("78");
		users.add("Guest"); userScore.add("72");
		users.add("Falessi"); userScore.add("72");
		users.add("Guest"); userScore.add("68");
		users.add("FakeUser"); userScore.add("66");
		
		final Button prsn = new Button("Personal");
		prsn.setTextFill(TEXT);
		final Button top = new Button("Top");
		top.setTextFill(TEXT);
	
		prsn.setMaxWidth(WIDTH);
		prsn.setMinWidth(WIDTH);
		top.setMaxWidth(WIDTH);
		top.setMinWidth(WIDTH);
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(70));
		
		Text title = new Text("High Scores");
		GridPane.setValignment(title, VPos.CENTER);
		GridPane.setHalignment(title, HPos.CENTER);
	    title.setStyle("-fx-font: 36 arial;");
	    title.maxWidth(100);
	    title.minWidth(100);
	    
	    final Text subtitle = new Text("Top Scores");
	    subtitle.setStyle("-fx-font: 20 arial;");
	    
	    final Text[] scores = new Text[10]; 
	    for (int i = 0; i < 10; i++) {
	    	scores[i] = new Text(" ");
	    }
		
		Button back = new Button("Back");
		back.setStyle(StartMenu.BUTTONCOLOR);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		top.setStyle(StartMenu.BUTTONCOLOR);
		top.setStyle("-fx-font-weight: bold;");
		top.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				top.setStyle("-fx-background-color: transparent;");
				prsn.setStyle(StartMenu.BUTTONCOLOR);
				subtitle.setText("Top Scores");
				for (int i = 0; i < 10; i++) {
					scores[i].setText(i+1 + ".\t" + users.get(i)+ "\t...................................................... " + userScore.get(i) + " wpm");
					scores[i].setStyle("-fx-font: 15 arial;");
				}
			}
		});
		
		prsn.setStyle("-fx-font-weight: bold;");
		prsn.setStyle(StartMenu.BUTTONCOLOR);
		prsn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				prsn.setStyle("-fx-background-color: transparent");
				top.setStyle(StartMenu.BUTTONCOLOR);
				subtitle.setText("Your Scores");
				for (int i = 0; i < getScore(10); i++) {
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
		
		Scene scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, StartMenu.backgroundMain);
		return(scene);
	}
	
	public static int getScore(int numScores)
	{
		int result = 0;
		
		for(int i = 0; i < numScores; i++)
		{
			result++;
		}
		
		return result;
	}
	
	public static int getNames(int numNames)
	{
		int result = 0;
		
		for(int i = numNames; i > 0 ; i--)
		{
			result++;
		}
		
		return result;
	}
}

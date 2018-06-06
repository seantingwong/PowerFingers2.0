package logic;

import javafx.application.Application;
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
import javafx.geometry.Pos;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class StartMenu extends Application{
	// macros
	static int height = 600;
	static int width = 500;
	static String buttonColor = "-fx-background-color: LightGrey;";
	static Color backgroundColor = Color.LIGHTSKYBLUE;
	
	Text title;
	Button play;
	Button scores;
	Button test;
	Button settings;
	Button help;
	Scene helpMenu;
	static Scene settingsPage;
	static Scene playGame;
	public static Scene scene;
	public static int colorSelected = 0;

	@Override
	public void start(final Stage stage) throws Exception {
		stage.setTitle("Power Fingers");
		GridPane grid = new GridPane();
		scene = new Scene(grid, height, width, Color.DIMGRAY);
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		title = new Text("Power Fingers");
	    title.setStyle("-fx-font: 36 arial;");
	    
		play = new Button("Play");
		play.setStyle(buttonColor);
		play.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("static-access")
			public void handle(ActionEvent event) {
				PlayGame newGame = new PlayGame(stage, scene);
				stage.setScene(newGame.scene);
			}
		});
		
		scores = new Button("Scores");
		scores.setStyle(buttonColor);
		scores.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("static-access")
			public void handle(ActionEvent event) {
				ScoreMenu newScore = new ScoreMenu(stage, scene);
				stage.setScene(newScore.scene);
			}
		});
		
		settings = new Button("Settings");
		settings.setStyle(buttonColor);
		settings.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("static-access")
			public void handle(ActionEvent event) {
				SettingsPage newSettingsPage = new SettingsPage(stage, scene);
				stage.setScene(newSettingsPage.scene);
			}
		});
		
		help = new Button("Help");
		help.setStyle(buttonColor);
		help.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("static-access")
			public void handle(ActionEvent event) {
				HelpMenu newHelp = new HelpMenu(stage, scene);
				stage.setScene(newHelp.scene);
			}
		});
		
		title.maxWidth(100);
		play.setMaxWidth(100);
		scores.setMaxWidth(100);
		settings.setMaxWidth(100);
		help.setMaxWidth(100);

		GridPane.setHalignment(title, HPos.CENTER);
		GridPane.setHalignment(play, HPos.CENTER);
		GridPane.setHalignment(scores, HPos.CENTER);
		GridPane.setHalignment(settings, HPos.CENTER);
		GridPane.setHalignment(help, HPos.CENTER);

		grid.add(title, 0, 0);
		grid.add(play, 0, 1);
		grid.add(scores, 0, 2);
		grid.add(settings, 0, 3);
		grid.add(help, 0, 4);

		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

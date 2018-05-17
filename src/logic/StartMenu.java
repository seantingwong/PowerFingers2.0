package logic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class StartMenu extends Application{
	Label title;
	Button play;
	Button scores;
	Button settings;
	Button help;
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Power Fingers");
		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		title = new Label("Power Fingers");
		play = new Button("Play");
		scores = new Button("Scores");
		settings = new Button("Settings");
		help = new Button("Help");

		grid.add(title, 0, 0, 4, 1);
		grid.add(play, 0, 1);
		grid.add(scores, 0, 2);
		grid.add(settings, 0, 3);
		grid.add(help, 0, 4);
		
		Scene scene = new Scene(grid, 200, 200);
		stage.setScene(scene);
		stage.show();
	}
}

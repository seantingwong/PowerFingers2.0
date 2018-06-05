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

import logic.HelpMenu;

@SuppressWarnings("restriction")
public class StartMenu extends Application{
	Text title;
	Button play;
	Button scores;
	Button settings;
	Button help;
	Scene helpMenu;

	@Override
	public void start(final Stage stage) throws Exception {
		stage.setTitle("Power Fingers");
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		title = new Text("Power Fingers");
	    title.setStyle("-fx-font: 36 arial;");
	    
		play = new Button("Play");
		play.setStyle("-fx-background-color: LightGrey;");
		play.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				play.setText("clicked");
			}
		});
		
		scores = new Button("Scores");
		scores.setStyle("-fx-background-color: LightGrey;");
		scores.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				scores.setText("clicked");
			}
		});
		
		settings = new Button("Settings");
		settings.setStyle("-fx-background-color: LightGrey;");
		settings.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				settings.setText("clicked");
			}
		});
		
		help = new Button("Help");
		help.setStyle("-fx-background-color: LightGrey;");
		help.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(helpMenu);
			}
		});
		HelpMenu newHelp = new HelpMenu();
		helpMenu = new Scene(newHelp.showHelp(), 700, 400, Color.DIMGRAY);

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

		Scene scene = new Scene(grid, 700, 400, Color.DIMGRAY);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

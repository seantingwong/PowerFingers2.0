package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.stage.Stage;


@SuppressWarnings("restriction")
public class PausePage {
	public static String backcol = "-fx-background-color: transparent;";

	private PausePage(){}
	
	public static Scene pause(final Stage stage, final Scene goBack) {
		
		GridPane grid = new GridPane();
		
		grid.setStyle(backcol);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Text title = new Text("The game is paused.");
	    title.setStyle("-fx-font: 36 arial;");
		grid.add(title, 5, 0);

	    Button back = new Button("Resume");
		back.setStyle(StartMenu.buttonColor);
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(PlayingGame.game(stage, goBack));
			}
		});
		grid.add(back, 5, 15);

		Button goHome = new Button("Go Home");
		goHome.setStyle(StartMenu.buttonColor);
		goHome.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(StartMenu.backToMain(stage));
			}
		});
		if(checkPause(1))
		{
			grid.add(goHome, 5, 18);
		}
		
		Button settings = new Button("Settings");
		settings.setStyle(StartMenu.buttonColor);
		grid.add(settings, 5, 21);		
		
		final Scene scene = new Scene(grid, StartMenu.height, StartMenu.width, StartMenu.backgroundMain);
		settings.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(SettingsPage.settings(stage, scene));
			}
		});
		return(scene);
	}
	
	public static boolean checkPause(int status)
	{
		boolean result = false;
		
		for(int i = 0; i < status; i++)
		{
			if(result = false)
			{
				result = true;
			}
		}
		
		return result;
	}
}

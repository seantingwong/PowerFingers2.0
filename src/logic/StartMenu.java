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
	int height = 600;
	int width = 500;
	String buttonColor = "-fx-background-color: LightGrey;";
	
	Text title;
	Button play;
	Button scores;
	Button test;
	Button settings;
	Button help;
	Scene helpMenu;
	static Scene settingsPage;
	static int HEIGHT = 600;
	static int WIDTH = 500;
	static Scene playGame;
	static Scene scene;

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
			public void handle(ActionEvent event) {
				stage.setScene(playGame);
			}
		});
		
		scores = new Button("Scores");
		scores.setStyle(buttonColor);
		scores.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				scores.setText("clicked");
			}
		});
		
		settings = new Button("Settings");
		settings.setStyle(buttonColor);
		settings.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(settingsPage);
			}
		});
		
		help = new Button("Help");
		help.setStyle(buttonColor);
		help.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(helpMenu);
			}
		});
		
		test = new Button("Test");
		test.setStyle("-fx-background-color: LightGrey;");
		test.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
//				LoginPage loginPage = new LoginPage(stage, scene);
//				stage.setScene(loginPage.scene);
				
//				CreateAccount createAccount = new CreateAccount(stage, scene);
//				stage.setScene(createAccount.scene);
			
//				PausePage pausePage = new PausePage(stage, scene);
//				stage.setScene(pausePage.scene);
			
//				GameOver gameOver = new GameOver(stage, scene);
//				stage.setScene(gameOver.scene);
				
				LoginSuccessfulPage loginSucc = new LoginSuccessfulPage(stage, scene);
				stage.setScene(loginSucc.scene);
			}
		});
		
		HelpMenu newHelp = new HelpMenu();
		helpMenu = new Scene(newHelp.showHelp(stage, scene), HEIGHT, WIDTH, Color.DIMGRAY);

		PlayGame newGame = new PlayGame();
		playGame = new Scene(newGame.showPage(stage, scene), height, width, Color.DIMGRAY);

		SettingsPage newSettingsPage = new SettingsPage();
		settingsPage = new Scene(newSettingsPage.showPage(stage, scene), HEIGHT, WIDTH, Color.DIMGRAY);
		
		
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
		grid.add(test, 0, 5);

		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

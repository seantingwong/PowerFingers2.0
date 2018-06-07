package logic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class HelpMenu {
	
	private HelpMenu(){}
	
	public static Scene help(final Stage main, final Scene goBack){
		GridPane grid = new GridPane();
		
        grid.setStyle("-fx-background-color: transparent;");
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		
		Button back = new Button("Back");
		back.setStyle("-fx-background-color: LightGrey;");
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				main.setScene(goBack);
			}
		});
		
		Text title = new Text("Help");
	    title.setStyle("-fx-font: 36 arial;");
		
		final ImageView guide = new ImageView(new Image("http://oakdome.com/k5/lesson-plans/word/images/proper-finger-placement-for-keyboarding-550.gif"));
		
		grid.add(back, 0, 0);
		grid.add(title, 18, 0);
		grid.add(guide, 0, 3);
		Scene scene = new Scene(grid, StartMenu.HEIGHT, StartMenu.WIDTH, StartMenu.backgroundMain);
		return(scene);
	}
}

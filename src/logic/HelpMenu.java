package logic;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

@SuppressWarnings("restriction")
public class HelpMenu {
	public VBox showHelp(){
		VBox help = new VBox(20);
		Text test = new Text("test");
		help.getChildren().add(test);
		return help;
	}
}

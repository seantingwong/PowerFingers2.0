package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.scene.paint.Color;
import logic.StartMenu;

@SuppressWarnings("restriction")
public class StartMenuTest {
	@Test
	public void checkBackGround()
	{
		StartMenu test = new StartMenu();
		assertEquals(test.backgroundColor, Color.LIGHTSKYBLUE);
	}
	
	@Test
	public void checkButton()
	{
		StartMenu test = new StartMenu();
		assertEquals(test.buttonColor, "-fx-background-color: LightGrey;");
	}
}

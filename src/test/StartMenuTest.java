// Sean Wong
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
		assertEquals(Color.LIGHTSKYBLUE, StartMenu.backgroundColor);
	}
	
	@Test
	public void checkButton()
	{
		assertEquals("-fx-background-color: LightGrey;", StartMenu.buttonColor);
	}
}

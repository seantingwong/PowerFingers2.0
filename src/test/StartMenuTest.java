// Sean Wong
package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.scene.paint.Color;
import logic.StartMenu;

@SuppressWarnings("restriction")
public class StartMenuTest {
	@Test
	public void checkWidth()
	{
		assertEquals(500, StartMenu.width);
	}
	
	@Test
	public void checkButton()
	{
		assertEquals("-fx-background-color: LightGrey;", StartMenu.buttonColor);
	}
}

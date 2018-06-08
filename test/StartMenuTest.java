// Sean Wong
package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.StartMenu;

public class StartMenuTest {
	@Test
	public void checkWidth()
	{
		int output = StartMenu.WIDTH;
		assertEquals(500, output);
	}
	
	@Test
	public void checkButton()
	{
		String output = StartMenu.BUTTONCOLOR;
		assertEquals("-fx-background-color: LightGrey;", output);
	}
}

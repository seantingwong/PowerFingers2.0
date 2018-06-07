// Jenna Stephens

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.PausePage;

public class PauseTest {
	@Test
	public void testLoops()
	{
		assertEquals(true, PausePage.checkPause(1));
	}
	
	@Test
	public void testColor()
	{
		String output = PausePage.BACKCOL;
		assertEquals("-fx-background-color: transparent;", output);
	}
}

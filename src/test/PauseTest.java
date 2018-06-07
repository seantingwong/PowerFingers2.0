// Jenna Stephens

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.PausePage;

public class PauseTest {
	@Test
	public void testLoops()
	{
		assertEquals(false, PausePage.checkPause(1));
	}
	
	@Test
	public void testColor()
	{
		assertEquals("-fx-background-color: transparent;", PausePage.backcol);
	}
}

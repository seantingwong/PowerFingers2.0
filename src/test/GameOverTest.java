// Brady Shutt

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.GameOver;

public class GameOverTest {
	@Test
	public void testCol()
	{
		int output = GameOver.COL;
		assertEquals(0, output);
	}
	
	@Test
	public void testInset()
	{
		int output = GameOver.INSET;
		assertEquals(25, output);
	}
}

// Brady Shutt

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.GameOver;

public class GameOverTest {
	@Test
	public void testCol()
	{
		assertEquals(0, GameOver.col);
	}
	
	@Test
	public void testInset()
	{
		assertEquals(25, GameOver.inset);
	}
}

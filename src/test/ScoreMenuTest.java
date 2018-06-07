// Jessi Trieu
package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.scene.paint.Color;
import logic.ScoreMenu;

@SuppressWarnings("restriction")
public class ScoreMenuTest {
	
	@Test
	public void checkWidth() {
		assertEquals(200, ScoreMenu.width);
	}
	
	@Test
	public void checkTextColor() {
		assertEquals(Color.BLACK, ScoreMenu.text);
	}
}

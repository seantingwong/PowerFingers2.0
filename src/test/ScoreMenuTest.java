package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.scene.paint.Color;
import logic.ScoreMenu;

@SuppressWarnings("restriction")
public class ScoreMenuTest {
	
	@Test
	public void checkWidth() {
		ScoreMenu test = new ScoreMenu();
		assertEquals(test.width, 200);
	}
	
	@Test
	public void checkTextColor() {
		ScoreMenu test = new ScoreMenu();
		assertEquals(test.text, Color.BLACK);
	}
}

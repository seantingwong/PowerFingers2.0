// Megan Washburn

package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.SettingsPage;

public class SettingsTest {
	@Test
	public void testConstraint()
	{
		int output = SettingsPage.CONSTRAINT;
		assertEquals(150, output);
	}
	
	@Test
	public void testString()
	{
		String output = SettingsPage.STYLE;
		assertEquals("-fx-font: 24 arial;", output);
	}
}

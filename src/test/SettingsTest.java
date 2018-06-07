// Megan Washburn

package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.SettingsPage;

public class SettingsTest {
	@Test
	public void testConstraint()
	{
		assertEquals(150, SettingsPage.constraint);
	}
	
	@Test
	public void testString()
	{
		assertEquals("-fx-font: 24 arial;", SettingsPage.style);
	}
}

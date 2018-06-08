package test;

import static org.junit.Assert.*;
import javafx.scene.paint.Color;
import org.junit.Test;
import logic.SettingsPage;


public class IntegrationTestColor {

	@Test
	public void testBlue() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorBlue();
		assertEquals(Color.LIGHTSKYBLUE, myColor);
	}
	
	@Test
	public void testRed() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorRed();
		assertEquals(Color.INDIANRED, myColor);
	}
	
	@Test
	public void testGreen() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorGreen();
		assertEquals(Color.DARKSEAGREEN, myColor);
	}
	
	@Test
	public void testYellow() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorYellow();
		assertEquals(Color.YELLOW, myColor);
	}
	
	@Test
	public void testOrange() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorOrange();
		assertEquals(Color.ORANGE, myColor);
	}
	
	@Test
	public void testTan() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorTan();
		assertEquals(Color.TAN, myColor);
	}
	
	@Test
	public void testPurple() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorPurple();
		assertEquals(Color.MEDIUMPURPLE, myColor);
	}
	
	@Test
	public void testGrey() {
		SettingsPage A = new SettingsPage();
		Color myColor = A.setColorGrey();
		assertEquals(Color.GREY, myColor);
	}

}

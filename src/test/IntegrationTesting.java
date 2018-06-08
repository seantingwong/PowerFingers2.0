package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.CreateAccount;
import logic.GameOver;
import logic.HelpMenu;
import logic.LoginPage;
import logic.LoginSuccessfulPage;
import logic.PausePage;
import logic.SettingsPage;
import logic.StartMenu;

public class IntegrationTesting {

	public boolean verifyStyle(String expected, String style) {
		return style == expected;
	}
	
	// Brady's Tests
	@Test
	public void testGetStyleStartMenu() {
		String style = StartMenu.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: LightGrey;", style);
		assertEquals(true, isGoodStyle);
	}
	
	@Test
	public void testGetStyleSettings() {
		String style = SettingsPage.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-font: 24 arial", style);
		assertEquals(true, isGoodStyle);
	}
	
	// Sean's Tests
	@Test
	public void testGetStyleCreateAccount() {
		String style = CreateAccount.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	@Test
	public void testGetStyleGameOver() {
		String style = GameOver.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	
	// Megan's Tests
	@Test
	public void testGetStyleHelpMenu() {
		String style = HelpMenu.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	@Test
	public void testGetStyleLoginPage() {
		String style = LoginPage.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	
	// Jenna's Tests
	@Test
	public void testGetStyleLoginSuccessfulPage() {
		String style = LoginSuccessfulPage.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	@Test
	public void testGetStylePausePage() {
		String style = PausePage.getStyle();
		boolean isGoodStyle = verifyStyle("-fx-background-color: transparent;", style);
		assertEquals(true, isGoodStyle);
	}
	
	// Sam's Tests
	
	
	// Jessie's Tests
	
	
}

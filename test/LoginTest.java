// Sam Wilson

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.LoginPage;

public class LoginTest {
	@Test
	public void testUser()
	{
		String output = LoginPage.USER;
		assertEquals("Username", output);
	}
	
	@Test
	public void testPass()
	{
		String output = LoginPage.PASS;
		assertEquals("Password", output);
	}
}

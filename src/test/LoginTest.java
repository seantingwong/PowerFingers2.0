// Sam Wilson

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import logic.LoginPage;

public class LoginTest {
	@Test
	public void testUser()
	{
		assertEquals("Username", LoginPage.user);
	}
	
	@Test
	public void testPass()
	{
		assertEquals("Password", LoginPage.pass);
	}
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	
	@Test
	
	public void testLogin() throws InterruptedException{
		
		loginPage.setLogin();
		
		Thread.sleep(3000);
		
		loginPage.setEmailRadio();
		
		loginPage.setEmail("mohamedshajanh@gmail.com");
		
		loginPage.setPassword("Temp@1234");
		
		loginPage.setSubmit();
		
		String expectedValue = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		
		String actualValue = driver.getTitle();
		
		Assert.assertEquals(actualValue, expectedValue);
	}

}

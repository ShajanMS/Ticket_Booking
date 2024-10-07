package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInPageTest extends BaseTest {
	
	@Test
	public void testCheckInPage() {
		
		checkInPage.setCheckInButton();
		
		checkInPage.setPNRNum("80727154");
		
		checkInPage.setEmail("mohamedshajanh@gmail.com");
		
		checkInPage.setSearch();
		
		String str = driver.findElement(By.xpath("//div[@class='css-76zvg2 css-cens5h r-jwli3a']")).getText();
		
		System.out.println(str);
		
		Assert.assertEquals(str, "Unable to fetch your booking. Please check the inputs \\n\" +\r\n"+ "\" you have provided and try again.");
		
	}

}

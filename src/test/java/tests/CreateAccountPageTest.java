package tests;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CreateAccountPage;

public class CreateAccountPageTest extends BaseTest {

	@Test

	public void CreateAcc() throws InterruptedException {

		CreateAccountPage createAccountPage = new CreateAccountPage(driver);

		createAccountPage.setClickSignupbutton();

		// Storing the current window handle

		String mainWindowHandel = driver.getWindowHandle();

		// Switching to the new window

		Set<String> allWindows = driver.getWindowHandles();

		for (String Windowhandle1 : allWindows) {

			if (!Windowhandle1.equals(mainWindowHandel)) {

				driver.switchTo().window(Windowhandle1);

				createAccountPage.setSelectDrpdwn();

				createAccountPage.setFirstName("Mohamed");

				createAccountPage.setLastName("Shajan");

				createAccountPage.setDOB();

				Thread.sleep(3000);

				// Selecting month

				WebElement dd = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));

				Select select = new Select(dd);

				select.selectByVisibleText("February");

				Thread.sleep(3000);

				// Selecting Year

				WebElement yy = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

				Select select1 = new Select(yy);

				select1.selectByValue("1997");

				Thread.sleep(3000);

				driver.findElement(By.xpath("//div[text()='4']")).click();

				createAccountPage.setMobileNumber("8072715417");

				Thread.sleep(2000);

				createAccountPage.setEmail("mohamedshajanh@gmail.com");

				createAccountPage.setNewPassword("Temp@1234");

				createAccountPage.setConfPassword("Temp@1234");

				createAccountPage.setCheckbox();

				createAccountPage.setSubmit();

				String str = driver.findElement(By.xpath("//label[text()='OTP Verification']")).getText();

				System.out.println(str);

				Assert.assertEquals(str, "OTP Verification");

				driver.close();

				driver.switchTo().window(mainWindowHandel);
			}

		}

	}
}

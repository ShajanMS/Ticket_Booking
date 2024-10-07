package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBookingPage {
	
	WebDriver driver;
	
	public  ManageBookingPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='manage booking']")
	
	WebElement ManageBooking;
	
	@FindBy(xpath = "//input[@type='text'][1]")
	
	WebElement PNRNum;
	
	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com / Doe']")
	
	WebElement Email;
	
	@FindBy(xpath = "//div[text()='Search Booking']")
	
	WebElement Search;
	
	public void setManageBooking() {
		
		ManageBooking.click();
	}
	
	public void setPNRNum(String pnr) {
		
		PNRNum.sendKeys(pnr);
	}
	
	public void setEmail(String email) {
		
		Email.sendKeys(email);
	}
	
	public void setSearch() {
		
		Search.click();
	}

}

package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInPage {

	WebDriver driver;
	
	public CheckInPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='check-in']")
	
	WebElement CheckInButton;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/input")
	
	WebElement PNRNum;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/input")
	
	WebElement Email;
	
	@FindBy(xpath = "//div[text()='Search Booking']")
	
	WebElement Search;
	
	// Method to fill out the Check-In Page
	
	public void setCheckInButton() {
		
		CheckInButton.click();
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

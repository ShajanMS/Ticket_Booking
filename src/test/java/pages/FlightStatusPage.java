package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightStatusPage {
	
	WebDriver driver;
	
	public FlightStatusPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//Locator For all the element
	
	@FindBy(xpath = "//div[text()='flight status']")
	
	WebElement FlightStatus;
	
	@FindBy(xpath = "//div[text()='Departure Date']")
	
	WebElement DepartureDate;
	
	@FindBy(xpath = "//div[text()='Today']")
	
	WebElement Today;
	
	@FindBy(xpath = "//div[text()='From']")
	
	WebElement From;
	
	@FindBy(xpath = "//div[text()='MAA']")
	
	WebElement Chennai;
	
	@FindBy(xpath = "//div[text()='To']")
	
	WebElement To;
	
	@FindBy(xpath = "//div[text()='HYD']")
	
	WebElement Hyderabad;
	
	@FindBy(xpath = "//div[text()='Search Flights']")
	
	WebElement FlightSearch;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-1ah4tor r-1otgn73']")
	
	WebElement FlightTiming;
	
	//Method to fill out the Flight Status
	
	public void setFlightStatus() {
		
		FlightStatus.click();
	}
	
	public void setDepartureDate() {
		
		DepartureDate.click();
	}
	
	public void setToday() {
		
		Today.click();
	}
	
	public void setFrom() {
		
		From.click();
	}
	
	public void setChennai() {
		
		Chennai.click();
	}
	
	public void setTo() {
		
		To.click();
	}
	
	public void setHyderabad() {
		
		Hyderabad.click();
	}
	
	public void setFlightSearch() {
		
		FlightSearch.click();
	}
	
	public void setFlightTiming() {
		
		FlightTiming.getText();
	}
}

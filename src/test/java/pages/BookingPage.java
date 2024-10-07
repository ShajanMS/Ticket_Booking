package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
	
			WebDriver driver;
			
	public BookingPage(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath = "//div[@data-testid='title-contact-detail-card']")
	 
	 WebElement Title;
	 
	 @FindBy(xpath = "//div[text()='Enter valid first name']")
	 
	 WebElement FirstName;
	 
	 @FindBy(xpath = "//div[text()='Enter valid last name']")
	 
	 WebElement LastName;
	 
	 @FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	 
	 WebElement MobileNumber;
	 
	 @FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	 
	 WebElement EmailId;
	 
	 @FindBy(xpath = "//div[text()='India']")
	 
	 WebElement CountryMenu;
	 
	 @FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	 
	 WebElement TownCity;
	 
	 @FindBy(xpath = "//div[text()='Retain my details for the next visit.']")
	 
	 WebElement RetainMyDetails;
	 
	 @FindBy(xpath = "//div[@data-testid='traveller-0-title-field']")
	 
	 WebElement Title1;
	 
	 @FindBy(xpath = "//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	 
	 WebElement FirstName1;
	 
	 @FindBy(xpath = "//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	 
	 WebElement LastName1;
	 
	 @FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
	 
	 WebElement MobileNumber1;
	 
	 @FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	 
	 WebElement Continue;
	 
	 public void setTitle() {
		
		 Select select = new Select(Title);
		 
		 select.selectByIndex(1);
	}
	 
	 public void setFirstName(String fname) {
		
		 FirstName.sendKeys(fname);
	}
	 
	 public void setLastName(String lname) {
		
		 LastName.click();
	}
	 
	 public void setMobileNumber(String mobile) {
		
		 MobileNumber.sendKeys(mobile);
	}
	 
	 public void setEmailId(String email) {
		
		 EmailId.sendKeys(email);
	}
	 
	 public void setCountryMenu() {
		
		 Select select1 = new Select(CountryMenu);
		 
		 select1.deselectByVisibleText("India");
	}
	 
	 public void setTownCity(String town) {
		
		 TownCity.clear();
		 
		 TownCity.sendKeys(town);
	}
	 
	 public void setTitle1() {
		
		 Select select2 = new Select(Title1);
		 
		 select2.selectByIndex(1);
	}
	 
	 public void setFirstName1(String fname1) {
		
		 FirstName1.sendKeys(fname1);
	}
	 
	 public void setLastName1(String lname1) {
		
		 LastName1.sendKeys(lname1);
	}
	 
	 public void setMobileNumber1(String mobile1) {
		
		 MobileNumber1.sendKeys(mobile1);
	}
	 
	 public void setContinue() {
		
		 Continue.click();
	}

}

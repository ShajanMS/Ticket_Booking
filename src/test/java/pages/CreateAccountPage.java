package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	WebDriver driver;
	
	// Constructor to initialize the driver and web elements

	public CreateAccountPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	  // Locators for the elements on the Sign-Up page
	
	@FindBy(xpath = "//div[text()='Signup']")
	
	WebElement ClickSignupbutton;
	
	@FindBy(xpath = "//select[@class='form-control form-select']")
	
	WebElement SelectDrpdwn;
	
	@FindBy(xpath = "//input[@id='first_name']")
	
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='dobDate']")
	
	WebElement DOB;
	
	@FindBy(xpath = "//input[@class=' form-control']")
	
	WebElement MobileNumber;
	
	@FindBy(xpath = "//input[@id='email_id']")
	
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='new-password']")
	
	WebElement NewPassword;
	
	@FindBy(xpath = "//input[@id='c-password']")
	
	WebElement ConfPassword;
	
	@FindBy(xpath = "//input[@id='defaultCheck1']")
	
	WebElement Checkbox;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement Submit;
	
	// Method to fill out the sign-up form
	
	 public void setClickSignupbutton() {
		 
		 ClickSignupbutton.click();
	 }
	 
	 public void setSelectDrpdwn() {
		
		 Select select = new Select(SelectDrpdwn);
		 
		 select.selectByValue("MR");
	}
	 
	 public void setFirstName(String fname) {
		 
		 FirstName.sendKeys(fname);
	}
	 
	 public void setLastName(String lname) {
		 
		 LastName.sendKeys(lname);	
	}
	 
	 public void setDOB() {
		 
		 DOB.click();
	}
	 
	 public void setMobileNumber(String mobile) {
		 
		MobileNumber.sendKeys(mobile);
	}
	 
	 public void setEmail(String email) {
		 
		 Email.sendKeys(email);
	}
	 
	 public void setNewPassword(String password) {
		 
		 NewPassword.sendKeys(password);	
	}
	 
	 public void setConfPassword(String Confpassword) {
		 
		 ConfPassword.sendKeys(Confpassword);
	}
	 
	 public void setCheckbox() {
		
		 Checkbox.click();
	}
	 
	 public void setSubmit() {
		
		 Submit.click();
	}
}

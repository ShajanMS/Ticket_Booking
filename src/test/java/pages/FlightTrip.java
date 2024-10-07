package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightTrip {
	
	WebDriver driver;
	
	//Constructor to initialize the driver and web elements

	public FlightTrip(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//Locators for the elements on the Flight trip page
	
	//One Way Trip
	
	@FindBy(xpath = "//div[text()='one way']")
	
	private WebElement OneWay;
	
	//Round Trip
	
	@FindBy(xpath = "//div[text()='round trip']")
	
	private WebElement RoundTrip;
	
	//Departure
	
	@FindBy(xpath = "//input[@value='Delhi (DEL)']")
	
	private WebElement Departure;
	
	//Arrival
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")
	
	private WebElement Destination;
	
	//Select Departure City
	
	@FindBy(xpath = "//div[text()='MAA']")
	
	private WebElement selectChennai;
	
	//Select Destination City
	
	@FindBy(xpath = "//div[contains(text(),'DEL')]")
	
	private WebElement selectDelhi;
	
	@FindBy(xpath = "//div[text()='Departure Date']")
	
	private WebElement DepartureDate;
	
	//Choosing Departure day
	
	@FindBy(xpath = "//div[text()='31']")
	
	private WebElement DepartureDay;
	
	//Choosing Return Date
	
	@FindBy(xpath = "//div[text()='Return Date']")
	
	private WebElement ReturnDate;
	
	//Choosing Return Day
	
	@FindBy(xpath = "//div[text()=20']")
	
	private WebElement ReturnDay;
	
	//Choosing Passenger
	
	@FindBy(xpath = "//div[text()='Passengers']")
	
	private WebElement Passengers;
	
	//Choosing Adult
	
	@FindBy(xpath = "//div[@data-testid='Adult-testID-plus-one-cta']")
	
	private WebElement NoOfAdult;
	
	//Choosing Child
	
	@FindBy(xpath = "//div[@data-testid='Children-testID-plus-one-cta']")
	
	private WebElement NoOfChild;
	
	//Clicking button after selecting Adult and Child
	
	@FindBy(xpath = "//div[text()='Passengers']")
	
	private WebElement Passengers1;
	
	//Selecting Currency from Dropdown
	
	@FindBy(xpath = "//div[text()='Currency']")
	
	private WebElement Currency;
	
	//Selecting Passenger type
	
	@FindBy(xpath = "//div[text()='Armed Forces']")
	
	private WebElement ArmedForces;
	
	//Search Flight button
	
	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	
	private WebElement SearchFlight;
	
	//Selecting Amount
	
	@FindBy(xpath = "//*[@id=\"list-results-section-0\"]/div[5]/div/div/div[2]/div[3]/div/div/div")
	
	private WebElement selectAmt;
	
	//Select ContinueButton
	
	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	
	private WebElement ContinueButton;
	
	public void setOneWay() {
		
		OneWay.click();		
	}
	
	public void setRoundTrip() {
		
		RoundTrip.click();	
	}
	
	public void setDeparture() {
		
		Departure.click();	
	}
	
	public void setDestination() {
		
		Destination.click();
	}
	
	public void setselectChennai() {
		
		selectChennai.click();
	}
	
	public void setselectDelhi() {
		
		selectDelhi.click();
	}
	
	public void setDepartureDate() {
		
		DepartureDate.click();
	}
	
	public void setDepartureDay() {
		
		DepartureDay.click();
	}
	
	public void setReturnDate() {
		
		ReturnDate.click();
	}
	
	public void setReturnDay() {
		
		ReturnDay.click();
	}
	
	public void setPassengers() {
		
		Passengers.click();
	}
	
	public void SetPassengers1() {
		
		Passengers1.click();
	}
	
	public void setCurrency() throws InterruptedException {
		
		Select select = new Select(Currency);
		
		select.selectByIndex(1);
		
		Thread.sleep(3000);
	}
	
	public void setSearchFlight() {
		
		SearchFlight.click();
	}
	
	public void setContinueButton() {
		
		ContinueButton.click();
	}
}

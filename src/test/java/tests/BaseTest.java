package tests;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.BookingPage;
import pages.CheckInPage;
import pages.CreateAccountPage;
import pages.FlightStatusPage;
import pages.FlightTrip;
import pages.LoginPage;
import pages.ManageBookingPage;

public class BaseTest {
	
	public static WebDriver driver;
	
	public BookingPage bookingPage;
	
	public CreateAccountPage createAccountPage;
	
	public FlightTrip flightTrip;
	
	public LoginPage loginPage;
	
	public CheckInPage checkInPage;
	
	public FlightStatusPage flightStatusPage;
	
	public ManageBookingPage manageBookingPage;
	
	@Parameters("browser")
	
	@BeforeMethod
	
	public void setUp(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
			FirefoxOptions options = new FirefoxOptions();
			
			options.addArguments("--disable-notifications");
			
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		bookingPage = new BookingPage(driver);
		
		createAccountPage = new CreateAccountPage(driver);
		
		flightTrip = new FlightTrip(driver);
		
		loginPage = new LoginPage(driver);
		
		checkInPage = new CheckInPage(driver);
		
		flightStatusPage = new FlightStatusPage(driver);
		
		manageBookingPage = new ManageBookingPage(driver);	
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	
	public static class ScreenshotUtility {

	    private static WebDriver driver; // Ensure that driver is initialized before using it in this method

	    public static String takeScreenshots(String testCaseName) {
	        
	    	// Capture the screenshot as a file object using java.io.File explicitly
	    	
	        TakesScreenshot takesScreenshots = (TakesScreenshot) driver;
	        
	        // Get the screenshot as a file
	        
	        java.io.File srcFile = takesScreenshots.getScreenshotAs(OutputType.FILE);

	        // Declare and define the destinationFile variable
	        
	        java.io.File destinationFile = new java.io.File("Screenshots/" + testCaseName + ".png");

	        try {
	            // Copy the screenshot to the destination
	        	
	            FileUtils.copyFile(srcFile, destinationFile);
	            
	        } catch (IOException e) {
	            
	        	throw new RuntimeException("Failed to take screenshot", e);
	        }

	        // Create the HTML path for displaying in the test report using destinationFile
	        
	        String path = "<img src=\"" + destinationFile.getAbsolutePath() + "\" width=\"200px\" height=\"200px\"/>";

	        // Log the path to the test report
	        
	        Reporter.log(path);

	        // Return the absolute path of the screenshot file
	        
	        return destinationFile.getAbsolutePath();
	    }
	}

	public static String takesScreenshots(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
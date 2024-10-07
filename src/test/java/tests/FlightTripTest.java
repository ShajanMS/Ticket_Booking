package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTripTest extends BaseTest {
	
	@Test 
	
	public void toFlightTrip()throws InterruptedException{
		
		flightTrip.setOneWay();
		flightTrip.setDeparture();
		flightTrip.setselectChennai();
		flightTrip.setDestination();
		flightTrip.setselectDelhi();
		Thread.sleep(3000);
		flightTrip.setDepartureDate();
		flightTrip.setReturnDate();
		flightTrip.setReturnDay();
		flightTrip.setPassengers();
		flightTrip.SetPassengers1();
		flightTrip.setSearchFlight();
		Thread.sleep(7000);
		flightTrip.setContinueButton();
		Thread.sleep(9000);
		bookingPage.setFirstName("Mohamed");
		bookingPage.setLastName("Shajan");
		bookingPage.setMobileNumber("8072715417");
		bookingPage.setEmailId("mohamedshajanh@gmail.com");
		bookingPage.setCountryMenu();
		bookingPage.setTownCity("Chennai");
		
		//Adding passenger detail
		
		bookingPage.setFirstName1("Mohamed");
		bookingPage.setLastName1("Shajan");
		bookingPage.setMobileNumber1("8072715417");
		bookingPage.setContinue();
		Thread.sleep(7000);
		String str = driver.getCurrentUrl();
		Assert.assertEquals(str, "https://www.spicejet.com/booking/addons");
	}

	@Test
	public void toFlightTrip1()throws InterruptedException{
		
		flightTrip.setRoundTrip();
		flightTrip.setDeparture();
		flightTrip.setselectChennai();
		flightTrip.setDestination();
		flightTrip.setselectDelhi();
		Thread.sleep(3000);
		flightTrip.setDepartureDate();
		flightTrip.setReturnDate();
		flightTrip.setReturnDay();
		flightTrip.setPassengers();
		flightTrip.SetPassengers1();
		flightTrip.setSearchFlight();
		Thread.sleep(7000);
		flightTrip.setContinueButton();
		Thread.sleep(9000);
		bookingPage.setFirstName("Mohamed");
		bookingPage.setLastName("Shajan");
		bookingPage.setMobileNumber("8072715417");
		bookingPage.setEmailId("mohamedshajanh@gmail.com");
		bookingPage.setCountryMenu();
		bookingPage.setTownCity("Chennai");
		//Adding passenger details
		
		bookingPage.setFirstName1("Mohamed");
		bookingPage.setLastName("Shajan");
		bookingPage.setMobileNumber1("8072715417");
		bookingPage.setContinue();
		Thread.sleep(6000);
		
		String str = driver.getCurrentUrl();
		
		Assert.assertEquals(str, "https://www.spicejet.com/booking/addons");
	}
	
	@Test
	
	public void validatingOneWayAndRoundWay() {
		
		String ExectedValue = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String ActualValue = driver.getTitle();
		Assert.assertEquals(ActualValue, ExectedValue);
	}
}

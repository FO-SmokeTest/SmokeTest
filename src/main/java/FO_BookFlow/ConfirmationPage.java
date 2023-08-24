package FO_BookFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class ConfirmationPage extends AbstractComponents {
	
	static WebDriver driver;
	public static String BookingRef;
	public static String BookingDeptDate;
	public static String BookingLeadPax;
	public static String BookingAirports;
	public static String SelectedBaggage;
	public static String SelectedSportsSSR;
	public static String SelectedPetSSR;
	public static String SelectedInsurance;
	

	@SuppressWarnings("static-access")
	public ConfirmationPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void ConfirmationPageVerification()
	{
		
		String URL = driver.getCurrentUrl();
		if(!URL.contains("book/fail"))
		{
			System.out.println("Booking confirmation page displayed... Printing booking details");
		}
		else 
		{
			System.out.println("Booking confirmation page not displaying, Please check it manually");
		}
	}
	
	public static void BookingDetails() throws InterruptedException
	{
		
		ConfirmationPageVerification();
		
		SelectedBaggage = null;
		SelectedSportsSSR = null;
		SelectedPetSSR = null;
		SelectedInsurance = null;

		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_BookingRefInConfirmationPage));
		BookingRef = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_BookingRefInConfirmationPage)).getText();
		
		SearchContext shadow = driver.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Shadowhost_PaymentAndConfirmationPage)).getShadowRoot();
		
		shadow.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ExpandPassengersInConfirmationPage)).click();
		BookingLeadPax = shadow.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_LeadPassengerInConfirmationPage)).getText();
		
		shadow.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ExpandJourneyInConfirmationPage)).click();
		BookingAirports = shadow.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_AirportsInConfirmationPage)).getText();
		BookingDeptDate = shadow.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_DepartureDateInConfirmationPage)).getText();
		
		SelectedBaggage = FlightoptionsPage.Baggage;
		SelectedSportsSSR = FlightoptionsPage.SportSSR;
		SelectedPetSSR = FlightoptionsPage.PetSSR;
		SelectedInsurance = ExtraoptionsPage.Insurance;
				
		System.out.println("----------**********----------");
		System.out.println( BookflowWebsite.website + " - " + SearchPage.JourneyType + " Reservation got success...");
		System.out.println("Below are the booking details...");
		System.out.println("Booking Ref: " + BookingRef);
		System.out.println("Journey route: " + BookingAirports);
		System.out.println("Departing: " + BookingDeptDate);
		System.out.println("LeadPax: " + BookingLeadPax );
		System.out.println("Baggage details: " + SelectedBaggage);
		System.out.println("SportsSSR details: " + SelectedSportsSSR);
		System.out.println("PetSSR details: " + SelectedPetSSR);
		System.out.println("     ");
		System.out.println("----------**********----------**********----------**********----------**********----------**********----------**********");
		System.out.println("**********----------**********----------**********----------**********----------**********----------**********----------");
		
		
		FO_MMB.ReservationDetails.ReservationStore(BookflowWebsite.website);
		
		driver.close();
	}
	
	public static String PrintBookingRefinReport() 
	{
		String ReservationRef = "BookingRef: " + BookingRef;
		return ReservationRef;
		
	}
	
	public static String PrintDeptDateinReport() 
	{
		String DepartureDate = "DepartureDate: " + BookingDeptDate;
		return DepartureDate;
		
	}
	
	public static String PrintLeadPaxNameReport() 
	{
		String LeadPaxName = "LeadPaxName: " + BookingLeadPax;
		return LeadPaxName;
		
	}
	
	public static String PrintBaggageReport() 
	{
		String Baggage = "Baggage details: " + SelectedBaggage;
		return Baggage;
		
	}
	
	public static String PrintSportSSRReport() 
	{
		String SportsSSR = "SportsSSR details: " + SelectedSportsSSR;
		return SportsSSR;
		
	}
	
	public static String PrintPetSSRReport() 
	{
		String PetSSR = "PetSSR details: " + SelectedPetSSR;
		return PetSSR;
		
	}
	
	public static String PrintInsuranceReport() 
	{
		String Insurance = "Insurance details: " + SelectedInsurance;
		return Insurance;
		
	}

}

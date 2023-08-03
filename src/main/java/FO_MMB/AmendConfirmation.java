package FO_MMB;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_MMB;

public class AmendConfirmation extends AbstractComponents {
	
	static WebDriver driver;
	public static String Baggage;
	public static String SportSSR;
	public static String PetSSR;

	@SuppressWarnings("static-access")
	public AmendConfirmation(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void AmendConfirmVerification() 
	{
		waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_BookingRefOnAmendConfirm));
		String BookingRef = driver.findElement(By.xpath(xpathsFO_MMB.xpath_BookingRefOnAmendConfirm)).getText();
		
		String ActualBookingRef = MMBWebsite.BookingRef;
		Boolean VerifyTitle = driver.getCurrentUrl().contains("managemybooking/managepaymentconfirm");
		assertTrue(VerifyTitle);
		
		if(BookingRef==ActualBookingRef) 
		{
			System.out.println("Amendment completed sucessfully...");
		}
		else 
		{
			System.out.println("Amendment confirmation page not displaying, Please check manually...");
		}
		
		Baggage = FlightAmendments.Baggage;
		SportSSR = FlightAmendments.SportSSR;
		PetSSR = FlightAmendments.PetSSR;
		
		
	}
	
	public static String MMBRetrievalOnReport() 
	{
		String Retrieval = "MMB Retrieval passed";
		return Retrieval;
		
	}
	
	public static String PrintDocsOnReport() 
	{
		String Document = MMBWebsite.FinalDoc;
		return Document;
		
	}
	
	public static String PrintBaggageReport() 
	{
		String SelectedBaggage = "Added Baggage: " + Baggage;
		return SelectedBaggage;
		
	}
	
	public static String PrintSportSSRReport() 
	{
		String SelectedSportsSSR = "Added SportsSSR: " + SportSSR;
		return SelectedSportsSSR;
		
	}
	
	public static String PrintPetSSRReport() 
	{
		String SelectedPetSSR = "Added PetSSR: " + PetSSR;
		return SelectedPetSSR;
		
	}
	
	public static String AmendmentOnReport() 
	{
		String Retrieval = "Amendment completed sucessfully...";
		return Retrieval;
		
	}

}

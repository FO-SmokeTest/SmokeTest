package FO_BookFlow;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class FlightoptionsPage extends AbstractComponents {
	
	static WebDriver driver;
	public static String Baggage;
	public static String SportSSR;
	public static String PetSSR;

	@SuppressWarnings("static-access")
	public FlightoptionsPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void FlightOptionsPageVerification()
	{
		
        if(shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Oneway)).isDisplayed()) 
        {
        	driver.navigate().refresh();
        	System.out.println("Flight options page is not loading in 1st attempt, Page Refresh initiated...");
        		
        	if (shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Oneway)).isDisplayed()) 
        	{
        		System.out.println("Flight options page is not loading in 2nd attempt, Please check manually");
        	}
        	else 
        	{
        		System.out.println("Flight options page loaded in 2nd attempt...");
        	}
        }
        else
        {
        	System.out.println("Flight options page loaded...");
        }
	}
	
	public static void FlightExtras(String baggage, String sportsSSR, String petSSR) throws InterruptedException
	{
		Baggage = baggage;
		SportSSR = sportsSSR;
		PetSSR = petSSR;
		
//		FlightOptionsPageVerification();
		Boolean VerifyTitle = driver.getCurrentUrl().contains("book/flightoptions");
		assertTrue(VerifyTitle);
		Thread.sleep(5000);
		waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SportsLink)));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage)).click();
		
		
		if (!Baggage.contentEquals("NA")) 
		{
			BaggageSelection(Baggage);
			Thread.sleep(5000);
			System.out.println("Selected Baggage: " + Baggage);
		}
		else if (!SportSSR.contentEquals("NA")) 
		{
			SportsSelection(SportSSR);
			Thread.sleep(5000);
			System.out.println("Selected SportSSR: " + SportSSR);
		}
		else if (!PetSSR.contentEquals("NA")) 
		{
			PetsSelection(PetSSR);
			Thread.sleep(5000);
			System.out.println("Selected PetSSR: " + PetSSR);
		}
		
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromFlightOptionsPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromFlightOptionsPage)).click();
		
		System.out.println("Navigating to Extra options page...");
		
	}
	
	public static void BaggageSelection(String baggage) throws InterruptedException 
	{
				
		if (baggage.contains("20"))
		{
			waitForWebElement(Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_20kgBaggagePax1)));
			Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_20kgBaggagePax1)).click();
			
		}
		else if (baggage.contains("25"))
		{
			waitForWebElement(Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_25kgBaggagePax1)));
			Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_25kgBaggagePax1)).click();
			
		}
		else if (baggage.contains("30"))
		{
			waitForWebElement(Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_30kgBaggagePax1)));
			Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_30kgBaggagePax1)).click();
			
		}
		else if (baggage.contains("40"))
		{
			waitForWebElement(Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_40kgBaggagePax1)));
			Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_40kgBaggagePax1)).click();
			
		}
		else if (baggage.contains("50"))
		{
			waitForWebElement(Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_50kgBaggagePax1)));
			Baggage_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_50kgBaggagePax1)).click();
			
		}
		else 
		{
			System.out.println("Please select a valid baggage...");
		}
		
	}		
	
	public static void SportsSelection(String sports) throws InterruptedException 
	{
		
		waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SportsLink)));
		Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SportsLink)).click();
		Thread.sleep(2000);
		
		if(sports.contains("Bicycle")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_BicycleSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_BicycleSportsPax1)).click();
		
		}
		else if(sports.contains("SurfBoard")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SurfBoardSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SurfBoardSportsPax1)).click();
			
		}
		else if(sports.contains("Golf")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_GolfSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_GolfSportsPax1)).click();
			
		}
		else if(sports.contains("Paraglider")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ParagliderSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ParagliderSportsPax1)).click();
			
		}
		else if(sports.contains("Dive")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_DiveSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_DiveSportsPax1)).click();
			
		}
		else if(sports.contains("WaterSki")) 
		{
//			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_WaterSkiSportsPax1)));
			Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_WaterSkiSportsPax1)).click();
			
		}
		else 
		{
			System.out.println("Please select a valid sport SSR...");
		}
		
	}
	
	public static void PetsSelection(String pet) throws InterruptedException 
	{
		
		waitForWebElement(Pets_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PetsLink)));
		Pets_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PetsLink)).click();
		Thread.sleep(2000);
		
		if(pet.contains("AVIH")) 
		{
			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_AvihPetPax1)));
			Pets_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_AvihPetPax1)).click();
			
		}
		else if(pet.contains("PETC")) 
		{
			waitForWebElement(Sports_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PetcPetPax1)));
			Pets_ShadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PetcPetPax1)).click();
			
		}
		else 
		{
			System.out.println("Please select a valid pet SSR...");
		}
		
	}

}

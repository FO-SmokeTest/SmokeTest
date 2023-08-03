package FO_MMB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_MMB;

public class FlightAmendments extends AbstractComponents {
	
	static WebDriver driver;
	public static String Baggage;
	public static String SportSSR;
	public static String PetSSR;

	@SuppressWarnings("static-access")
	public FlightAmendments(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void FlightAmends(String baggage, String sportsSSR, String petSSR) throws InterruptedException
	{
		Baggage = baggage;
		SportSSR = sportsSSR;
		PetSSR = petSSR;
		
		waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_ClickBaggage));
		
		if (!Baggage.contentEquals("NA")) 
		{
			BaggageAmends(Baggage);
			Thread.sleep(5000);
			waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_SaveBaggage));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_SaveBaggage)).click();
		}
		else if (!SportSSR.contentEquals("NA")) 
		{
			SportsAmends(SportSSR);
			Thread.sleep(5000);
			waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_SaveSportsSSR));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_SaveSportsSSR)).click();
		}
		else if (!PetSSR.contentEquals("NA")) 
		{
			PetsAmends(PetSSR);
			Thread.sleep(5000);
			waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_SavePetSSR));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_SavePetSSR)).click();
		}
		
		
		waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_ContinueFromMMB));
		driver.findElement(By.xpath(xpathsFO_MMB.xpath_ContinueFromMMB)).click();
		
		System.out.println("Navigating to Review changes page...");
		
		ReviewChangesPage.ContinueFromReviewChangesPage();
		
	}
	
	public static void BaggageAmends(String baggage) throws InterruptedException 
	{
		waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_ClickBaggage));
		driver.findElement(By.xpath(xpathsFO_MMB.xpath_ClickBaggage)).click();
		Thread.sleep(2000);
				
		if (baggage.contains("20"))
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_20kgBaggagePax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_20kgBaggagePax1)).click();
			System.out.println("20Kg baggage selected...");
			
		}
		else if (baggage.contains("25"))
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_25kgBaggagePax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_25kgBaggagePax1)).click();
			System.out.println("25Kg baggage selected...");
			
		}
		else if (baggage.contains("30"))
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_30kgBaggagePax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_30kgBaggagePax1)).click();
			System.out.println("30Kg baggage selected...");
			
		}
		else if (baggage.contains("40"))
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_40kgBaggagePax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_40kgBaggagePax1)).click();
			System.out.println("40Kg baggage selected...");
			
		}
		else if (baggage.contains("50"))
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_50kgBaggagePax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_50kgBaggagePax1)).click();
			System.out.println("50Kg baggage selected...");
			
		}
		
	}		
	
	public static void SportsAmends(String sports) throws InterruptedException 
	{
		
		waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_ClickSports));
		driver.findElement(By.xpath(xpathsFO_MMB.xpath_ClickSports)).click();
		Thread.sleep(2000);
		
		if(sports.contains("Bicycle")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_BicycleSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_BicycleSportsPax1)).click();
			System.out.println("Bicycle SSR selected...");
			
		}
		else if(sports.contains("SurfBoard")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_SurfBoardSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_SurfBoardSportsPax1)).click();
			System.out.println("SurfBoard SSR selected...");
			
		}
		else if(sports.contains("Golf")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_GolfSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_GolfSportsPax1)).click();
			System.out.println("Golf SSR selected...");
			
		}
		else if(sports.contains("Paraglider")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_ParagliderSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_ParagliderSportsPax1)).click();
			System.out.println("Paraglider SSR selected...");
			
		}
		else if(sports.contains("Dive")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_DiveSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_DiveSportsPax1)).click();
			System.out.println("Dive SSR selected...");
			
		}
		else if(sports.contains("WaterSki")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_WaterSkiSportsPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_WaterSkiSportsPax1)).click();
			System.out.println("WaterSki SSR selected...");
			
		}
		
	}
	
	public static void PetsAmends(String pet) throws InterruptedException 
	{
		
		waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_ClickPets));
		driver.findElement(By.xpath(xpathsFO_MMB.xpath_ClickPets)).click();
		Thread.sleep(2000);
		
		if(pet.contains("AVIH")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_AvihPetPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_AvihPetPax1)).click();
			System.out.println("AVIH SSR selected...");
			
		}
		else if(pet.contains("PETC")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_MMB.xpath_PetcPetPax1));
			driver.findElement(By.xpath(xpathsFO_MMB.xpath_PetcPetPax1)).click();
			System.out.println("PETC SSR selected...");
			
		}
		
	}

}

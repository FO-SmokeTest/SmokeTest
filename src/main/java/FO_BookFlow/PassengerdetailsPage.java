package FO_BookFlow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.PassengerInformation;
import Resources.xpathsFO_BookFlow;

public class PassengerdetailsPage extends PassengerInformation {
	
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public PassengerdetailsPage(WebDriver driver) throws IOException 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
	}
	
	public static void PassengerDetailsPageVerification() 
	{
        	
        if(!driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FlightExtraPassengerPageLoadVerification)).isDisplayed()) 
        {
        	driver.navigate().refresh();
        	
        	waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FlightExtraPassengerPageLoadVerification));
        	
        	System.out.println("Page Refreshed as Passenger details page not displaying 1st attempt...");
        		
        	if (!driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FlightExtraPassengerPageLoadVerification)).isDisplayed()) 
        	{
        		System.out.println("Passenger details page not displaying 2nd attempt, Please check manually");
        	}
        	else 
        	{
        		System.out.println("Passenger details page loaded in 2nd attempt...");
        	}
        }
        else
        {
        	System.out.println("Passenger details page loaded...");
        }
	}
	
	public static void SingleAdult ()
	{
		LeadPassenger();
		Address();
		ContactDetails();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void OneAdultsOneChild () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		ChildAs2ndPax();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void OneAdultsOneInfant () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		InfantAs2ndPax();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdults () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdultsOneChild () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		ChildAs3rdPax();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdultsTwoChilds () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		ChildAs3rdPax();
		ChildAs4thPax ();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdultsOneInfant () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		InfantAs3rdPax();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdultsTwoInfants () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		InfantAs3rdPax();
		InfantAs4thPax ();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}
	
	public static void TwoAdultsOneChildOneInfant () throws InterruptedException
	{
		LeadPassenger();
		Address();
		ContactDetails();
		NonLeadPassenger();
		ChildAs3rdPax();
		InfantAs4thPax ();
		EmargencyDetails();
		System.out.println("Navigating to Payment options page");
	}

}

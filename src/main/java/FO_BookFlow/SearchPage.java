package FO_BookFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class SearchPage extends AbstractComponents{
	
static WebDriver driver;
public static String JourneyType;


	@SuppressWarnings("static-access")
	public SearchPage(WebDriver driver) 

	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** Common search page methods ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****----- 
	
	public static void JourneyWay (String JourneyWay)
	{	
		String Way = JourneyWay;
		
		if(Way.equalsIgnoreCase("Oneway")) 
		{
			shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Oneway)).click();
		}
		else if(Way.equalsIgnoreCase("Twoway")) 
		{
//			shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Twoway)).click();
		}
		
		JourneyType = JourneyWay;
		System.out.println("Journey style: "+ JourneyType);
		
	}
	
	public static void SearchAirports(String outbound, String inbound) 
	{
		//Selecting Outbound flight
        WebElement OutboundSearch = shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_OutboundSearch));
        waitForWebElement(OutboundSearch);
        OutboundSearch.click();
        String OutboundCSS = "#" + outbound;
        shadowHost().findElement(By.cssSelector(OutboundCSS)).click();
//        shadowHost().findElement(By.partialLinkText(outbound)).click();
    
      //Selecting Inbound flight
        WebElement InboundSearch = shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_InboundSearch));
        waitForWebElement(InboundSearch);
        InboundSearch.click();
        String InboundCSS = "#allAirports #" + inbound;
        shadowHost().findElement(By.cssSelector(InboundCSS)).click();
//        shadowHost().findElement(By.partialLinkText(inbound)).click();
    
        System.out.println("Outbound airport: "+ outbound +" and Inbound airport: "+ inbound);
    
	}
	
	public static void OnlyOutbounddate(String month, String date) 
	{
		
		//Selecting Outbound date
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_OutboundCalendertextbox)).click();
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_OutboundMonth, month);
		ListofWebelementsByCSS(xpathsFO_BookFlow.cssSelector_OutboundDate, date);
				
		System.out.println("Outbound date: "+ date +" "+ month);	
	}
	
	public static void BothOutAndInbounddate(String outboundMonth, String outboundDate, String inboundMonth, String inboundDate) 
	{   
		//Selecting Outbound date
		OnlyOutbounddate(outboundMonth, outboundDate);
		
		//Selecting Inbound date
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_InboundCalendertextbox)).click();
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_InboundMonth, inboundMonth);
		ListofWebelementsByCSS(xpathsFO_BookFlow.cssSelector_InboundDate, inboundDate);
	
		System.out.println("Inbound date: "+inboundDate +" "+inboundMonth);
	}
	
	public static void PassengersAdults(String adults) throws InterruptedException 
	{
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PassengerDropdown)).click();

		//Selecting Adults
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_AdultDropdown, adults);
		System.out.println("Adult Passengers: " +adults + " Adults");
		
		SearchResults();	
	}
	
	public static void PassengersAdultsChild(String adults, String child, String child1age) throws InterruptedException
	{	
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PassengerDropdown)).click();
		
		//Selecting Adults
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_AdultDropdown, adults);	
		System.out.println("Adult Passengers: " +adults + " Adults");
		
		//Selecting Childs and age
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_ChildDropdown, child);
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_SingleChildAgeDropdown, child1age);		
		System.out.println("Child Passengers: " +child + " Child aged " + child1age + " years");
		
		SearchResults();
		
	}
	
	public static void PassengersAdultsChilds(String adults, String childs, String child1age, String child2age) throws InterruptedException 
	{
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_PassengerDropdown)).click(); 
		
		//Selecting Adults
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_AdultDropdown, adults);		
		System.out.println("Adult Passengers: " +adults + " Adults");
		
		//Selecting Childs and age
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_ChildDropdown, childs);
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_Child1AgeDropdown, child1age);
		DropdownByCSS(xpathsFO_BookFlow.cssSelector_Child2AgeDropdown, child2age);
		
		System.out.println("Child Passengers: " + childs + " Childs aged " + child1age + ", " +child2age + " years");
		
		SearchResults();
	}
	
    public static void SearchButton()  
    {
    	
		shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_SearchButton)).click();
    	System.out.println("Search initiated...");
    	
    }
    
    public static void SearchResults() throws InterruptedException
    {
    	SearchButton();
    	
    	if(JourneyType.equalsIgnoreCase("Oneway")) 
		{
    		driver.navigate().refresh();
    		OnewaySearchResults();
		}
		else if(JourneyType.equalsIgnoreCase("Twoway")) 
		{
			driver.navigate().refresh();
			TwowaySearchResults();
		}
    }
    
    public static void OnewaySearchResults() throws InterruptedException
    {
    	
    	String website = BookflowWebsite.website;
    	if (website.contains("MA_B2C")) 
    	{
    		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_MADSelection));
    		WebElement CurrencyConverter = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MADSelection));
    		Select MADSelection = new Select (CurrencyConverter);
    		MADSelection.selectByVisibleText("MAD");
    	}
    	
    	WebElement NearbyAirportsUncheck = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_NearByAirortsCheckbox));
    	waitForWebElement(NearbyAirportsUncheck);
    	NearbyAirportsUncheck.click();
    	
    	WebElement OutboundFlightSelection = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_OutboundFlightSelect));
    	waitForWebElement(OutboundFlightSelection);
    	OutboundFlightSelection.click();
    	System.out.println("Outbound flight selected");
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromSearchResults)).click();
    	System.out.println("Navigating to Flight options page...");
    }
    
    public static void TwowaySearchResults() throws InterruptedException 
    {
    	
    	String website = BookflowWebsite.website;
    	if (website.contains("MA_B2C")) 
    	{
    		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_MADSelection));
    		WebElement CurrencyConverter = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MADSelection));
    		Select MADSelection = new Select (CurrencyConverter);
    		MADSelection.selectByVisibleText("MAD");
    	}
    	
    	WebElement NearbyAirportsUncheck = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_NearByAirortsCheckbox));
    	waitForWebElement(NearbyAirportsUncheck);
    	NearbyAirportsUncheck.click();
  	
    	WebElement OutboundFlightSelection = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_OutboundFlightSelect));
    	waitForWebElement(OutboundFlightSelection);
    	OutboundFlightSelection.click();
    	
    	Thread.sleep(3000);
    	WebElement InboundFlightSelection = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InboundFlightSelect));
    	waitForWebElement(InboundFlightSelection);
    	InboundFlightSelection.click();
    	System.out.println("Outbound and Inbound flights selected");
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromSearchResults)).click();
    	System.out.println("Navigating to Flight options page...");
    	
    }
    
  
    
}

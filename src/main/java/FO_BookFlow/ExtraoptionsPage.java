package FO_BookFlow;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class ExtraoptionsPage extends AbstractComponents {
	
	static WebDriver driver;
	static Properties prop;
	public static String Insurance;

	@SuppressWarnings("static-access")
	public ExtraoptionsPage(WebDriver driver) throws IOException 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
	public static void ExtraOptionsPageVerification()
	{
		
        if(shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Oneway)).isDisplayed()) 
        {
        	driver.navigate().refresh();
        	System.out.println("Extra options page is not loading in 1st attempt, Page Refresh initiated...");
        		
        	if (shadowHost().findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_Oneway)).isDisplayed()) 
        	{
        		System.out.println("Extra options page is not loading in 2nd attempt, Please check manually");
        	}
        	else 
        	{
        		System.out.println("Extra options page loaded in 2nd attempt...");
        	}
        }
        else
        {
        	System.out.println("Extra options page loaded...");
        }
	}
	
	public static void NoInsurance() throws InterruptedException
	{
//		ExtraOptionsPageVerification();
		
		Boolean VerifyTitle = driver.getCurrentUrl().contains("book/extraoptions");
		assertTrue(VerifyTitle);
		driver.navigate().refresh();
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage)).click();
		
		Thread.sleep(7000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage));
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage)).click();
		
		System.out.println("Navigating to Passenger details page...");
	}
	
	public static void AddInsurance(String InsuranceName) throws InterruptedException 
	{
		Insurance = InsuranceName;
		
		if (Insurance.contains("NA")) 
		{
			NoInsurance();
		}
		else 
		{
			Boolean VerifyTitle = driver.getCurrentUrl().contains("book/extraoptions");
			assertTrue(VerifyTitle);
			
			waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage)).click();
			
			waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax1));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax1)).click();
//			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax2)).click();
			
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_Pax1)).sendKeys(prop.getProperty("LeadPaxDOBdate"));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_Pax1)).sendKeys(prop.getProperty("LeadPaxDOBmonth"));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_Pax1)).sendKeys(prop.getProperty("LeadPaxDOByear"));
			
			waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax2));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax2)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax2)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InsuranceRecalculation)).click();
			
			if(InsuranceName.contains("Travel")) 
			{
				TravelInsurance();
			}
			else if(InsuranceName.contains("Cancel")) 
			{
				CancelInsurance();
			}
			else if(InsuranceName.contains("Combi")) 
			{
				CombiInsurance();
			}
			
			System.out.println("Selected Insurance: " + Insurance);
		}
	}
	
	public static void TravelInsurance() 
	{
		
	}
	
	public static void CancelInsurance() 
	{
		
	}
	
/*	public static void CombiInsurancePererson() throws InterruptedException 
	{
//		Thread.sleep(3000);
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CombiInsurance)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_SelectingCombiInsurancePax1)).click();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_InsuranceConfirm));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InsuranceConfirm)).click();
		
		Thread.sleep(3000);
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_InsurancePopupConfirm));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InsurancePopupConfirm)).click();
		
		
	}
*/	
	
	public static void CombiInsurance() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CombiInsurance)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_SelectingCombiInsurance)).click();
		
		Thread.sleep(1000);
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage)).click();
		
		
		
		
	}
	
	

}

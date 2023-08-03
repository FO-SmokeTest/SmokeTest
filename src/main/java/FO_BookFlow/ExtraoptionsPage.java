package FO_BookFlow;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class ExtraoptionsPage extends AbstractComponents {
	
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public ExtraoptionsPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
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
	
	public static void CombiInsurance() throws InterruptedException 
	{
		Boolean VerifyTitle = driver.getCurrentUrl().contains("book/extraoptions");
		assertTrue(VerifyTitle);
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_randomClickonCurrentPage)).click();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax1));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax1)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DOBCheckBoxPax2)).click();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_Pax1)).sendKeys("12");
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_Pax1)).sendKeys("05");
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_Pax1)).sendKeys("1991");
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InsuranceRecalculation)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CombiInsurance)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_SelectingCombiInsurancePax1)).click();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromExtraOptionsPage)).click();
		
		Thread.sleep(5000);
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_InsuranceConfirm));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_InsuranceConfirm)).click();
		
		
	}
	
	

}

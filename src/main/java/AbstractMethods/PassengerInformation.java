package AbstractMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import FO_BookFlow.BookflowWebsite;
import FO_BookFlow.ExtraoptionsPage;
import Resources.xpathsFO_BookFlow;

public class PassengerInformation extends AbstractComponents {
	
	static WebDriver driver;
	
	static Properties prop;
	
	@SuppressWarnings("static-access")
	public PassengerInformation(WebDriver driver) throws IOException 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
	public static void LeadPassenger () 
	{
	
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_LeadPax));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_LeadPax)).sendKeys(prop.getProperty("LeadPaxFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_LeadPax)).sendKeys(prop.getProperty("LeadPaxLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_LeadPax));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("LeadPaxGender").equalsIgnoreCase("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		if (ExtraoptionsPage.Insurance.contains("NA")) 
		{
			waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_LeadPax));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_LeadPax)).sendKeys(prop.getProperty("LeadPaxDOBdate"));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_LeadPax)).sendKeys(prop.getProperty("LeadPaxDOBmonth"));
			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_LeadPax)).sendKeys(prop.getProperty("LeadPaxDOByear"));
			
		}
		
		
	}
	
	public static void Address() 
	{
        String website = BookflowWebsite.website;
        
        if(!website.contains("ThirdParty")) 
        {
        	waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_Address1));
        	driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Address1)).sendKeys(prop.getProperty("Address1"));
        	driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_HouseNo)).sendKeys(prop.getProperty("HouseNo"));
        	driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_City)).sendKeys(prop.getProperty("City"));
        	
        	if(website.contains("BE"))
    		{
    			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PostalCode)).sendKeys(prop.getProperty("BEPostalCode"));
    			System.out.println("Postalcode entered as BE format");
    		}
    		else if(website.contains("NL")) 
    		{
    			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PostalCode)).sendKeys(prop.getProperty("NLPostalCode"));
    			System.out.println("Postalcode entered as NL format");
    		}
    		else if(website.contains("FR")) 
    		{
    			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PostalCode)).sendKeys(prop.getProperty("FRandMAPostalCode"));
    			System.out.println("Postalcode entered as FR format");
    		}
    		else if(website.contains("MA")) 
    		{
    			driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PostalCode)).sendKeys(prop.getProperty("FRandMAPostalCode"));
    			System.out.println("Postalcode entered as MA format");
    		}
    		else 
    		{
    			System.out.println("Please check selected source market storing in String or not...");
    		}
        	
        }
        else 
        {
        	System.out.println("No address details for 3PA websites...");
        }
	   
		
	}
    
	public static void ContactDetails()
	{
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PhoneNo)).sendKeys(prop.getProperty("ContactNumber"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Email)).sendKeys(prop.getProperty("EmailId"));
	}
	
	public static void EmargencyDetails() 
	{
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EmargencyName));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EmargencyName)).sendKeys(prop.getProperty("EmergencyName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EmargencyNo)).sendKeys(prop.getProperty("EmergencyNumber"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PassengerdetailsCheckbox)).click();
		
		driver.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ContinueFromPassengersPage)).click();
	}
	
	public static void NonLeadPassenger () throws InterruptedException
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_NonLeadPax));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_NonLeadPax)).sendKeys(prop.getProperty("NonLeadPaxFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_NonLeadPax)).sendKeys(prop.getProperty("NonLeadPaxLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_NonLeadPax));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("NonLeadPaxGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_NonLeadPax)).sendKeys(prop.getProperty("NonLeadPaxDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_NonLeadPax)).sendKeys(prop.getProperty("NonLeadPaxDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_NonLeadPax)).sendKeys(prop.getProperty("NonLeadPaxDOByear"));	
		
	}
	
	public static void ChildAs2ndPax () throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs2nd));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs2nd)).sendKeys(prop.getProperty("Child2ndFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_ChildPaxAs2nd)).sendKeys(prop.getProperty("Child2ndLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_ChildPaxAs2nd));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Child2ndGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_ChildPaxAs2nd)).sendKeys(prop.getProperty("Child2ndDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_ChildPaxAs2nd)).sendKeys(prop.getProperty("Child2ndDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_ChildPaxAs2nd)).sendKeys(prop.getProperty("Child2ndDOByear"));
	}
	
	public static void ChildAs3rdPax () throws InterruptedException
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs3rd));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs3rd)).sendKeys(prop.getProperty("Child3rdFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_ChildPaxAs3rd)).sendKeys(prop.getProperty("Child3rdLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_ChildPaxAs3rd));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Child3rdGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_ChildPaxAs3rd)).sendKeys(prop.getProperty("Child3rdDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_ChildPaxAs3rd)).sendKeys(prop.getProperty("Child3rdDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_ChildPaxAs3rd)).sendKeys(prop.getProperty("Child3rdDOByear"));
	}
	
	public static void ChildAs4thPax () throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs4th));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_ChildPaxAs4th)).sendKeys(prop.getProperty("Child4thFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_ChildPaxAs4th)).sendKeys(prop.getProperty("Child4thLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_ChildPaxAs4th));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Child4thGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_ChildPaxAs4th)).sendKeys(prop.getProperty("Child4thDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_ChildPaxAs4th)).sendKeys(prop.getProperty("Child4thDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_ChildPaxAs4th)).sendKeys(prop.getProperty("Child4thDOByear"));
	}
	
	public static void InfantAs2ndPax () throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs2nd));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs2nd)).sendKeys(prop.getProperty("Infant2ndFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_InfantAs2nd)).sendKeys(prop.getProperty("Infant2ndLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_InfantAs2nd));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Infant2ndGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_InfantAs2nd)).sendKeys(prop.getProperty("Infant2ndDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_InfantAs2nd)).sendKeys(prop.getProperty("Infant2ndDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_InfantAs2nd)).sendKeys(prop.getProperty("Infant2ndDOByear"));
	}
	
	public static void InfantAs3rdPax () throws InterruptedException
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs3rd));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs3rd)).sendKeys(prop.getProperty("Infant3rdFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_InfantAs3rd)).sendKeys(prop.getProperty("Infant3rdLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_InfantAs3rd));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Infant3rdGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_InfantAs3rd)).sendKeys(prop.getProperty("Infant3rdDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_InfantAs3rd)).sendKeys(prop.getProperty("Infant3rdDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_InfantAs3rd)).sendKeys(prop.getProperty("Infant3rdDOByear"));
	}
	
	public static void InfantAs4thPax () throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs4th));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_FirstName_InfantAs4th)).sendKeys(prop.getProperty("Infant4thFirstName"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_LastName_InfantAs4th)).sendKeys(prop.getProperty("Infant4thLastName"));
		
		WebElement PaxGender = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Gender_InfantAs4th));
		Select Gender = new Select (PaxGender);
		if (prop.getProperty("Infant4thGender").contentEquals("Male")) 
		{
			Gender.selectByIndex(1);
		}
		else 
		{
			Gender.selectByIndex(2);
		}
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_DateOfDOB_InfantAs4th)).sendKeys(prop.getProperty("Infant4thDOBdate"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MonthOfDOB_InfantAs4th)).sendKeys(prop.getProperty("Infant4thDOBmonth"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_YearOfDOB_InfantAs4th)).sendKeys(prop.getProperty("Infant4thDOByear"));
	}
	
	
	

}

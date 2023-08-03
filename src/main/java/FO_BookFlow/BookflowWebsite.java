package FO_BookFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.inputsFO;
import Resources.xpathsFO_BookFlow;


public class BookflowWebsite extends AbstractComponents {
	
	public static String website;
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public BookflowWebsite(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void WebsiteSelection(String selectedwebsite) 
	{
		website = selectedwebsite;
		
		System.out.println("Selected website is: " + website);
		
		if(website.contains("B2C")) 
		{
			WebsiteSelection_B2C();
		}
		else if(website.contains("Inhouse")) 
		{
			WebsiteSelection_Inhouse();
		}
		else if(website.contains("ThirdParty")) 
		{
			WebsiteSelection_3PA ();
		}
	    else {
	        
	    	System.out.println( website + " is an Invalid website format, Please enter in valid format...");
	    	throw new IllegalArgumentException("Invalid website name: " + website);
	    }
	    
	    System.out.println( website + " Website launched...");
	        
	}
	

	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** Inhouse login in SIT and PPRD ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----
	
	public static void WebsiteSelection_B2C () 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_B2C")) {
	        driver.get(inputsFO.SIT_BE_B2C);
	        
	    } else if (website.equalsIgnoreCase("SIT_NL_B2C")) {
	        driver.get(inputsFO.SIT_NL_B2C);
	       
	    } else if (website.equalsIgnoreCase("SIT_FR_B2C")) {
	        driver.get(inputsFO.SIT_FR_B2C);
	        
	    } else if (website.equalsIgnoreCase("SIT_MA_B2C")) {
	        driver.get(inputsFO.SIT_MA_B2C);
	    }
	    
	    else if (website.equalsIgnoreCase("PPRD_BE_B2C")) {
	        driver.get(inputsFO.PPRD_BE_B2C); 
	       
	    } else if (website.equalsIgnoreCase("PPRD_NL_B2C")) {
	        driver.get(inputsFO.PPRD_NL_B2C);
	        
	    } else if (website.equalsIgnoreCase("PPRD_FR_B2C")) {
	        driver.get(inputsFO.PPRD_FR_B2C);
	        
	    } else if (website.equalsIgnoreCase("PPRD_MA_B2C")) {
	        driver.get(inputsFO.PPRD_MA_B2C);
	       
	    }
		
		driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
	}
	
	
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** Inhouse login in SIT and PPRD ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----
	
	public static void WebsiteSelection_Inhouse () 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_Inhouse")) {
	        driver.get(inputsFO.SIT_BE_Inhouse);
	        InhouseLogin();
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_Inhouse")) {
	        driver.get(inputsFO.SIT_NL_Inhouse);
	        InhouseLogin();

	    }else if (website.equalsIgnoreCase("SIT_MA_Inhouse")) {
	        driver.get(inputsFO.SIT_MA_Inhouse);
	        InhouseLogin();
	        
	    }else if (website.equalsIgnoreCase("PPRD_BE_Inhouse")) {
	        driver.get(inputsFO.PPRD_BE_Inhouse);
	        InhouseLogin();
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_Inhouse")) {
	        driver.get(inputsFO.PPRD_NL_Inhouse);
	        InhouseLogin();

	    }else if (website.equalsIgnoreCase("PPRD_MA_Inhouse")) {
	        driver.get(inputsFO.PPRD_MA_Inhouse);
	        InhouseLogin();
	        
	    }
	}
	
	public static void InhouseLogin() 
	{
		driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_advanced)).click();
        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_unsafe)).click();
        driver.findElement(By.id(xpathsFO_BookFlow.id_username)).sendKeys(inputsFO.mailid);
        driver.findElement(By.id(xpathsFO_BookFlow.id_password)).sendKeys(inputsFO.mailpassword);
        driver.findElement(By.id(xpathsFO_BookFlow.id_signin)).click();
	}
	
	
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** ThirdParty login in SIT and PPRD ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----	
	
	public static void WebsiteSelection_3PA () 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_ThirdParty")) {
	        driver.get(inputsFO.SIT_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_ThirdParty")) {
	        driver.get(inputsFO.SIT_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        
	    }else if (website.equalsIgnoreCase("SIT_MA_ThirdParty")) {
	        driver.get(inputsFO.SIT_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	      
	    }else if (website.equalsIgnoreCase("PPRD_BE_ThirdParty")) {
	        driver.get(inputsFO.PPRD_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_ThirdParty")) {
	        driver.get(inputsFO.PPRD_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        
	    }else if (website.equalsIgnoreCase("PPRD_MA_ThirdParty")) {
	        driver.get(inputsFO.PPRD_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	    
	    }
		
		RelaunchThirdPartyWebsite();
	}
	
	public static void ThirdPartyLogin_BE() 
	{
		driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_username)).sendKeys(inputsFO.BE3PA_username);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_password)).sendKeys(inputsFO.BE3PA_password);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ref)).sendKeys(inputsFO.BE3PA_ref);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_BE_login)).click();
	}
	
	public static void ThirdPartyLogin_NL() 
	{
	//  driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_username)).sendKeys(inputsFO.NL3PA_username);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_password)).sendKeys(inputsFO.NL3PA_password);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ref)).sendKeys(inputsFO.NL3PA_ref);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_NL_login)).click();
	}
	
	public static void ThirdPartyLogin_MA() 
	{
	//  driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_username)).sendKeys(inputsFO.MA3PA_username);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_password)).sendKeys(inputsFO.MA3PA_password);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ref)).sendKeys(inputsFO.MA3PA_ref);
        driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MA_login)).click();
	}
	
	public static void RelaunchThirdPartyWebsite() 
	{
		
		String HomepageURL = driver.getCurrentUrl();
		
		if (! HomepageURL.contains("retail/flight") ) 
		{
			WebsiteSelection_3PA_2ndAttempt ();
			System.out.println("Relanching website as it is not loading correctly");
		}
		else 
		{
			// System.out.println("Website loading correctly in 1st attempt...");
		}
		
	}
	 
	public static void WebsiteSelection_3PA_2ndAttempt ()
	{
		
		if (website.equalsIgnoreCase("SIT_BE_ThirdParty")) {
	        driver.get(inputsFO.SIT_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_ThirdParty")) {
	        driver.get(inputsFO.SIT_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        
	    }else if (website.equalsIgnoreCase("SIT_MA_ThirdParty")) {
	        driver.get(inputsFO.SIT_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	      
	    }else if (website.equalsIgnoreCase("PPRD_BE_ThirdParty")) {
	        driver.get(inputsFO.PPRD_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_ThirdParty")) {
	        driver.get(inputsFO.PPRD_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        
	    }else if (website.equalsIgnoreCase("PPRD_MA_ThirdParty")) {
	        driver.get(inputsFO.PPRD_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	    
	    }
		
	}
	
	

}

package FO_MMB;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import AbstractMethods.AbstractComponents;
import Resources.inputsFO;
import Resources.xpathsFO_BookFlow;

public class MMBWebsite extends AbstractComponents {
	
	static WebDriver driver;
	public static String website;
	public static String BookingRef;
	public static String B2CBookingDeptdate;
	public static String B2CBookingLeadPaxName;
	
	public static String Doc1= null;
	public static String Doc2= null;
	public static String Doc3= null;
	public static String Doc4= null;
	public static String Doc5= null;
	public static String Doc6= null;
	public static String Doc7= null;
	public static String Doc8= null;
	public static String Doc9= null;
	public static String Doc10= null;
	
	public static String FinalDoc = null;
	

	@SuppressWarnings("static-access")
 	public MMBWebsite(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void MMB_MMBHomepage(String MMBwebsite) throws InterruptedException 
	{
        website = MMBwebsite;
		
		System.out.println("Booking website is: " + website);
		
		if(website.contains("B2C")) 
		{
			MMB_WebsiteLaunchAndBookingDetails_B2C();
			
		}
		else if(website.contains("Inhouse")) 
		{
			MMB_WebsiteLaunchAndBookingDetails_Inhouse();
			
		}
		else if(website.contains("ThirdParty")) 
		{
			MMB_WebsiteLaunchAndBookingDetails_3PA ();
			
		}
	    else {
	        
	    	System.out.println( website + " is an Invalid website format, Please enter in valid format...");
	    	throw new IllegalArgumentException("Invalid website name: " + website);
	    }
	    
	    System.out.println( website + " MMB page launched...");
	    
	    Documents.Document();
	        
	}
	
	public static void MMB_WebsiteLaunchAndBookingDetails_B2C () throws InterruptedException 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_B2C")) {
	        driver.get(inputsFO.SIT_BE_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.SIT_B2C_BE_BookingDeptDate;
	        BookingRef = ReservationDetails.SIT_B2C_BE_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.SIT_B2C_BE_BookingPaxName;
	        
	    } else if (website.equalsIgnoreCase("SIT_NL_B2C")) {
	        driver.get(inputsFO.SIT_NL_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.SIT_B2C_NL_BookingDeptDate;
	        BookingRef = ReservationDetails.SIT_B2C_NL_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.SIT_B2C_NL_BookingPaxName;
	       
	    } else if (website.equalsIgnoreCase("SIT_FR_B2C")) {
	        driver.get(inputsFO.SIT_FR_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.SIT_B2C_FR_BookingDeptDate;
	        BookingRef = ReservationDetails.SIT_B2C_FR_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.SIT_B2C_FR_BookingPaxName;
	        
	    } else if (website.equalsIgnoreCase("SIT_MA_B2C")) {
	        driver.get(inputsFO.SIT_MA_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.SIT_B2C_MA_BookingDeptDate;
	        BookingRef = ReservationDetails.SIT_B2C_MA_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.SIT_B2C_MA_BookingPaxName;
	    }
	    
	    else if (website.equalsIgnoreCase("PPRD_BE_B2C")) {
	        driver.get(inputsFO.PPRD_BE_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.PPRD_B2C_BE_BookingDeptDate;
	        BookingRef = ReservationDetails.PPRD_B2C_BE_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.PPRD_B2C_BE_BookingPaxName;
	       
	    } else if (website.equalsIgnoreCase("PPRD_NL_B2C")) {
	        driver.get(inputsFO.PPRD_NL_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.PPRD_B2C_NL_BookingDeptDate;
	        BookingRef = ReservationDetails.PPRD_B2C_NL_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.PPRD_B2C_NL_BookingPaxName;
	        
	    } else if (website.equalsIgnoreCase("PPRD_FR_B2C")) {
	        driver.get(inputsFO.PPRD_FR_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.PPRD_B2C_FR_BookingDeptDate;
	        BookingRef = ReservationDetails.PPRD_B2C_FR_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.PPRD_B2C_FR_BookingPaxName;
	        
	    } else if (website.equalsIgnoreCase("PPRD_MA_B2C")) {
	        driver.get(inputsFO.PPRD_MA_B2C_MMB);
	        B2CBookingDeptdate = ReservationDetails.PPRD_B2C_MA_BookingDeptDate;
	        BookingRef = ReservationDetails.PPRD_B2C_MA_BookingRef;
	        B2CBookingLeadPaxName = ReservationDetails.PPRD_B2C_MA_BookingPaxName;
	       
	    }
		 System.out.println(B2CBookingDeptdate);
		 System.out.println(BookingRef);
		 System.out.println(B2CBookingLeadPaxName);
		
		driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
		
		MMBLogin_B2C();
		
	}
	
	public static void MMB_WebsiteLaunchAndBookingDetails_Inhouse () 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_Inhouse")) {
	        driver.get(inputsFO.SIT_BE_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_Inhouse_BE_BookingRef;
	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_Inhouse")) {
	        driver.get(inputsFO.SIT_NL_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_Inhouse_NL_BookingRef;
//	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();

	    }else if (website.equalsIgnoreCase("SIT_MA_Inhouse")) {
	        driver.get(inputsFO.SIT_MA_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_Inhouse_MA_BookingRef;
//	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
	        
	    }else if (website.equalsIgnoreCase("PPRD_BE_Inhouse")) {
	        driver.get(inputsFO.PPRD_BE_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_Inhouse_BE_BookingRef;
	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_Inhouse")) {
	        driver.get(inputsFO.PPRD_NL_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_Inhouse_NL_BookingRef;
//	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();

	    }else if (website.equalsIgnoreCase("PPRD_MA_Inhouse")) {
	        driver.get(inputsFO.PPRD_MA_Inhouse);
	        InhouseLogin();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_Inhouse_MA_BookingRef;
//	        driver.findElement(By.id(xpathsFO_BookFlow.id_homepage_privacyAccept)).click();
	        
	    }
		
		MMBLogin_NonB2C();
		
	}

	public static void MMB_WebsiteLaunchAndBookingDetails_3PA () 
	{
		
		if (website.equalsIgnoreCase("SIT_BE_ThirdParty")) {
	        driver.get(inputsFO.SIT_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_BE_BookingRef;
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_ThirdParty")) {
	        driver.get(inputsFO.SIT_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_NL_BookingRef;
	        
	    }else if (website.equalsIgnoreCase("SIT_MA_ThirdParty")) {
	        driver.get(inputsFO.SIT_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_MA_BookingRef;
	      
	    }else if (website.equalsIgnoreCase("PPRD_BE_ThirdParty")) {
	        driver.get(inputsFO.PPRD_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_BE_BookingRef;
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_ThirdParty")) {
	        driver.get(inputsFO.PPRD_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_NL_BookingRef;
	        
	    }else if (website.equalsIgnoreCase("PPRD_MA_ThirdParty")) {
	        driver.get(inputsFO.PPRD_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_MA_BookingRef;
	    
	    }
		
		RelaunchThirdPartyWebsite();
	
	}
	
	public static void RelaunchThirdPartyWebsite() 
	{
		
		String HomepageURL = driver.getCurrentUrl();
		
		if (!HomepageURL.contains("managebooking")) 
		{
			MMB_WebsiteLaunchAndBookingDetails_3PA_2ndAttempt ();
			System.out.println("Relanching website as it is not loading correctly");
		}
		else 
		{
			// System.out.println("Website loading correctly in 1st attempt...");
		}
		
		MMBLogin_NonB2C();
		
	}
	
	public static void MMB_WebsiteLaunchAndBookingDetails_3PA_2ndAttempt ()
	{
		
		if (website.equalsIgnoreCase("SIT_BE_ThirdParty")) {
	        driver.get(inputsFO.SIT_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_BE_BookingRef;
	     
	    }else if (website.equalsIgnoreCase("SIT_NL_ThirdParty")) {
	        driver.get(inputsFO.SIT_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_NL_BookingRef;
	        
	    }else if (website.equalsIgnoreCase("SIT_MA_ThirdParty")) {
	        driver.get(inputsFO.SIT_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.SIT_3PA_MA_BookingRef;
	      
	    }else if (website.equalsIgnoreCase("PPRD_BE_ThirdParty")) {
	        driver.get(inputsFO.PPRD_BE_ThirdParty);
	        ThirdPartyLogin_BE();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_BE_BookingRef;
	     
	    }else if (website.equalsIgnoreCase("PPRD_NL_ThirdParty")) {
	        driver.get(inputsFO.PPRD_NL_ThirdParty);
	        ThirdPartyLogin_NL();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkBEandNL_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_NL_BookingRef;
	        
	    }else if (website.equalsIgnoreCase("PPRD_MA_ThirdParty")) {
	        driver.get(inputsFO.PPRD_MA_ThirdParty);
	        ThirdPartyLogin_MA();
	        driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBlinkMA_InhouseAnd3PA)).click();
	        BookingRef = ReservationDetails.PPRD_3PA_MA_BookingRef;
	    
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
	
	public static void MMBLogin_B2C() throws InterruptedException 
	{
		
		String DeptMonth = DeptMonth(B2CBookingDeptdate); 
		String DeptDate = Deptday(B2CBookingDeptdate);
		String LeadPaxLastName = LeadPaxLastname(B2CBookingLeadPaxName);
		
		System.out.println(DeptMonth);
		System.out.println(DeptDate);
		System.out.println(LeadPaxLastName);
		
		waitForElementPresent(By.xpath(Resources.xpathsFO_MMB.xpath_MMBCalendar_B2C));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBCalendar_B2C)).click();
		
		SelectMonth(Resources.xpathsFO_MMB.xpath_MMBCalendarMonth_B2C, DeptMonth);
		
		SelectDate(Resources.xpathsFO_MMB.xpath_MMBCalendarDay_B2C, DeptDate);
		
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_BookingRef_B2C)).sendKeys(BookingRef);
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_LeadPaxLastName_B2C)).sendKeys(LeadPaxLastName);
		
		waitForElementPresent(By.xpath(Resources.xpathsFO_MMB.xpath_ContinueToMMB));
		Thread.sleep(2000);
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_ContinueToMMB)).click();
		
/*		WebElement OutboundCalander = driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_MMBCalendarMonth_B2C));
		Select OutboundMonth = new Select (OutboundCalander);
		OutboundMonth.selectByVisibleText(DeptMonth);
		
		List<WebElement> dates = driver.findElements(By.xpath(Resources.xpathsFO_MMB.xpath_MMBCalendarDay_B2C)); 
		  int count = dates.size();
		  
		  for(int i=0; i<count; i++) 
		  { 
			  String RealDate = dates.get(i).getText();
			  if(RealDate.equalsIgnoreCase(DeptDate)) 
			  { 
				  dates.get(i).click(); 
				  break; 
			  } 
		   }
*/		  
		  
	}
	
	public static void MMBLogin_NonB2C() 
	{
		
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_BookingRef_InhouseAnd3PA)).sendKeys(BookingRef);
		driver.findElement(By.xpath(Resources.xpathsFO_MMB.xpath_ContinueToMMB)).click();
		
	}
	
}

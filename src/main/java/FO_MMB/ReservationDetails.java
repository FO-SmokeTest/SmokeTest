package FO_MMB;

import org.openqa.selenium.WebDriver;

import FO_BookFlow.ConfirmationPage;

public class ReservationDetails extends ConfirmationPage {
	
	static WebDriver driver;
	public static String SelectedWebsite;
	
	@SuppressWarnings("static-access")
	public ReservationDetails(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	//SIT Booking details storing
	public static String SIT_B2C_BE_BookingRef;
	public static String SIT_B2C_BE_BookingDeptDate;
	public static String SIT_B2C_BE_BookingPaxName;
	public static String SIT_B2C_NL_BookingRef;
	public static String SIT_B2C_NL_BookingDeptDate;
	public static String SIT_B2C_NL_BookingPaxName;
	public static String SIT_B2C_FR_BookingRef;
	public static String SIT_B2C_FR_BookingDeptDate;
	public static String SIT_B2C_FR_BookingPaxName;
	public static String SIT_B2C_MA_BookingRef;
	public static String SIT_B2C_MA_BookingDeptDate;
	public static String SIT_B2C_MA_BookingPaxName;

	public static String SIT_Inhouse_BE_BookingRef;
	public static String SIT_Inhouse_NL_BookingRef;
	public static String SIT_Inhouse_MA_BookingRef;

	public static String SIT_3PA_BE_BookingRef;
	public static String SIT_3PA_NL_BookingRef;
	public static String SIT_3PA_MA_BookingRef;

	//PPRD Booking details storing
	public static String PPRD_B2C_BE_BookingRef;
	public static String PPRD_B2C_BE_BookingDeptDate;
	public static String PPRD_B2C_BE_BookingPaxName;
	public static String PPRD_B2C_NL_BookingRef;
	public static String PPRD_B2C_NL_BookingDeptDate;
	public static String PPRD_B2C_NL_BookingPaxName;
	public static String PPRD_B2C_FR_BookingRef;
	public static String PPRD_B2C_FR_BookingDeptDate;
	public static String PPRD_B2C_FR_BookingPaxName;
	public static String PPRD_B2C_MA_BookingRef;
	public static String PPRD_B2C_MA_BookingDeptDate;
	public static String PPRD_B2C_MA_BookingPaxName;

	public static String PPRD_Inhouse_BE_BookingRef;
	public static String PPRD_Inhouse_NL_BookingRef;
	public static String PPRD_Inhouse_MA_BookingRef;

	public static String PPRD_3PA_BE_BookingRef;
	public static String PPRD_3PA_NL_BookingRef;
	public static String PPRD_3PA_MA_BookingRef;
	
	
	
	public static void ReservationStore(String channel) 
	{
		SelectedWebsite = channel;
		
		
		if(SelectedWebsite.contains("B2C")) 
		{
			BookingDetailsStore_B2C();
		}
		else if(SelectedWebsite.contains("Inhouse")) 
		{
			BookingDetailsStore_Inhouse();
		}
		else if(SelectedWebsite.contains("ThirdParty")) 
		{
			BookingDetailsStore_3PA ();
		}
	    else {
	        
	    	System.out.println( SelectedWebsite + " is not receiving data from ConfirmationPage class");

	    }
		
		System.out.println("Booking details are stored...");
	}
	
	public static void BookingDetailsStore_B2C() 
	{ 
		
		if (SelectedWebsite.equalsIgnoreCase("SIT_BE_B2C")) {
			SIT_B2C_BE_BookingRef = BookingRef;
			SIT_B2C_BE_BookingDeptDate = BookingDeptDate;
			SIT_B2C_BE_BookingPaxName = BookingLeadPax;
	        
	    } else if (SelectedWebsite.equalsIgnoreCase("SIT_NL_B2C")) {
	    	SIT_B2C_NL_BookingRef = BookingRef;
			SIT_B2C_NL_BookingDeptDate = BookingDeptDate;
			SIT_B2C_NL_BookingPaxName = BookingLeadPax;
	       
	    } else if (SelectedWebsite.equalsIgnoreCase("SIT_FR_B2C")) {
	    	SIT_B2C_FR_BookingRef = BookingRef;
			SIT_B2C_FR_BookingDeptDate = BookingDeptDate;
			SIT_B2C_FR_BookingPaxName = BookingLeadPax;
	        
	    } else if (SelectedWebsite.equalsIgnoreCase("SIT_MA_B2C")) {
	    	SIT_B2C_MA_BookingRef = BookingRef;
			SIT_B2C_MA_BookingDeptDate = BookingDeptDate;
			SIT_B2C_MA_BookingPaxName = BookingLeadPax;
	    }
	    
	    else if (SelectedWebsite.equalsIgnoreCase("PPRD_BE_B2C")) {
	    	PPRD_B2C_BE_BookingRef = BookingRef;
			PPRD_B2C_BE_BookingDeptDate = BookingDeptDate;
			PPRD_B2C_BE_BookingPaxName = BookingLeadPax;
	       
	    } else if (SelectedWebsite.equalsIgnoreCase("PPRD_NL_B2C")) {
	    	PPRD_B2C_NL_BookingRef = BookingRef;
			PPRD_B2C_NL_BookingDeptDate = BookingDeptDate;
			PPRD_B2C_NL_BookingPaxName = BookingLeadPax;
	        
	    } else if (SelectedWebsite.equalsIgnoreCase("PPRD_FR_B2C")) {
	    	PPRD_B2C_FR_BookingRef = BookingRef;
			PPRD_B2C_FR_BookingDeptDate = BookingDeptDate;
			PPRD_B2C_FR_BookingPaxName = BookingLeadPax;
	        
	    } else if (SelectedWebsite.equalsIgnoreCase("PPRD_MA_B2C")) {
	    	PPRD_B2C_MA_BookingRef = BookingRef;
			PPRD_B2C_MA_BookingDeptDate = BookingDeptDate;
			PPRD_B2C_MA_BookingPaxName = BookingLeadPax;
	       
	    }
	}
	
	public static void BookingDetailsStore_Inhouse() 
	{
		if (SelectedWebsite.equalsIgnoreCase("SIT_BE_Inhouse")) {
			SIT_Inhouse_BE_BookingRef = BookingRef;
	     
	    }else if (SelectedWebsite.equalsIgnoreCase("SIT_NL_Inhouse")) {
	    	SIT_Inhouse_NL_BookingRef = BookingRef;

	    }else if (SelectedWebsite.equalsIgnoreCase("SIT_MA_Inhouse")) {
	    	SIT_Inhouse_MA_BookingRef = BookingRef;
	        
	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_BE_Inhouse")) {
	    	PPRD_Inhouse_BE_BookingRef = BookingRef;
	     
	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_NL_Inhouse")) {
	    	PPRD_Inhouse_NL_BookingRef = BookingRef;

	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_MA_Inhouse")) {
	    	PPRD_Inhouse_MA_BookingRef = BookingRef;
	        
	    }
		
	}
	
	public static void BookingDetailsStore_3PA () 
	{
		if (SelectedWebsite.equalsIgnoreCase("SIT_BE_ThirdParty")) {
			SIT_3PA_BE_BookingRef = BookingRef;
	     
	    }else if (SelectedWebsite.equalsIgnoreCase("SIT_NL_ThirdParty")) {
	    	SIT_3PA_NL_BookingRef = BookingRef;
	        
	    }else if (SelectedWebsite.equalsIgnoreCase("SIT_MA_ThirdParty")) {
	    	SIT_3PA_MA_BookingRef = BookingRef;
	      
	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_BE_ThirdParty")) {
	    	PPRD_3PA_BE_BookingRef = BookingRef;
	     
	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_NL_ThirdParty")) {
	    	PPRD_3PA_NL_BookingRef = BookingRef;
	        
	    }else if (SelectedWebsite.equalsIgnoreCase("PPRD_MA_ThirdParty")) {
	    	PPRD_3PA_MA_BookingRef = BookingRef;
	    
	    }
	}

}

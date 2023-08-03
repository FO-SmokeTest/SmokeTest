package FO_Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import TestComponents.LaunchBrowser;
import TestComponents.RetryFailureTCs;


public class OnewayWithAdults extends LaunchBrowser {
static Properties prop;
	
	public OnewayWithAdults() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_B2C");
        
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("BRU", "VRA");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("september 2023", "13");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("AMS", "VRA");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023", "10");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_FR_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_FR_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("LIL", "CMN");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "9");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("AGA", "ORY");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "19");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
        
        FO_BookFlow.PassengerdetailsPage.SingleAdult();
        
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
        
        FO_BookFlow.ConfirmationPage.BookingDetails();
		

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023", "12");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		//Card names for Card payment 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("AMS", "CUN");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023", "7");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_MA_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("AGA", "LIL");
		
		//Select departure date 'juli 2023' 'août 2023' 'septembre 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "17");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		//Give card nane for Card selection 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023", "12");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("AMS", "ACE");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("september 2023", "7");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
        FO_BookFlow.SearchPage.SearchAirports("RAK", "BRU");
		
		//Select departure date 'juli 2023' 'août 2023' 'septembre 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "15");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_B2C() throws InterruptedException, IOException  
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		               
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_B2C() throws IOException, InterruptedException 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                     
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_FR_B2C() throws IOException, InterruptedException 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_FR_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("LIL", "CMN");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "9");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		             
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_B2C() throws InterruptedException, IOException  
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");
		
		//Select departure date 'juli 2023' 'août 2023' 'septembre 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
        
        FO_BookFlow.ConfirmationPage.BookingDetails();
		                
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_Inhouse() throws IOException, InterruptedException 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "FUE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023", "12");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		//Card names for Card payment 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
				
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_Inhouse() throws IOException, InterruptedException
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                    
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_Inhouse() throws InterruptedException, IOException  
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");
		
		//Select departure date 'juli 2023' 'août 2023' 'septembre 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "15");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		//Give card nane for Card selection 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
				
		FO_BookFlow.ConfirmationPage.BookingDetails();
		               
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_3PA() throws InterruptedException, IOException  
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_3PA() throws InterruptedException, IOException 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023", "8");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                    
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_3PA() throws InterruptedException, IOException 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");
		
		//Select departure date 'juli 2023' 'août 2023' 'septembre 2023'
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023", "15");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdults("1");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.SingleAdult();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}

}

package FO_Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import TestComponents.LaunchBrowser;


public class OnewayWithAdultAndChild extends LaunchBrowser{
static Properties prop;
	
	public OnewayWithAdultAndChild() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
// TargetedWebsite name is Environment_Country_Channel ex: PPRD_BE_B2C, SIT_NL_Inhouse, SIT_MA_3PA		
	
	@Test
	public static void SIT_BE_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_B2C");
        
		FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("BRU", "VRA");

		FO_BookFlow.SearchPage.OnlyOutbounddate("september 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_NL_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("AMS", "VRA");

		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_FR_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_FR_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("LIL", "AGA");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_MA_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_B2C");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("AGA", "LIL");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
        
        FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
        
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
        
        FO_BookFlow.ConfirmationPage.BookingDetails();
		

	}
	
	@Test
	public static void SIT_BE_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();

		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_NL_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("AMS", "CUN");

		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_MA_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_Inhouse");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("RAK", "BRU");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();

		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_BE_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_NL_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("AMS", "ACE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("september 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	
	@Test
	public static void SIT_MA_3PA() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_ThirdParty");
		
        FO_BookFlow.SearchPage.JourneyWay("Oneway");

        FO_BookFlow.SearchPage.SearchAirports("RAK", "BRU");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();

	}
	

	@Test
	public static void PPRD_BE_B2C() throws InterruptedException, IOException  
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		               
	}
	
	@Test
	public static void PPRD_NL_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");

		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                     
	}
	
	@Test
	public static void PPRD_FR_B2C() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_FR_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("LIL", "AGA");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		             
	}
	
	@Test
	public static void PPRD_MAinMAD_B2C() throws InterruptedException, IOException  
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");
		
		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
        
        FO_BookFlow.ConfirmationPage.BookingDetails();
		                
	}
	
	@Test
	public static void PPRD_BE_Inhouse() throws IOException, InterruptedException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "FUE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();

		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
				
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                
	}
	
	@Test
	public static void PPRD_NL_Inhouse() throws IOException, InterruptedException
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_Inhouse");
		
		FO_BookFlow.SearchPage.JourneyWay("Oneway");
		
		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");
		
		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                    
	}
	
	@Test
	public static void PPRD_MA_Inhouse() throws InterruptedException, IOException  
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();

		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
				
		FO_BookFlow.ConfirmationPage.BookingDetails();
		               
	}
	
	@Test
	public static void PPRD_BE_3PA() throws InterruptedException, IOException  
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_3PA() throws InterruptedException, IOException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "HRG");

		FO_BookFlow.SearchPage.OnlyOutbounddate("juli 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		                    
	}
	
	@Test
	public static void PPRD_MA_3PA() throws InterruptedException, IOException 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Oneway");

		FO_BookFlow.SearchPage.SearchAirports("AGA", "BRU");

		FO_BookFlow.SearchPage.OnlyOutbounddate("septembre 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChild("2", "1", "5");
		
		FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.OneAdultsOneChild();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}

}

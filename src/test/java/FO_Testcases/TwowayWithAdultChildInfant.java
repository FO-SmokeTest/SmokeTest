package FO_Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import TestComponents.LaunchBrowser;

public class TwowayWithAdultChildInfant extends LaunchBrowser {
static Properties prop;
	
	public TwowayWithAdultChildInfant() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
// TargetedWebsite name is Environment_Country_Channel ex: PPRD_BE_B2C, SIT_NL_Inhouse, SIT_MA_3PA		
	
	@Test
	public static void SIT_BE_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "SID");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("september 2023", "september 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_NL_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "PUJ");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("september 2023", "september 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_BE_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023",  "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_NL_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUN");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_BE_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_NL_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "MBJ");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	
	@Test
	public static void PPRD_BE_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023","augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_BE_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "FUE");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_BE_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_ThirdParty");
	
		FO_BookFlow.SearchPage.JourneyWay("Twoway");

		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");

		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "augustus 2023");

		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}

}

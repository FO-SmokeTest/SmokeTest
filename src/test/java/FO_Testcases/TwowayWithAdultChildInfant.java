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
	
	@Test
	public static void SIT_BE_B2C() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "SID");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("september 2023", "9", "september 2023", "16");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "PUJ");
		
		//Select departure date 'september 2023' 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("september 2023", "6", "september 2023", "13");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "12", "augustus 2023", "19");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		//Card names for Card payment 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_NL_Inhouse() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUN");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "7", "augustus 2023", "14");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "12", "augustus 2023", "19");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void SIT_NL_3PA() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "MBJ");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "19", "augustus 2023", "26");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	
	@Test
	public static void PPRD_BE_B2C() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "12", "augustus 2023", "19");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_B2C");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "6", "augustus 2023", "13");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "FUE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "12", "augustus 2023", "19");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		//Card names for Card payment 'Amex' 'Bancontact' 'Maestro' 'Master' 'MasterDebit' 'Visa' 'VisaDebit'
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	public static void PPRD_NL_Inhouse() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_Inhouse");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "6", "augustus 2023", "13");
		
		//Select passengers
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
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("BRU", "ACE");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "12", "augustus 2023", "19");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_3PA() throws Exception 
	{
		// Website name is Environment_Country_Channel ex:SIT_NL_Inhouse
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_ThirdParty");
		
		// Select Journey style Oneway/Twoway
		FO_BookFlow.SearchPage.JourneyWay("Twoway");
		
		//Select departure and arrival aiports
		FO_BookFlow.SearchPage.SearchAirports("AMS", "CUR");
		
		//Select departure date 'augustus 2023' 'juli 2023'
		FO_BookFlow.SearchPage.BothOutAndInbounddate("augustus 2023", "6", "augustus 2023", "13");
		
		//Select passengers
		FO_BookFlow.SearchPage.PassengersAdultsChilds("2", "2", "5", "1");
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(null, null, null);
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}

}

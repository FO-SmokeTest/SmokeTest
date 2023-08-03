package FO_Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import TestComponents.LaunchBrowser;
import TestComponents.RetryFailureTCs;

public class TwowayWithAdults extends LaunchBrowser {
	
	static Properties prop;
	
	public TwowayWithAdults() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
// TargetedWebsite name is Environment_Country_Channel ex: PPRD_BE_B2C, SIT_NL_Inhouse, SIT_MA_3PA	
	
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_B2C() throws Exception 
	{
		TargetedWebsite("SIT_BE_B2C");
		
		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));
		
		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITB2CBEDeparture"), prop.getProperty("SITB2CBEArrival"));
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CBEDepartureMonth"), prop.getProperty("SITB2CBEDepartureDate"), prop.getProperty("SITB2CBEArrivalMonth"), prop.getProperty("SITB2CBEArrivalDate"));
		
		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2")); 
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CBEBaggage"), prop.getProperty("SITB2CBESportSSR"), prop.getProperty("SITB2CBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_B2C() throws Exception 
	{
		TargetedWebsite("SIT_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITB2CNLDeparture"), prop.getProperty("SITB2CNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CNLDepartureMonth"), prop.getProperty("SITB2CNLDepartureDate"), prop.getProperty("SITB2CNLArrivalMonth"), prop.getProperty("SITB2CNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CNLBaggage"), prop.getProperty("SITB2CNLSportSSR"), prop.getProperty("SITB2CNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CNLPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_FR_B2C() throws Exception 
	{
		TargetedWebsite("SIT_FR_B2C");
		
		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));
		
		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITB2CFRDeparture"), prop.getProperty("SITB2CFRArrival"));
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CFRDepartureMonth"), prop.getProperty("SITB2CFRDepartureDate"), prop.getProperty("SITB2CFRArrivalMonth"), prop.getProperty("SITB2CFRArrivalDate"));
		
		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2")); 
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CFRBaggage"), prop.getProperty("SITB2CFRSportSSR"), prop.getProperty("SITB2CFRPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CFRPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_B2C() throws Exception 
	{
		TargetedWebsite("SIT_MA_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITB2CMADeparture"), prop.getProperty("SITB2CMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CMADepartureMonth"), prop.getProperty("SITB2CMADepartureDate"), prop.getProperty("SITB2CMAArrivalMonth"), prop.getProperty("SITB2CMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2")); 
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CMABaggage"), prop.getProperty("SITB2CMASportSSR"), prop.getProperty("SITB2CMAPetSSR"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_Inhouse() throws Exception 
	{
		TargetedWebsite("SIT_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));
		
		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITInhouseBEDeparture"), prop.getProperty("SITInhouseBEArrival"));
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseBEDepartureMonth"), prop.getProperty("SITInhouseBEDepartureDate"), prop.getProperty("SITInhouseBEArrivalMonth"), prop.getProperty("SITInhouseBEArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseBEBaggage"), prop.getProperty("SITInhouseBESportSSR"), prop.getProperty("SITInhouseBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITInhouseBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITInhouseNLDeparture"), prop.getProperty("SITInhouseNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseNLDepartureMonth"), prop.getProperty("SITInhouseNLDepartureDate"), prop.getProperty("SITInhouseNLArrivalMonth"), prop.getProperty("SITInhouseNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseNLBaggage"), prop.getProperty("SITInhouseNLSportSSR"), prop.getProperty("SITInhouseNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITInhouseNLPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_Inhouse() throws Exception 
	{
		TargetedWebsite("SIT_MA_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITInhouseMADeparture"), prop.getProperty("SITInhouseMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseMADepartureMonth"), prop.getProperty("SITInhouseMADepartureDate"), prop.getProperty("SITInhouseMAArrivalMonth"), prop.getProperty("SITInhouseMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseMABaggage"), prop.getProperty("SITInhouseMASportSSR"), prop.getProperty("SITInhouseMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITInhouseMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyBEDeparture"), prop.getProperty("SITThirdPartyBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyBEDepartureMonth"), prop.getProperty("SITThirdPartyBEDepartureDate"), prop.getProperty("SITThirdPartyBEArrivalMonth"), prop.getProperty("SITThirdPartyBEArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyBEBaggage"), prop.getProperty("SITThirdPartyBESportSSR"), prop.getProperty("SITThirdPartyBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyNLDeparture"), prop.getProperty("SITThirdPartyNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyNLDepartureMonth"), prop.getProperty("SITThirdPartyNLDepartureDate"), prop.getProperty("SITThirdPartyNLArrivalMonth"), prop.getProperty("SITThirdPartyNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyNLBaggage"), prop.getProperty("SITThirdPartyNLSportSSR"), prop.getProperty("SITThirdPartyNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("SIT_MA_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyMADeparture"), prop.getProperty("SITThirdPartyMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyMADepartureMonth"), prop.getProperty("SITThirdPartyMADepartureDate"), prop.getProperty("SITThirdPartyMAArrivalMonth"), prop.getProperty("SITThirdPartyMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyMABaggage"), prop.getProperty("SITThirdPartyMASportSSR"), prop.getProperty("SITThirdPartyMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CBEDeparture"), prop.getProperty("PPRDB2CBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CBEDepartureMonth"), prop.getProperty("PPRDB2CBEDepartureDate"), prop.getProperty("PPRDB2CBEArrivalMonth"), prop.getProperty("PPRDB2CBEArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CBEBaggage"), prop.getProperty("PPRDB2CBESportSSR"), prop.getProperty("PPRDB2CBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults(); 
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CNLDeparture"), prop.getProperty("PPRDB2CNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CNLDepartureMonth"), prop.getProperty("PPRDB2CNLDepartureDate"), prop.getProperty("PPRDB2CNLArrivalMonth"), prop.getProperty("PPRDB2CNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CNLBaggage"), prop.getProperty("PPRDB2CNLSportSSR"), prop.getProperty("PPRDB2CNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CNLPayment"));
        
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_FR_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_FR_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CFRDeparture"), prop.getProperty("PPRDB2CFRArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CFRDepartureMonth"), prop.getProperty("PPRDB2CFRDepartureDate"), prop.getProperty("PPRDB2CFRArrivalMonth"), prop.getProperty("PPRDB2CFRArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CFRBaggage"), prop.getProperty("PPRDB2CFRSportSSR"), prop.getProperty("PPRDB2CFRPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CFRPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_B2C() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CMADeparture"), prop.getProperty("PPRDB2CMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CMADepartureMonth"), prop.getProperty("PPRDB2CMADepartureDate"), prop.getProperty("PPRDB2CMAArrivalMonth"), prop.getProperty("PPRDB2CMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CMABaggage"), prop.getProperty("PPRDB2CMASportSSR"), prop.getProperty("PPRDB2CMAPetSSR"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDInhouseBEDeparture"), prop.getProperty("PPRDInhouseBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDInhouseBEDepartureMonth"), prop.getProperty("PPRDInhouseBEDepartureDate"), prop.getProperty("PPRDInhouseBEArrivalMonth"), prop.getProperty("PPRDInhouseBEArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseBEBaggage"), prop.getProperty("PPRDInhouseBESportSSR"), prop.getProperty("PPRDInhouseBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDInhouseNLDeparture"), prop.getProperty("PPRDInhouseNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDInhouseNLDepartureMonth"), prop.getProperty("PPRDInhouseNLDepartureDate"), prop.getProperty("PPRDInhouseNLArrivalMonth"), prop.getProperty("PPRDInhouseNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseNLBaggage"), prop.getProperty("PPRDInhouseNLSportSSR"), prop.getProperty("PPRDInhouseNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseNLPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_Inhouse() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDInhouseMADeparture"), prop.getProperty("PPRDInhouseMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDInhouseMADepartureMonth"), prop.getProperty("PPRDInhouseMADepartureDate"), prop.getProperty("PPRDInhouseMAArrivalMonth"), prop.getProperty("PPRDInhouseMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseMABaggage"), prop.getProperty("PPRDInhouseMASportSSR"), prop.getProperty("PPRDInhouseMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDThirdPartyBEDeparture"), prop.getProperty("PPRDThirdPartyBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDThirdPartyBEDepartureMonth"), prop.getProperty("PPRDThirdPartyBEDepartureDate"), prop.getProperty("PPRDThirdPartyBEArrivalMonth"), prop.getProperty("PPRDThirdPartyBEArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyBEBaggage"), prop.getProperty("PPRDThirdPartyBESportSSR"), prop.getProperty("PPRDThirdPartyBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDThirdPartyNLDeparture"), prop.getProperty("PPRDThirdPartyNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDThirdPartyNLDepartureMonth"), prop.getProperty("PPRDThirdPartyNLDepartureDate"), prop.getProperty("PPRDThirdPartyNLArrivalMonth"), prop.getProperty("PPRDThirdPartyNLArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyNLBaggage"), prop.getProperty("PPRDThirdPartyNLSportSSR"), prop.getProperty("PPRDThirdPartyNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_3PA() throws Exception 
	{
		TestComponents.LaunchBrowser.TargetedWebsite("PPRD_MA_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDThirdPartyMADeparture"), prop.getProperty("PPRDThirdPartyMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDThirdPartyMADepartureMonth"), prop.getProperty("PPRDThirdPartyMADepartureDate"), prop.getProperty("PPRDThirdPartyMAArrivalMonth"), prop.getProperty("PPRDThirdPartyMAArrivalDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyMABaggage"), prop.getProperty("PPRDThirdPartyMASportSSR"), prop.getProperty("PPRDThirdPartyMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.NoInsurance();
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}

}

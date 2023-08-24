package Smoke_TCs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import TestComponents.LaunchBrowser;
import TestComponents.RetryFailureTCs;

public class SIT_SmokeTCs extends LaunchBrowser {
	
	static Properties prop;
	
	public SIT_SmokeTCs() throws IOException 
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
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CBEDepartureMonth"), prop.getProperty("SITB2CBEDepartureDate"));
		
		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2")); 
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CBEBaggage"), prop.getProperty("SITB2CBESportSSR"), prop.getProperty("SITB2CBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITB2CBEInsurance"));
		
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

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CNLDepartureMonth"), prop.getProperty("SITB2CNLDepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CNLBaggage"), prop.getProperty("SITB2CNLSportSSR"), prop.getProperty("SITB2CNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITB2CNLInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITB2CNLPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_FR_B2C() throws Exception 
	{
		TargetedWebsite("SIT_FR_B2C");
		
		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));
		
		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITB2CFRDeparture"), prop.getProperty("SITB2CFRArrival"));
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CFRDepartureMonth"), prop.getProperty("SITB2CFRDepartureDate"));
		
		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2")); 
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITB2CFRBaggage"), prop.getProperty("SITB2CFRSportSSR"), prop.getProperty("SITB2CFRPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITB2CFRInsurance"));
		
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

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITB2CMADepartureMonth"), prop.getProperty("SITB2CMADepartureDate"));

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
		
		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseBEDepartureMonth"), prop.getProperty("SITInhouseBEDepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseBEBaggage"), prop.getProperty("SITInhouseBESportSSR"), prop.getProperty("SITInhouseBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITInhouseBEInsurance"));
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITInhouseBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_Inhouse() throws Exception 
	{
		TargetedWebsite("SIT_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITInhouseNLDeparture"), prop.getProperty("SITInhouseNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseNLDepartureMonth"), prop.getProperty("SITInhouseNLDepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseNLBaggage"), prop.getProperty("SITInhouseNLSportSSR"), prop.getProperty("SITInhouseNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITInhouseNLInsurance"));
		
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

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITInhouseMADepartureMonth"), prop.getProperty("SITInhouseMADepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITInhouseMABaggage"), prop.getProperty("SITInhouseMASportSSR"), prop.getProperty("SITInhouseMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITInhouseMAInsurance"));
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("SITInhouseMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_BE_3PA() throws Exception 
	{
		TargetedWebsite("SIT_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyBEDeparture"), prop.getProperty("SITThirdPartyBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyBEDepartureMonth"), prop.getProperty("SITThirdPartyBEDepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyBEBaggage"), prop.getProperty("SITThirdPartyBESportSSR"), prop.getProperty("SITThirdPartyBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITThirdPartyBEInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_NL_3PA() throws Exception 
	{
		TargetedWebsite("SIT_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyNLDeparture"), prop.getProperty("SITThirdPartyNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyNLDepartureMonth"), prop.getProperty("SITThirdPartyNLDepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyNLBaggage"), prop.getProperty("SITThirdPartyNLSportSSR"), prop.getProperty("SITThirdPartyNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITThirdPartyNLInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void SIT_MA_3PA() throws Exception 
	{
		TargetedWebsite("SIT_MA_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("SITThirdPartyMADeparture"), prop.getProperty("SITThirdPartyMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("SITThirdPartyMADepartureMonth"), prop.getProperty("SITThirdPartyMADepartureDate"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("SITThirdPartyMABaggage"), prop.getProperty("SITThirdPartyMASportSSR"), prop.getProperty("SITThirdPartyMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("SITThirdPartyMAInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_BE_B2C() throws Exception 
	{
		TargetedMMB("SIT_BE_B2C"); 
		
        FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITB2CBEBaggageAmend"), prop.getProperty("SITB2CBESportSSRAmend"), prop.getProperty("SITB2CBEPetSSRAmend"));
		
        Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITB2CBEPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_NL_B2C() throws Exception 
	{
		TargetedMMB("SIT_NL_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITB2CNLBaggageAmend"), prop.getProperty("SITB2CNLSportSSRAmend"), prop.getProperty("SITB2CNLPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITB2CNLPayment"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_FR_B2C() throws Exception 
	{
		TargetedMMB("SIT_FR_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITB2CFRBaggageAmend"), prop.getProperty("SITB2CFRSportSSRAmend"), prop.getProperty("SITB2CFRPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITB2CFRPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_MA_B2C() throws Exception 
	{
		TargetedMMB("SIT_MA_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITB2CMABaggageAmend"), prop.getProperty("SITB2CMASportSSRAmend"), prop.getProperty("SITB2CMAPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITB2CMAPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_BE_Inhouse() throws Exception 
	{
		TargetedMMB("SIT_BE_Inhouse");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITInhouseBEBaggageAmend"), prop.getProperty("SITInhouseBESportSSRAmend"), prop.getProperty("SITInhouseBEPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITInhouseBEPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_NL_Inhouse() throws Exception 
	{
		TargetedMMB("SIT_NL_Inhouse");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITInhouseNLBaggageAmend"), prop.getProperty("SITInhouseNLSportSSRAmend"), prop.getProperty("SITInhouseNLPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITInhouseNLPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_MA_Inhouse() throws Exception 
	{
		TargetedMMB("SIT_MA_Inhouse");
	
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITInhouseMABaggageAmend"), prop.getProperty("SITInhouseMASportSSRAmend"), prop.getProperty("SITInhouseMAPetSSRAmend"));
	
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("SITInhouseMAPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_BE_3PA() throws Exception 
	{
		TargetedMMB("SIT_BE_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITThirdPartyBEBaggageAmend"), prop.getProperty("SITThirdPartyBESportSSRAmend"), prop.getProperty("SITThirdPartyBEPetSSRAmend"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_NL_3PA() throws Exception 
	{
		TargetedMMB("SIT_NL_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITThirdPartyNLBaggageAmend"), prop.getProperty("SITThirdPartyNLSportSSRAmend"), prop.getProperty("SITThirdPartyNLPetSSRAmend"));
	
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_SIT_MA_3PA() throws Exception 
	{
		TargetedMMB("SIT_MA_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("SITThirdPartyMABaggageAmend"), prop.getProperty("SITThirdPartyMASportSSRAmend"), prop.getProperty("SITThirdPartyMAPetSSRAmend"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}

}

package Smoke_TCs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import TestComponents.LaunchBrowser;
import TestComponents.RetryFailureTCs;

public class PPRD_SmokeTCs extends LaunchBrowser {
	
	static Properties prop;
	
	public PPRD_SmokeTCs() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
// TargetedWebsite name is Environment_Country_Channel ex: PPRD_BE_B2C, SIT_NL_Inhouse, PPRD_MA_3PA	
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_B2C() throws Exception 
	{
		TargetedWebsite("PPRD_BE_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDB2CBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CBEBaggage"), prop.getProperty("PPRDB2CBESportSSR"), prop.getProperty("PPRDB2CBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDB2CBEInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults(); 
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_B2C() throws Exception 
	{
		TargetedWebsite("PPRD_NL_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDB2CNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdultsChilds(prop.getProperty("passengers2"), prop.getProperty("Child2"), prop.getProperty("Child1Age"), prop.getProperty("Child2Age"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CNLBaggage"), prop.getProperty("PPRDB2CNLSportSSR"), prop.getProperty("PPRDB2CNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDB2CNLInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CNLPayment"));
        
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_FR_B2C() throws Exception 
	{
		TargetedWebsite("PPRD_FR_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CFRDeparture"), prop.getProperty("PPRDB2CFRArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CFRDepartureDay"), prop.getProperty("PPRDB2CFRArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CFRBaggage"), prop.getProperty("PPRDB2CFRSportSSR"), prop.getProperty("PPRDB2CFRPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDB2CFRInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CFRPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_B2C() throws Exception 
	{
		TargetedWebsite("PPRD_MA_B2C");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDB2CMADeparture"), prop.getProperty("PPRDB2CMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDB2CMADepartureDay"), prop.getProperty("PPRDB2CMAArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDB2CMABaggage"), prop.getProperty("PPRDB2CMASportSSR"), prop.getProperty("PPRDB2CMAPetSSR"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDB2CMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_Inhouse() throws Exception 
	{
		TargetedWebsite("PPRD_BE_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDInhouseBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseBEBaggage"), prop.getProperty("PPRDInhouseBESportSSR"), prop.getProperty("PPRDInhouseBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDInhouseBEInsurance"));
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();

        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseBEPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test
	public static void PPRD_NL_Inhouse() throws Exception 
	{
		TargetedWebsite("PPRD_NL_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDInhouseNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseNLBaggage"), prop.getProperty("PPRDInhouseNLSportSSR"), prop.getProperty("PPRDInhouseNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDInhouseNLInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseNLPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_Inhouse() throws Exception 
	{
		TargetedWebsite("PPRD_MA_Inhouse");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDInhouseMADeparture"), prop.getProperty("PPRDInhouseMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDInhouseMADepartureDay"), prop.getProperty("PPRDInhouseMAArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDInhouseMABaggage"), prop.getProperty("PPRDInhouseMASportSSR"), prop.getProperty("PPRDInhouseMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDInhouseMAInsurance"));
		
        FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
        Common_PaymentPage.PaymentMethods.BookflowPayment(prop.getProperty("PPRDInhouseMAPayment"));
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_BE_3PA() throws Exception 
	{
		TargetedWebsite("PPRD_BE_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDThirdPartyBEArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyBEBaggage"), prop.getProperty("PPRDThirdPartyBESportSSR"), prop.getProperty("PPRDThirdPartyBEPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDThirdPartyBEInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_NL_3PA() throws Exception 
	{
		TargetedWebsite("PPRD_NL_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("CommonDepartureAirport"), prop.getProperty("PPRDThirdPartyNLArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("CommonDepartureDay"), prop.getProperty("CommonArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdults(prop.getProperty("passengers2"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyNLBaggage"), prop.getProperty("PPRDThirdPartyNLSportSSR"), prop.getProperty("PPRDThirdPartyNLPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDThirdPartyNLInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdults();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void PPRD_MA_3PA() throws Exception 
	{
		TargetedWebsite("PPRD_MA_ThirdParty");

		FO_BookFlow.SearchPage.JourneyWay(prop.getProperty("JourneyWay2"));

		FO_BookFlow.SearchPage.SearchAirports(prop.getProperty("PPRDThirdPartyMADeparture"), prop.getProperty("PPRDThirdPartyMAArrival"));

		FO_BookFlow.SearchPage.BothOutAndInbounddate(prop.getProperty("PPRDThirdPartyMADepartureDay"), prop.getProperty("PPRDThirdPartyMAArrivalDay"));

		FO_BookFlow.SearchPage.PassengersAdultsChilds(prop.getProperty("passengers2"), prop.getProperty("Child2"), prop.getProperty("Child1Age"), prop.getProperty("Child2Age"));
		
        FO_BookFlow.FlightoptionsPage.FlightExtras(prop.getProperty("PPRDThirdPartyMABaggage"), prop.getProperty("PPRDThirdPartyMASportSSR"), prop.getProperty("PPRDThirdPartyMAPetSSR"));
		
		FO_BookFlow.ExtraoptionsPage.AddInsurance(prop.getProperty("PPRDThirdPartyMAInsurance"));
		
		FO_BookFlow.PassengerdetailsPage.TwoAdultsOneChildOneInfant();
		
		FO_BookFlow.ConfirmationPage.BookingDetails();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_BE_B2C() throws Exception 
	{
		TargetedMMB("PPRD_BE_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDB2CBEBaggageAmend"), prop.getProperty("PPRDB2CBESportSSRAmend"), prop.getProperty("PPRDB2CBEPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDB2CBEPayment"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_NL_B2C() throws Exception 
	{
		TargetedMMB("PPRD_NL_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDB2CNLBaggageAmend"), prop.getProperty("PPRDB2CNLSportSSRAmend"), prop.getProperty("PPRDB2CNLPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDB2CNLPayment"));
        
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_FR_B2C() throws Exception 
	{
		TargetedMMB("PPRD_FR_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDB2CFRBaggageAmend"), prop.getProperty("PPRDB2CFRSportSSRAmend"), prop.getProperty("PPRDB2CFRPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDB2CFRPayment"));
		
	    FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_MA_B2C() throws Exception 
	{
		TargetedMMB("PPRD_MA_B2C");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDB2CMABaggageAmend"), prop.getProperty("PPRDB2CMASportSSRAmend"), prop.getProperty("PPRDB2CMAPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDB2CMAPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_BE_Inhouse() throws Exception 
	{
		TargetedMMB("PPRD_BE_Inhouse");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDInhouseBEBaggageAmend"), prop.getProperty("PPRDInhouseBESportSSRAmend"), prop.getProperty("PPRDInhouseBEPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDInhouseBEPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_NL_Inhouse() throws Exception 
	{
		TargetedMMB("PPRD_NL_Inhouse");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDInhouseNLBaggageAmend"), prop.getProperty("PPRDInhouseNLSportSSRAmend"), prop.getProperty("PPRDInhouseNLPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDInhouseNLPayment"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_MA_Inhouse() throws Exception 
	{
		TargetedMMB("PPRD_MA_Inhouse");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDInhouseMABaggageAmend"), prop.getProperty("PPRDInhouseMASportSSRAmend"), prop.getProperty("PPRDInhouseMAPetSSRAmend"));
		
		Common_PaymentPage.PaymentMethods.MMBPayment(prop.getProperty("PPRDInhouseMAPayment"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_BE_3PA() throws Exception 
	{
		TargetedMMB("PPRD_BE_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDThirdPartyBEBaggageAmend"), prop.getProperty("PPRDThirdPartyBESportSSRAmend"), prop.getProperty("PPRDThirdPartyBEPetSSRAmend"));
				
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_NL_3PA() throws Exception 
	{
		TargetedMMB("PPRD_NL_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDThirdPartyNLBaggageAmend"), prop.getProperty("PPRDThirdPartyNLSportSSRAmend"), prop.getProperty("PPRDThirdPartyNLPetSSRAmend"));
		
        FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}
	
	@Test (retryAnalyzer =RetryFailureTCs.class)
	public static void MMB_PPRD_MA_3PA() throws Exception 
	{
		TargetedMMB("PPRD_MA_ThirdParty");
		
		FO_MMB.FlightAmends.FlightAmendments(prop.getProperty("PPRDThirdPartyMABaggageAmend"), prop.getProperty("PPRDThirdPartyMASportSSRAmend"), prop.getProperty("PPRDThirdPartyMAPetSSRAmend"));
		
		FO_MMB.AmendConfirmation.AmendConfirmVerification();
		
	}

}

package FO_Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import TestComponents.LaunchBrowser;
import TestComponents.RetryFailureTCs;

public class MMBflow extends LaunchBrowser {
	
	static Properties prop;
	
	public MMBflow() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
	}
	
	// TargetedMMB name is Environment_Country_Channel ex: PPRD_BE_B2C, SIT_NL_Inhouse, SIT_MA_3PA
	
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

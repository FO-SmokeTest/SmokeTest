package FO_BookFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class PaymentoptionsPage_Old extends AbstractComponents {
	
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public PaymentoptionsPage_Old(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
	}
	
	public static void PaymentOptionsPageVerification()
	{
		String URL = driver.getCurrentUrl();
		if(!URL.contains("validatepaymentoptions"))
		{
			System.out.println("Payment options page loaded...");
		}
		else 
		{
			System.out.println("Payment page not displaying, Please check the AWS manually");
		}
	}
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** B2C Payment options methods ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----
		
    // BE Payment options
	public static void SofortSelection_BE_B2C()
	{
		PaymentOptionsPageVerification();
	
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_SofortSelection_BE)).click();
		System.out.println("Sofort Payment selected as payment method...");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	public static void VisaCardSelection_BE_B2C()
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardSelection_BE)).click();
		System.out.println("Visa card selected as payment method...");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	public static void IdealSelection_BE_B2C()
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_BE)).click();
		System.out.println("Ideal payment selected as payment method...");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	// NL Payment options
	public static void IdealSelection_NL_B2C() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_NL)).click();
		System.out.println("Ideal payment selected as payment method");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	public static void VisaCardSelection_NL_B2C()
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardSelection_NL)).click();
		System.out.println("Visa card selected as payment method");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	// FR Payment options
	public static void VisaCardSelection_FR_B2C()
	{
		PaymentOptionsPageVerification();
	
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardSelection_FR)).click();
		System.out.println("Visa card selected as payment method");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	// MA Payment options
	public static void ViasSelection_MAinMAD_B2C() 
	{
		PaymentOptionsPageVerification();

		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardSelection_MAinMAD)).click();
		System.out.println("Visa card selected as payment method");
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ContinueFromPaymentOptions)).click();
	}
	
	
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** Inhouse Payment options methods ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----
	
	// BE and MA Inhouse Card selection methods
	public static void AmexSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Amex_BEandMAInhouse)).click();
		
		System.out.println("AMEX card selected as payment method");
	}
	
	public static void BancontactSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Bancontact_BEandMAInhouse)).click();
		
		System.out.println("Bancontact card selected as payment method");
	}
	
	public static void MaestroSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Maestro_BEandMAInhouse)).click();
		
		System.out.println("Maestro card selected as payment method");
	}
	
	public static void MasterSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Master_BEandMAInhouse)).click();
		
		System.out.println("Master card selected as payment method");
	}
	
	public static void MasterDebitSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_MasterDebit_BEandMAInhouse)).click();
		
		System.out.println("Master Debit card selected as payment method");
	}
	
	public static void VisaCardSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_Visa_BEandMAInhouse)).click();
		
		System.out.println("Visa card selected as payment method");
		
	}
	
	public static void VisaDebitSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CardPayment_BEInhouse)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaDebit_BEandMAInhouse)).click();
		
		System.out.println("Visa Debit card selected as payment method");
	}
	
	//Common Payment options
	public static void CashSelection_Inhouse()
	{
		PaymentOptionsPageVerification();

		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_CashSelection)).click();
		
		System.out.println("Cash selected as payment method");
	}
	
	public static void PaymentTransferSelection_Inhouse() 
	{
		PaymentOptionsPageVerification();

		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PaymentTransfer)).click();
		
		System.out.println("Payment Transfer selected as payment method");
	}

}

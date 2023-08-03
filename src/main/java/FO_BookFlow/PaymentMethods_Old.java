package FO_BookFlow;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_BookFlow;

public class PaymentMethods_Old extends AbstractComponents {
	
	static WebDriver driver;
	static Properties prop;
	static String selectedWebsite;

	@SuppressWarnings("static-access")
	public PaymentMethods_Old(WebDriver driver) throws IOException 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
		
	}
	
	public static void CommonPayment(String PaymentMethod) throws InterruptedException 
	{
		selectedWebsite = BookflowWebsite.website;
		
		if(selectedWebsite.contains("B2C")) 
		{
			PaymentMethod_B2C(PaymentMethod);
		}
		else if(selectedWebsite.contains("Inhouse")) 
		{
			PaymentMethod_Inhouse(PaymentMethod);
		}
		else if(selectedWebsite.contains("ThirdParty")) 
		{
			System.out.println("No payment required for 3PA website, Booking about to confirm...");
		}
	    else {
	        
	    	System.out.println( selectedWebsite + " is not receiving data from ConfirmationPage class");

	    }
		
	}
	
	public static void PaymentMethod_B2C(String B2CPaymentMethod) throws InterruptedException 
	{
		if (selectedWebsite.contains("BE_B2C")) {
			
			if(B2CPaymentMethod.contains("Visa")) 
			{
				VisaCardPayment_BEandFR();
			}
			else if(B2CPaymentMethod.contains("Sofort")) 
			{
				SofortPayment_BE();
			}
			else if(B2CPaymentMethod.contains("Ideal")) 
			{
				IdealPayment_BE();
			}
		
			
	    } else if (selectedWebsite.contains("NL_B2C")) {
	    	
	    	if(B2CPaymentMethod.contains("Visa")) 
			{
	    		VisaCardPayment_NL();
			}
			else if(B2CPaymentMethod.contains("Ideal")) 
			{
				IdealPayment_NL();
			}
	       
	    } else if (selectedWebsite.contains("FR_B2C")) {
	    	
	    	if(B2CPaymentMethod.contains("Visa")) 
			{
	    		VisaCardPayment_BEandFR();
			}
	        
	    } else if (selectedWebsite.contains("MA_B2C")) {
	    	
	    	if(B2CPaymentMethod.contains("Visa")) 
			{
	    		VisaCardPayment_MAinMAD();
			}
	    }
	}
	
	public static void PaymentMethod_Inhouse(String InhousePaymentMethod) throws InterruptedException 
	{
		String PaymentType = InhousePaymentMethod;
		
		if (selectedWebsite.contains("BE_Inhouse")) {
			
			if(InhousePaymentMethod.contains("Cash")) 
			{
				CashPayment_BE_Inhouse ();
			}
			else 
			{
				
				CardPayment_BE_Inhouse (PaymentType);
			}
	     
	    }else if (selectedWebsite.contains("NL_Inhouse")) {
	    	
	    	if(InhousePaymentMethod.contains("Cash")) 
			{
	    		CashPayment_NL_Inhouse ();
			}

	    }else if (selectedWebsite.contains("MA_Inhouse")) {
	    	
	    	if(InhousePaymentMethod.contains("Cash")) 
			{
	    		CashPayment_MA_Inhouse ();
			}
	    	else 
			{
				
	    		CardPayment_MA_Inhouse (PaymentType);
			}
	        
	    }
	}
	
	
//-----**** &&&&&&&&&&&&&&&&&&& ****-----    
//-----**** B2C Payment methods ****----- 
//-----**** &&&&&&&&&&&&&&&&&&& ****-----		
	
	// BE Payment Methods
	public static void SofortPayment_BE()
	{
		PaymentoptionsPage_Old.SofortSelection_BE_B2C();
		
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_sofortPaymentConfirm_BE));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_sofortPaymentConfirm_BE));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_sofortPaymentConfirm_BE)).click();
		System.out.println("Payment completed by Sofort payment method...");
	}
	
	public static void VisaCardPayment_BEandFR() throws InterruptedException
	{
		String website = BookflowWebsite.website;
		if (website.contains("BE")) 
		{
			PaymentoptionsPage_Old.VisaCardSelection_BE_B2C();
		}
		else if (website.contains("FR")) 
		{
			PaymentoptionsPage_Old.VisaCardSelection_FR_B2C();
		}
		
//		Thread.sleep(10000);
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_BE));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_BE));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_BE)).sendKeys(prop.getProperty("VisacardNameBE"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardNumber_BE)).sendKeys(prop.getProperty("VisacardNumberBE"));
		
		WebElement month = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpiryMonth_BE));
		Select months = new Select(month);
		months.selectByVisibleText(prop.getProperty("VisacardExpiryMonthBE"));
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_VisaExpireYear_BE));
		WebElement year = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpireYear_BE));
		Select years = new Select(year);
		years.selectByVisibleText(prop.getProperty("VisacardExpiryYearBE"));
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCVV_BE)).sendKeys(prop.getProperty("VisacardCvvBE"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PaymentConfirm_BE)).click();
		
		System.out.println("Payment completed by VISA CARD...");
	}
	
	public static void IdealPayment_BE()
	{
		PaymentoptionsPage_Old.IdealSelection_BE_B2C();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_BE));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_BE));
		WebElement bank = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_BE));
		Select selectedBank = new Select(bank);
		selectedBank.selectByVisibleText("TST iDEAL");	
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankContinue_BE)).click();
		
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_IdealPaymentSuccess_BE));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealPaymentSuccess_BE)).click();
		
		System.out.println("Payment completed by Ideal Payment method...");
	}
	
	//NL Payment Methods
	public static void IdealPayment_NL()
	{
		PaymentoptionsPage_Old.IdealSelection_NL_B2C();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_NL));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_NL));
		WebElement bank = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankSelection_NL));
		Select selectedBank = new Select(bank);
		selectedBank.selectByVisibleText("ING");
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealBankContinue_NL)).click();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_IdealPaymentSuccess_NL));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_IdealPaymentSuccess_NL));
		
		System.out.println("Payment completed by Ideal payment method...");
	}
	
	public static void VisaCardPayment_NL() throws InterruptedException
	{
		PaymentoptionsPage_Old.VisaCardSelection_NL_B2C();
		
	    waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_VisaCardNumber_NL));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_VisaCardNumber_NL));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardNumber_NL)).sendKeys(prop.getProperty("VisacardNumberNL"));
		
		WebElement month = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpiryMonth_NL));
		Select months = new Select(month);
		months.selectByVisibleText(prop.getProperty("VisacardExpiryMonthNL"));
		
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpireYear_NL));
		Select years = new Select(year);
		years.selectByVisibleText(prop.getProperty("VisacardExpiryYearNL"));
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCVV_NL)).sendKeys(prop.getProperty("VisacardCvvNL"));
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PaymentConfirm_NL)).click();
		
		System.out.println("Payment completed by VISA CARD...");
	}

	// MA in MAD payment methods
	public static void VisaCardPayment_MAinMAD() 
	{
		
		PaymentoptionsPage_Old.ViasSelection_MAinMAD_B2C();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_MAinMAD));
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_MAinMAD));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardName_MAinMAD)).sendKeys(prop.getProperty("VisacardNameMA"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardNumber_MAinMAD)).sendKeys(prop.getProperty("VisacardNumberMA"));
		
		WebElement month = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpiryMonth_MAinMAD));
		Select months = new Select(month);
		months.selectByVisibleText(prop.getProperty("VisacardExpiryMonthMA"));
		
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_VisaExpireYear_MAinMAD));
		WebElement year = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaExpireYear_MAinMAD));
		Select years = new Select(year);
		years.selectByVisibleText(prop.getProperty("VisacardExpiryYearMA"));
		
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCVV_MAinMAD)).sendKeys(prop.getProperty("VisacardCvvMA"));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_VisaCardCheckbox_MAinMAD)).click();
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_PaymentConfirm_MAinMAD)).click();
		
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmationpageAppear_MAinMAD));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmationpageAppear_MAinMAD)).click();
		
		System.out.println("Payment completed by VISA CARD...");
	}
	
	
	
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
//-----**** Inhouse Payment type methods ****----- 
//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----	
	
	//BE Payment Methods
	public static void CashPayment_BE_Inhouse () throws InterruptedException
	{
		PaymentoptionsPage_Old.CashSelection_Inhouse();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount));
		String BookingAmount = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount)).getText();
		String FinalAmount = InhouseCashPaymentHandlingMorethan3000(BookingAmount);
        waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment)).sendKeys("Srinivas");
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation)).sendKeys(FinalAmount);
		
		Thread.sleep(3000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse)).click();
        
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking)).click();
		
		System.out.println("Payment completed by Cash payment method...");
		
	}
	
	public static void CardPayment_BE_Inhouse (String InhouseCard) throws InterruptedException 
	{
       String Card = InhouseCard;
		
		if (Card.contains("Amex")) 
		{
			PaymentoptionsPage_Old.AmexSelection_Inhouse();
		}
		else if (Card.contains("Bancontact")) 
		{
			PaymentoptionsPage_Old.BancontactSelection_Inhouse();
		}
		else if (Card.contains("Maestro")) 
		{
			PaymentoptionsPage_Old.MaestroSelection_Inhouse();
		}
		else if(Card.contentEquals("Master")) 
		{
			PaymentoptionsPage_Old.MasterSelection_Inhouse();
		}
		else if(Card.contains("MasterDebit")) 
		{
			PaymentoptionsPage_Old.MasterDebitSelection_Inhouse();
		}
		else if(Card.contentEquals("Visa")) 
		{
			PaymentoptionsPage_Old.VisaCardSelection_Inhouse();
		}
		else if(Card.contains("VisaDebit")) 
		{
			PaymentoptionsPage_Old.VisaDebitSelection_Inhouse();
		}
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount));
		String Amount = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount)).getText();
		
        waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation)).sendKeys(Amount);
		
		Thread.sleep(3000);
//		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse)).click();
		
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking)).click();
		
		System.out.println("Payment completed by Card payment method...");
	}
	
	//NL Payment Methods
	public static void CashPayment_NL_Inhouse () throws InterruptedException
	{
		
		PaymentoptionsPage_Old.CashSelection_Inhouse();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount));
		String BookingAmount = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount)).getText();
		String FinalAmount = InhouseCashPaymentHandlingMorethan3000(BookingAmount);
		
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment)).sendKeys("Srinivas");
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation)).sendKeys(FinalAmount);
		
		Thread.sleep(3000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse)).click();
        
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking)).click();
		
		System.out.println("Payment completed by Cash Payment method...");
	}
	
	//MA Payment Methods
	public static void CashPayment_MA_Inhouse () throws InterruptedException
	{
		PaymentoptionsPage_Old.CashSelection_Inhouse();
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount));
        String Amount = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount)).getText();
		
        waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterNameForCashPayment)).sendKeys("Srinivas");
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation_MA)).sendKeys(Amount);
		
		Thread.sleep(3000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse)).click();
        
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking)).click();
		
		System.out.println("Payment completed by Cash payment method...");
	}
	
	public static void CardPayment_MA_Inhouse (String InhouseCard) throws InterruptedException
	{
		
		String Card = InhouseCard;
		
		if (Card.contains("Amex")) 
		{
			PaymentoptionsPage_Old.AmexSelection_Inhouse();
		}
		else if (Card.contains("Bancontact")) 
		{
			PaymentoptionsPage_Old.BancontactSelection_Inhouse();
		}
		else if (Card.contains("Maestro")) 
		{
			PaymentoptionsPage_Old.MaestroSelection_Inhouse();
		}
		else if(Card.contentEquals("Master")) 
		{
			PaymentoptionsPage_Old.MasterSelection_Inhouse();
		}
		else if(Card.contains("MasterDebit")) 
		{
			PaymentoptionsPage_Old.MasterDebitSelection_Inhouse();
		}
		else if(Card.contentEquals("Visa")) 
		{
			PaymentoptionsPage_Old.VisaCardSelection_Inhouse();
		}
		else if(Card.contains("VisaDebit")) 
		{
			PaymentoptionsPage_Old.VisaDebitSelection_Inhouse();
		}
		
		waitForElementVisible(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount));
		String Amount = driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_GetBookingAmount)).getText();

		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation_MA));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_EnterMoneyForReservation_MA)).sendKeys(Amount);
		
		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmPayment_Inhouse)).click();

		Thread.sleep(2000);
		waitForElementPresent(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking));
		driver.findElement(By.xpath(xpathsFO_BookFlow.xpath_ConfirmBooking)).click();
		
		System.out.println("Payment completed by Card payment method...");
	}
	

}

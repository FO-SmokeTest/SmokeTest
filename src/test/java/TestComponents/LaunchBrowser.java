package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Common_PaymentPage.PaymentMethods;
import Common_PaymentPage.PaymentoptionsPage;
import FO_BookFlow.BookflowWebsite;
import FO_BookFlow.ConfirmationPage;
import FO_BookFlow.ExtraoptionsPage;
import FO_BookFlow.FlightoptionsPage;
import FO_BookFlow.PassengerdetailsPage;
import FO_BookFlow.PaymentMethods_Old;
import FO_BookFlow.PaymentoptionsPage_Old;
import FO_BookFlow.SearchPage;
import FO_MMB.AmendConfirmation;
import FO_MMB.Documents;
import FO_MMB.FlightAmendments;
import FO_MMB.MMBWebsite;
import FO_MMB.ReservationDetails;
import FO_MMB.ReviewChangesPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	@SuppressWarnings("unused")
	public static void initializeDriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream (	System.getProperty("user.dir") + "//src//main//java//Resources//GlobalData.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else 
		{
			throw new IllegalArgumentException("Invalid browser name: " + browser);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println(browser + " browser lanched...");
		
	    
        
		BookflowWebsite websitelaunch = new BookflowWebsite(driver);
		
		SearchPage searchpage = new SearchPage(driver);
	    
		FlightoptionsPage flightoptionspage = new FlightoptionsPage(driver);
	    
		ExtraoptionsPage extrasoptionspage = new ExtraoptionsPage(driver);
	    
		PassengerdetailsPage passengerdetailspage = new PassengerdetailsPage(driver);
	    
		PaymentoptionsPage_Old paymentoptionspageOld = new PaymentoptionsPage_Old(driver);
	    
		PaymentMethods_Old paymentmethodsOld = new PaymentMethods_Old(driver);
		
        PaymentoptionsPage paymentoptionspage = new PaymentoptionsPage(driver);
	    
		PaymentMethods paymentmethods = new PaymentMethods(driver);
	    
		ConfirmationPage confirmationpage = new ConfirmationPage(driver);
		
		ReservationDetails reservationsstore = new ReservationDetails(driver);
		
		MMBWebsite MMBWebsiteLaunch = new MMBWebsite(driver);
		
		Documents docs = new Documents(driver);
		
		FlightAmendments flightAmends = new FlightAmendments(driver);
		
		ReviewChangesPage reviewChanges = new ReviewChangesPage(driver);
		
		AmendConfirmation AmendConfirm = new AmendConfirmation(driver);
		
		
		
	}
	
	public static void TargetedWebsite(String website) throws IOException 
	{
		initializeDriver();
	    FO_BookFlow.BookflowWebsite.WebsiteSelection(website);
	}
	
	public static void TargetedMMB(String website) throws IOException, InterruptedException 
	{
		initializeDriver();
	    FO_MMB.MMBWebsite.MMB_MMBHomepage(website);
	}
	
	public static String GetScreenshot(String TestCaseName, WebDriver driver) throws IOException 
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		String timeStamp2 = new SimpleDateFormat("HH.mm").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File (System.getProperty("user.dir")+ "//Reports//ErrorScreenshots//" + timeStamp + "//" + timeStamp2 + "//" + TestCaseName + ".png");
//		File file = new File ("C://Users//Admin//OneDrive - TUI//Smoke Reports//ErrorScreenshots//" + timeStamp + "//" + timeStamp2 + "//" + TestCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+ "//Reports//ErrorScreenshots//" + timeStamp + "//" + timeStamp2 + "//" + TestCaseName + ".png";
//		return "C://Users//Admin//OneDrive - TUI//Smoke Reports//ErrorScreenshots//" + timeStamp + "//" + timeStamp2 + "//" + TestCaseName + ".png";
		
	}
	
	

}

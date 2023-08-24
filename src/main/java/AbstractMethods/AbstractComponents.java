package AbstractMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FO_BookFlow.BookflowWebsite;
import Resources.xpathsFO_BookFlow;

public class AbstractComponents {
	
	static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public AbstractComponents(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public static void waitForElementVisible(By findBy) 
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public static void waitForElementPresent(By findBy) 
	{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.presenceOfElementLocated(findBy));
	}
	
	public static void waitForWebElement(WebElement element) 
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForWebElements(List<WebElement> element) 
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public static String FlyingMonth(String journey) 
	{
		String Journey = journey;        //+ 45 days
		String[] words=Journey.split(" ");
		String JourneyMonth = words[1];
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(Integer.parseInt(JourneyMonth));
		DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
		String Monthvalue = futureDate.format(monthFormatter);
		return Monthvalue;
		  
	}
	
	public static String FlyingDay(String journey) 
	{
		String Journey = journey;        //+ 45 days
		String[] words=Journey.split(" ");
		String JourneyDay = words[1];
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(Integer.parseInt(JourneyDay));
		DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
		String DayValue = futureDate.format(dayFormatter);
		return DayValue;
		  
	}
	
	public static void DropdownByCSS(String Xpath, String SelectData)
	{
		WebElement Webelement = shadowHost().findElement(By.cssSelector(Xpath));
		waitForWebElement(Webelement);
		Select TargetSelection = new Select (Webelement);
		TargetSelection.selectByVisibleText(SelectData);
		  
	}
	
	public static void JourneyMonth(String Xpath, String SelectData)
	{
		WebElement Webelement = shadowHost().findElement(By.cssSelector(Xpath));
		waitForWebElement(Webelement);
		Select TargetSelection = new Select (Webelement);
		TargetSelection.selectByValue(SelectData);
		  
	}
	
	public static void JourneyDay(String Xpath, String SelectData)
	{
		List<WebElement> TargettedData = shadowHost().findElements(By.cssSelector(Xpath));
		waitForWebElements(TargettedData);
		int count = TargettedData.size();
		
		if(SelectData.contains("0")) 
		{
			String[]DeptwithZero = SelectData.split("");
			String ZeroDeptDate = DeptwithZero[0];
			if(ZeroDeptDate.contains("0")) 
			{
				SelectData = DeptwithZero[1];
			}
			
		}
		
		for(int i=0;i<count;i++) 
		{
			String selectedData = TargettedData.get(i).getText();
			if(selectedData.equalsIgnoreCase(SelectData)) 
			{
				TargettedData.get(i).click();
				break;
			}
		}
		  
	}
	
	public static String InhouseCashPaymentHandlingMorethan3000(String str) 
	{
		float amount;
		float PaidAmount;
		String ActualAmount;
		amount = Float.parseFloat(str.substring(1));
		
		if(amount > 3000) 
		{
			PaidAmount = (float) 3000.00;
		}
		else 
		{
			PaidAmount = amount;
		}
		ActualAmount = String.valueOf(PaidAmount);
		
		return ActualAmount;
	}
	
//MMB Calander	
	
	public static String LeadPaxLastname (String Name) 
	{
		String Paxname = Name;        //"M. Sourav Ganguly"; //M. Sourav Ganguly
		String[] words=Paxname.split(" ");
		String AlterName = words[2];
		return AlterName;
		
	}
	
	public static String DeptMonth (String Deptdate) 
	{
		String deptmonth = Deptdate;
		String augMonth = "August 2023";
		String sepMonth = "September 2023";
		String octMonth = "October 2023";
		String novMonth = "November 2023";
		String decMonth = "December 2023";
		String SelectableMonth = null;
		
		if(deptmonth.contains("aug")) 
		{
			SelectableMonth = augMonth;
		}
		else if(deptmonth.contains("sep")) 
		{
			SelectableMonth = sepMonth;
		}
		else if(deptmonth.contains("oct")) 
		{
			SelectableMonth = octMonth;
		}
		else if(deptmonth.contains("okt")) 
		{
			SelectableMonth = octMonth;
		}
		else if(deptmonth.contains("nov")) 
		{
			SelectableMonth = novMonth;
		}
		else if(deptmonth.contains("dec")) 
		{
			SelectableMonth = decMonth;
		}
				
		return SelectableMonth;
		
	}
	
	public static String Deptday (String Deptdate) 
	{
		String deptday = Deptdate;      
		String[] DeptNew= deptday.split(" ");
		String SelectableDay = DeptNew[1];
		if(SelectableDay.contains("0")) 
		{
			String[]DeptwithZero = SelectableDay.split("");
			String ZeroDeptDate = DeptwithZero[0];
			if(ZeroDeptDate.contains("0")) 
			{
				SelectableDay = DeptwithZero[1];
			}
			
		}
		
		return SelectableDay;
		
	}
	
	public static void SelectMonth(String MonthXpath, String month) throws InterruptedException 
	{
		  WebElement OutboundCalander = driver.findElement(By.xpath(MonthXpath));
		  Thread.sleep(2000); 
		  Select OutboundMonth = new Select (OutboundCalander);
		  OutboundMonth.selectByVisibleText(month);
		  
	}
	
	public static void SelectDate(String DayXpath, String day) throws InterruptedException 
	{
		List<WebElement> dates = driver.findElements(By.xpath(DayXpath)); 
		  int count = dates.size();
		  
		  for(int i=0; i<count; i++) 
		  { 
			  String RealDate = dates.get(i).getText();
			  if(RealDate.equalsIgnoreCase(day)) 
			  { 
				  dates.get(i).click(); 
				  break; 
		      }
	      } 
	}
	

	
// *** Common shadow host method to call shadow reference in all source markets ***	
	public static SearchContext shadowHost () 
	{ 
		String website = BookflowWebsite.website;
		
		String shadowsHoster = null;
	
		if(website.contains("BE")) 
		{
			shadowsHoster = xpathsFO_BookFlow.cssSelector_ShadowHost_BE;
		}
		else if(website.contains("NL")) 
		{
			shadowsHoster = xpathsFO_BookFlow.cssSelector_ShadowHost_NL;
		}
		else if(website.contains("FR")) 
		{
			shadowsHoster = xpathsFO_BookFlow.cssSelector_ShadowHost_FRAndMA;
		}
		else if(website.contains("MA")) 
		{
			shadowsHoster = xpathsFO_BookFlow.cssSelector_ShadowHost_FRAndMA;
		}
		else 
		{
			System.out.println("Please check selected source market storing in String or not...");
		}
		
		SearchContext shadow = driver.findElement(By.cssSelector(shadowsHoster)).getShadowRoot();
		return shadow;
		
	}	
	
	public static SearchContext Baggage_ShadowHost() 
	{
		SearchContext shadow = driver.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ShadowHost_Baggage)).getShadowRoot();
		return shadow;
		
	}
	
	public static SearchContext Sports_ShadowHost() 
	{
		SearchContext shadow = driver.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ShadowHost_Sports)).getShadowRoot();
		return shadow;
		
	}
	
	public static SearchContext Pets_ShadowHost() 
	{
		SearchContext shadow = driver.findElement(By.cssSelector(xpathsFO_BookFlow.cssSelector_ShadowHost_Pets)).getShadowRoot();
		return shadow;
		
	}

}

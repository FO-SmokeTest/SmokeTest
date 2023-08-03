package FO_MMB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractMethods.AbstractComponents;
import Resources.xpathsFO_MMB;

public class ReviewChangesPage extends AbstractComponents {
	
	static WebDriver driver;

	@SuppressWarnings("static-access")
	public ReviewChangesPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void ContinueFromReviewChangesPage() 
	{
		waitForElementVisible(By.xpath(xpathsFO_MMB.xpath_ContinueFromReviewChanges));
		driver.findElement(By.xpath(xpathsFO_MMB.xpath_ContinueFromReviewChanges)).click();
		
		System.out.println("Navigating to Payment page...");
		
	}

}

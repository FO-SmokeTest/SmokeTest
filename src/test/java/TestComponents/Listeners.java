package TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import FO_BookFlow.ConfirmationPage;
import FO_MMB.AmendConfirmation;
import Resources.ExtentReproter;

public class Listeners extends LaunchBrowser implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent = ExtentReproter.getReporterObject();
	ThreadLocal<ExtentTest> excenttest = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
		excenttest.set(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		if(result.getMethod().getMethodName().contains("MMB")) 
		{
			excenttest.get().pass(AmendConfirmation.MMBRetrievalOnReport());
			excenttest.get().pass(AmendConfirmation.PrintDocsOnReport());
			excenttest.get().pass(AmendConfirmation.PrintBaggageReport());
			excenttest.get().pass(AmendConfirmation.PrintSportSSRReport());
			excenttest.get().pass(AmendConfirmation.PrintPetSSRReport());
			excenttest.get().pass(AmendConfirmation.AmendmentOnReport());
		}
		else 
		{
			excenttest.get().pass(ConfirmationPage.PrintBookingRefinReport());
			excenttest.get().pass(ConfirmationPage.PrintDeptDateinReport());
			excenttest.get().pass(ConfirmationPage.PrintLeadPaxNameReport());
			excenttest.get().pass(ConfirmationPage.PrintBaggageReport());
			excenttest.get().pass(ConfirmationPage.PrintSportSSRReport());
			excenttest.get().pass(ConfirmationPage.PrintPetSSRReport());
			excenttest.get().pass(ConfirmationPage.PrintInsuranceReport());
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try 
		{
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			excenttest.get().fail("Testcase failed at: " + driver.getCurrentUrl());
			excenttest.get().fail(result.getThrowable());
		} 
		catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		String filepath = null;
		try 
		{
			filepath = GetScreenshot(result.getMethod().getMethodName(), driver);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		excenttest.get().addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}

}

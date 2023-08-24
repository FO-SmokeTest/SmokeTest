package Resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReproter {
	
	public static ExtentReports getReporterObject() 
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		String timeStamp2 = new SimpleDateFormat("HH.mm").format(new Date());
		
//		String path = System.getProperty("user.dir")+"//Reports//Results//" + timeStamp + "//" + timeStamp2 + ".html";
		String path = "C://Users//Admin//OneDrive - TUI//Smoke Reports//Results//" + timeStamp + "//" + timeStamp2 + ".html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("SmokeTest Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TestedBy", "SrinivasaReddy M");
		return extent;
		
	}

}

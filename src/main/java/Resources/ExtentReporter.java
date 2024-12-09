package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public void startReport() {
		ExtentSparkReporter report=new ExtentSparkReporter(System.getProperty("user.dir")+"//report.html");
		report.config().setReportName("Practice");
		report.config().setDocumentTitle("Practice");
		
	    extent=new ExtentReports();
		extent.attachReporter(report);
		
		
	}
	
	public void endReport()
	{
		extent.flush();
	}
}

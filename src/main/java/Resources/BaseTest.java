package Resources;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;

public class BaseTest {
	public static ExtentReporter extentReport;
	public static WebDriver driver;
	String browserName;
	public static Properties prop;
	
	@BeforeSuite
	public void beforesuit() throws IOException
	{
	    extentReport=new ExtentReporter();
		extentReport.startReport();
		prop=new Properties();
		String filePath=System.getProperty("user.dir")+"//src//main//java//Resources//data.properties";
		FileInputStream fis=new FileInputStream(filePath);
		prop.load(fis);
		browserName=prop.getProperty("browser");
		String env=prop.getProperty("env");
		if(env.equalsIgnoreCase("AWS"))
		{
			 filePath=System.getProperty("user.dir")+"//src//main//java//Resources//dataAWS.properties";
			 fis=new FileInputStream(filePath);
			 prop.load(fis);
		}
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		switch(result.getStatus())
		{
			case ITestResult.SUCCESS:
				extentReport.test.pass("test passed");
				break;
			case ITestResult.FAILURE:
				extentReport.test.fail("test failed "+System.lineSeparator()+ result.getThrowable().getMessage());
				String path=captureScreenshot();
				extentReport.test.addScreenCaptureFromPath(path);
				break;
			default:
				extentReport.test.pass("unknown exception");
				break;
		}
		driver.close();
	}
	
	@AfterSuite
	public void aftersuit()
	{
		extentReport.endReport();
	}
	
	public String captureScreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		String filePath=System.getProperty("user.dir")+"\\Screenshots\\screenshot_"+RandomStringUtils.randomAlphanumeric(5)+".png";
		File destFile=new File(filePath);
		FileUtils.copyFile(file, destFile);
		return filePath;
	}
	
}

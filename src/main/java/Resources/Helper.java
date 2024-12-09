package Resources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Helper extends BaseTest{
	By username=By.id("userName");
	By password=By.id("password");
	By loginBtn=By.id("btnLogin");
	
	public void launchUrl(String url)
	{
		driver.get(url);
	}
	
	
	public void login(String userName,String pass) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	    wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		Thread.sleep(1000);
		driver.findElement(loginBtn).click();
		Thread.sleep(3000);
	}
	
	public static void waitFor(By ele,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		
	}
	
	public static void clickUsingJavascript(WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		jse.executeScript("arguments[0].click();",ele);
		
	}
	
	public static void clickUsingJavascript(By xpath)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(xpath));
		jse.executeScript("arguments[0].click();",driver.findElement(xpath));
		extentReport.test.info("Clicked on element: "+xpath);
		
	}
	
	public static void waitForLoader(int time)
	{
		By xpathLoader=By.xpath("//span[@class='loader']");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathLoader));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(xpathLoader));
	}
	
	public Properties getTestData(String classname) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resources//"+classname+".properties");
		prop.load(fis);
		return prop;
	}
	
	public void logout() throws InterruptedException
	{
		clickUsingJavascript(driver.findElement(By.className("icon-logout")));
		Helper.waitFor(By.xpath("(//button[text()='Yes'])[2]"), 10);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(3000);
	}
	
	public void checkLoginDone()
	{
		By activity=By.xpath("//h2[text()='Activity']");
		SoftAssert as=new SoftAssert();
		as.assertEquals(driver.findElement(activity).getText(), "Activity");
	}
	
//	public static String getPdfContent(String url) throws IOException 
//	{
//		URL pdfURL=new URL(url);
//		InputStream is=pdfURL.openStream();
//		BufferedInputStream bis=new BufferedInputStream(is);
//		PDDocument doc=PDDocument.load(bis);
//		int pages=doc.getNumberOfPages();
//		System.out.println("The total number of pages "+pages);
//		PDFTextStripper strip=new PDFTextStripper();
//		strip.setStartPage(1);
//		strip.setEndPage(2);
//		String stripText=strip.getText(doc);
//		System.out.println(stripText);
//		doc.close();
//		return stripText;
//	}   
	
}

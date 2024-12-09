package Selenium.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseTest;
import Resources.Helper;
import bsh.This;
import junit.framework.Assert;

public class demo2 extends BaseTest{
	String classname=this.getClass().getSimpleName();
	Helper help=new Helper();
	String username;
	String password;
	String url;
	
	
	@Test
	public void test1() throws IOException, InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		int count=0;
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=1;i<=2;i++)
		{
			try {
			String url=help.getTestData(classname).getProperty("url"+i);
			username=help.getTestData(classname).getProperty("user"+i);
			password=help.getTestData(classname).getProperty("pass"+i);
			driver.get(url);
			help.login(username, password);
			By activity=By.xpath("//h2[text()='Activity']");
			boolean flag=driver.findElement(activity).isDisplayed();
			Assert.assertTrue(flag);
			extentReport.test.info("login done for : "+username+"/"+password);
			help.logout();
			}
			catch(Exception e)
			{
				extentReport.test.info("login failed for: " +username+"/"+password);
				count++;
				arr.add(username);
				
			}	
		}
		if(count>0) {
			Assert.fail("login failed for users : " +arr);
		}
		
	}
	
	@Test
	public void test2() throws IOException, InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//credentials.xls");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet1");
        int count=0;
        int rowCount=sheet.getPhysicalNumberOfRows();
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<rowCount-1;i++)
        {
        	
        		Row row = sheet.getRow(i+1); 
        		if(row!=null)
        		{
                url = row.getCell(0).getStringCellValue(); 
                username = row.getCell(1).getStringCellValue(); 
                password = row.getCell(2).getStringCellValue(); 
                workbook.close();
                fis.close();

                driver.get(url);
                try {
        			driver.get(url);
        			help.login(username, password);
        			Thread.sleep(2000);
        			By changePwd=By.xpath("//h2[text()='Change Password']");
        			boolean flag=driver.findElement(changePwd).isDisplayed();
        			Assert.assertTrue(flag);
        			extentReport.test.info("login done for : "+username+"/"+password);
        			Thread.sleep(2000);
        			driver.findElement(By.id("btnCancel")).click();
        			Thread.sleep(1000);
//        			help.logout();
        			}
        			catch(Exception e)
        			{
        				extentReport.test.info("login failed for: " +username+"/"+password);
        				count++;
        				arr.add(username);
        			}
        		}
        }
        
       if(count>0)
       {
    	   Assert.fail("login failed for users: "+arr);
       }

	}
	
}

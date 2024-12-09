package Selenium.Practice;


import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.CommercialLinesPage;
import PageObjects.PersonalLinesPage;
import PageObjects.WorkersCompensationPage;
import Resources.BaseTest;
import Resources.Helper;

public class demo1 extends BaseTest{

	
	@Test(priority = 1)
	public void PersonalLines_HO3() throws InterruptedException, IOException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		String policyNumber=personalLines.personalLinesHO3();
//		String policyNumber="143-10066";
		personalLines.HO3Endorsement(policyNumber);
		personalLines.HO3Cancellation(policyNumber);
		personalLines.HO3Reinstate(policyNumber);
	}
	
	@Test(priority = 2)
	public void PersonalLines_HO5() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		String policyNumber=personalLines.personalLinesHO5();
//		String policyNumber="VAVE-10076";
		personalLines.HO3Endorsement(policyNumber);
		personalLines.HO3Cancellation(policyNumber);
		personalLines.HO3Reinstate(policyNumber);
	}
	
	@Test(priority = 3)
	public void PersonalLines_DP3() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		String policyNumber=personalLines.personalLinesDP3();
		personalLines.HO3Endorsement(policyNumber);
		personalLines.HO3Cancellation(policyNumber);
		personalLines.HO3Reinstate(policyNumber);
	}
	
	
	@Test(priority = 4)
	public void CommercialLines_GL() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		CommercialLinesPage commercialLines=new CommercialLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		commercialLines.commercialLines_GL();
	}
	
	@Test(priority = 5)
	public void CommercialLines_CommercialProperty() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		CommercialLinesPage commercialLines=new CommercialLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		commercialLines.commercialLines_CommercialProperty();
	}
	
	@Test(priority = 6)
	public void CommercialLines_Package() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		CommercialLinesPage commercialLines=new CommercialLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		commercialLines.commercialLines_Package();
	}
	
	@Test(priority = 7)
	public void WorkersCompensation() throws InterruptedException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		WorkersCompensationPage personalLines=new WorkersCompensationPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		personalLines.workersCompensation();
	}
	
	

	
}

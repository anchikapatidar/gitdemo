package CRC;


import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.CommercialLinesPage;
import PageObjects.PersonalLinesPage;
import PageObjects.WorkersCompensationPage;
import Resources.BaseTest;
import Resources.Helper;

public class CRCFlow extends BaseTest{

	
	@Test(priority = 1)
	public void PersonalLines_HO3CRC() throws InterruptedException, IOException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("CRCUrl"));
		help.login(prop.getProperty("CRCUsername"),prop.getProperty("CRCPassword"));
		String policyNumber=personalLines.personalLinesHO3CRC(this.getClass().getSimpleName());
//		String policyNumber="143-10066";
//		personalLines.HO3Endorsement(policyNumber);
//		personalLines.HO3Cancellation(policyNumber);
//		personalLines.HO3Reinstate(policyNumber);
	}
	
}

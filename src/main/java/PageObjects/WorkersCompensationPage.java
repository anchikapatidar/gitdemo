package PageObjects;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Resources.BaseTest;
import Resources.Helper;

public class WorkersCompensationPage extends BaseTest{
	
	public WorkersCompensationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By NewQuoteBtn= By.id("btnNewQuote");
	By workersCompensation=By.xpath("(//h6[contains(text(),'compensation')])[last()]");
	By continueBtn=By.id("btnContinue");
	By stateCode=By.id("stateCode");
	By retailAgency=By.id("retailAgency");
	By searchIcon=By.xpath("//label[@for='Search Agency']//following::span[@class='fa-fw select-all fas']");
	By producer=By.id("producer");
	By autoSuggestive=By.xpath("//ul[@id='suggestiveList']/li/a");
	By underWriter=By.id("uwId");
	By nextStepBtn=By.xpath("//button[@name='next']");
	By appFullName=By.id("appFullName");
	By insuredEmail=By.id("insuredEmail");
	By isNewVenture=By.xpath("(//input[@id='isNewVenture'])[2]");
	By fein=By.id("fein");
	By yearsOfBusiness=By.id("yearsOfBusiness");
	By masterPolicyNo=By.id("masterPolicyNo");
	By nonProfit=By.xpath("(//input[@id='nonProfit'])[2]");
	By incumbentAgent=By.xpath("(//input[@id='isIncumbentAgent'])[2]");
	By googleSearch=By.id("GooglesearchAddressPhysical");
	By addressSuggestion=By.xpath("//ul[@class='input-dropdown']/li/a");
	By city=By.id("physicalCity");
	By clearInsured=By.id("btnClearInsured");
	By isNewInsured=By.xpath("(//label[contains(text(),'Select To Generate New Insured')])[1]");
	By createNewInsuredBtn=By.id("btnCreateNewInsured");
	By webAddress=By.id("webAddress");
	By sameAsPhysicalAddress=By.xpath("(//label[@for='sameAsPhysicalAddress']//following::label[contains(text(),'Yes')])[1]");
	By savebtn=By.xpath("//button[contains(text(),'Save ')]");
	By saveBtn=By.id("btnSave");
	By addClassification=By.id("btnAddClassifications");
	By deleteIcon=By.xpath("(//button[contains(@id,'delete')])[last()]");
	By fillTimeEmp=By.xpath("//input[contains(@id,'fullTimeEmp')]");
	By partTimeEmp=By.xpath("//input[contains(@id,'partTimeEmp')]");
	By empPayroll=By.xpath("//input[contains(@id,'txtEmployeePayroll')]");
	By GetRatesBtn=By.xpath("//button[contains(text(),'Get Rates')]");
	By approveAll=By.id("appoveAll");
	By selectAndProceed=By.id("btnSelectAndProceed");
	By quoteBtn=By.id("btnApproved");
	By agentStatus=By.xpath("//div[@class='agent-status']/span");
	By agentNotes=By.id("agentNotes");
	By proceedToBind=By.id("btnRequestBinding");
	By BindBtn=By.id("btnGeneratePolicy");
	By cancelbtn=By.id("btnCancel");
	By primaryContactName=By.id("primContactName");
	By primaryPhone=By.id("primPhone");
	By primaryEmail=By.id("primEmail");
	By isSameAsContactInfo=By.id("isSameAsContactInfo");
	By ofcLocation=By.id("ofcLocation");
	By ofcName=By.id("ofcName");
	By payroll=By.id("payroll");
	By openCalendar=By.xpath("(//button[@aria-label='Open Calendar'])[1]");
	By yearlabel=By.className("yearlabel");
	By yearChangeBtn=By.xpath("//button[@class='yearchangebtn mydpicon icon-mydpup yearchangebtnenabled']");
	By ownership=By.id("ownership");
	By ofcRole=By.id("ofcRole");
	By ofcDuties=By.id("ofcDuties");
	By ofcIncludeOrExclude=By.xpath("(//input[@id='ofcIncludeOrExclude'])[2]");
	By btnOfcInfosAdd=By.id("btnOfcInfosAdd");
	By continueToBind=By.xpath("//button[contains(text(),'Continue To Bind')]");
	By policyregNo=By.id("policyRegisterNo");
	By btnGenerateBinder=By.id("btnGenerateBinder");
	By agentStatusListing=By.xpath("//tbody//tr[1]//td[7]//span");
	By closeBtn=By.xpath("(//span[@class='icon-close'])[1]");
	By policyNumber=By.xpath("//tbody//tr[1]//td[1]");
	

	
	public void workersCompensation() throws InterruptedException
	{
		Thread.sleep(3000);
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
		Helper.waitFor(workersCompensation, 10);
		driver.findElement(workersCompensation).click();
//		selectByValue(stateCode,"MS");
		driver.findElement(By.xpath("//option[@value='MS']")).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		fillInsuredInfo();
		fillBusinessInfo();
		driver.findElement(clearInsured).click();
		Helper.waitFor(isNewInsured, 10);
		Helper.clickUsingJavascript( driver.findElement(isNewInsured));
		Helper.clickUsingJavascript( driver.findElement(createNewInsuredBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		fillWorkersCompensationInfo();
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		Helper.waitForLoader(20);
		Helper.waitFor(GetRatesBtn, 20);
		Helper.clickUsingJavascript(GetRatesBtn);
		Helper.waitForLoader(30);
		Helper.clickUsingJavascript(driver.findElement(approveAll));
		Helper.waitFor(selectAndProceed, 20);
		Thread.sleep(3000);
		Helper.clickUsingJavascript(selectAndProceed);
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		driver.findElement(agentNotes).sendKeys("test");
		Helper.waitFor(quoteBtn, 20);
		driver.findElement(quoteBtn).click();
		Helper.waitForLoader(20);
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(cancelbtn);
		Helper.waitFor(proceedToBind, 20);
		driver.findElement(proceedToBind).click();
		fillContactInfo();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
//		driver.findElement(By.id("insuredEmail")).sendKeys("sddsdd@gmail.com");
		String policyNo=RandomStringUtils.randomNumeric(5);
		driver.findElement(policyregNo).sendKeys(policyNo);
		driver.findElement(continueToBind).click();
		Helper.waitFor(btnGenerateBinder, 20);
		driver.findElement(btnGenerateBinder).click();
		Helper.waitForLoader(10);
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound");
		driver.findElement(closeBtn).click();
		Thread.sleep(2000);
		Helper.waitFor(policyNumber, 20);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNo);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound");
		extentReport.test.info("policy bounded");
		extentReport.test.info("policy number is: "+driver.findElement(policyNumber).getText());
		
	}
	
	public void selectByValue(By ele,String value)
	{
//		Helper.waitFor(ele, 10);
		Select select=new Select(driver.findElement(ele));
		select.selectByValue(value);
	}
	
	public void selectVisibltext(By ele,String value)
	{
//		Helper.waitFor(ele, 10);
		Select select=new Select(driver.findElement(ele));
		select.selectByVisibleText(value);
	}
	
	public void fillInsuredInfo() throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Helper.waitFor(retailAgency, 5);
		driver.findElement(retailAgency).sendKeys("dyad");
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(searchIcon));
		driver.findElement(searchIcon).click();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(autoSuggestive);
		for(WebElement element:list)
		{
			if(element.getText().equalsIgnoreCase("Dyad Tech"))
			{
				element.click();
				Thread.sleep(3000);
			}
		}
		Select select=new Select(driver.findElement(producer));
		select.selectByVisibleText("Harshil Patel");
		select=new Select(driver.findElement(underWriter));
		select.selectByVisibleText("testtest");
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
	}
	
	public void fillBusinessInfo() throws InterruptedException
	{
		driver.findElement(appFullName).sendKeys("i-eng");
		driver.findElement(insuredEmail).sendKeys("sdds@gmail.com");
		Helper.clickUsingJavascript(isNewVenture);
		driver.findElement(fein).sendKeys("666667777");
		driver.findElement(yearsOfBusiness).sendKeys("10");
		driver.findElement(webAddress).sendKeys("www.xyz.com");
		Helper.clickUsingJavascript(masterPolicyNo);
		Helper.clickUsingJavascript(nonProfit);
		Helper.clickUsingJavascript(incumbentAgent);
		
		driver.findElement(googleSearch).sendKeys("611 Rue Maupesant, Ocean Springs, MS 39564, USA");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("611 Rue Maupesant, Ocean Springs, MS 39564, USA"))
			{
				while (!success && attempts < 3) {
				try {
				element.click();
				success = true;
				}
				catch(StaleElementReferenceException e)
				{
					list=driver.findElements(addressSuggestion);
					Thread.sleep(1000);
					 attempts++;
				}
				}
				Thread.sleep(3000);
				break;
			}
		}
		
		Select select=new Select(driver.findElement(city));
		select.selectByVisibleText("OCEAN SPRINGS");
		
		
	}
	
	public void fillWorkersCompensationInfo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		Helper.clickUsingJavascript(addClassification);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select-options select-style']/li")).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
		Thread.sleep(2000);
		driver.findElement(deleteIcon).click();
		Thread.sleep(2000);
		driver.findElement(fillTimeEmp).sendKeys("100");
		driver.findElement(partTimeEmp).sendKeys("10");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(empPayroll));
		driver.findElement(empPayroll).sendKeys("5000");
		driver.findElement(continueBtn).click();
		
	}
	
	public void fillContactInfo() throws InterruptedException {
		driver.findElement(primaryContactName).sendKeys("i-eng");
		driver.findElement(primaryPhone).sendKeys("8888899999");
		driver.findElement(primaryEmail).sendKeys("sdds@gmail.com");
		Helper.clickUsingJavascript(isSameAsContactInfo);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		driver.findElement(ofcLocation).sendKeys("main st");
		driver.findElement(ofcName).sendKeys("ofc 1 ");
		driver.findElement(payroll).sendKeys("5000");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		Helper.waitFor(yearChangeBtn, 10);
		driver.findElement(yearChangeBtn).click();
		Helper.waitFor(By.xpath("//div[text()='2000']"), 10);
		driver.findElement(By.xpath("//div[text()='2000']")).click();
		Helper.waitFor(By.xpath("//span[text()='1']"), 10);
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(ownership).sendKeys("50");
		selectVisibltext(ofcRole, "Owner");
		driver.findElement(ofcDuties).sendKeys("test");
		Helper.clickUsingJavascript(ofcIncludeOrExclude);
		Helper.clickUsingJavascript(btnOfcInfosAdd);

	}
}

package PageObjects;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Resources.BaseTest;
import Resources.Helper;

public class CommercialLinesPage extends BaseTest{

	private WebDriver driver;

	By NewQuoteBtn= By.id("btnNewQuote");
	By commercialLines=By.xpath("(//h6[text()='Commercial Lines'])[last()]");
	By continueBtn=By.id("btnContinue");
	By selectAll=By.xpath("//label[@for='selectAllAsYes']");
	By retailAgency=By.id("retailAgency");
	By searchIcon=By.xpath("//a[@class='disableSearchControl']/span");
	By producer=By.id("producer");
	By autoSuggestive=By.xpath("//ul[@id='suggestiveList']/li/a");
	By underWriter=By.id("uwId");
	By nextStepBtn=By.xpath("//button[@name='next']");
	By appFullName=By.id("appFullName");
	By googleSearch=By.id("GooglesearchAddressPhysical");
	By addressSuggestion=By.xpath("//ul[@class='input-dropdown']/li/a");
	By city=By.id("physicalCity");
	By clearInsured=By.id("btnClearInsured");
	By isNewInsured=By.xpath("(//label[contains(text(),'Select To Generate New Insured')])[1]");
	By createNewInsuredBtn=By.id("btnCreateNewInsured");
	By sameAsPhysicalAddress=By.xpath("(//label[@for='sameAsPhysicalAddress']//following::label[contains(text(),'Yes')])[1]");
	By distanceToCoastal=By.id("distanceToCoastTB_HO");
	By distanceToHydrant=By.id("distanceToHydrant");
	By distanceToFirStation=By.id("distanceToFireStation");
	By openCalendar=By.xpath("(//button[@aria-label='Open Calendar'])[3]");
	By yearlabel=By.className("yearlabel");
	By yearChangeBtn=By.xpath("//button[@class='yearchangebtn mydpicon icon-mydpup yearchangebtnenabled']");
	By saveBtn=By.xpath("//button[contains(text(),'Save')]");
	By savebtn=By.id("btnSave");
	By quoteBtn=By.id("btnApproved");
	By agentStatus=By.xpath("//div[@class='agent-status']/span");
	By closeBtn=By.xpath("(//span[@class='icon-close'])[1]");
	By policyNumber=By.xpath("//tbody//tr[1]//td[1]");
	By proceedToBind=By.id("btnRequestBinding");
	By BindBtn=By.id("btnGeneratePolicy");
	By continueToBind=By.xpath("//button[contains(text(),'Continue To Bind')]");
	By issuePolicy=By.id("btnIssuePolicy");
	By agentStatusListing=By.xpath("//tbody//tr[1]//td[7]//span");
	By approveAll=By.id("appoveAll");
	By cancelbtn=By.id("btnCancel");
	By averageDailyAttendence=By.xpath("//input[contains(@id,'averageDailyAttendence')]");
	By yearOfBusiness=By.xpath("//input[contains(@id,'inceptionYearOfDayCareBusiness')]");
	By isAnyChildAbuseCase101=By.xpath("//input[contains(@id,'isAnyChildAbuseCase')]");
	By isAnyChildUnder15101=By.xpath("//input[contains(@id,'isAnyChildUnder15')]");
	By isAnyDCPriorInsCancelledNonRenewed101=By.xpath("//input[contains(@id,'isAnyDCPriorInsCancelledNonRenewed')]");
	By isAnyFieldTrip101=By.xpath("//input[contains(@id,'isAnyFieldTrip')]");
	By isAnyPastViolation101=By.xpath("//input[contains(@id,'isAnyPastViolation')]");
	By isAnyPoolTrip101=By.xpath("//input[contains(@id,'isAnyPoolTrip')]");
	By isAnyTransportation100=By.xpath("//input[contains(@id,'isAnyTransportation')]");
	By isHourOfOprMoreThan14101=By.xpath("//input[contains(@id,'isHourOfOprMoreThan14')]");
	By isLicenseRevoked101=By.xpath("//input[contains(@id,'isLicenseRevoked')]");
	By isPoolDeeperThan24Inch100=By.xpath("//input[contains(@id,'isPoolDeeperThan24Inch')]");
	By isPremiseFenced101=By.xpath("//input[contains(@id,'isPremiseFenced')]");
	By noOfChildren10=By.xpath("//input[contains(@id,'noOfChildren')]");
	By totalStaffMember10=By.xpath("//input[contains(@id,'totalStaffMember')]");
	By commercialProperty=By.xpath("//*[@id='CoverageCommercial Property']");
	By subProductCommercialProperty=By.xpath("//*[@id='subProductCommercial Property']");
	By pkg=By.xpath("//*[@id='CoveragePackage (General Liability & Commercial Property)']");
	By subProductPkg=By.xpath("//*[@id='subProductPackage (General Liability & Commercial Property)']");
	By fireResistive=By.xpath("//span[@title='Fire Resistive']");
	By squareFootage=By.id("squareFootage");
	By noOfStories=By.id("noOfStories");
	By yearBuilt=By.id("yearBuilt");
	
	By GetRateNextBtn=By.id("btnDefGetRates");
	By GetRatesBtn=By.xpath("//button[contains(text(),'Get Rates')]");
	By selectAndProceed=By.id("btnSelectAndProceed");
	By continueSplit=By.id("btnContinueSplit");
	
	
	
	
	public CommercialLinesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void commercialLines_GL() throws InterruptedException {
		Thread.sleep(5000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Helper.clickUsingJavascript(NewQuoteBtn);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(commercialLines));
		driver.findElement(commercialLines).click();
		driver.findElement(continueBtn).click();
		extentReport.test.info("commercial lines selected");
		fillProducerInfo();
		driver.findElement(googleSearch).sendKeys("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA"))
			{
				while (!success && attempts < 3) {
				try {
				Helper.clickUsingJavascript(element);
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
		select.selectByVisibleText("FORT DIX");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		String name=RandomStringUtils.randomAlphabetic(5);
		driver.findElement(appFullName).sendKeys(name);
		driver.findElement(clearInsured).click();
		Helper.waitFor(isNewInsured, 10);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.waitFor(continueBtn, 10);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(8000);
//		Helper.clickUsingJavascript(driver.findElement(continueBtn));
//		Thread.sleep(2000);
//		Helper.waitForLoader(15);
		Helper.clickUsingJavascript(driver.findElement(By.id("btnAddClassifications")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select-options select-style']/li")).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[contains(@id,'exposure')]")));
		driver.findElement(By.xpath("//input[contains(@id,'exposure')]")).sendKeys("555");
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		supplements();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		
		Helper.waitFor(GetRateNextBtn, 60);
		Helper.clickUsingJavascript(GetRateNextBtn);
		Helper.waitFor(GetRatesBtn, 60);
		Helper.clickUsingJavascript(GetRatesBtn);
		Helper.waitFor(selectAndProceed, 60);
		Thread.sleep(3000);
		Helper.clickUsingJavascript(selectAndProceed);
		try {
		Helper.waitFor(continueSplit, 20);
		Helper.clickUsingJavascript(continueSplit);
		}catch(Exception e)
		{
			extentReport.test.info("Element not found");
		}
		Helper.waitFor(quoteBtn, 30);
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(cancelbtn);
		Helper.waitFor(proceedToBind, 20);
		driver.findElement(proceedToBind).click();
		Helper.waitFor(BindBtn, 20);
		driver.findElement(BindBtn).click();
		driver.findElement(By.id("insuredEmail")).sendKeys("sddsdd@gmail.com");
		String policyNo=RandomStringUtils.randomNumeric(5);
		driver.findElement(By.id("policyRegisterNo")).sendKeys(policyNo);
		driver.findElement(continueToBind).click();
		Helper.waitFor(issuePolicy, 20);
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		
		driver.findElement(closeBtn).click();
		Thread.sleep(2000);
		Helper.waitFor(policyNumber, 20);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNo);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		extentReport.test.info("policy bounded");
		extentReport.test.info("policy number is: "+driver.findElement(policyNumber).getText());
			
	}
	
	public void fillProducerInfo() throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Helper.waitFor(retailAgency, 5);
		driver.findElement(retailAgency).sendKeys("dyad");
		Helper.waitFor(searchIcon, 5);
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
		select.selectByVisibleText("TESTTEST");
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
	}
	
	public void commercialLines_CommercialProperty() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Helper.clickUsingJavascript(NewQuoteBtn);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(commercialLines));
		driver.findElement(commercialLines).click();
		extentReport.test.info("commercial lines selected");
		Thread.sleep(5000);
		Helper.clickUsingJavascript(commercialProperty);
		Helper.clickUsingJavascript(subProductCommercialProperty);
		driver.findElement(continueBtn).click();
		fillProducerInfo();
		driver.findElement(googleSearch).sendKeys("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA"))
			{
				while (!success && attempts < 3) {
				try {
					Helper.clickUsingJavascript(element);
//					element.click();
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
		select.selectByVisibleText("FORT DIX");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		String name=RandomStringUtils.randomAlphabetic(5);
		driver.findElement(appFullName).sendKeys(name);
		Helper.clickUsingJavascript(driver.findElement(clearInsured));
		Helper.waitFor(isNewInsured, 10);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.waitForLoader(15);
		Helper.waitFor(By.id("btnAddPropertyClassifications"), 10);
		Helper.clickUsingJavascript(By.id("btnAddPropertyClassifications"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select-options select-style']/li")).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
		
		Helper.clickUsingJavascript(fireResistive);
		driver.findElement(squareFootage).sendKeys("1000");
		driver.findElement(squareFootage).sendKeys(Keys.TAB);
		By xpath=By.xpath("(//div[@id='myWarningModal']//button[text()='OK'])[2]");
		Helper.waitFor(xpath, 10);
		Helper.clickUsingJavascript(xpath);
		
		driver.findElement(noOfStories).sendKeys("2");
		driver.findElement(yearBuilt).sendKeys("2010");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
		driver.findElement(nextStepBtn).click();
		select=new Select(driver.findElement(By.id("allOtherPerils")));
		select.selectByVisibleText("$500");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
//		driver.findElement(nextStepBtn).click();
//		Thread.sleep(3000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(nextStepBtn).click();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		supplements();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		
		Helper.waitFor(GetRateNextBtn, 60);
		Helper.clickUsingJavascript(GetRateNextBtn);
		Helper.waitFor(GetRatesBtn, 60);
		Helper.clickUsingJavascript(GetRatesBtn);
		Helper.waitFor(selectAndProceed, 60);
		Thread.sleep(3000);
		Helper.clickUsingJavascript(selectAndProceed);
		try {
		Helper.waitFor(continueSplit, 20);
		Helper.clickUsingJavascript(continueSplit);
		}catch(Exception e)
		{
			extentReport.test.info("element not found");
		}
		Helper.waitFor(quoteBtn, 20);
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(cancelbtn);
		Helper.waitFor(proceedToBind, 20);
		driver.findElement(proceedToBind).click();
		Helper.waitFor(BindBtn, 20);
		driver.findElement(BindBtn).click();
		driver.findElement(By.id("insuredEmail")).sendKeys("sddsdd@gmail.com");
		String policyNo=RandomStringUtils.randomNumeric(5);
		driver.findElement(By.id("policyRegisterNo")).sendKeys(policyNo);
		driver.findElement(continueToBind).click();
		Helper.waitFor(issuePolicy, 20);
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		
		driver.findElement(closeBtn).click();
		Thread.sleep(2000);
		Helper.waitFor(policyNumber, 20);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNo);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		extentReport.test.info("policy bounded");
		extentReport.test.info("policy number is: "+driver.findElement(policyNumber).getText());
		
	}
	
	public void supplements()
	{
		driver.findElement(averageDailyAttendence).sendKeys("50");
		
		driver.findElement(yearOfBusiness).sendKeys("2010");
		Helper.clickUsingJavascript(isAnyChildAbuseCase101);
		Helper.clickUsingJavascript(isAnyChildUnder15101);
		Helper.clickUsingJavascript(isAnyDCPriorInsCancelledNonRenewed101);
		Helper.clickUsingJavascript(isAnyFieldTrip101);
		
		Helper.clickUsingJavascript(isAnyPastViolation101);
		Helper.clickUsingJavascript(isAnyPoolTrip101);
		Helper.clickUsingJavascript(isAnyTransportation100);
		Helper.clickUsingJavascript(isHourOfOprMoreThan14101);
		
		Helper.clickUsingJavascript(isLicenseRevoked101);
		Helper.clickUsingJavascript(isPoolDeeperThan24Inch100);
		Helper.clickUsingJavascript(isPremiseFenced101);
		driver.findElement(noOfChildren10).sendKeys("50");
		driver.findElement(totalStaffMember10).sendKeys("10");
		
	}
	
	public void commercialLines_Package() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Helper.clickUsingJavascript(NewQuoteBtn);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(commercialLines));
		driver.findElement(commercialLines).click();
		extentReport.test.info("commercial lines selected");
		Thread.sleep(5000);
		Helper.clickUsingJavascript(pkg);
		Helper.clickUsingJavascript(subProductPkg);
		driver.findElement(continueBtn).click();
		fillProducerInfo();
		fillBusinessInfo();
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		String name=RandomStringUtils.randomAlphabetic(5);
		driver.findElement(appFullName).sendKeys(name);
		Helper.clickUsingJavascript(driver.findElement(clearInsured));
		Helper.waitFor(isNewInsured, 10);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.waitFor(By.id("btnAddClassifications"), 10);
		Helper.clickUsingJavascript(By.id("btnAddClassifications"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select-options select-style']/li")).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[contains(@id,'exposure')]")));
		driver.findElement(By.xpath("//input[contains(@id,'exposure')]")).sendKeys("555");
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.waitFor(By.id("btnAddPropertyClassifications"), 10);
		Helper.clickUsingJavascript(By.id("btnAddPropertyClassifications"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='select-options select-style']/li")).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
		
		Helper.clickUsingJavascript(fireResistive);
		driver.findElement(squareFootage).sendKeys("1000");
		driver.findElement(squareFootage).sendKeys(Keys.TAB);
		By xpath=By.xpath("(//div[@id='myWarningModal']//button[text()='OK'])[2]");
		Helper.waitFor(xpath, 10);
		Helper.clickUsingJavascript(xpath);
		driver.findElement(noOfStories).sendKeys("2");
		driver.findElement(yearBuilt).sendKeys("2010");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
		driver.findElement(nextStepBtn).click();
		Select select=new Select(driver.findElement(By.id("allOtherPerils")));
		select.selectByVisibleText("$500");
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(3000);
//		driver.findElement(nextStepBtn).click();
//		Thread.sleep(3000);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(nextStepBtn).click();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		supplements();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		
		Helper.waitFor(GetRateNextBtn, 60);
		Helper.clickUsingJavascript(GetRateNextBtn);
		Helper.waitFor(GetRatesBtn, 60);
		Helper.clickUsingJavascript(GetRatesBtn);
		Helper.waitFor(selectAndProceed, 60);
		Thread.sleep(3000);
		Helper.clickUsingJavascript(selectAndProceed);
		try {
		Helper.waitFor(continueSplit, 20);
		Helper.clickUsingJavascript(continueSplit);
		}
		catch(Exception e)
		{
			extentReport.test.info("Element not found");
		}
		Helper.waitFor(quoteBtn, 20);
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		extentReport.test.info("policy quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(cancelbtn);
		Helper.waitFor(proceedToBind, 20);
		driver.findElement(proceedToBind).click();
		Helper.waitFor(BindBtn, 20);
		driver.findElement(BindBtn).click();
		driver.findElement(By.id("insuredEmail")).sendKeys("sddsdd@gmail.com");
		String policyNo=RandomStringUtils.randomNumeric(5);
		driver.findElement(By.id("policyRegisterNo")).sendKeys(policyNo);
		driver.findElement(continueToBind).click();
		Helper.waitFor(issuePolicy, 20);
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		
		driver.findElement(closeBtn).click();
		Thread.sleep(2000);
		Helper.waitFor(policyNumber, 20);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNo);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		extentReport.test.info("policy bounded");
		extentReport.test.info("policy number is: "+driver.findElement(policyNumber).getText());
		
	}
	
	public void fillBusinessInfo() throws InterruptedException
	{
		driver.findElement(googleSearch).sendKeys("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("USAF Expeditionary Center, Texas Avenue, Fort Dix, NJ, USA"))
			{
				while (!success && attempts < 3) {
				try {
					Helper.clickUsingJavascript(element);
//					element.click();
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
		select.selectByVisibleText("FORT DIX");
	}
	
	
}

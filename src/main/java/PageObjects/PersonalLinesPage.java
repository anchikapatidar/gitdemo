package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Resources.BaseTest;
import Resources.Helper;

public class PersonalLinesPage extends BaseTest{

	private WebDriver driver;
	Helper help=new Helper();

	By NewQuoteBtn= By.id("btnNewQuote");
	By personalLines=By.xpath("(//h6[text()='Personal Lines'])[last()]");
	By continueBtn=By.id("btnContinue");
	By selectAll=By.xpath("//label[@for='selectAllAsYes']");
	By retailAgency=By.id("retailAgency");
	By searchIcon=By.xpath("//a[@class='searchicon']/span");
	By producer=By.id("producer");
	By autoSuggestive=By.xpath("//ul[@id='suggestiveList']/li/a");
	By underWriter=By.id("uwId");
	By nextStepBtn=By.xpath("//button[@name='next']");
	By appType=By.id("appType");
	By appFullName=By.id("appFullName");
	By appTrusteename=By.id("appNameOfTrustee");
	By dob=By.xpath("(//label[@for='Date of Birth']//following::input[@aria-label='Date input field'])[1]");
	By appOccupation=By.id("appOccupation");
	By googleSearch=By.id("GooglesearchAddressPhysical");
	By addressSuggestion=By.xpath("//ul[@class='input-dropdown']/li/a");
	By city=By.id("physicalCity");
	By clearInsured=By.id("btnClearInsured");
	By isNewInsured=By.xpath("(//label[contains(text(),'Select To Generate New Insured')])[1]");
	By createNewInsuredBtn=By.id("btnCreateNewInsured");
	By sameAsPhysicalAddress=By.xpath("(//label[@for='sameAsPhysicalAddress']//following::label[contains(text(),'Yes')])[1]");
	By distanceToCoastal=By.xpath("//input[contains(@id,'distanceToCoastTB')]");
	By distanceToHydrant=By.id("distanceToHydrant");
	By distanceToFirStation=By.id("distanceToFireStation");
	By openCalendar=By.xpath("(//button[@aria-label='Open Calendar'])[3]");
	By yearlabel=By.className("yearlabel");
	By yearChangeBtn=By.xpath("//button[@class='yearchangebtn mydpicon icon-mydpup yearchangebtnenabled']");
	By savebtn=By.id("btnSave");
	By occupancy=By.xpath("//*[contains(@id,'occupancy')]");
	
	By protectionClass=By.xpath("//*[contains(@id,'protectionClass')]");
	By squareFootage=By.xpath("//*[contains(@id,'squareFootage')]");
	By noOfStories=By.xpath("//*[contains(@id,'numberOfStories')]");
	By yearBuilt=By.xpath("//*[contains(@id,'yearBuilt')]");
	By Masonry=By.xpath("//label[@title='Masonry']/span");
	By primaryHeatSource=By.xpath("//*[contains(@id,'primaryHeatSource')]");
	By Concrete=By.xpath("//label[@title='Concrete']/span[1]");
	By woodShake=By.xpath("//label[@title='Woodshake']/span[1]");
	By flat=By.xpath("//label[@title='Flat']/span[1]");
	By roofAnchor=By.xpath("//*[contains(@id,'roofAnchor')]");
	By foundationType=By.xpath("//*[contains(@id,'foundationType')]");
	By openingProtections=By.xpath("//*[contains(@id,'openingProtections')]");
	By noOfFamilies=By.xpath("//*[contains(@id,'numberOfFamilies')]");
	By fireAlarm=By.xpath("//*[contains(@id,'fireBurglarAlarm')]");
	By animalOrPetNo=By.xpath("//*[contains(@id,'isAnimalOrPetNo')]");
	By animalOrPetYes=By.xpath("//*[contains(@id,'isAnimalOrPetYes')]");
	By trampolineNo=By.xpath("//*[contains(@id,'isTrampolineNo')]");
	By trampolineYes=By.xpath("//*[contains(@id,'isTrampolineYes')]");
	By lapseInCoverage=By.xpath("//*[contains(@id,'isLapseAfter30DaysNo')]");
	By lapseInCoverageYes=By.xpath("//*[contains(@id,'isLapseAfter30DaysYes')]");
	By doesRiskHaveDOckNo=By.xpath("//*[contains(@id,'dosRiskHaveDocNo')]");
	By doesRiskHaveDOckYes=By.xpath("//*[contains(@id,'dosRiskHaveDocyes')]");
	By BurglerBars=By.xpath("//*[contains(@id,'isBurglarBarsNo')]");
	By BurglerBarsYes=By.xpath("//*[contains(@id,'isBurglarBarsYes')]");
	By pools=By.xpath("//*[contains(@id,'isPools')]");
	By isWaterLeak=By.xpath("//*[contains(@id,'isWaterLeakNo')]");
	By isWaterLeakYes=By.xpath("//*[contains(@id,'isWaterLeakYes')]");
	By isPrimaryHeatSource=By.xpath("//*[contains(@id,'isPrimaryHeatSourceNo')]");
	By isPrimaryHeatSourceYes=By.xpath("//*[contains(@id,'isPrimaryHeatSourceYes')]");
	By isCoverageBeenDeclinedNo_HO=By.xpath("//*[contains(@id,'isCoverageBeenDeclinedNo')]");
	By isCoverageBeenDeclinedYes_HO=By.xpath("//*[contains(@id,'isCoverageBeenDeclinedYes')]");
	By isApplicantConvictedNo_HO=By.xpath("//*[contains(@id,'isApplicantConvictedNo')]");
	By isApplicantConvictedYes_HO=By.xpath("//*[contains(@id,'isApplicantConvictedYes')]");
	By resistanceOpening_HO=By.xpath("//*[contains(@id,'resistanceOpening')]");
	By CoverageA_HO=By.xpath("//*[contains(@id,'CoverageA')]");
	By otherStuctureRentalNo_HO=By.xpath("//*[contains(@id,'otherStuctureRentalNo')]");
	By otherStuctureRentalYes_HO=By.xpath("//*[contains(@id,'otherStuctureRentalYes')]");
	By isNewPurchaseYes_HO=By.xpath("//*[contains(@id,'isNewPurchaseYes')]");
	By isNewPurchaseNo_HO=By.xpath("//*[contains(@id,'isNewPurchaseNo')]");
	By windDeductible_HO=By.xpath("//*[contains(@id,'windDeductible')]");
	By isBuildersRiskEnhancedCovNo_HO=By.xpath("//*[contains(@id,'isBuildersRiskEnhancedCovNo')]");
	By isBuildersRiskEnhancedCovYes_HO=By.xpath("//*[contains(@id,'isBuildersRiskEnhancedCovYes')]");
	By raitobtn=By.xpath("(//div[@class='custom-control custom-radio']//input[contains(@class,'custom-control-input')])[1]");
	By saveBtn=By.id("btnSave");
	By isAnyLossWithinFiveYearN=By.id("isAnyLossWithinFiveYearN");
	By isAnyLossWithinFiveYearY=By.id("isAnyLossWithinFiveYearY");
	By claimNumber=By.id("claimNumber");
	By claimLocNo=By.id("claimLocNo");
	By claimBuildNo=By.id("claimBuildNo");
	By totalClaimCount=By.id("totalClaimCount");
	By claimCovType=By.id("claimCovType");
	By claimStatus=By.id("claimStatus");
	By totalPayout=By.id("totalPayout");
	By reserveAmount=By.id("reserveAmount");
	By claimAmount=By.id("claimAmount");
	By lossDescription=By.id("lossDescription");
	By lossDate=By.xpath("//input[@aria-label='Date input field']");
	By isDwellingRentalNo_HO=By.xpath("//*[contains(@id,'isDwellingRentalNo')]/parent::label");
	By isDwellingRentalYes_HO=By.xpath("//*[contains(@id,'isDwellingRentalYes')]/parent::label");
	By openCalendar1=By.xpath("(//button[@aria-label='Open Calendar'])[1]");
	By internalSubmitRules=By.xpath("//li[@class='title-border']//div[@class='form-group mr-3']");
	By selectQuote=By.xpath("//strong[contains(text(),'SELECT THIS QUOTE')]");
	By quoteBtn=By.id("btnApproved");
	By agentStatus=By.xpath("//div[@class='agent-status']/span");
	By closeBtn=By.xpath("(//span[@class='icon-close'])[1]");
	By insuredNameListing=By.xpath("//tbody//tr[1]//td[2]");
	By proceedToBind=By.id("btnRequestBinding");
	By BindBtn=By.id("btnGeneratePolicy");
	By continueToBind=By.xpath("//button[contains(text(),'Continue To Bind')]");
	By issuePolicy=By.id("btnIssuePolicy");
	By agentStatusListing=By.xpath("//tbody//tr[1]//td[7]//span");
	By approveAll=By.id("appoveAll");
	By cancelbtn=By.id("btnCancel");
	By personalPropertyReplacementCost=By.xpath("//input[contains(@id,'personalPropReplCostYes')]");
	By coverageDwelling=By.id("CoverageDwelling");
	By subProductDP3=By.xpath("//input[@id='subProductDP 3']");
	// Endorsement
	By mtaRequest=By.id("btnMtaRequest");
	By premiumBearing=By.xpath("//label[@title='Premium Bearing']");
	By manual=By.xpath("//label[@title='Manual']");
	By effectiveDatePicker=By.xpath("//button[@aria-label='Open Calendar']");
	By currentDay=By.xpath("//span[@class='markcurrday']");
	By endorsementReasonOtherCheck=By.id("otherChk");
	By othervalue=By.id("otherVal");
	By endorsementReason=By.xpath("//a[@data-title='Endorsment Reason']");
	By endorsementReasonValue=By.id("endorsementReason");
	By btnAddMtaReason=By.id("btnAddMtaReason");
	By startMta=By.id("btnStartMta");
	By editIcon=By.className("icon-edit");
	By coverageLimits=By.xpath("//div[contains(text(),'Coverage Limits')]//ancestor::li//div[@class='icon-circle']");
	By coverage=By.xpath("//input[contains(@id,'CoverageA')]");
	By btnBindMta=By.id("btnBindMta");
	By policyNumber=By.xpath("//tbody//tr//td[1]");
	// cancel policy
	By btnCancelRequest=By.id("btnCancelRequest");
	By flatRate=By.xpath("//label[@title='Flat']");
	By endorsementRequestedBy=By.id("endorsementRequestedBy");
	By endorsementReasonCancel=By.id("endorsementReason");
	By btnStartCancellation=By.id("btnStartCancellation");
	By cancelPolicy=By.id("btnCancel");
	By aimQuote=By.id("apiQuoteId");
			
	
	
	public PersonalLinesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnNewQuote()
	{
		WebElement  ele=driver.findElement(NewQuoteBtn);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewQuoteBtn));
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
	}
	
	public void clickOnPersonalLines()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(personalLines));
		driver.findElement(personalLines).click();
	}
	
	public void selectRiskState(String state)
	{
		driver.findElement(By.xpath("//option[@value='"+state+"']")).click();
	}
	
	public void selectHO3()
	{
		Helper.clickUsingJavascript(driver.findElement(By.id("CoverageHomeowners")));
		Helper.clickUsingJavascript(By.xpath("//*[@id='subProductHO 3']"));
	}
	
	public void clickOnContinue() throws InterruptedException
	{
		Helper.waitFor(continueBtn, 10);
		driver.findElement(continueBtn).click();
		Thread.sleep(2000);
	}
	
	public void clickOnSelectAll()
	{
		Helper.waitFor(selectAll,15);
		driver.findElement(selectAll).click();
	}
	
	public void clickOnNextStep() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(nextStepBtn).click();
	}
	
	public void selectAppTypeTrust()
	{
		Helper.waitFor(appType, 10);
		Select select=new Select(driver.findElement(appType));
		select.selectByVisibleText("Trust");
	}
	
	public void enterTrustName(String trusteename)
	{
		driver.findElement(appFullName).sendKeys(trusteename);
	}
	
	public void enterTrusteeName()
	{
		driver.findElement(appTrusteename).sendKeys(RandomStringUtils.randomAlphabetic(5));
	}
	
	public void enterTrusteeName(String name)
	{
		driver.findElement(appTrusteename).sendKeys(name);
	}
	
	public void enterdob()
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='2000']")));
		driver.findElement(By.xpath("//div[text()='2000']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1']")));
		driver.findElement(By.xpath("//span[text()='1']")).click();
	}
	
	public void selectAppOccupation()
	{
		Select select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText("Architecture and Engineering");
	}
	
	public void enterAddress(String address) throws InterruptedException {
		driver.findElement(googleSearch).sendKeys(address);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//label[@for='GooglesearchAddressPhysical']//following::span[@class='fa-fw select-all fas']")).click();
//		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains(address))
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
	}
	
	public void enterCity(String City)
	{
		Select select=new Select(driver.findElement(city));
		select.selectByValue(City);
	}
	
	public void clickOnClearInsured()
	{
		driver.findElement(clearInsured).click();
	}
	
	public void clickOnNewInsured()
	{
		Helper.waitFor(isNewInsured, 10);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
	}
	
	public void clickOnCreateNewInsuredBtn()
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
	}
	
	public void clickOnSameAsPhysicalAddress() throws InterruptedException
	{
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
	}
	
	public void enterDistanceFromCoastal(String distance)
	{
		driver.findElement(distanceToCoastal).sendKeys(distance);
	}
	
	public void enterDistanceFromHydrant(String distance)
	{
		driver.findElement(distanceToHydrant).sendKeys(distance);
	}
	
	public void enterDistanceFromFireStation(String distance)
	{
		driver.findElement(distanceToFirStation).sendKeys(distance);
	}
	
	public void clickOnSaveBtn() throws InterruptedException
	{
		Helper.waitFor(savebtn, 10);
		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Thread.sleep(2000);
	}
	
	public void approveReferRules()
	{
		try {
			Helper.clickUsingJavascript(driver.findElement(approveAll));
			}catch(Exception e)
			{
				extentReport.test.info("No rules found");
			}
	}
	
	public void clickOnSelectQuoteBtn()
	{
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
	}
	
	public void clickOnQuoteBtn()
	{
		driver.findElement(quoteBtn).click();
	}
	
	public String personalLinesHO3() throws InterruptedException, IOException {
		Thread.sleep(5000);
		clickOnNewQuote();
		clickOnPersonalLines();
		Thread.sleep(5000);
		selectRiskState("MS");
		selectHO3();
		Thread.sleep(2000);
		clickOnContinue();
		clickOnSelectAll();
		clickOnContinue();
		fillInsuredInfo();
		clickOnNextStep();
		Thread.sleep(5000);
		selectAppTypeTrust();
		String trusteename=RandomStringUtils.randomAlphabetic(5);
		enterTrustName(trusteename);
		enterTrusteeName();
		enterdob();
		enterAddress("611 Rue Maupesant, Ocean Springs, MS 39564, USA");
		Thread.sleep(2000);
		enterCity("OCEAN SPRINGS");
		clickOnClearInsured();
		clickOnNewInsured();
		clickOnCreateNewInsuredBtn();
		Thread.sleep(2000);
		clickOnSameAsPhysicalAddress();
		enterDistanceFromCoastal("1");
		enterDistanceFromHydrant("1");
		enterDistanceFromFireStation("1");
		clickOnSaveBtn();
		clickOnContinue();
		fillRiskCoveragesHO3();
		clickOnContinue();
		fillClaimInfo();
		clickOnContinue();
		clickOnContinue();
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		approveReferRules();
		clickOnSelectQuoteBtn();
		clickOnContinue();
		clickOnContinue();
		clickOnQuoteBtn();
		Thread.sleep(10000);
		verifyQuotedStatus();
		clickOnCancelBtn();
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		verifyBoundIssueStatus();
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		verifyInsuredName(trusteename);
		verifyBoundIssueStatusInListing();
		By xpath=By.xpath("//tr[count(//span[text()='"+trusteename+"']//ancestor::tr//preceding-sibling::tr)+1]//td[1]");
		String policyNumber=driver.findElement(xpath).getText();
		extentReport.test.info("policy number is: "+policyNumber);
		return policyNumber;
	}
	
	public void verifyInsuredName(String trusteename) throws InterruptedException
	{
		Helper.waitFor(insuredNameListing, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trusteename);
	}
	
	public void verifyQuotedStatus()
	{
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
	}
	
	public void verifyBoundIssueStatus()
	{
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
	}
	
	public void verifyBoundIssueStatusInListing()
	{
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
	}
	
	public void clickOnCancelBtn()
	{
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
	}
	
	public void fillInsuredInfo() throws InterruptedException
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
		select.selectByVisibleText("testtest");
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
	}
	
	public void fillClaimInfo() throws InterruptedException
	{
		try {
			Helper.clickUsingJavascript(isAnyLossWithinFiveYearN);
			Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(3000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("Element not present");
		}
//		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Helper.waitFor(claimNumber, 10);
		driver.findElement(claimNumber).sendKeys(RandomStringUtils.randomNumeric(5));
		Select select=new Select(driver.findElement(claimLocNo));
		select.selectByVisibleText("Loc-1");
		select=new Select(driver.findElement(claimBuildNo));
		select.selectByVisibleText("Build-1");
		driver.findElement(totalClaimCount).sendKeys("50");
		select=new Select(driver.findElement(claimCovType));
		select.selectByVisibleText("Property");
		select=new Select(driver.findElement(claimStatus));
		select.selectByVisibleText("Closed");
		driver.findElement(totalPayout).sendKeys("4000");
		driver.findElement(reserveAmount).sendKeys("3000");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar1));
		driver.findElement(openCalendar1).click();
		driver.findElement(By.xpath("(//div[@class='datevalue currmonth']/span)[5]")).click();
//		driver.findElement(lossDate).sendKeys("06-11-2023");
		driver.findElement(claimAmount).sendKeys("5000");
		driver.findElement(lossDescription).sendKeys("dhdjdj");
	}
	
	public void fillRiskCoveragesHO31(String className) throws InterruptedException, IOException
	{
		Helper.waitFor(occupancy, 10);
		Select select=new Select(driver.findElement(occupancy));
		select.selectByVisibleText(help.getTestData(className).getProperty("occupancy"));
		Thread.sleep(3000);
		if(help.getTestData(className).getProperty("isDwellingOnRental").equalsIgnoreCase("Yes"))
		{
			try {
				driver.findElement(isDwellingRentalYes_HO).click();
			}catch(Exception e)
			{
					extentReport.test.info("No dwelling on rental");
			}
		}
		else if(help.getTestData(className).getProperty("isDwellingOnRental").equalsIgnoreCase("No"))
		{
			try {
				driver.findElement(isDwellingRentalNo_HO).click();
			}catch(Exception e)
			{
					extentReport.test.info("No dwelling on rental");
			}
		}
		
		select=new Select(driver.findElement(protectionClass));
		select.selectByVisibleText(help.getTestData(className).getProperty("protectionClass"));
		select=new Select(driver.findElement(noOfStories));
		select.selectByVisibleText(help.getTestData(className).getProperty("noOfStories"));
		driver.findElement(squareFootage).sendKeys(help.getTestData(className).getProperty("squareFootage"));
		driver.findElement(yearBuilt).sendKeys(help.getTestData(className).getProperty("yearBuilt"));
		By xpath=By.xpath("//label[@title='"+help.getTestData(className).getProperty("constructionType")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
//		select=new Select(driver.findElement(primaryHeatSource));
//		select.selectByVisibleText(help.getTestData(className).getProperty("primaryHeatSource"));
//		xpath=By.xpath("//label[@title='"+help.getTestData(className).getProperty("roofFinish")+"']/span");
//		Helper.clickUsingJavascript(driver.findElement(xpath));
//		xpath=By.xpath("//label[@title='"+help.getTestData(className).getProperty("roofCovering")+"']/span");
//		Helper.clickUsingJavascript(driver.findElement(xpath));
		xpath=By.xpath("//label[@title='"+help.getTestData(className).getProperty("roofGeometry")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
//		Helper.clickUsingJavascript(driver.findElement(flat));
//		select=new Select(driver.findElement(roofAnchor));
//		select.selectByVisibleText(help.getTestData(className).getProperty("roofAnchor"));
//		select=new Select(driver.findElement(foundationType));
//		select.selectByVisibleText(help.getTestData(className).getProperty("foundationType"));
//		try {
//		select=new Select(driver.findElement(openingProtections));
//		select.selectByVisibleText(help.getTestData(className).getProperty("openingProtections"));
//		}
//		catch(NoSuchElementException e)
//		{
//			extentReport.test.info("No opening protections field");
//		}
		
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		Helper.waitFor(noOfFamilies, 10);
		select=new Select(driver.findElement(noOfFamilies));
		select.selectByVisibleText(help.getTestData(className).getProperty("noOfFamilies"));
		select=new Select(driver.findElement(fireAlarm));
		select.selectByVisibleText(help.getTestData(className).getProperty("fireAlarms"));
		if(help.getTestData(className).getProperty("animalsOrExoticPets").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(animalOrPetNo));
		}
		else if(help.getTestData(className).getProperty("animalsOrExoticPets").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(animalOrPetYes));
		}
		
		if(help.getTestData(className).getProperty("trampoline").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(trampolineNo));
		}
		else if(help.getTestData(className).getProperty("trampoline").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(trampolineYes));
		}
		
		if(help.getTestData(className).getProperty("lapseInCoverage").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(lapseInCoverage));
		}
		else if(help.getTestData(className).getProperty("lapseInCoverage").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(lapseInCoverageYes));
		}
		
		if(help.getTestData(className).getProperty("lapseInCoverage").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckNo));
		}
		else if(help.getTestData(className).getProperty("lapseInCoverage").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckYes));
		}
		
		if(help.getTestData(className).getProperty("burglarBars").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(BurglerBars));
		}
		else if(help.getTestData(className).getProperty("burglarBars").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(BurglerBarsYes));
		}
		
		select=new Select(driver.findElement(pools));
		select.selectByVisibleText("No");
		
		if(help.getTestData(className).getProperty("waterLeakDetection").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isWaterLeak));
		}
		else if(help.getTestData(className).getProperty("waterLeakDetection").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isWaterLeakYes));
		}
		
		if(help.getTestData(className).getProperty("isprimaryHeatSource").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSource));
		}
		else if(help.getTestData(className).getProperty("isprimaryHeatSource").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSourceYes));
		}
		
		if(help.getTestData(className).getProperty("coverageDeclined").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedNo_HO));
		}
		else if(help.getTestData(className).getProperty("coverageDeclined").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedYes_HO));
		}
		
		if(help.getTestData(className).getProperty("crimeConviction").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedNo_HO));
		}
		else if(help.getTestData(className).getProperty("crimeConviction").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedYes_HO));
		}
		
		try {
		select=new Select(driver.findElement(resistanceOpening_HO));
		select.selectByVisibleText(" AllGlazedLargeMissiles ");
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("No resistance opening field");
		}
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		driver.findElement(CoverageA_HO).sendKeys(help.getTestData(className).getProperty("coverageA"));
		if(help.getTestData(className).getProperty("rentalStructures").equalsIgnoreCase("No"))
		{
			try {
			Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalNo_HO));
			}
			catch(NoSuchElementException e)
			{
				extentReport.test.info("No other structure rental field");
			}
		}
		else if(help.getTestData(className).getProperty("rentalStructures").equalsIgnoreCase("Yes"))
		{
			try {
				Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalYes_HO));
				}
				catch(NoSuchElementException e)
				{
					extentReport.test.info("No other structure rental field");
				}
		}
		Thread.sleep(2000);
		if(help.getTestData(className).getProperty("newPurchase").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isNewPurchaseNo_HO));
		}
		else if(help.getTestData(className).getProperty("newPurchase").equalsIgnoreCase("Yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isNewPurchaseYes_HO));	
		}
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		select=new Select(driver.findElement(windDeductible_HO));
		select.selectByVisibleText(help.getTestData(className).getProperty("windDeductible"));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
//		Helper.clickUsingJavascript(driver.findElement(isBuildersRiskEnhancedCovNo_HO));
		Helper.clickUsingJavascript(driver.findElement(By.xpath("//input[contains(@id,'personalPropReplCostNo')]")));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		
//		Helper.waitFor(raitobtn, 10);
		Helper.clickUsingJavascript(driver.findElement(raitobtn));
		try {
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		}
		catch(NoSuchElementException e){
			extentReport.test.info("No next button");
		}
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
	}
	
	public void fillRiskCoveragesHO3() throws InterruptedException, IOException
	{
		Helper.waitFor(occupancy, 10);
		Select select=new Select(driver.findElement(occupancy));
		select.selectByVisibleText("Primary");
		Thread.sleep(3000);
			try {
				driver.findElement(isDwellingRentalYes_HO).click();
			}catch(Exception e)
			{
					extentReport.test.info("No dwelling on rental");
			}
		
		select=new Select(driver.findElement(protectionClass));
		select.selectByVisibleText("2");
		select=new Select(driver.findElement(noOfStories));
		select.selectByVisibleText("2");
		driver.findElement(squareFootage).sendKeys("2000");
		driver.findElement(yearBuilt).sendKeys("2010");
		Helper.clickUsingJavascript(driver.findElement(Masonry));
		select=new Select(driver.findElement(primaryHeatSource));
		select.selectByVisibleText("Gas");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Concrete));
		Helper.clickUsingJavascript(driver.findElement(Concrete));
		Helper.clickUsingJavascript(driver.findElement(woodShake));
		Helper.clickUsingJavascript(driver.findElement(flat));
		select=new Select(driver.findElement(roofAnchor));
		select.selectByVisibleText("Clips");
		select=new Select(driver.findElement(foundationType));
		select.selectByVisibleText("Slab");
		try {
		select=new Select(driver.findElement(openingProtections));
		select.selectByVisibleText("All");
		}
		catch(NoSuchElementException e)
		{
			extentReport.test.info("No opening protections field");
		}
		
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		Helper.waitFor(noOfFamilies, 10);
		select=new Select(driver.findElement(noOfFamilies));
		select.selectByVisibleText("1 Family");
		select=new Select(driver.findElement(fireAlarm));
		select.selectByVisibleText("None");
		Helper.clickUsingJavascript(driver.findElement(animalOrPetNo));
		Helper.clickUsingJavascript(driver.findElement(trampolineNo));
		Helper.clickUsingJavascript(driver.findElement(lapseInCoverage));
		Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckNo));
		Helper.clickUsingJavascript(driver.findElement(BurglerBars));
		select=new Select(driver.findElement(pools));
		select.selectByVisibleText("No");
		Helper.clickUsingJavascript(driver.findElement(isWaterLeak));
		Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSource));
		Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedNo_HO));
		Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedNo_HO));
		try {
		select=new Select(driver.findElement(resistanceOpening_HO));
		select.selectByVisibleText(" AllGlazedLargeMissiles ");
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("No resistance opening field");
		}
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		driver.findElement(CoverageA_HO).sendKeys("1500000");
		try {
		Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalNo_HO));
		}
		catch(NoSuchElementException e)
		{
			extentReport.test.info("No other structure rental field");
		}
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(isNewPurchaseYes_HO));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		select=new Select(driver.findElement(windDeductible_HO));
		select.selectByVisibleText("5%");
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
//		Helper.clickUsingJavascript(driver.findElement(isBuildersRiskEnhancedCovNo_HO));
		Helper.clickUsingJavascript(driver.findElement(By.xpath("//input[contains(@id,'personalPropReplCostNo')]")));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		
//		Helper.waitFor(raitobtn, 10);
		Helper.clickUsingJavascript(driver.findElement(raitobtn));
		try {
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		}
		catch(NoSuchElementException e){
			extentReport.test.info("No next button");
		}
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
	}
	
	
	public void fillRiskCoveragesHO5() throws InterruptedException
	{
		Helper.waitFor(occupancy, 10);
		Select select=new Select(driver.findElement(occupancy));
		select.selectByValue("PRIMARY");
		Thread.sleep(5000);
//		WebElement element=driver.findElement(isDwellingRentalNo_HO);
//		if(element.isDisplayed() && element.isEnabled())
//		    element.click();
//		else
//		   System.out.println("Element is not visible or enabled");
		try {
		Helper.clickUsingJavascript(driver.findElement(isDwellingRentalNo_HO));
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("No dwelling on rental");
		}
		select=new Select(driver.findElement(protectionClass));
		select.selectByVisibleText("2");
		select=new Select(driver.findElement(noOfStories));
		select.selectByVisibleText("2");
		driver.findElement(squareFootage).sendKeys("3000");
		driver.findElement(yearBuilt).sendKeys("2010");
		Helper.clickUsingJavascript(driver.findElement(Masonry));
		select=new Select(driver.findElement(primaryHeatSource));
		select.selectByVisibleText("Gas");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Concrete));
		Helper.clickUsingJavascript(driver.findElement(Concrete));
		Helper.clickUsingJavascript(driver.findElement(woodShake));
		Helper.clickUsingJavascript(driver.findElement(flat));
		select=new Select(driver.findElement(roofAnchor));
		select.selectByVisibleText("Clips");
		select=new Select(driver.findElement(foundationType));
		select.selectByVisibleText("Slab");
		try {
		select=new Select(driver.findElement(openingProtections));
		select.selectByVisibleText("All");
		}
		catch(NoSuchElementException e)
		{
			extentReport.test.info("No opening protections field");
		}
		
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		Helper.waitFor(noOfFamilies, 10);
		select=new Select(driver.findElement(noOfFamilies));
		select.selectByVisibleText("1 Family");
		select=new Select(driver.findElement(fireAlarm));
		select.selectByVisibleText("None");
		Helper.clickUsingJavascript(driver.findElement(animalOrPetNo));
		Helper.clickUsingJavascript(driver.findElement(trampolineNo));
		Helper.clickUsingJavascript(driver.findElement(lapseInCoverage));
		Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckNo));
		Helper.clickUsingJavascript(driver.findElement(BurglerBars));
		select=new Select(driver.findElement(pools));
		select.selectByVisibleText("No");
		Helper.clickUsingJavascript(driver.findElement(isWaterLeak));
		Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSource));
		Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedNo_HO));
		Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedNo_HO));
		try {
		select=new Select(driver.findElement(resistanceOpening_HO));
		select.selectByVisibleText(" AllGlazedLargeMissiles ");
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("No resistance opening field");
		}
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		driver.findElement(CoverageA_HO).sendKeys("1500000");
		try {
		Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalNo_HO));
		}
		catch(NoSuchElementException e)
		{
			extentReport.test.info("No other structure rental field");
		}
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(isNewPurchaseYes_HO));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		select=new Select(driver.findElement(windDeductible_HO));
		select.selectByVisibleText("5%");
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
//		Helper.clickUsingJavascript(driver.findElement(isBuildersRiskEnhancedCovNo_HO));
		Helper.clickUsingJavascript(driver.findElement(By.xpath("//input[contains(@id,'personalPropReplCostNo')]")));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		
//		Helper.waitFor(raitobtn, 10);
		Helper.clickUsingJavascript(driver.findElement(raitobtn));
		try {
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		}
		catch(NoSuchElementException e){
			extentReport.test.info("No next button");
		}
		Thread.sleep(5000);
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
	}
	
	public String personalLinesHO5() throws InterruptedException {
		Thread.sleep(5000);
		WebElement  ele=driver.findElement(NewQuoteBtn);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewQuoteBtn));
		
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(personalLines));
		driver.findElement(personalLines).click();
//		extentReport.test.info("personal lines selected");
//		Helper.waitFor(By.id("CoverageHomeowners"), 10);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='CT']")).click();
		Helper.clickUsingJavascript(driver.findElement(By.id("CoverageHomeowners")));
//		Helper.waitFor(By.xpath("//*[@id='subProductHO 5']"), 10);
		Helper.clickUsingJavascript(By.xpath("//*[@id='subProductHO 5']"));
		driver.findElement(continueBtn).click();
		Helper.waitFor(selectAll,15);
		driver.findElement(selectAll).click();
		driver.findElement(continueBtn).click();
		fillInsuredInfo();
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		Helper.waitFor(appType, 10);
		Select select=new Select(driver.findElement(appType));
		select.selectByVisibleText("Trust");
		String trusteename=RandomStringUtils.randomAlphabetic(5);
		driver.findElement(appFullName).sendKeys(trusteename);
		driver.findElement(appTrusteename).sendKeys(RandomStringUtils.randomAlphabetic(5));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='2000']")));
		driver.findElement(By.xpath("//div[text()='2000']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1']")));
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
//		driver.findElement(dob).sendKeys("22-07-1995");
		select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText("Architecture and Engineering");
		driver.findElement(googleSearch).sendKeys("USA Motel, Berlin Turnpike, Newington, CT, USA");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//label[@for='GooglesearchAddressPhysical']//following::span[@class='fa-fw select-all fas']")).click();
//		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(8000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("USA Motel, Berlin Turnpike, Newington, CT, USA"))
			{
				while (!success && attempts < 3) {
				try {
				element.click();
				success = true;
				}
				catch(StaleElementReferenceException e)
				{
					list=driver.findElements(addressSuggestion);
					Thread.sleep(2000);
					 attempts++;
				}
				}
				Thread.sleep(3000);
				break;
			}
		}
		
		
		select=new Select(driver.findElement(city));
		select.selectByVisibleText("HTFD");
		driver.findElement(clearInsured).click();
//		WebElement popup=driver.findElement(By.id("myInsuredClearanceModel"));
//		jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", popup);
		Helper.waitFor(isNewInsured, 10);
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
//		driver.findElement(isNewInsured).click();
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
//		driver.findElement(createNewInsuredBtn).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		driver.findElement(distanceToCoastal).sendKeys("1");
		driver.findElement(distanceToHydrant).sendKeys("1");
		driver.findElement(distanceToFirStation).sendKeys("1");
		Helper.clickUsingJavascript(driver.findElement(savebtn));
//		driver.findElement(savebtn).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		
		fillRiskCoveragesHO5();

		Helper.waitFor(continueBtn, 10);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		
		fillClaimInfo();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		try {
			Helper.clickUsingJavascript(driver.findElement(approveAll));
			}catch(Exception e)
			{
				extentReport.test.info("No rules found");
			}
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(quoteBtn).click();
		Thread.sleep(15000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		Helper.waitFor(proceedToBind, 20);
		driver.findElement(proceedToBind).click();
		Helper.waitFor(BindBtn, 20);
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		Helper.waitFor(issuePolicy, 20);
		driver.findElement(issuePolicy).click();
		Thread.sleep(25000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Thread.sleep(2000);
		Helper.waitFor(insuredNameListing, 20);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trusteename);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		extentReport.test.info("policy bounded");
		String policyno=driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
		extentReport.test.info("policy number is: "+policyno);
		return policyno;
	}
	
	
	public String personalLinesDP3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement  ele=driver.findElement(NewQuoteBtn);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewQuoteBtn));
		
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(personalLines));
		driver.findElement(personalLines).click();
//		extentReport.test.info("personal lines selected");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='MS']")).click();
		Helper.clickUsingJavascript(coverageDwelling);
		Helper.clickUsingJavascript(subProductDP3);
		driver.findElement(continueBtn).click();
		Helper.waitFor(selectAll,15);
		driver.findElement(selectAll).click();
		driver.findElement(continueBtn).click();
		fillInsuredInfo();
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		Helper.waitFor(appType, 10);
		Select select=new Select(driver.findElement(appType));
		select.selectByVisibleText("Trust");
		String trusteename=RandomStringUtils.randomAlphabetic(5);
		driver.findElement(appFullName).sendKeys(trusteename);
		driver.findElement(appTrusteename).sendKeys(RandomStringUtils.randomAlphabetic(5));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='2000']")));
		driver.findElement(By.xpath("//div[text()='2000']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1']")));
		driver.findElement(By.xpath("//span[text()='1']")).click();
		select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText("Architecture and Engineering");
		driver.findElement(googleSearch).sendKeys("USA Pawn Shop Pearl, North Pearson Road, Pearl, MS, USA");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//label[@for='GooglesearchAddressPhysical']//following::span[@class='fa-fw select-all fas']")).click();
//		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains("USA Pawn Shop Pearl, North Pearson Road, Pearl, MS, USA"))
			{
				while (!success && attempts < 8) {
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
		
		Thread.sleep(2000);
		select=new Select(driver.findElement(city));
		select.selectByVisibleText("PEARL");
		driver.findElement(clearInsured).click();
//		WebElement popup=driver.findElement(By.id("myInsuredClearanceModel"));
//		jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", popup);
		Helper.waitFor(isNewInsured, 10);
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
//		driver.findElement(isNewInsured).click();
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
//		driver.findElement(createNewInsuredBtn).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		driver.findElement(distanceToCoastal).sendKeys("1");
		driver.findElement(distanceToHydrant).sendKeys("1");
		driver.findElement(distanceToFirStation).sendKeys("1");
		Helper.clickUsingJavascript(driver.findElement(savebtn));
//		driver.findElement(savebtn).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		
		fillRiskCoveragesHO5();
		
//		Helper.waitFor(savebtn, 10);
//		Helper.clickUsingJavascript(driver.findElement(savebtn));
		Helper.waitFor(continueBtn, 10);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Helper.clickUsingJavascript(driver.findElement(By.xpath("//input[contains(@id,'isAnyLossWithinFiveYearN')]")));
		driver.findElement(nextStepBtn).click();
		Thread.sleep(2000);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(2000);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(2000);
		fillClaimInfo();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		try {
			Helper.clickUsingJavascript(driver.findElement(approveAll));
			}catch(Exception e)
			{
				extentReport.test.info("No rules found");
			}
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(insuredNameListing, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trusteename);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		String policyno=driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
		extentReport.test.info("policy number is: "+policyno);
		return policyno;
	}
	
	public void personalLinesHO3TestData(String className) throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement  ele=driver.findElement(NewQuoteBtn);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewQuoteBtn));
		
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(personalLines));
		driver.findElement(personalLines).click();
		Thread.sleep(5000);
		String bindingoffice=help.getTestData(className).getProperty("PUMAABindingOffice");
		Select select=new Select(driver.findElement(By.id("binidingOffice")));
		select.selectByVisibleText(bindingoffice);
		String riskState=help.getTestData(className).getProperty("riskState");
		driver.findElement(By.xpath("//option[@value='"+riskState+"']")).click();
		Helper.clickUsingJavascript(driver.findElement(By.id("CoverageHomeowners")));
//		Helper.waitFor(By.xpath("//*[@id='subProductHO 5']"), 10);
		Helper.clickUsingJavascript(By.xpath("//*[@id='subProductHO 3']"));
		Thread.sleep(2000);
//		extentReport.test.info("personal lines selected");
		driver.findElement(continueBtn).click();
		Helper.waitFor(selectAll,15);
		driver.findElement(selectAll).click();
		driver.findElement(continueBtn).click();
		fillInsuredInfo1(className);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		Helper.waitFor(appType, 10);
		select=new Select(driver.findElement(appType));
		select.selectByVisibleText(help.getTestData(className).getProperty("applicantType"));
		String trustname=help.getTestData(className).getProperty("trustName");
		driver.findElement(appFullName).sendKeys(trustname);
		driver.findElement(appTrusteename).sendKeys(help.getTestData(className).getProperty("trusteeName"));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		String year=help.getTestData(className).getProperty("dob").split("/")[2];
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+year+"']")));
		driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
		String date=help.getTestData(className).getProperty("dob").split("/")[1];
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+date+"']")));
		driver.findElement(By.xpath("//span[text()='"+date+"']")).click();
		
//		driver.findElement(dob).sendKeys("22-07-1995");
		select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText(help.getTestData(className).getProperty("occupation"));
		driver.findElement(googleSearch).sendKeys(help.getTestData(className).getProperty("address"));
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//label[@for='GooglesearchAddressPhysical']//following::span[@class='fa-fw select-all fas']")).click();
//		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains(help.getTestData(className).getProperty("address")))
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
		
		Thread.sleep(2000);
		select=new Select(driver.findElement(city));
		select.selectByValue(help.getTestData(className).getProperty("city"));
		driver.findElement(clearInsured).click();
//		WebElement popup=driver.findElement(By.id("myInsuredClearanceModel"));
//		jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", popup);
		Helper.waitFor(isNewInsured, 10);
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
//		driver.findElement(isNewInsured).click();
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
//		driver.findElement(createNewInsuredBtn).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		driver.findElement(distanceToCoastal).sendKeys(help.getTestData(className).getProperty("coastalDistance"));
		driver.findElement(distanceToHydrant).sendKeys(help.getTestData(className).getProperty("hydrantDistance"));
		driver.findElement(distanceToFirStation).sendKeys(help.getTestData(className).getProperty("fireStationDistance"));
		Helper.clickUsingJavascript(driver.findElement(savebtn));
//		driver.findElement(savebtn).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		
		fillRiskCoveragesHO31(className);

		Helper.waitFor(continueBtn, 10);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		if(help.getTestData(className).getProperty("lossesWithinPast5Years").equalsIgnoreCase("No"))
		{
		Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearN));
		}
		else if(help.getTestData(className).getProperty("lossesWithinPast5Years").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearY));
		}
		fillClaimInfo();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		try {
		Helper.clickUsingJavascript(driver.findElement(approveAll));
		}catch(Exception e)
		{
			extentReport.test.info("No rules found");
		}
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(insuredNameListing, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trustname);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
	}
	
	public void fillInsuredInfo1(String className) throws InterruptedException, IOException
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Helper.waitFor(retailAgency, 5);
		driver.findElement(retailAgency).sendKeys(help.getTestData(className).getProperty("retailAgency"));
		Helper.waitFor(searchIcon, 5);
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(searchIcon));
		driver.findElement(searchIcon).click();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(autoSuggestive);
//		for(WebElement element:list)
//		{
//			list=driver.findElements(autoSuggestive);
//			if(element.getText().equalsIgnoreCase(help.getTestData(className).getProperty("retailAgency")))
//			{
//				element.click();
//				Thread.sleep(3000);
//			}
//		}
		
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains(help.getTestData(className).getProperty("retailAgency")))
			{
				while (!success && attempts < 3) {
				try {
				element.click();
				success = true;
				}
				catch(StaleElementReferenceException e)
				{
					list=driver.findElements(autoSuggestive);
					Thread.sleep(1000);
					 attempts++;
				}
				}
				Thread.sleep(3000);
				break;
			}
		}
		
		Select select=new Select(driver.findElement(producer));
		select.selectByVisibleText(help.getTestData(className).getProperty("producer"));
		select=new Select(driver.findElement(underWriter));
		select.selectByVisibleText(help.getTestData(className).getProperty("underwriter"));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
	}
	
	public void fillInsuredInfo2(Map<String,String> parameters) throws InterruptedException, IOException
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Helper.waitFor(retailAgency, 5);
		driver.findElement(retailAgency).sendKeys(parameters.get("retailAgency"));
		Helper.waitFor(searchIcon, 5);
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(searchIcon));
		driver.findElement(searchIcon).click();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(autoSuggestive);
		for(WebElement element:list)
		{
			if(element.getText().equalsIgnoreCase(parameters.get("retailAgency")))
			{
				element.click();
				Thread.sleep(3000);
			}
		}
		Select select=new Select(driver.findElement(producer));
		select.selectByVisibleText(parameters.get("producer"));
		select=new Select(driver.findElement(underWriter));
		select.selectByVisibleText(parameters.get("underwriter"));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextStepBtn));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
	}
	
	public void personalLinesHO3Excel(Map<String, String> parameters) throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement  ele=driver.findElement(NewQuoteBtn);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewQuoteBtn));
		
		Helper.clickUsingJavascript(driver.findElement(NewQuoteBtn));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(personalLines));
		driver.findElement(personalLines).click();
		Thread.sleep(5000);
		String bindingoffice=parameters.get("PUMAABindingOffice");
		Select select=new Select(driver.findElement(By.id("binidingOffice")));
		select.selectByVisibleText(bindingoffice);
		String riskState=parameters.get("riskState");
		driver.findElement(By.xpath("//option[@value='"+riskState+"']")).click();
		Helper.clickUsingJavascript(driver.findElement(By.id("CoverageHomeowners")));
//		Helper.waitFor(By.xpath("//*[@id='subProductHO 5']"), 10);
		Helper.clickUsingJavascript(By.xpath("//*[@id='subProductHO 3']"));
		Thread.sleep(2000);
//		extentReport.test.info("personal lines selected");
		driver.findElement(continueBtn).click();
		Helper.waitFor(selectAll,15);
		driver.findElement(selectAll).click();
		driver.findElement(continueBtn).click();
		fillInsuredInfo2(parameters);
		driver.findElement(nextStepBtn).click();
		Thread.sleep(5000);
		Helper.waitFor(appType, 10);
		select=new Select(driver.findElement(appType));
		select.selectByVisibleText(parameters.get("applicantType"));
		String trustname=parameters.get("trustName");
		driver.findElement(appFullName).sendKeys(trustname);
		driver.findElement(appTrusteename).sendKeys(parameters.get("trusteeName"));
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		String year=parameters.get("dobYear");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+year+"']")));
		driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
		String date=parameters.get("dobDate");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+date+"']")));
		driver.findElement(By.xpath("//span[text()='"+date+"']")).click();
		
//		driver.findElement(dob).sendKeys("22-07-1995");
		select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText(parameters.get("occupation"));
		driver.findElement(googleSearch).sendKeys(parameters.get("address"));
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//label[@for='GooglesearchAddressPhysical']//following::span[@class='fa-fw select-all fas']")).click();
//		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(addressSuggestion);
		Thread.sleep(5000);
		list=driver.findElements(addressSuggestion);
		boolean success = false;
		int attempts = 0;
		for(WebElement element:list)
		{
			if(element.getText().contains(parameters.get("address")))
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
		
		Thread.sleep(2000);
		select=new Select(driver.findElement(city));
		select.selectByValue(parameters.get("city"));
		driver.findElement(clearInsured).click();
//		WebElement popup=driver.findElement(By.id("myInsuredClearanceModel"));
//		jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", popup);
		Helper.waitFor(isNewInsured, 10);
		jse.executeScript("arguments[0].click();", driver.findElement(isNewInsured));
//		driver.findElement(isNewInsured).click();
		jse.executeScript("arguments[0].click();", driver.findElement(createNewInsuredBtn));
//		driver.findElement(createNewInsuredBtn).click();
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(sameAsPhysicalAddress));
		Thread.sleep(2000);
		driver.findElement(distanceToCoastal).sendKeys(parameters.get("coastalDistance"));
		driver.findElement(distanceToHydrant).sendKeys(parameters.get("hydrantDistance"));
		driver.findElement(distanceToFirStation).sendKeys(parameters.get("fireStationDistance"));
		Helper.clickUsingJavascript(driver.findElement(savebtn));
//		driver.findElement(savebtn).click();
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
		
		fillRiskCoveragesHO32(parameters);

		Helper.waitFor(continueBtn, 10);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		if(parameters.get("lossesWithinPast5Years").equalsIgnoreCase("No"))
		{
		Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearN));
		}
		else if(parameters.get("lossesWithinPast5Years").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearY));
		}
		fillClaimInfo();
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		try {
		Helper.clickUsingJavascript(driver.findElement(approveAll));
		}catch(Exception e)
		{
			extentReport.test.info("No rules found");
		}
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(insuredNameListing, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trustname);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
	}
	
	public void fillRiskCoveragesHO32(Map<String,String> parameters) throws InterruptedException, IOException
	{
		Helper.waitFor(occupancy, 10);
		Select select=new Select(driver.findElement(occupancy));
		select.selectByVisibleText(parameters.get("occupancy"));
		Thread.sleep(3000);
		if(parameters.get("isDwellingOnRental").equalsIgnoreCase("Yes"))
		{
			try {
				driver.findElement(isDwellingRentalYes_HO).click();
			}catch(Exception e)
			{
					extentReport.test.info("No dwelling on rental");
			}
		}
		else if(parameters.get("isDwellingOnRental").equalsIgnoreCase("No"))
		{
			try {
				driver.findElement(isDwellingRentalNo_HO).click();
			}catch(Exception e)
			{
					extentReport.test.info("No dwelling on rental");
			}
		}
		
		select=new Select(driver.findElement(protectionClass));
		select.selectByVisibleText(parameters.get("protectionClass"));
		select=new Select(driver.findElement(noOfStories));
		select.selectByVisibleText(parameters.get("noOfStories"));
		driver.findElement(squareFootage).sendKeys(parameters.get("squareFootage"));
		driver.findElement(yearBuilt).sendKeys(parameters.get("yearBuilt"));
		By xpath=By.xpath("//label[@title='"+parameters.get("constructionType")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
		select=new Select(driver.findElement(primaryHeatSource));
		select.selectByVisibleText(parameters.get("primaryHeatSource"));
		xpath=By.xpath("//label[@title='"+parameters.get("roofFinish")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
		xpath=By.xpath("//label[@title='"+parameters.get("roofCovering")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
		xpath=By.xpath("//label[@title='"+parameters.get("roofGeometry")+"']/span");
		Helper.clickUsingJavascript(driver.findElement(xpath));
//		Helper.clickUsingJavascript(driver.findElement(flat));
		select=new Select(driver.findElement(roofAnchor));
		select.selectByVisibleText(parameters.get("roofAnchor"));
		select=new Select(driver.findElement(foundationType));
		select.selectByVisibleText(parameters.get("foundationType"));
		try {
		select=new Select(driver.findElement(openingProtections));
		select.selectByVisibleText(parameters.get("openingProtections"));
		}
		catch(NoSuchElementException e)
		{
			extentReport.test.info("No opening protections field");
		}
		
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		Helper.waitFor(noOfFamilies, 10);
		select=new Select(driver.findElement(noOfFamilies));
		select.selectByVisibleText(parameters.get("noOfFamilies"));
		select=new Select(driver.findElement(fireAlarm));
		select.selectByVisibleText(parameters.get("fireAlarms"));
		if(parameters.get("animalsOrExoticPets").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(animalOrPetNo));
		}
		else if(parameters.get("animalsOrExoticPets").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(animalOrPetYes));
		}
		
		if(parameters.get("trampoline").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(trampolineNo));
		}
		else if(parameters.get("trampoline").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(trampolineYes));
		}
		
		if(parameters.get("lapseInCoverage").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(lapseInCoverage));
		}
		else if(parameters.get("lapseInCoverage").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(lapseInCoverageYes));
		}
		
		if(parameters.get("lapseInCoverage").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckNo));
		}
		else if(parameters.get("lapseInCoverage").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(doesRiskHaveDOckYes));
		}
		
		if(parameters.get("burglarBars").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(BurglerBars));
		}
		else if(parameters.get("burglarBars").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(BurglerBarsYes));
		}
		
		select=new Select(driver.findElement(pools));
		select.selectByVisibleText("No");
		
		if(parameters.get("waterLeakDetection").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isWaterLeak));
		}
		else if(parameters.get("waterLeakDetection").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isWaterLeakYes));
		}
		
		if(parameters.get("isprimaryHeatSource").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSource));
		}
		else if(parameters.get("isprimaryHeatSource").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isPrimaryHeatSourceYes));
		}
		
		if(parameters.get("coverageDeclined").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedNo_HO));
		}
		else if(parameters.get("coverageDeclined").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isCoverageBeenDeclinedYes_HO));
		}
		
		if(parameters.get("crimeConviction").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedNo_HO));
		}
		else if(parameters.get("crimeConviction").equalsIgnoreCase("yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isApplicantConvictedYes_HO));
		}
		
		try {
		select=new Select(driver.findElement(resistanceOpening_HO));
		select.selectByVisibleText(" AllGlazedLargeMissiles ");
		}catch(NoSuchElementException e)
		{
			extentReport.test.info("No resistance opening field");
		}
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		driver.findElement(CoverageA_HO).sendKeys(parameters.get("coverageA"));
		if(parameters.get("rentalStructures").equalsIgnoreCase("No"))
		{
			try {
			Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalNo_HO));
			}
			catch(NoSuchElementException e)
			{
				extentReport.test.info("No other structure rental field");
			}
		}
		else if(parameters.get("rentalStructures").equalsIgnoreCase("Yes"))
		{
			try {
				Helper.clickUsingJavascript(driver.findElement(otherStuctureRentalYes_HO));
				}
				catch(NoSuchElementException e)
				{
					extentReport.test.info("No other structure rental field");
				}
		}
		Thread.sleep(2000);
		if(parameters.get("newPurchase").equalsIgnoreCase("No"))
		{
			Helper.clickUsingJavascript(driver.findElement(isNewPurchaseNo_HO));
		}
		else if(parameters.get("newPurchase").equalsIgnoreCase("Yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isNewPurchaseYes_HO));	
		}
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		Thread.sleep(2000);
		
		select=new Select(driver.findElement(windDeductible_HO));
		select.selectByVisibleText(parameters.get("windDeductible"));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
//		Helper.clickUsingJavascript(driver.findElement(isBuildersRiskEnhancedCovNo_HO));
		Helper.clickUsingJavascript(driver.findElement(By.xpath("//input[contains(@id,'personalPropReplCostNo')]")));
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		
//		Helper.waitFor(raitobtn, 10);
		Helper.clickUsingJavascript(driver.findElement(raitobtn));
		try {
		Helper.clickUsingJavascript(driver.findElement(nextStepBtn));
		}
		catch(NoSuchElementException e){
			extentReport.test.info("No next button");
		}
		Helper.clickUsingJavascript(driver.findElement(saveBtn));
	}
	
	public void HO3Endorsement(String policyNum) throws InterruptedException
	{
		By xpath=By.xpath("//tr[count(//span[text()='"+policyNum+"']//ancestor::tr//preceding-sibling::tr)+1]//span[@class='icon-edit']");
		Helper.waitFor(xpath, 10);
		Helper.clickUsingJavascript(xpath);	
		help.waitFor(mtaRequest, 10);
		Helper.clickUsingJavascript(mtaRequest);
		help.waitFor(premiumBearing, 10);
		Helper.clickUsingJavascript(premiumBearing);
		Helper.clickUsingJavascript(manual);
		Helper.clickUsingJavascript(effectiveDatePicker);
		Helper.waitFor(currentDay, 10);
		Helper.clickUsingJavascript(currentDay);
		Helper.clickUsingJavascript(endorsementReason);
		Helper.waitFor(endorsementReasonValue, 10);
		Select select=new Select(driver.findElement(endorsementReasonValue));
		select.selectByVisibleText(" Additional Premium Endorsement");
		Helper.clickUsingJavascript(btnAddMtaReason);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(startMta);
		Thread.sleep(2000);
		Helper.waitFor(nextStepBtn, 20);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.waitFor(continueBtn, 20);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
//		Helper.clickUsingJavascript(continueBtn);
//		Thread.sleep(2000);
		Helper.clickUsingJavascript(editIcon);
		Helper.waitFor(coverageLimits, 20);
		Helper.clickUsingJavascript(coverageLimits);
		Helper.waitFor(coverage, 10);
		driver.findElement(coverage).clear();
		driver.findElement(coverage).sendKeys("500000");
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(saveBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(nextStepBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		try {
		Helper.waitFor(approveAll, 20);
		Helper.clickUsingJavascript(approveAll);
		}
		catch(Exception e)
		{
			extentReport.test.info("No approve rules section");
		}
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(continueBtn);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(btnBindMta);
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Endorsement");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(policyNumber, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNum);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Endorsement");
	}
	
	public void HO3Cancellation(String policyNum) throws InterruptedException
	{
		By xpath=By.xpath("//tr[count(//span[text()='"+policyNum+"']//ancestor::tr//preceding-sibling::tr)+1]//span[@class='icon-edit']");
		Helper.waitFor(xpath, 10);
		Helper.clickUsingJavascript(xpath);	
		Helper.waitFor(btnCancelRequest, 10);
		Helper.clickUsingJavascript(btnCancelRequest);
		Helper.waitFor(flatRate, 10);
		Helper.clickUsingJavascript(flatRate);
		Helper.clickUsingJavascript(effectiveDatePicker);
		Helper.waitFor(currentDay, 10);
		Helper.clickUsingJavascript(currentDay);
		Select select=new Select(driver.findElement(endorsementRequestedBy));
		select.selectByVisibleText(" Additional Insured/Leinholder");
		select=new Select(driver.findElement(endorsementReasonCancel));
		select.selectByVisibleText(" Change in Market");
		Helper.clickUsingJavascript(btnStartCancellation);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(cancelPolicy);
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Cancelled");
		Helper.waitFor(cancelbtn, 10);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(policyNumber, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNum);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Cancelled");
	}
	
	public void HO3Reinstate(String policyNum) throws InterruptedException
	{
		By xpath=By.xpath("//tr[count(//span[text()='"+policyNum+"']//ancestor::tr//preceding-sibling::tr)+1]//span[@class='icon-edit']");
		Helper.waitFor(xpath, 10);
		Helper.clickUsingJavascript(xpath);	
		
		By btnReInstateRequest=By.id("btnReInstateRequest");
		By endorsementReasonReinstate=By.id("endorsementReason");
		By btnStartReinstate=By.id("btnStartReinstate");
		By reinstatePolicy=By.id("btnReinstate");
		
		Helper.waitFor(btnReInstateRequest, 10);
		Helper.clickUsingJavascript(btnReInstateRequest);
		Helper.waitFor(effectiveDatePicker, 10);
		Helper.clickUsingJavascript(effectiveDatePicker);
		Helper.waitFor(currentDay, 10);
		Helper.clickUsingJavascript(currentDay);
		Select select=new Select(driver.findElement(endorsementReasonReinstate));
		select.selectByVisibleText(" Does not fit carriers program.");
		Helper.clickUsingJavascript(btnStartReinstate);
		Helper.waitFor(reinstatePolicy, 10);
		Helper.clickUsingJavascript(reinstatePolicy);
		Thread.sleep(5000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Reinstated");
		Helper.waitFor(cancelbtn, 10);
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(policyNumber, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(policyNumber).getText(), policyNum);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Reinstated");
		
	}
	
	public void enterAIMQuote()
	{
		driver.findElement(aimQuote).sendKeys(RandomStringUtils.randomNumeric(5));
	}
	
	public String personalLinesHO3CRC() throws InterruptedException, IOException {
		Thread.sleep(5000);
		clickOnNewQuote();
//		clickOnPersonalLines();
		Thread.sleep(5000);
		selectRiskState("MS");
		selectHO3();
		Thread.sleep(2000);
		clickOnContinue();
//		clickOnSelectAll();
		clickOnContinue();
		enterAIMQuote();
		fillInsuredInfo();
		clickOnNextStep();
		Thread.sleep(5000);
		selectAppTypeTrust();
		String trusteename=RandomStringUtils.randomAlphabetic(5);
		enterTrustName(trusteename);
		enterTrusteeName();
		enterdob();
		enterAddress("611 Rue Maupesant, Ocean Springs, MS 39564, USA");
		Thread.sleep(2000);
		enterCity("OCEAN SPRINGS");
		clickOnClearInsured();
		clickOnNewInsured();
		clickOnCreateNewInsuredBtn();
		Thread.sleep(2000);
		clickOnSameAsPhysicalAddress();
		enterDistanceFromCoastal("1");
		enterDistanceFromHydrant("1");
		enterDistanceFromFireStation("1");
		clickOnSaveBtn();
		clickOnContinue();
		fillRiskCoveragesHO3();
		clickOnContinue();
		fillClaimInfo();
		clickOnContinue();
		clickOnContinue();
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		approveReferRules();
		clickOnSelectQuoteBtn();
		clickOnContinue();
		clickOnContinue();
		clickOnQuoteBtn();
		Thread.sleep(10000);
		verifyQuotedStatus();
		clickOnCancelBtn();
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		verifyBoundIssueStatus();
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		verifyInsuredName(trusteename);
		verifyBoundIssueStatusInListing();
		By xpath=By.xpath("//tr[count(//span[text()='"+trusteename+"']//ancestor::tr//preceding-sibling::tr)+1]//td[1]");
		String policyNumber=driver.findElement(xpath).getText();
		extentReport.test.info("policy number is: "+policyNumber);
		return policyNumber;
	}
	
	public void selectBindingOffice(String office)
	{
		Select select=new Select(driver.findElement(By.id("binidingOffice")));
		select.selectByVisibleText(office);
	}
	
	public void enterdob(String className) throws IOException
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(openCalendar));
		driver.findElement(openCalendar).click();
		driver.findElement(yearlabel).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearChangeBtn));
		driver.findElement(yearChangeBtn).click();
		String year=help.getTestData(className).getProperty("dob").split("/")[2];
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+year+"']")));
		driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
		String date=help.getTestData(className).getProperty("dob").split("/")[1];
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+date+"']")));
		driver.findElement(By.xpath("//span[text()='"+date+"']")).click();
	}
	
	public void selectAppOccupation(String occupation)
	{
		Select select=new Select(driver.findElement(appOccupation));
		select.selectByVisibleText(occupation);
	}
	
	public String personalLinesHO3CRC(String className) throws InterruptedException, IOException {
		Thread.sleep(5000);
		clickOnNewQuote();
		Thread.sleep(5000);
		selectBindingOffice(help.getTestData(className).getProperty("bindingOffice"));
		selectRiskState(help.getTestData(className).getProperty("riskState"));
		selectHO3();
		Thread.sleep(2000);
		clickOnContinue();
		clickOnContinue();
		enterAIMQuote();
		fillInsuredInfo1(className);
		clickOnNextStep();
		Thread.sleep(5000);
		selectAppTypeTrust();
		String trustname=help.getTestData(className).getProperty("trustName");
		enterTrustName(trustname);
		String trusteename=help.getTestData(className).getProperty("trusteeName");
		enterTrusteeName(trusteename);
//		enterdob(className);
//		selectAppOccupation(help.getTestData(className).getProperty("occupation"));
		enterAddress(help.getTestData(className).getProperty("address"));
		Thread.sleep(2000);
		enterCity(help.getTestData(className).getProperty("city"));
		clickOnContinue();
//		clickOnClearInsured();
//		clickOnNewInsured();
//		clickOnCreateNewInsuredBtn();
		clickOnSameAsPhysicalAddress();
		Thread.sleep(2000);
		enterDistanceFromCoastal(help.getTestData(className).getProperty("coastalDistance"));
		enterDistanceFromHydrant(help.getTestData(className).getProperty("hydrantDistance"));
		enterDistanceFromFireStation(help.getTestData(className).getProperty("fireStationDistance"));
		clickOnSaveBtn();
//		driver.findElement(savebtn).click();
		Thread.sleep(2000);
		clickOnContinue();
		
		fillRiskCoveragesHO31(className);

		clickOnContinue();
		if(help.getTestData(className).getProperty("lossesWithinPast5Years").equalsIgnoreCase("No"))
		{
		Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearN));
		}
		else if(help.getTestData(className).getProperty("lossesWithinPast5Years").equalsIgnoreCase("Yes"))
		{
			Helper.clickUsingJavascript(driver.findElement(isAnyLossWithinFiveYearY));
		}
		fillClaimInfo();
		clickOnContinue();
		clickOnContinue();
		Thread.sleep(20000);
//		wait.until(ExpectedConditions.elementToBeClickable(approveAll));
		try {
		Helper.clickUsingJavascript(driver.findElement(approveAll));
		}catch(Exception e)
		{
			extentReport.test.info("No rules found");
		}
		Helper.waitFor(selectQuote, 10);
		Helper.clickUsingJavascript(driver.findElement(selectQuote));
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		Thread.sleep(2000);
		Helper.clickUsingJavascript(driver.findElement(continueBtn));
		driver.findElement(quoteBtn).click();
		Thread.sleep(10000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Quoted");
		Helper.waitFor(cancelbtn, 10);
		Helper.clickUsingJavascript(driver.findElement(cancelbtn));
		driver.findElement(proceedToBind).click();
		driver.findElement(BindBtn).click();
		driver.findElement(continueToBind).click();
		driver.findElement(issuePolicy).click();
		Thread.sleep(20000);
		Helper.waitFor(agentStatus, 20);
		Assert.assertEquals(driver.findElement(agentStatus).getText(),"Bound Issue");
		Helper.clickUsingJavascript(driver.findElement(closeBtn));
		Helper.waitFor(insuredNameListing, 20);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(insuredNameListing).getText(), trustname);
		Assert.assertEquals(driver.findElement(agentStatusListing).getText(), "Bound Issue");
		
		By xpath=By.xpath("//tr[count(//span[text()='"+trustname+"']//ancestor::tr//preceding-sibling::tr)+1]//td[1]");
		String policyNumber=driver.findElement(xpath).getText();
		extentReport.test.info("policy number is: "+policyNumber);
		return policyNumber;
	}
	


}

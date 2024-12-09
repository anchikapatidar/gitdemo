package Selenium.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjects.PersonalLinesPage;
import Resources.BaseTest;
import Resources.Helper;

public class demo3 extends BaseTest{

	
	@Test(priority = 1)
	public void PersonalLines_HO3() throws InterruptedException, IOException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		personalLines.personalLinesHO3TestData(this.getClass().getSimpleName());
	}
	
	@Test(priority = 2)
	public void PersonalLines_HO3Excel() throws InterruptedException, IOException
	{
		extentReport.test=extentReport.extent.createTest(new Throwable().getStackTrace()[0].getMethodName());
		extentReport.test.info("test started");
		PersonalLinesPage personalLines=new PersonalLinesPage(driver);
		Helper help=new Helper();
		help.launchUrl(prop.getProperty("url"));
		help.login(prop.getProperty("username"),prop.getProperty("password"));
		
		Map<String,String>	parameters=new HashMap<String,String>();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//HO3 flow testdata.xls");
		Workbook workbook = WorkbookFactory.create(fis);
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
         
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row

                Cell paramCell = row.getCell(0); // Parameter column
                Cell valueCell = row.getCell(1); // Value column

                if (paramCell != null && valueCell != null) {
                	
                	if(valueCell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(valueCell)){
                		String parameter = paramCell.getStringCellValue();
                        Date value = valueCell.getDateCellValue();
                        System.out.println(parameter);
                        System.out.println(value);
                        parameters.put(parameter, String.valueOf(value));
                    	}
                	
                else if(valueCell.getCellType()==CellType.NUMERIC)
            	{
		                String parameter = paramCell.getStringCellValue();
		                int value = (int) valueCell.getNumericCellValue();
		                System.out.println(parameter);
		                System.out.println(value);
		                parameters.put(parameter, String.valueOf(value));
            	}
                	else {
                		String parameter = paramCell.getStringCellValue();
                        String value = valueCell.getStringCellValue();
                        System.out.println(parameter);
                        System.out.println(value);
                        parameters.put(parameter, value);
                	}
                	
                }
            }
           System.out.println(parameters.get("riskState"));
      
		personalLines.personalLinesHO3Excel(parameters);
	}
}

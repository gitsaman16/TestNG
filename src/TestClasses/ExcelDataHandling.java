package TestClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataHandling {

	@Test
	public void excelData() throws IOException
	{
		FileInputStream fis=new FileInputStream("/Users/RoopaPrabhagaran/Documents/Selenium_training/Excel_sample_data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//index starts with 0
		System.out.println(wb.getSheet("Test Data Sheet").getRow(1).getCell(0));
		wb.close();
	}
}

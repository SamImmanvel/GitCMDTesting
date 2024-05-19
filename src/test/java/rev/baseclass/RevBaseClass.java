package rev.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevBaseClass {
	public static WebDriver driver;
	
	public WebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
     return driver;
	}
	
	public void loadurl(WebDriver driver,String url) {
    driver.get(url);
	}
	
	public void insertText(WebElement e,String data) {
      e.sendKeys(data);
	}
	public void btncli() {
    driver.quit();
	}
	public void updatetoexcel(String filepath1, String sheetname, int row, String orde) throws Exception {
File exloc=new File(filepath1);
FileInputStream stream=new FileInputStream(exloc);
Workbook w=new XSSFWorkbook(stream);
Sheet s = w.getSheet(sheetname);
Row r = s.getRow(row);
int lc = r.getLastCellNum();
Cell c = r.createCell(lc);
c.setCellValue(orde);
FileOutputStream o=new FileOutputStream(exloc);
w.write(o);


	}
	public String getdatafromexcel(String filepath1, String sheetname, int getrow, int getcell) throws IOException {
		String value = null;
		File exloc=new File(filepath1);
		FileInputStream stream=new FileInputStream(exloc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(getrow);
		Cell c = r.getCell(getcell);
		int type = c.getCellType();
		if(type==1) {
			 value = c.getStringCellValue();
		}if (type==0) {
			boolean cf = DateUtil.isCellDateFormatted(c);
			if (cf) {
				Date dcv = c.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
				 value = sd.format(dcv);
			
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			 value = String.valueOf(l);
			
		}}
		
return value;


	}
	public void webdriverwait(WebElement locat) {
		WebDriverWait we123= new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement btn3 = we123.until(ExpectedConditions.elementToBeClickable(locat));
		btn3.click();
   
	}
	public String gattri(WebElement ref) {
      String at1 = ref.getAttribute("value");
      System.out.println(at1);
      return at1;
	}
	

}

package org.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {
    WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
    return driver;
	}
    public void loadUrl(WebDriver driver,String url) {
    driver.get(url);
	}
    public void insertText(WebElement e,String data) {
     e.sendKeys(data);
	}
    public void btnClick(WebElement element) {
     element.click();
	}
    public void updatetoexcel(String filepath1, String sheetname, int row, String data) throws Exception {
   File excloc1=new File(filepath1);
   FileInputStream stream =new FileInputStream(excloc1);
   Workbook w=new XSSFWorkbook(stream);
   Sheet s = w.getSheet(sheetname);
   Row r = s.getRow(row);
   int lastCellNum = r.getLastCellNum();
   Cell c = r.createCell(lastCellNum);
   c.setCellValue(data);
   FileOutputStream o=new FileOutputStream(excloc1);
   w.write(o);
   
   
	}
    
    public String getDatafromExcel(String filepath, String sheetname, int row, int cell) throws IOException {
   String value=null;
    File excloc=new File(filepath);
   FileInputStream stream=new FileInputStream(excloc);
   Workbook w=new XSSFWorkbook(stream);
   Sheet s = w.getSheet(sheetname);
   Row r = s.getRow(row);
   Cell c = r.getCell(cell);
   int type = c.getCellType();
   if (type==1) {
	    value = c.getStringCellValue();
	
}if (type==0) {
	boolean cdf = DateUtil.isCellDateFormatted(c);
	if (cdf) {
		Date dcv = c.getDateCellValue();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-YYYY");
		 value = sd.format(dcv);
	}
   else {
	double ncv = c.getNumericCellValue();
	long l=(long)ncv;
	 value = String.valueOf(l);
}}
    return value;
}
    public void webdriverWait(WebElement url) {
   WebDriverWait we= new WebDriverWait(driver, Duration.ofSeconds(60)); 
   WebElement btn3 = we.until(ExpectedConditions.elementToBeClickable(url));
   btn3.click();
}
public String gattribute(WebElement ele) {
	String at = ele.getAttribute("value");
	System.out.println(at);
	return at;
}
}

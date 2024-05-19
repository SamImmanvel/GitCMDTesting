package org.revisionjunit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rev.baseclass.RevBaseClass;
import rev.pompages.revdemologinpage;

public class Revtask5 {
	RevBaseClass global=new RevBaseClass();

	@Test
	public void method1() {
		WebDriver driver = global.launchbrowser();
		global.loadurl(driver, "https://demoqa.com/register");

	}
	@Test
	public void method2() throws Exception {
		revdemologinpage rd=new revdemologinpage();
		
	   String fn = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\demoreg.xlsx", "demoregi", 0, 0);
	   String ln = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\demoreg.xlsx", "demoregi", 0, 1);
	   String un = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\demoreg.xlsx", "demoregi", 0, 2);
	   String psdd = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\demoreg.xlsx", "demoregi" ,0, 3);
	  rd.regis(fn, ln, un, psdd);
	}
	
	
	
	
	
}
/*QUESTION 5
URL : https://demoqa.com/register
NOTE: Create a project in maven and register the form by using POM & 
Junit framework and get the input data from excel sheet. */
 
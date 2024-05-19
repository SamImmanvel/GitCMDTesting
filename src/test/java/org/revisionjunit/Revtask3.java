package org.revisionjunit;

import org.Baseclass.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rev.baseclass.RevBaseClass;
import rev.pompages.revDemoregisterpage;

public class Revtask3 {
	@Test
	public  void method1() {
		RevBaseClass global=new RevBaseClass();
		WebDriver driver = global.launchbrowser();
		global.loadurl(driver, "https://demoqa.com/register");
		
	}
	@Test
	public  void method2() {
		revDemoregisterpage revdem=new revDemoregisterpage();
		revdem.registration("sam", "immanvel", "hola", "123465");
		
		String at1 = revdem.getFirstname().getAttribute("value");
		String at2 = revdem.getLastnae().getAttribute("value");
		String at3 = revdem.getUserNam().getAttribute("value");
		String at4 = revdem.getPasswor().getAttribute("value");
		Assert.assertEquals("sam", at1);
		Assert.assertEquals("immanvel", at2);
		Assert.assertEquals("hola", at3);
		Assert.assertEquals("123465", at4);
		

	}
	@Test
	public void method3() {
		System.out.println("method 3");
	}
	
	
	
}
/*QUESTION 3
URL : https://demoqa.com/registration/

NOTE: Give the details and register the form and 
verify whether the input data's is correct or not by using Junit framework & POM framework.  */
package org.revisionjunit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revisionasserclass {
	
	static WebDriver driver;
	
	@Test
	public  void tc1() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       String contains = driver.getCurrentUrl();
       Assert.assertTrue(contains, true);
     //  Assert.assertEquals("verify", "https://www.facebook.com/", contains);
       
	}
	@Test
	public void tc2() {
	
		WebElement emai = driver.findElement(By.id("email"));
		emai.sendKeys("sam");
	String at = emai.getAttribute("value");
	Assert.assertEquals("verify username","sam", at);
		
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys("123456");
		String at1 = passw.getAttribute("value");
		Assert.assertEquals("verify pasw","123456", at1);
		

	}
	@Ignore
	@Test
	public void tc3() {
		WebElement btnlog = driver.findElement(By.xpath("//button[@name='login']"));
		btnlog.click();

	}

}
/*QUESTION 1
URL : https://www.facebook.com/
NOTE: Enter the username and password and verify whether the 
input data is correct or not by using junit framework.*/

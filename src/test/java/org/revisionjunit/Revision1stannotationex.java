package org.revisionjunit;

import java.sql.Driver;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision1stannotationex {
	static WebDriver driver;
     @BeforeClass
	public static void Befor() {
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    	 driver.get("https://www.facebook.com/");

	}
     @Before
     public void before() {
Date d=new Date();
System.out.println(d);

	}
     @After
     public void after() {
    	 Date d=new Date();
    	 System.out.println(d);

	}
     @Test
     public void tc1() {
	System.out.println("hello mamae");

	}
     @AfterClass
     public static void afterclass() {
    	 driver.quit();

	}
     

}

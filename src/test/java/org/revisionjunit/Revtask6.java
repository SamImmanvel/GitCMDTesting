package org.revisionjunit;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import rev.baseclass.RevBaseClass;
import rev.pompages.AdaptinBookahotelpage;
import rev.pompages.Adaptinbooknowpage;
import rev.pompages.Adaptinselecthotelpage;
import rev.pompages.revadaptinloginpage;
import rev.pompages.revadatinsearchhotel;

public class Revtask6 {
	
	RevBaseClass global=new RevBaseClass();
	
	@Test
	public void method1() {
		WebDriver driver = global.launchbrowser();
		global.loadurl(driver, "http://www.adactin.com/HotelApp/");

	}
	@Test
	public void method2() throws Exception {
		revadaptinloginpage lp=new revadaptinloginpage();
		String usern = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 0);
		String passw = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 1);
		lp.login(usern, passw);
		
	}
	@Test
	public void method3() throws Exception {
		revadatinsearchhotel searchhotel=new revadatinsearchhotel();
		String loc = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 2);
		String hot = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 3);
		String romtype = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 4);
		String noofrom = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 5);
		String checkin = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 6);
		String checkout = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 7);
		String adultsperroom = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 8);
	searchhotel.searchhotel(hot, loc, romtype, checkin, checkout, adultsperroom, noofrom);
	}
	@Test
	public void method4() {
		Adaptinselecthotelpage ash=new Adaptinselecthotelpage();
	ash.selecthote();
	}
	@Test
public void method5() throws Exception {
	AdaptinBookahotelpage abh=new AdaptinBookahotelpage();
	
	String firstname = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 14);
	String lastname = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 15);
	String addr = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 16);
	String creditcartno = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 17);
	String carttype = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 18);
	String exmon = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 19);
	String exyea = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 20);
	String cvs = global.getdatafromexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, 22);
	abh.bookhote(firstname, lastname, addr, creditcartno, carttype, exmon, exyea, cvs);
	
	
	
	
	
}@Test
	public void method6() throws Exception {
		Adaptinbooknowpage bn1=new Adaptinbooknowpage();
		String order = bn1.orderget();
		 global.updatetoexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task6adaptin.xlsx", "Hotel booking", 1, orde);
some error need to check
	}
	
	
	
	
	
}
/*QUESTION 6
URL : http://www.adactin.com/HotelApp/
NOTE: Book a room by using POM & 
Junit framework and print the order no generated.*/
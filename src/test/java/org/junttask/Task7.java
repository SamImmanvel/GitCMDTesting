package org.junttask;

import java.io.IOException;

import org.Baseclass.BaseClass;
import org.junit.Test;
import org.junitpages.Bookahotelpage;
import org.junitpages.Bookinconfirpage;
import org.junitpages.LoginPages;
import org.junitpages.SearchHotelPage;
import org.junitpages.Selecthotel;
import org.openqa.selenium.WebDriver;


public class Task7 {
	 BaseClass global =new BaseClass();
	 @Test
	public void method() {
		WebDriver driver = global.launchBrowser();
		global.loadUrl(driver, "http://www.adactin.com/HotelApp/");
	}
	 @Test
	 public void method1() throws IOException {
		 LoginPages lp=new LoginPages();
String uname = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 0);
String paswd = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 1);
 
	lp.login(uname, paswd); 
	 }
	 @Test
	 public void method2() throws IOException {
		 SearchHotelPage shp=new SearchHotelPage();
		 String loc = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 2);
		 String hott = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 3);
		 String roomty = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 4);
		 String roomno = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 5);
		 String checkin = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 6);
		 String checkout = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 7);
		 String adultperrom = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 8);
		 String childperrom = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 9);
		 
		 shp.searchHotel(loc, hott, roomty, roomno, checkin, checkout, adultperrom, childperrom);
	}
	 @Test
	public void method3() {
		 Selecthotel sh1=new Selecthotel();
        sh1.selectHotel();
	}
	 @Test
	 public void method4() throws IOException {
		 Bookahotelpage boohotepag=new Bookahotelpage();
		 String fn = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 14);
		 String ln = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 15);
		 String addr = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 16);
		 String cno = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 17);
		 String ctype = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 18);
		 String month = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 19);
		 String year = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 20);
		 String cvv = global.getDatafromExcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, 21);
		 boohotepag.bookhotelPage(fn, ln, addr, cno, ctype, month, year, cvv);
	}
	 @Test
	 public void method5() throws Exception {
		 Bookinconfirpage bcp=new Bookinconfirpage();
		 Thread.sleep(5000);
		String orderget = bcp.orderget();
	global.updatetoexcel("D:\\Samtest- Java\\SJunittask\\Excel\\Task9.xlsx", "Hotel booking", 1, orderget);
		
		
		
	}
	 @Test
	 public void method6() {
System.out.println("done..");
	}
}
/*QUESTION 7
----------
URL : http://www.adactin.com/HotelApp/
NOTE: Book a room by using POM ,Junit framework and 
get the input data from excel sheet 
and update the generated order no  in excel. */
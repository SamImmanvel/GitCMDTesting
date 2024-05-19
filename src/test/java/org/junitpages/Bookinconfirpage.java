package org.junitpages;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookinconfirpage extends BaseClass{
	public Bookinconfirpage() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(id="order_no")
	private WebElement Orderno;

	public WebElement getOrderno() {
		return Orderno;
	}
	public String orderget( ) {
	 String at2 = gattribute(Orderno);
	 return at2;
	
	}
	
}


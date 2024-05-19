package org.junitpages;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotelpage extends BaseClass {
	
	public Bookahotelpage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement cardNo;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	
	@FindBy(id="book_now")
	private WebElement BookNow;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	public void bookhotelPage(String firstName,String lastName,String address,
			String cardno,String cardType,String emonth,String eyear,String cvv
			) {
		insertText(getFirstName(), firstName);
		insertText(getLastName(), lastName);
		insertText(getAddress(), address);
		insertText(getCardNo(), cardno);
		insertText(getCardType(), cardType);
		insertText(getExpMonth(),emonth);
		insertText(getExpYear(),eyear);
		insertText(getCvv(), cvv);
		btnClick(getBookNow());
	}

}

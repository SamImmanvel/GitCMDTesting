package org.junitpages;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends BaseClass{
	public LoginPages() {
PageFactory.initElements(driver, this);
}
	
	
	@FindBy(id="username")
	private WebElement usename;
	
	@FindBy(id="password")
	private WebElement psw;
	
	@FindBy(id="login")
	private WebElement logbtn;

	
	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPsw() {
		return psw;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
	public void login(String un, String psd) {
		insertText(getUsename(), un);
		insertText(getPsw(), psd);
		btnClick(getLogbtn());

	}

}

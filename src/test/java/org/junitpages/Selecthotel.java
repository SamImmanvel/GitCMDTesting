package org.junitpages;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends BaseClass{
	
	public Selecthotel() {
PageFactory.initElements(driver, this);	
}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement contin;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContin() {
		return contin;
	}
	
	public void selectHotel() {
		btnClick(getRadiobtn());
    webdriverWait(getContin());
	}
}

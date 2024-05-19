package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class Adaptinselecthotelpage extends RevBaseClass{
	
	public Adaptinselecthotelpage() {
PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement cont;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void selecthote() {
	 getRadiobtn().click();
	 webdriverwait(getCont());

	}

}

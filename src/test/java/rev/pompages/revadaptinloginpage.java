package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class revadaptinloginpage extends RevBaseClass{
	public revadaptinloginpage() {
PageFactory.initElements(driver, this);	
}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement logbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

	public void login(String un, String psw) {
		insertText(getUsername(), un);
		insertText(getPass(), psw);
		getLogbtn().click();
   
	}
}

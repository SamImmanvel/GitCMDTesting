package rev.pompages;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class revDemoregisterpage extends RevBaseClass{
	
	public revDemoregisterpage() {
PageFactory.initElements(driver, this);
}
	
	@FindBy(id="firstname")
	private WebElement firstname;
	
	@FindBy(id="lastname")
	private WebElement lastnae;
	
	@FindBy(id="userName")
	private WebElement userNam;
	
	@FindBy(id="password")
	private WebElement passwor;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastnae() {
		return lastnae;
	}

	public WebElement getUserNam() {
		return userNam;
	}

	public WebElement getPasswor() {
		return passwor;
	}
	public void registration(String firstname,String lastname,
			String userName,String password) {
		insertText(getFirstname(), firstname);
		insertText(getLastnae(), lastname);
		insertText(getUserNam(), userName);
		insertText(getPasswor(), password);

		

	}
	

}

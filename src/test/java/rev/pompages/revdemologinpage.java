package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class revdemologinpage extends RevBaseClass{
	public revdemologinpage() {
PageFactory.initElements(driver, this);	}
	
	
	@FindBy(id="firstname")
	private WebElement firstname;
	
	@FindBy(id="lastname")
	private WebElement lastname;
	
	@FindBy(id="userName")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	public void regis(String fnn1, String lnn1, String unn1, String pswd1) {
insertText(getFirstname(), fnn1);
insertText(getLastname(), lnn1);
insertText(getUserName(), unn1);
insertText(getPassword(), pswd1);
	}

}
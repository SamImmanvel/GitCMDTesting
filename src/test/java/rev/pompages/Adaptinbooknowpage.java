package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class Adaptinbooknowpage extends RevBaseClass{
	public Adaptinbooknowpage() {
PageFactory.initElements(driver, this);	}
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement ordern;

	public WebElement getOrdern() {
		return ordern;
		
	}
	
	public String orderget() {
     String at1 = gattri(ordern);
     System.out.println(at1);
     return at1;

	}

}

package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class AdaptinBookahotelpage extends RevBaseClass{
	public AdaptinBookahotelpage() {
PageFactory.initElements(driver, this);	}
	
	
	@FindBy(id="first_name")
	private WebElement firnam;
	
	@FindBy(id="last_name")
	private WebElement last_nam;
	
	@FindBy(id="address")
	private WebElement addre;
	
	@FindBy(id="cc_num")
	private WebElement cc_nu;
	
	@FindBy(id="cc_type")
	private WebElement cc_ty;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccv;
	
	@FindBy(id="book_now")
	private WebElement bn;
	
	@FindBy(id="order_no")
	private WebElement ordern;

	public WebElement getBn() {
		return bn;
	}

	public WebElement getFirnam() {
		return firnam;
	}

	public WebElement getLast_nam() {
		return last_nam;
	}

	public WebElement getAddre() {
		return addre;
	}

	public WebElement getCc_nu() {
		return cc_nu;
	}

	public WebElement getCc_ty() {
		return cc_ty;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCccv() {
		return cccv;
	}
	
	public void bookhote(String fn, String ln, String add, String ccnu, String ccty, String em, String ey, String cv1) {
		insertText(getFirnam(), fn);
		insertText(getLast_nam(), ln);
		insertText(getAddre(), add);
		insertText(getCc_nu(), ccnu);
		insertText(getCc_ty(), ccty);
		insertText(getExpmon(), em);
		insertText(getExpyear(), ey);
		insertText(getCccv(), cv1);
		webdriverwait(getBn());
		
		

	}

	

}

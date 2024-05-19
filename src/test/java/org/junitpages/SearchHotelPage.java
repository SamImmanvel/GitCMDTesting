package org.junitpages;
import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;

	
public WebElement getLoc() {
		return loc;
	}
	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getChecin() {
		return checin;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAdultroom() {
		return adultroom;
	}


	public WebElement getChildroom() {
		return childroom;
	}


	public WebElement getSubmit() {
		return submit;
	}


public void searchHotel(String loc,String hot, String rt, String rn, String checki, String checkou, String adult, String childoom) {

	insertText(getLoc(), loc);
	insertText(getHot(), hot);
	insertText(getRoomtype(), rt);
	insertText(getRoomno(), rn);
	insertText(getChecin(), checki);
	insertText(getCheckout(), checkou);
	insertText(getAdultroom(), adult);
	insertText(getChildroom(), childoom);
	btnClick(getSubmit());

}	

}

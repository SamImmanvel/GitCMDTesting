package rev.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rev.baseclass.RevBaseClass;

public class revadatinsearchhotel extends RevBaseClass{
	public revadatinsearchhotel() {
PageFactory.initElements(driver, this);	
}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
@FindBy(id="Submit")
private WebElement submtbtn;

	
	
	public WebElement getSubmtbtn() {
	return submtbtn;
}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}



	public WebElement getRoomtype() {
		return roomtype;
	}



	public WebElement getRoomno() {
		return roomno;
	}



	public WebElement getCheckin() {
		return checkin;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getAdultroom() {
		return adultroom;
	}



	public void searchhotel(String htl, String loc, String romty,
			 String checin, String checout, String adroom, String romno) {
		insertText(getLocation(), loc);
		insertText(getHotel(), htl);
		insertText(getRoomtype(), romty);
		insertText(getRoomno(), romno);
		insertText(getCheckin(), checin);
		insertText(getCheckout(), checout);
		insertText(getAdultroom(), adroom);
		webdriverwait(getSubmtbtn());
    
	}
	
	

}

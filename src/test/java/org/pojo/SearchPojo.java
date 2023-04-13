package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {

	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//td[@class='login_title']")
	private WebElement hotelCheck;
	
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement numberOfRoom;

	@FindBy(name = "datepick_in")
	private WebElement checkIn;

	@FindBy(name = "datepick_out")
	private WebElement checkOut;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement children;

	@FindBy(id = "Submit")
	private WebElement search;

	
	
	public WebElement getHotelCheck() {
		return hotelCheck;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

}

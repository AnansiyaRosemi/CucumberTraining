package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPojo extends BaseClass {

	public BookPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//td[@class='login_title'])[2]")
	private WebElement bookCheck;
	
	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement creditnum;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bookbtn;
	
	

	public WebElement getBookCheck() {
		return bookCheck;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditnum() {
		return creditnum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMth() {
		return expiryMth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

}

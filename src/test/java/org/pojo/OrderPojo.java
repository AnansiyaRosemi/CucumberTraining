package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPojo extends BaseClass {

	public OrderPojo() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//td[text()='Booking Confirmation ']")
	private WebElement confirm;
	
	@FindBy(name ="order_no")
	private WebElement ordernum;

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getOrdernum() {
		return ordernum;
	}

	
}

package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPojo extends BaseClass {

	public SelectPojo() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//td[@class='login_title']")
	private WebElement selectCheck;
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectbtn;

	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	public WebElement getSelectCheck() {
		return selectCheck;
	}


	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
}

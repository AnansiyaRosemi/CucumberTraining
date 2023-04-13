package com.stepdefinition;



import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition1 extends BaseClass  {

@Given("User launch Facebook website URL")
public void user_launch_Facebook_website_URL() {

}

@Then("user verify login page is displayed")
public void user_verify_login_page_is_displayed() {
   
	Assert.assertTrue("verify URL", driver.getCurrentUrl().contains("facebook"));
	
}

@When("user enters  invalid username and  password")
public void user_enters_invalid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
   
	WebElement username = driver.findElement(By.id("email"));
	Map<String,String> asMap = dataTable.asMap(String.class, String.class);
	username.sendKeys(asMap.get("userName"));
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(asMap.get("passWord"));
	
}

@When("user clicks login button")
public void user_clicks_login_button() {
	driver.findElement(By.name("login")).click();
}

@Then("user verify error message is displayed")
public void user_verify_error_message_is_displayed() {
	WebElement errormsg = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String text = errormsg.getText();
	System.out.println(text);
}



}

package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.BookPojo;
import org.pojo.LoginPojo;
import org.pojo.OrderPojo;
import org.pojo.SearchPojo;
import org.pojo.SelectPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("User launch Adactin Website URL")
	public void user_launch_Adactin_Website_URL() {

//		launchBrowser();
//		maximize();
//
//		launchUrl("https://adactinhotelapp.com/");

	}

	@Then("User verify Adactin login page is displayed")
	public void user_verify_Adactin_login_page_is_displayed() {

		String currentUrl = currentUrl();
		System.out.println(currentUrl);
		boolean url = currentUrl.contains("adactinhotelapp.com");
		System.out.println(url);
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {

		LoginPojo lp = new LoginPojo();
		type(lp.getUsername(), "Anansiya");
		type(lp.getPassword(), "Rosemi@98");

	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {

		LoginPojo lp = new LoginPojo();
		btnClick(lp.getLoginbtn());

	}

	@Then("User verify SearchHotel Page is displayed")
	public String user_verify_SearchHotel_Page_is_displayed() {

		SearchPojo sp = new SearchPojo();
		String text = text(sp.getHotelCheck());
		System.out.println(text);
		boolean contains = text.contains("Hotel");
		System.out.println(contains);
		return text;

	}

	@When("User selects any location from Location dropdown")
	public void user_selects_any_location_from_Location_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getLocation(), "Sydney");

	}

	@When("User selects any Hotel from Hotel dropdown")
	public void user_selects_any_Hotel_from_Hotel_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getHotel(), "Hotel Sunshine");
	}

	@When("User selects any RoomType from Room Type dropdown")
	public void user_selects_any_RoomType_from_Room_Type_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getRoomType(), "Standard");

	}

	@When("User selects Number of rooms from Number of rooms dropdown")
	public void user_selects_Number_of_rooms_from_Number_of_rooms_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getNumberOfRoom(), "2");
	}

	@When("User enters valid Check In Date")
	public void user_enters_valid_Check_In_Date() {

		SearchPojo sp = new SearchPojo();
		type(sp.getCheckIn(), "15/03/2023");
	}

	@When("User enters valid Check Out Date")
	public void user_enters_valid_Check_Out_Date() {

		SearchPojo sp = new SearchPojo();
		type(sp.getCheckOut(), "16/03/2023");
	}

	@When("User selects  Adults per Room from Adults per Room dropdown")
	public void user_selects_Adults_per_Room_from_Adults_per_Room_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getAdult(), "1");
	}

	@When("User selects Children per Room from Children per Room dropdown")
	public void user_selects_Children_per_Room_from_Children_per_Room_dropdown() {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getChildren(), "0");
	}

	@When("User clicks Search button")
	public void user_clicks_Search_button() {

		SearchPojo sp = new SearchPojo();
		btnClick(sp.getSearch());
	}

	@Then("User verify Select Hotel Page is displayed")
	public void user_verify_Select_Hotel_Page_is_displayed() {
		SelectPojo sp = new SelectPojo();
		String text = text(sp.getSelectCheck());
		System.out.println(text);
		boolean contains = text.contains("Hotel");
		System.out.println(contains);
	}

	@When("User clicks the Select radiobutton")
	public void user_clicks_the_Select_radiobutton() {

		SelectPojo sp = new SelectPojo();
		btnClick(sp.getSelectbtn());
	}

	@When("User clicks Continue button")
	public void user_clicks_Continue_button() {
		SelectPojo sp = new SelectPojo();
		btnClick(sp.getContinuebtn());
	}

	@Then("User verify Book a Hotel Page is displayed")
	public void user_verify_Book_a_Hotel_Page_is_displayed() {
		BookPojo bp = new BookPojo();
		String text = text(bp.getBookCheck());
		System.out.println(text);
		boolean contains = text.contains("Book");
		System.out.println(contains);
	}

	@When("User enters valid First Name")
	public void user_enters_valid_First_Name() {
		BookPojo bp = new BookPojo();
		type(bp.getFirstName(), "Anansiya");
	}

	@When("User enters valid Last Name")
	public void user_enters_valid_Last_Name() {
		BookPojo bp = new BookPojo();
       type(bp.getLastName(), "Rosemi");
	}

	@When("User enters valid Billing address")
	public void user_enters_valid_Billing_address() {
		BookPojo bp = new BookPojo();
		type(bp.getAddress(), "Tuticorin");
	}

	@When("User enters valid Credit card number")
	public void user_enters_valid_Credit_card_number() {
		BookPojo bp = new BookPojo();
		type(bp.getCreditnum(), "1234567812345678");
	}

	@When("User selects valid Credit card type from Credit card type dropdown")
	public void user_selects_valid_Credit_card_type_from_Credit_card_type_dropdown() {

		BookPojo bp = new BookPojo();
		selectValue(bp.getCardType(),"VISA");
	}

	@When("User selects valid Expiry month from Select Month dropdown")
	public void user_selects_valid_Expiry_month_from_Select_Month_dropdown() {
		BookPojo bp = new BookPojo();
		selectByText(bp.getExpiryMth(),"May");
	}

	@When("User selects valid Expiry year  from Select Year dropdown")
	public void user_selects_valid_Expiry_year_from_Select_Year_dropdown() {
		BookPojo bp = new BookPojo();
		selectValue(bp.getExpiryYear(),"2022");
	}

	@When("User enters valid CVV number")
	public void user_enters_valid_CVV_number() {
		BookPojo bp = new BookPojo();
		type(bp.getCvv(), "1234");
	}

	@When("User clicks Book Now button")
	public void user_clicks_Book_Now_button() throws InterruptedException {
		BookPojo bp = new BookPojo();
		btnClick(bp.getBookbtn());

	}
	

	@Then("User verify Booking Confirmation is displayed")
	public void user_verify_Booking_Confirmation_is_displayed() throws InterruptedException {

		Thread.sleep(3000);
		
		OrderPojo op = new OrderPojo();
		String text = text(op.getConfirm());
		System.out.println(text);
		boolean b = text.contains("Confirmation");
		System.out.println(b);
		
	}


	@When("User selects any {string} from Location dropdown")
	public void user_selects_any_from_Location_dropdown(String string) {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getLocation(), string);
	}

	@When("User selects any {string} from Hotel dropdown")
	public void user_selects_any_from_Hotel_dropdown(String string) {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getHotel(), string);
	}

	@When("User selects any {string} from Room Type dropdown")
	public void user_selects_any_from_Room_Type_dropdown(String string) {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getRoomType(), string);
	}

	@When("User selects {string}  from Number of rooms dropdown")
	public void user_selects_from_Number_of_rooms_dropdown(String string) {

		SearchPojo sp = new SearchPojo();
		selectValue(sp.getNumberOfRoom(), string);
	}

	@When("User enters valid {string}")
	public void user_enters_valid(String string) {
		
		SearchPojo sp = new SearchPojo();
		type(sp.getCheckIn(),string);
		type(sp.getCheckOut(),string);

	}

	@When("User selects  {string} from Adults per Room dropdown")
	public void user_selects_from_Adults_per_Room_dropdown(String string) {
		SearchPojo sp = new SearchPojo();
		selectValue(sp.getAdult(),string);
	}

	@When("User selects {string} from Children per Room dropdown")
	public void user_selects_from_Children_per_Room_dropdown(String string) {
		SearchPojo sp = new SearchPojo();
		selectValue(sp.getChildren(), string);
	}
	
	@When("User enters valid first name {string}")
	public void user_enters_valid_first_name(String string) {
	  
		BookPojo bp = new BookPojo();
		type(bp.getFirstName(), string);
	}

	@When("User enters valid last name{string}")
	public void user_enters_valid_last_name(String string) {

		BookPojo bp = new BookPojo();
		type(bp.getLastName(),string);
	}

	@When("User enters valid address{string}")
	public void user_enters_valid_address(String string) {
		BookPojo bp = new BookPojo();
		type(bp.getAddress(),string);
		
	}

	@When("User enters valid card number {string}")
	public void user_enters_valid_card_number(String string) {
		BookPojo bp = new BookPojo();
		type(bp.getCreditnum(),string);
	}



	@When("User selects valid {string} from Credit card type dropdown")
	public void user_selects_valid_from_Credit_card_type_dropdown(String string) {
		BookPojo bp = new BookPojo();
		selectByText(bp.getCardType(),string);
		
		
	}

	@When("User selects valid {string} from Select Month dropdown")
	public void user_selects_valid_from_Select_Month_dropdown(String string) {
		BookPojo bp = new BookPojo();
		selectValue(bp.getExpiryMth(), string);
	}

	@When("User selects valid {string}  from Select Year dropdown")
	public void user_selects_valid_from_Select_Year_dropdown(String string) {
		BookPojo bp = new BookPojo();
		selectValue(bp.getExpiryYear(), string);
	}

	@When("User enters valid cvv {string}")
	public void user_enters_valid_cvv(String string) {
		BookPojo bp = new BookPojo();
		type(bp.getCvv(),string);
	}

	
}

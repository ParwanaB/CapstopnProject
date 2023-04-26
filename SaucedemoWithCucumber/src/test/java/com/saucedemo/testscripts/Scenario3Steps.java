package com.saucedemo.testscripts;

import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario3Steps extends Driver{
	
	

@Given("user is available on the landing page of saucedemo.com")
public void user_is_available_on_the_landing_page_of_saucedemo_com() {
	Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
}

@When("Enter user name problem_user")
public void enter_user_name_problem_user() {
        landingPage.enterUserName("problem_user");
}

@When("user enter the password secret_sauce")
public void user_enter_the_password_secret_sauce() {
	
   landingPage.enterPassword("secret_sauce");
}
   @When("Click on login button")
   public void click_on_login_button() {
            landingPage.clickLogInBtn();
}

@When("first product added to the cart")
public void first_product_added_to_the_cart() {
	    addToCart.clickFirstItem();
}

@When("he clicked on the cart icon at top right corner")
public void he_clicked_on_the_cart_icon_at_top_right_corner() {
	    addToCart.clickCartIcon();
}

@When("Click on checkout button")
public void click_on_checkout_button() {
   
   checkout.clickCheckoutBtn();
}

@When("Enter the first name")
public void enter_the_first_name() {
	    names.enterFirstName("Parwana");
}

@When("Enter your last name")
public void enter_your_last_name() {
	
   names.enterLastName("Parwana");
}

@When("Enter postal code")
public void enter_postal_code() {
	
   names.enterpostalCode("110018");
}

@When("he clicked on continue button")
public void he_clicked_on_continue_button() {
	
    names.clickContinueBtn();
}

@When("an error message is displayed Error: Last Name is required")
public void an_error_message_is_displayed_error_last_name_is_required() {
	
	String expectedErrMsg = "Error: Last Name is required";
	String actualErrMsg = driver.getTitle();
	landingPage.getErrMsg();
}

@Then("close the browser window")
public void close_the_browser_window() {
    
}



}

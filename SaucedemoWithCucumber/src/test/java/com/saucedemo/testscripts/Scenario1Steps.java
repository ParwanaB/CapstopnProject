package com.saucedemo.testscripts;



import org.testng.Assert;

import com.saucedemo.pages.VerifySuccessMsg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1Steps extends Driver {
	
	@Given("user will go to landing page of saucedemeo.com")
	public void user_will_go_to_landing_page_of_saucedemeo_com() {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
		
	}

	@When("standard_user is entered")
	public void standard_user_is_entered() {
	    landingPage.enterUserName("standard_user");
	}

	@When("enters secret_sauce password")
	public void enters_secret_sauce_password() {
			   landingPage.enterPassword("secret_sauce");
	}
	   @When("login button clicked by him")
	   public void login_button_clicked_by_him() {
	      
	      landingPage.clickLogInBtn();
	}

	@When("first two products added to the cart")
	public void first_two_products_added_to_the_cart() {
		
	    addToCart.clickFirstItem();
	   
	    addToCart.clickAddToCart2();
	}

	@When("Click on the cart icon at top right corner")
	public void click_on_the_cart_icon_at_top_right_corner() {
			   addToCart.clickCartIcon();
	}

	@When("Checkout button clicked")
	public void checkout_button_clicked() {
	  
	   checkout.clickCheckoutBtn();
	}

	@When("Enter your first name in first name textbox")
	public void enter_your_first_name_in_first_name_textbox() {
			    names.enterFirstName("Parwana");
	}

	@When("Enter the last name in the last name textbox")
	public void enter_the_last_name_in_the_last_name_textbox() {
			    names.enterLastName("Bamiani");
	}

	@When("Postal Code entered in postal code textbox")
	public void postal_code_entered_in_postal_code_textbox() {
		
	    names.enterpostalCode("110018");
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
	
	    names.clickContinueBtn();
	}

	@When("Click on finish button")
	public void click_on_finish_button() {
	 
	    finish.clickFinishBtn();
	}

	@When("Verify the success message Your cart has been dispatched, and will arrive just as fast as the pony can get there!")
	public void verify_the_success_message_your_cart_has_been_dispatched_and_will_arrive_just_as_fast_as_the_pony_can_get_there() {
		VerifySuccessMsg verifySuccessMsg = new VerifySuccessMsg(driver);
		String expectedSuccessMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualSuccessMsg = verifySuccessMsg.getSuccessMsg();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
	}


}

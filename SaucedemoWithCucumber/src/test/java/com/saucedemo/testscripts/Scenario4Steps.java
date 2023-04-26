package com.saucedemo.testscripts;


import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario4Steps extends Driver {
	
	@Given("user enters into landing page")
	public void user_enters_into_landing_page() {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
	}

	@When("User name entered")
	public void user_name_entered() {
	   
	    landingPage.enterUserName("standard_user");
	}

	@When("password was entered")
	public void password_was_entered() {
	   
	   landingPage.enterPassword("secret_sauce");
	}
	@When("Click login button")
	public void click_login_button() {
	    
	    landingPage.clickLogInBtn();
	}

	@When("sort the item low to high")
	public void sort_the_item_low_to_high() {
	    
	    addToCart.clickHighToLow("price(low To High");
	}

	@When("Add the first item to cart")
	public void add_the_first_item_to_cart() {
		
		addToCart.clickAddToCart2();
		
	    	}

	@When("cart icon was clicked")
	public void cart_icon_was_clicked() {
	   
	    addToCart.clickCartIcon();
	}

	@When("click checkout button on next page")
	public void click_checkout_button_on_next_page() {
	   	    checkout.clickCheckoutBtn();
	}
	

	@When("Enter your first name")
	public void enter_your_first_name() {
	    	    names.enterFirstName("Parwana");
	}

	@When("Enter the last name")
	public void enter_the_last_name() {
		
		names.enterLastName("Bamiani");
	    	}

	@When("Enter the postal code")
	public void enter_the_postal_code() {
				names.enterpostalCode("110018");
	    	}

	@When("Click on Continue")
	public void click_on_continue() {
				names.clickContinueBtn();
	   	}

@When("Click on finish button next page")
public void click_on_finish_button_next_page() {
        finish.clickFinishBtn();
}


	@When("verify the success message")
	public void verify_the_success_message() {
		
		String expectedSuccessMsg = "Thank you for your order!";
		String actualSuccessMsg = verifySuccessMsg.getSuccessMsg();
		
	    
	}

	@Then("close the window")
	public void close_the_window() {
	   
	}


}

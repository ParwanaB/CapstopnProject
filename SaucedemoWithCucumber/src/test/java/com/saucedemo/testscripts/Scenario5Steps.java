package com.saucedemo.testscripts;



import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario5Steps extends Driver {
	
	@Given("user visiting the landing page of saucedemo.com")
	public void user_visiting_the_landing_page_of_saucedemo_com() {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
		
}

	

	@When("Enter the user name standard_user")
	public void enter_the_user_name_standard_user() {
	    
	    landingPage.enterUserName("standard_user");
	}

	@When("Enter the password secret_sauce")
	public void enter_the_password_secret_sauce() {
	   
	    landingPage.enterPassword("secret_sauce");
	}

	@When("login button was clicked by him")
	public void login_button_was_clicked_by_him() {
	    	    landingPage.clickLogInBtn();
	}


	@When("Add the first and third products to the cart")
	public void add_the_first_and_third_products_to_the_cart() {
	   
	    addToCart.clickAddToCart();
	    		
	    addToCart.ClickAddToCart3();
	}

	@When("remove the first product from the cart")
	public void remove_the_first_product_from_the_cart() {
	   
	    addToCart.clickRemove();
	}

	@When("Click on cart icon at top right corner")
	public void click_on_cart_icon_at_top_right_corner() {
	   
	    addToCart.clickCartIcon();
	}

	@When("verify the text Your cart is displayed at the top left corner of the page")
	public void verify_the_text_your_cart_is_displayed_at_the_top_left_corner_of_the_page() {
		
		String expectedText = "Your Cart";
		String actualText = checkout.verifyText();
		Assert.assertEquals(actualText, expectedText);
		
	}

	

	@When("Click on continue shopping")
	public void click_on_continue_shopping() {
	    
	    checkout.clickContinueShopping();
	    
	}

	@When("item was sorted from high to low")
	public void item_was_sorted_from_high_to_low() {
	    
	    addToCart.clickHighToLow("price(High To Low");
	}

	@When("Add the most expensive item to cart")
	public void add_the_most_expensive_item_to_cart() {
		
		addToCart.clickExpensiveItem();
	    	}

	@When("Click on cart icon")
	public void click_on_cart_icon() {
	    
	    addToCart.clickCartIcon();
	}

	@When("verify two items in the cart")
	public void verify_two_items_in_the_cart() {
	    	    checkout.checkQuantity();
	}
	@When("checkout button is being process")
	public void checkout_button_is_being_process() {
	    
	    checkout.clickCheckoutBtn();
	}

	@When("first name was entered")
	public void first_name_was_entered() {
	  
	   names.enterFirstName("Parwana");
	}

	@When("last name is being entered")
	public void last_name_is_being_entered() {
	    	    names.enterLastName("Bamiani");
	}
	@When("postal code was entered by him")
	public void postal_code_was_entered_by_him() {
	    
	    names.enterpostalCode("110018");
	}


	    @When("continue button was clicked")
	    public void continue_button_was_clicked() {
	    	
	    	names.clickContinueBtn();

	    	
	    }
	    @When("finish button was checked")
	    public void finish_button_was_checked() {
	        
	        finish.clickFinishBtn();
	    }
	
	    @When("verify the success message Thank you for your order")
	    public void verify_the_success_message_thank_you_for_your_order() {
	    	
			 String expectedText = "Thank you for your order!";
			String actualText= verifySuccessMsg.getSucMsg();
	    }
	
	@Then("browser will be close")
	public void browser_will_be_close() {
	    
	}

}

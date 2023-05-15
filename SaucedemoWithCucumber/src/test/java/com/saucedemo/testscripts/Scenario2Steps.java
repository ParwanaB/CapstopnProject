package com.saucedemo.testscripts;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2Steps extends Driver {
	
	
	@Given("user is on the landing page of saucedeme.com")
	public void user_is_on_the_landing_page_of_saucedeme_com() {
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
	    
		
	    
	}

	@When("he enters the user name locked_out_user")
	public void he_enters_the_user_name_locked_out_user() {
	    
	   landingPage.enterUserName("locked_out_user");
	}

	@When("he enters the password secret_sauce")
	public void he_enters_the_password_secret_sauce() {
		landingPage.enterPassword("secret_sauce");
	    
	}

	@When("he clicks on login button")
	public void he_clicks_on_login_button() {
	    landingPage.clickLogInBtn();
	}

	@Then("he verifys the error message Epic sadface: Sorry this user has been locked out.")
	public void he_verifys_the_error_message_epic_sadface_sorry_this_user_has_been_locked_out() {
		String expectedErrMsg= "Epic sadface: Sorry, this user has been locked out.";
		   String actualErrMsg = landingPage.getErrMsg();
		   Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}

	


}

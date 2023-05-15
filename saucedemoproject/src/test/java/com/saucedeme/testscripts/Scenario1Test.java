package com.saucedeme.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Finish;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Names;
import com.saucedemo.pages.VerifySuccessMsg;

public class Scenario1Test extends BaseTest {
	
		
	
	@Test
	public void buyProducts() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLogInBtn();
		
		AddToCart addToCart = new AddToCart(driver);
		addToCart.clickAddToCart();
		addToCart.clickAddToCart2();
		addToCart.clickCartIcon();
		Checkout checkout = new Checkout(driver);
	checkout.clickCheckoutBtn();
		
		Names names = new Names(driver);
		names.enterFirstName("Parwana");
		names.enterLastName("Bamiani");
		names.enterpostalCode("110018");
		names.clickContinueBtn();
		
		Finish finish = new Finish(driver);
		finish.clickFinishBtn();
		
		//Verify the success message
		VerifySuccessMsg verifySuccessMsg = new VerifySuccessMsg(driver);
		
	String expectedSuccessMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	String actualSuccessMsg = verifySuccessMsg.getSuccessMsg();
	Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
	
		
	}
	

          
	      
	
}
	
	



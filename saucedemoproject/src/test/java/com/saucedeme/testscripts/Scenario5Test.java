package com.saucedeme.testscripts;


import org.testng.Assert;

import org.testng.annotations.Test;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Names;
import com.saucedemo.pages.VerifySuccessMsg;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Finish;


public class Scenario5Test extends BaseTest {
	
	@Test
	public void SuccessMsg() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLogInBtn();
		
		AddToCart addToCart = new AddToCart(driver);
		addToCart.clickAddToCart();
		addToCart.ClickAddToCart3();
		addToCart.clickRemove();
		addToCart.clickCartIcon();
		
		Checkout checkout = new Checkout(driver);
		String expectedText = "Your Cart";
		String actualText = checkout.verifyText();
		Assert.assertEquals(actualText, expectedText);
		
		checkout.clickContinueShopping();
		
	  addToCart.clickHighToLow("price(High To Low");
	  
		addToCart.clickExpensiveItem();
		addToCart.clickCartIcon();
		
		checkout.checkQuantity();
		
		checkout.clickCheckoutBtn();
		
		
		
		Names names = new Names(driver);
		names.enterFirstName("Parwana");
		names.enterLastName("Bamiani");
		names.enterpostalCode("110018");
		names.clickContinueBtn();
		
		Finish finish = new Finish(driver);
		finish.clickFinishBtn();
		
		VerifySuccessMsg verifySuccessMsg = new VerifySuccessMsg(driver);
		 expectedText = "Thank you for your order!";
		 actualText= verifySuccessMsg.getSucMsg();
		 Assert.assertEquals(actualText, expectedText);
		
	}
}	
		
		
		
				
		
	



package com.saucedeme.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Names;
import com.saucedemo.pages.VerifySuccessMsg;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Finish;

public class Scenario4Test extends BaseTest {
	
	@Test
	public void SortPrice() {
		LandingPage landingPage = new LandingPage(driver);
		// 4 ) Enter user name
		landingPage.enterUserName("standard_user");
		// 5 ) Enter Password
		landingPage.enterPassword("secret_sauce");
		// 6 ) click on login button
		landingPage.clickLogInBtn();
		
        //7 ) sort the items based on price from low to high
		
		
		AddToCart addToCart = new AddToCart(driver);

		//addToCart.dropDown();
		addToCart.clickLowToHigh("price (low To High");
		
		
		//8 ) Add 1st Item to the cart
		addToCart.clickAddToCart2();
		addToCart.clickCartIcon();
		//addToCart.verifyItem();
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckoutBtn();
		Names names = new Names(driver);
		names.enterFirstName("Parwana");
		names.enterLastName("Bamiani");
		names.enterpostalCode("110018");
		names.clickContinueBtn();
		
		Finish finish = new Finish(driver);
		finish.clickFinishBtn();
		
		VerifySuccessMsg verifySuccessMsg = new VerifySuccessMsg(driver);
		String expectedSuccessMsg = "Thank you for your order!";
		String actualSuccessMsg = verifySuccessMsg.getSucMsg();
				Assert.assertEquals(actualSuccessMsg, expectedSuccessMsg);
				
		
		

		
      }

		
		
	
	
    	
}



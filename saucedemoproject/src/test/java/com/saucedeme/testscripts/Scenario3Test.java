package com.saucedeme.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddToCart;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Names;

public class Scenario3Test extends BaseTest{
	
	@Test
	public void AddItemToCart() {
		LandingPage landingPage = new LandingPage(driver);
		// 4 ) Enter the user name
		landingPage.enterUserName("problem_user");
		// 5 ) Enter the Password
		landingPage.enterPassword("secret_sauce");
		// 6 ) click Log In button
		landingPage.clickLogInBtn();
		
		// 7 ) Add 1st product to the cart
		AddToCart addToCart = new AddToCart(driver);
		
		
		addToCart.clickAddToCart2();
		// 8 ) Click on the cart icon
		addToCart.clickCartIcon();
		//click on checkout button
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckoutBtn();
		
		
		Names names = new Names(driver);
		// 9 ) Enter first name
		names.enterFirstName("Parwana");
		// 10 ) Enter last Name
		names.enterLastName("Bamiani");
		// 11 ) Enter postal code
		names.enterpostalCode("110018");
		// 12 ) click on continue button
		names.clickContinueBtn();
		
		// 13 ) verify the Error Message
		
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = landingPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
		
		
		
		
	}
}

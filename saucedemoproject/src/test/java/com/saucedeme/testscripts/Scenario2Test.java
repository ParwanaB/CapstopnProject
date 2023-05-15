package com.saucedeme.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.VerifySuccessMsg;

public class Scenario2Test extends BaseTest {
	
	@Test
	public void VerifyUserName() {
	   LandingPage landingPage = new LandingPage(driver);
	   landingPage.enterUserName("locked_out_user");
	   landingPage.enterPassword("secret_sauce");
	   landingPage.clickLogInBtn();
	   
	   // verify the error message - Epic sadface: sorry, this user has been locked out is displayed
	   String expectedErrMsg= "Epic sadface: Sorry, this user has been locked out.";
	   String actualErrMsg = landingPage.getErrMsg();
	   Assert.assertEquals(actualErrMsg, expectedErrMsg);
	   
	}

}   


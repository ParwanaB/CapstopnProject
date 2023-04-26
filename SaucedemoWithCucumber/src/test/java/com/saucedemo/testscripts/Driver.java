package com.saucedemo.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.pages.*;

public class Driver extends Tools {
	
	
	protected static LandingPage landingPage;
	protected static AddToCart addToCart;
	protected static Checkout checkout;
	protected static Finish finish;
	protected static Names names;
	protected static VerifySuccessMsg verifySuccessMsg;
	
	
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		landingPage = new LandingPage(driver);
		addToCart = new AddToCart(driver);
		checkout = new Checkout(driver);
		finish = new Finish(driver);
		names = new Names(driver);
		verifySuccessMsg = new VerifySuccessMsg(driver);
	}

}

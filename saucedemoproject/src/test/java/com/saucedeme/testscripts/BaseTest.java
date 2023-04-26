package com.saucedeme.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	
	WebDriver driver;
	@BeforeClass
	public void launchApplication() {
		
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		// 2 ) Maximize it
		driver.manage().window().maximize();
		//3 ) Navigate to Application
		driver.get("https://www.saucedemo.com/");
		

}
	
    @AfterClass
       public void closeTheBrowser() {
	       driver.quit();
    }
}
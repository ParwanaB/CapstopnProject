package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
	@FindBy(id = "user-name")
	private WebElement userNameText;
	
	@FindBy(id = "password")
	private WebElement passwordText;
	
	@FindBy(id = "login-button")
	private WebElement logInBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'error-message')]")
	private WebElement errMsg;
	
		
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
		
	}
		public void enterUserName(String user ) {
			userNameText.sendKeys(user);
			
		
	}
		public void enterPassword(String password) {
			passwordText.sendKeys(password);
		}
	
		public void clickLogInBtn() {
			logInBtn.click();
		}
		public String getErrMsg() {
			String message = errMsg.getText();
			return message;
		}
}
	
			
			
			
		

 
		
		
			
		


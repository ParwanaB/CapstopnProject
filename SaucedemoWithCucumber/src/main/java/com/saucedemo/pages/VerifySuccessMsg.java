 package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySuccessMsg {
	@FindBy(xpath = "//div[contains(@class, 'complete-text')]")
	private WebElement successMsg;
	
	@FindBy(xpath ="//h2[contains(@class, 'complete-header')]")
	private WebElement sucMsg;
	public VerifySuccessMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    public String getSuccessMsg() {
    	String message = successMsg.getText();
    	return message;
   }
	
    
    public String getSucMsg() {
    	String message = sucMsg.getText();
    	return message;
    }
}

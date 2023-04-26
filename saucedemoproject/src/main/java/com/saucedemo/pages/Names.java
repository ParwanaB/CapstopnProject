package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Names {
	@FindBy(id = "first-name")
	private WebElement firstNameText;
	
	@FindBy(id = "last-name")
	private WebElement lastNameText;
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement clickContinue;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShoping;
	
	public Names(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String firstName) {
		firstNameText.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		lastNameText.sendKeys(lastName);
	}
	public void enterpostalCode(String postal) {
		postalCode.sendKeys(postal);
		
	}
	public void clickContinueBtn() {
		clickContinue.click();
	}
	public void clickContinueShopping() {
		clickContinue.click();
	}

}

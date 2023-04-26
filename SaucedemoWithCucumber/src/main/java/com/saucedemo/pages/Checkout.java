package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	@FindBy(xpath = "//span[contains(@class, 'title')]")
	private WebElement text;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShoping;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(xpath = "//span[contains(@class,'shopping_cart_badge' )]")
	private WebElement qty;
	
	
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifyText() {
		String message = text.getText();
		return message;
	
	}
	
	
	
	
	public void clickCheckoutBtn() {
		checkout.click();
	}
	public void clickContinueShopping() {
		continueShoping.click();

}
	public void checkQuantity() {
		qty.click();
	}
}
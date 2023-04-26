package com.saucedemo.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addItem1;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement addToCart2;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cartIcon;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCart3; 
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement remove;
	
	
	@FindBy(xpath= "//select[contains(@class, 'product_sort_container')]")
	private WebElement sortLowToHigh;
	
	
	//@FindBy(xpath = "(//div[contains(@class, 'inventory_item_name')])[5]")
	//private WebElement verifyItem;
	
	
	
	@FindBy(xpath= "//select[contains(@class, 'product_sort_container')]")
	private WebElement sortHighToLow;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement expensiveItem;
	
	

	
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
		
	}
	public void clickAddToCart() {
		addItem1.click();
	}
	public void clickAddToCart2() {
		addToCart2.click();
	}
	public void clickCartIcon() {
		cartIcon.click();
	}
	
	
	public void ClickAddToCart3() {
		addToCart3.click();
	}
	public void clickRemove() {
		remove.click();
	}
	//public void verifyItem() {
		//verifyItem.click();
		
	//}
	
	
	public void clickLowToHigh(String price) {
		sortLowToHigh.sendKeys(price);
	
	}
	public void clickHighToLow(String priceHigh) {
		sortHighToLow.sendKeys(priceHigh);
	}
	
	public void clickExpensiveItem() {
		expensiveItem.click();
	}
	
	
		
	

	
	}
	

		
	
		
		
	
	
	



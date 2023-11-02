package com.NewBellatrix.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(css = "#site-navigation > div:nth-child(2) > ul > li.page_item.page-item-6.current_page_item > a")
	WebElement CartButton;
	
	public void clickOnCartButton() {
		CartButton.click();
	}

	@FindBy(css = "p.cart-empty.woocommerce-info")
	WebElement EmptyCartText;
	
	    public String textForCartEmpty() {
	    String emptytext =	EmptyCartText.getText();
	    return emptytext;
		}
	    
	    @FindBy(css = "th.product-name")
	    WebElement productName;
	    
	    public String productTextOnCartPage() {
		String productname = productName.getText();
		return productname;
		}
}


   
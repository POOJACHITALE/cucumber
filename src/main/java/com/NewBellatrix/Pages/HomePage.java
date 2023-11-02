package com.NewBellatrix.Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NewBellatrix.Base.Browser;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Browser.driver, this);
	}
	
	// search bar to search any product
		@FindBy(css = "input#woocommerce-product-search-field-0")
		WebElement searchComponent;
		
		public void searchProduct(String productName) {
			searchComponent.sendKeys(productName);
			searchComponent.sendKeys(Keys.RETURN);
		}
		
		//add to cart button for falcon heavy
		@FindBy(css = "li.product.type-product.post-31 a:nth-child(2)")
		WebElement addToCartFalconHeavy;
		
		public void addProductToCartFalconHeavy() {
			addToCartFalconHeavy.click();
		}
		
		//add to cart button for falcon 9
			@FindBy(css = "li.product.type-product.post-28 a:nth-child(2)")
			WebElement addToCartFalcon9;
			
			public void addProductToCartFalcon9() {
				addToCartFalcon9.click();
			}
		
		
		
		//view cart button for falcon heavy
		@FindBy(css = "li.product.type-product.post-31>a:nth-child(3)")
		WebElement viewCartFalconHeavy;
		
		public void viewProductAddedToCartForFalconHeavy() {
			viewCartFalconHeavy.click();
		}
		
		//view cart button for falcon 9
			@FindBy(css = "li.product.type-product.post-28>a:nth-child(3)")
			WebElement viewCartFalcon9;
			
			public void viewProductAddedToCartForFalcon9() {
				viewCartFalcon9.click();
			}
			
			//product title for falcon heavy
			@FindBy(css= "li.product.type-product.post-31>a:nth-child(1)>h2")
			WebElement productTitleFalconHeavy;
			
			public String productTitleFalconHeavy() {
	        String productTitle = productTitleFalconHeavy.getText();
	        return productTitle;
			}
			
			//product title for falcon 9
			@FindBy(css= "li.product.type-product.post-28>a:nth-child(1)>h2")
			WebElement productTitleFalcon9;
			
			public String productTitleFalcon9() {
	        String productTitle = productTitleFalcon9.getText();
	        return productTitle;
			}
			
			@FindBy(css = "h2.woocommerce-loop-product__title")
			List<WebElement> productTitleFalcon;
			
			public Iterator<WebElement> productTitleForFalcon() {
				
				Iterator<WebElement> itr = productTitleFalcon.iterator();
                   return itr;
			}
			
		//To get Sale text on homepage
		@FindBy(css = "span.onsale")
		List<WebElement> saleTexts;
		
		public List<String> toGetSaleTexts() {
			List<String>  Texts = new ArrayList<String>();
			for (WebElement saletext : saleTexts) {
				Texts.add(saletext.getText());
			}
			return Texts;
		}
		
		//to get product titles
		@FindBy(css = "h2.woocommerce-loop-product__title")
		List<WebElement> productTitles;
		
		
		public List<String> getProductTitles() {
			List<String> titles = new ArrayList<String>();
			for (WebElement  title: productTitles) {
				titles.add(title.getText());
			}
			return titles;
			
			
		}
}

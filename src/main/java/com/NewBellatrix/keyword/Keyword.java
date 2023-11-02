package com.NewBellatrix.keyword;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.NewBellatrix.Base.Browser;

public class Keyword {
	
	public WebElement getWebElement(String LocatorType, String LocatorValue) {
		if (LocatorType.equalsIgnoreCase("id")) {
			return Browser.driver.findElement(By.id(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			return Browser.driver.findElement(By.xpath(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("css")) {
			return Browser.driver.findElement(By.cssSelector(LocatorValue));
		} else
			return null;
	}
	
	public List<WebElement> getWebElements(String LocatorType, String LocatorValue) {
		if (LocatorType.equalsIgnoreCase("id")) {
			return Browser.driver.findElements(By.id(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			return Browser.driver.findElements(By.xpath(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("css")) {
			return Browser.driver.findElements(By.cssSelector(LocatorValue));
		} else
			return null;
	}
	
	public List<String> getTexts(String LocatorType, String LocatorValue) {
		List<WebElement> data = getWebElements(LocatorType, LocatorValue);

		List<String> stringdata = new ArrayList<String>();
		for (WebElement element : data) {
			stringdata.add(element.getText());
		}
		return stringdata;

	}

	public void enterText(String LocatorType, String LocatorValue, String TextToEnter) {
		getWebElement(LocatorType, LocatorValue).sendKeys(TextToEnter);
	}

	public String getText(String LocatorType, String LocatorValue) {
		return getWebElement(LocatorType, LocatorValue).getText();
	}

	public void click(String LocatorType, String LocatorValue) {
		getWebElement(LocatorType, LocatorValue).click();
	}
	public void launchUrl(String url) {
		Browser.driver.get(url);

	}
	
	public void maximizeWindow() {
		Browser.driver.manage().window().maximize();
	}
	
	public void scrollWindow() {
		Browser.driver.executeScript("window.scrollBy(0,2000)");

	}
}

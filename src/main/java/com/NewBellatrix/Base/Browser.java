package com.NewBellatrix.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Browser {

public static	RemoteWebDriver driver;
	
	@Before
	public void OpenBrowser() {
		driver = new ChromeDriver();
	}
	
	@After
	public void CloseBrowser() {
		driver.quit();

	}
}

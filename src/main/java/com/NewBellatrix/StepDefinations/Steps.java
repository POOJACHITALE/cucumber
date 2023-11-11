package com.NewBellatrix.StepDefinations;

import com.NewBellatrix.config.Configuration;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.NewBellatrix.Pages.CartPage;
import com.NewBellatrix.Pages.HomePage;
import com.NewBellatrix.keyword.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	private static final Logger LOG = Logger.getLogger(HomePage.class);
	Keyword keyword = new Keyword();
	HomePage homepage = new HomePage();
	CartPage cartpage = new CartPage();
	Configuration config = new Configuration();

	@Given("Open the the app url")
	public void open_the_the_app_url() {
//		try {
//			config.getAppUrl("app.url");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 keyword.launchUrl("https://demos.bellatrix.solutions/");

		keyword.maximizeWindow();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@When("Search for Falcon Product")
	public void search_for_falcon_product() {
		homepage.searchProduct("Falcon");
		// keyword.scrollWindow();

	}

	@Then("Click on Add to Cart for falcon heavy")
	public void Click_on_add_to_cart() {
		keyword.scrollWindow();
		homepage.addProductToCartFalconHeavy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Click on View Cart For Falcon Heavy")
	public void click_on_view_cart_for_falcon_heavy() {
		homepage.viewProductAddedToCartForFalconHeavy();
	}

	@Then("Click on Add to Cart for falcon9")
	public void Click_on_add_to_cart_For_falcon9() {
		keyword.scrollWindow();
		homepage.addProductToCartFalcon9();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Click on View Cart For falcon9")
	public void click_on_view_cart_for_falcon9() {

		homepage.viewProductAddedToCartForFalcon9();
	}

	@Then("Verify Falcon Heavy Product Title is Displayed")
	public void verify_falcon_heavy_product_title_is_displayed() {

		Assert.assertTrue(homepage.productTitleFalconHeavy().contains("Falcon Heavy"), " ");
	}

	@Then("Verify Falcon9 Product Title is Displayed")
	public void verify_falcon9_product_title_is_displayed() {

		Assert.assertTrue(homepage.productTitleFalcon9().contains("Falcon 9"), " ");
	}

	@Then("Verify Falcon Product Titles are Displayed")
	public void verify_falcon_product_titles_are_displayed() {
		homepage.productTitleForFalcon();

		while (homepage.productTitleForFalcon().hasNext()) {
			String producttitles = homepage.productTitleForFalcon().next().getText();
			System.out.println("Checking: " + producttitles);
			String out = producttitles.toLowerCase();
			Assert.assertTrue(out.contains("falcon"), "");
			// LOG.info("" + producttitles);
			break;
		}
		// LOG.info(""+producttitles);
	}

	@When("Search for Proton Product")
	public void search_for_proton_product() {
		homepage.searchProduct("Proton");
		LOG.info("Proton product searched");
	}

	@Then("Verify Proton Product Titles are Displayed")
	public void verify_proton_product_titles_are_displayed() {
		homepage.productTitleForProton();

		while (homepage.productTitleForProton().hasNext()) {
			String producttitles = homepage.productTitleForProton().next().getText();
			System.out.println("Checking: " + producttitles);
			String out = producttitles.toLowerCase();
			Assert.assertTrue(out.contains("proton"), "");
			break;
		}
	}

	@When("Click on Cart")
	public void click_on_cart() {
		// driver.switchTo().frame(0);
		cartpage.clickOnCartButton();
	}

	@Then("Your cart is currently empty text should get displayed")
	public void your_cart_is_currently_empty_text_should_get_displayed() {
		Assert.assertTrue(cartpage.textForCartEmpty().contains("Your cart is currently empty."));
	}

	@Then("Product Name text should get displayed")
	public void product_name_text_should_get_displayed() {
		Assert.assertTrue(cartpage.productTextOnCartPage().contains("Product"));
	}
}
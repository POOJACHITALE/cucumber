package com.NewBellatrix.StepDefinations;

import com.NewBellatrix.Pages.CartPage;

import io.cucumber.java.en.Then;

public class CartSteps {

	CartPage cartpage = new CartPage();
	@Then("Get the subtotal")
	public void get_the_subtotal() {
	   cartpage.getSubTotalWhenFalconHeavyAdded();
	}

}

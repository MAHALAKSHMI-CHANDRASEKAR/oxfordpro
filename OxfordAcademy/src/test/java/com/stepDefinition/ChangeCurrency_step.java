package com.stepDefinition;

import com.pages.CurrencyChange_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeCurrency_step {
	CurrencyChange_main c = new CurrencyChange_main();
	@Given("^user launched the chrome browser$")
	public void user_launched_the_chrome_browser() throws Throwable {
	   c.url();
	}

	@When("^user opened the website$")
	public void user_opened_the_website() throws Throwable {
	   c.oxford_website();
	}

	@Then("^user select book$")
	public void user_select_book() throws Throwable {
	   c.select_book();
	}

	@Then("^user select currency$")
	public void user_select_currency() throws Throwable {
	   c.select_currency();
	}

	@Then("^user close the page$")
	public void user_close_the_page() throws Throwable {
	    c.close_page();
	}


}

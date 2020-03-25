package com.stepDefinition;

import com.pages.PrintUser_Id;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintUser_Id_step {
	PrintUser_Id p = new PrintUser_Id();
	@Given("^I launched the chrome browser$")
	public void i_launched_the_chrome_browser() throws Throwable {
	    p.url1();
	}

	@When("^I opened the website$")
	public void i_opened_the_website() throws Throwable {
	   p.Oxford_website();
	}

	@Then("^I print the email id$")
	public void i_print_the_email_id() throws Throwable {
	   p.email_id();
	}

	@Then("^I closed the page$")
	public void i_closed_the_page() throws Throwable {
	    p.close();
	}
}

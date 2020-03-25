package com.stepDefinition;

import com.pages.Register_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register_step {
	Register_main r = new Register_main();
	@Given("^Launch Chrome browser$")
	public void launch_Chrome_browser() throws Throwable {
	   r.url();
	}
	@Then("^open Oxford Academy website$")
	public void open_Oxford_Academy_website() throws Throwable {
	   r.Oxford_homepage();
	}

	@Then("^register the valid details$")
	public void register_the_valid_details() throws Throwable {
	    r.register_details();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    r.exit();
	}

	
}

package com.stepDefinition;

import com.pages.DownloadFile_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DownloadFile_step {
	DownloadFile_main d = new DownloadFile_main();
	@Given("^I launch the chrome browser$")
	public void i_launch_the_chrome_browser() throws Throwable {
	   d.url1();
	}

	@When("^I open the oxford website$")
	public void i_open_the_oxford_website() throws Throwable {
	  d.Oxford_website();
	}

	@Then("^I click the journalAtoZ button$")
	public void i_click_the_journalAtoZ_button() throws Throwable {
	   d.journalAtoZ();
	}
	@Then("^I click dispatch date button$")
	public void i_click_dispatch_date_button() throws Throwable {
	    d.dispatch_date();
	}

	@Then("^I select a journal$")
	public void i_select_a_journal() throws Throwable {
	    d.Select_journal();
	}

	@Then("^I download the file$")
	public void i_download_the_file() throws Throwable {
	    d.file_download();
	}

	@Then("^I close the page$")
	public void i_close_the_page() throws Throwable {
	    d.close_page();
	}
}

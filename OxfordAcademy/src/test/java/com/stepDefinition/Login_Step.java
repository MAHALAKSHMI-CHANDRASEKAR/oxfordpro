package com.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Login_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Step {
	WebDriver driver; 
	Login_main l = new Login_main(driver);
	@Given("^the user launch chrome$")
	public void the_user_launch_chrome() throws Throwable {
	    l.launchBrowser("chrome");
	}

	@Then("^the user opens website$")
	public void the_user_opens_website() throws Throwable {
	    l.oxfordHomepage();
	}

	@Then("^The user login using \"([^\"]*)\" and \"([^\"]*)\" with vaild and invaild deatils$")
	public void the_user_enters_the_valid_login_details(String emailId, String password) throws Throwable {
		l.oxfordDetails(emailId, password);
	l.screenshot("src\\test\\resources\\Driver\\login.png");
	}

	@Then("^the user closes the browser$")
	public void the_user_closes_the_browser() throws Throwable {
	   l.oxfordClose();
	}
}

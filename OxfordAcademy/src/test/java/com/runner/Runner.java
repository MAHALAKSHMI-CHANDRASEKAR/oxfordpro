package com.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/oxford.Feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-extent-report/extentreport.html"},
		tags = {"@tc04_Oxford_Academy_Print_email,@tc5_Oxford_Academy_Currency_change"},
		glue = {"com.stepDefinition"},
		monochrome = true
		)
public class Runner {
	@AfterClass
    public static void writeExtentReport() 
	{
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
        
    }

}

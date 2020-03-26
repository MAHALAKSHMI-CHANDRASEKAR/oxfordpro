package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Register_main {
	WebDriver driver;
	By register=By.className("register");
	By email=By.id("EmailAddress");
	By password=By.name("Password");
	By confirm_password=By.id("ConfirmPassword");
	By submit=By.xpath("//*[@id=\"registerBtn\"]");

		public void url()
		{
			System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");//Launching the chrome browser
			driver=new ChromeDriver();
			driver.manage().window().maximize();//Maximizing the window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		public void Oxford_homepage()
		{
			driver.get("https://academic.oup.com/journals");//Launching the website
			System.out.println(driver.getTitle());
		}
		//entering user details to register the website
		public void register_details() throws InterruptedException//Entering the details in the required field
		{
			driver.findElement(register).click();
			driver.findElement(email).sendKeys("koms@123");
			Thread.sleep(3000);
			driver.findElement(password).sendKeys("123");
			Thread.sleep(3000);
			driver.findElement(password).sendKeys(Keys.TAB);
			driver.findElement(confirm_password).sendKeys("123");
			Thread.sleep(3000);
			driver.findElement(confirm_password).sendKeys(Keys.TAB);
			//Thread.sleep(3000);
			driver.findElement(confirm_password).sendKeys(Keys.TAB);
			//Thread.sleep(3000);
			//driver.findElement(submit).click();
			driver.findElement(submit).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
		//taking screenshot		
	    public void screenshot(String path) throws IOException, InterruptedException
		{
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src,new File(path));					
		}
		public void exit() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.close();//closing the website
		}

}

package com.pages;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_main {
	WebDriver driver;
	public Login_main(WebDriver driver) 
	{
		this.driver=driver;
	}
		
	public void launchBrowser(String browser) //Launch url
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
		public void oxfordHomepage()
		{
			driver.get("https://academic.oup.com/journals");//Launching the Oxford journal Website
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();//Clicking the sign in button
	}
		//Enter user details for valid log in
		public void oxfordDetails(String emailId,String password)throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"user_LoginFormPopup\"]")).sendKeys(emailId);
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		
		}
		//taking screenshot		
	    public void screenshot(String path) throws IOException, InterruptedException
		{
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src,new File(path));					
		}	
		public void oxfordClose() throws InterruptedException, IOException 
		{
			Thread.sleep(3000);
			
			driver.close();//closing the website
		}

}

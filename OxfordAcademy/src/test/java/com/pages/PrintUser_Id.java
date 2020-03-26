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

public class PrintUser_Id {
WebDriver driver;
	
	public void url1() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	// enter the details to sign in 
	public void Oxford_website() throws InterruptedException
	{
	  driver.get("https://academic.oup.com/journals");
	  //(enter details)sign in button
	  driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();
	  //user id
	  driver.findElement(By.xpath("//*[@id=\"user_LoginFormPopup\"]")).sendKeys("mahalakshmi.c98@gmail.com");
	  //password
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys("Maha@12345");
	  //sign in
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	}
	//print the user's mail Id
	public void email_id() 
	{		
		String email=driver.findElement(By.id("header-account-info-user-fullname")).getText();
		System.out.println(email);
	}
	//taking screenshot		
    public void screenshot(String path) throws IOException, InterruptedException
	{
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src,new File(path));					
	}
	public void close()
	{
		driver.close();
	}
}

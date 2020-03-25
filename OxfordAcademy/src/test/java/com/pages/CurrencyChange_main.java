package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyChange_main {
	WebDriver driver;
	public void url() 
{
     System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
}
public void oxford_website() 
{
	driver.get("https://academic.oup.com/journals"); 
    System.out.println(driver.getTitle());
		
}
//selecting the book to purchase
public void select_book()
{
	driver.findElement(By.linkText("Journals A to Z")).click();
	driver.findElement(By.xpath("//*[@id=\"cloudCMS\"]/div/div[1]/div/div/p[2]/a[1]")).click();
	driver.findElement(By.linkText("Purchase")).click();
	
}
//selecting the currency to be changed
public void select_currency() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\"collapsible-table-0\"]/tr/td[5]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"basket_currency_choice\"]/a[1]")).click();
	Thread.sleep(3000);
}
public void close_page() 
{
	driver.close();
}
}

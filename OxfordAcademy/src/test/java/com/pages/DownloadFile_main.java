package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DownloadFile_main {

	WebDriver driver;
	
	public void url1() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void Oxford_website()
	{
	  driver.get("https://academic.oup.com/journals");
	
	}
	//click journal AtoZ button
    public void journalAtoZ() 
	{
      driver.findElement(By.linkText("Journals A to Z")).click();
	}
    //click dispatch dates button
	public void dispatch_date() 
	{
	  driver.findElement(By.xpath("//*[@id=\"cloudCMS\"]/div/div[2]/div[2]/ul/li[2]/a")).click();
	}
	//select the journal from drop down 
	public void Select_journal() 
	{
	  driver.findElement(By.xpath("//*[@id=\"id_pick_journal\"]")).click();	
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.DOWN);
	  action.sendKeys(Keys.DOWN).click().build().perform();
	  
    }
	// download the file
	public void file_download()
	{
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
	}
	//taking screenshot		
public void screenshot(String path) throws IOException, InterruptedException
	{
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src,new File(path));					
	}

	public void close_page() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}

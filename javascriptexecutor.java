package selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver  driver =new ChromeDriver();
		 driver.navigate().to("https://demoqa.com/automation-practice-form");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		 JavascriptExecutor js = (JavascriptExecutor )driver;
		
		 //click
		 WebElement male= driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		 js.executeScript("arguments[0].click();", male);
		
		 //scoll
		 WebElement submitBtn= driver.findElement(By.xpath("//button[@id='submit']"));
               js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);
	
               //js.executeAsyncScript("window.scrollBy(0,350);");
	
	
	//new page against driver.get,deiver.navigate to
	js.executeScript("window.location='https://www.facebook.com'" );
	
	//refresh
	js.executeScript("history.go(0);");
	
	
	//for popup message
	js.executeScript("alert('Happy Dasara');");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	
	}
	
	
	

}

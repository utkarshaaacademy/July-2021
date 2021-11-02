package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenresdemo.class)
public class threaddemo {

	 public WebDriver driver;
	 @Test(threadPoolSize = 2, invocationCount = 4, timeOut = 25000)
    public void testMethod() 
    {
        System.out.println("Thread ID Is : " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\eclipse-workspace\\July-2021\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		driver.close();
    }
}

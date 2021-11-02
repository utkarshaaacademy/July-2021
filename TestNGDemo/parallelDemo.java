package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelDemo {
    public WebDriver driver;
	@Test
	public void ChromeTest()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\eclipse-workspace\\July-2021\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
	@Test
	public void FirefoxTest()
	{
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharayu\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
	@Test 
	public void EdgeTest()
	{
		System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
}

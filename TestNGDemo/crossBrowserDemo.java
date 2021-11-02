package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(listenresdemo.class)
public class crossBrowserDemo {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforetest(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharayu\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\eclipse-workspace\\July-2021\\Binary\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("https://kite.zerodha.com");
			
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}

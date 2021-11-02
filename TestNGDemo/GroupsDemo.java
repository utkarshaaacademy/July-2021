package TestNGDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsDemo {
	public WebDriver driver;
	@Test(priority = 0 ,groups = {"sanity","regression"})
	public void LaunchBrowser()
	{   System.out.println("The thread ID for GroupsDemo is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver(); 
		driver.get("https://kite.zerodha.com");
		Reporter.log("Successfully launched chrome browser with kite application",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test(priority = 3 ,groups = {"sanity","regression"})
	public void LoginTest()
	{
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.xpath("//div[@class='login-form']//child::input[@id='password']")).sendKeys("Sharayu1706!5");
		driver.findElement(By.xpath("//div[@class='login-form']//child::button")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("691991");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
	@Test(priority = 2 ,groups = {"regression"})
	public void CheckTitle()
	{
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(priority = 1 ,groups = {"regression"})
	public void CheckLogo()
	{
		WebElement kiteLogo = driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
		kiteLogo.isDisplayed();
		String maxwidth = kiteLogo.getCssValue("max-width");
		System.out.println(maxwidth);
	}
	@Test(priority = 4 ,groups = {"sanity","regression"})
	public void teardown()
	{
		driver.quit();
	}
	@Test(enabled = false,groups = {"regression"})
	public void skipTest()
	{
		System.out.println("Skip test");
	}
}

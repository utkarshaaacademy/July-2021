package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groupsdemo {
  public WebDriver driver;
  @Test(priority = 0 , groups= {"sanity","regression"})
  public void launchBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\Pooja\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://kite.zerodha.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  @Test(priority = 3 ,groups= {"sanity","regression"})
  public void LoginTest()
  {
	  driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("pooja123");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("poo@123");
	  driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	  //driver.findElement(By.xpath("")).sendkeys("3456");
	  //driver.findElement(By.xpath("")).click();
  }
  @Test(priority = 2 ,groups= {"regression"})
  public void CheckTitle()
  {
	 String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	 String ActualTitle = driver.getTitle();
	 Assert.assertEquals(ActualTitle,ExpectedTitle);
  }
  @Test(priority = 1 , groups= {"regression"})
  public void CheckLogo()
  {
	  WebElement kiteLogo = driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
	  kiteLogo.isDisplayed();
	  String maxwidth = kiteLogo.getCssValue("max-width");
	  System.out.println("maxwidth");
  }
  @Test(priority = 4 ,groups = {"regression","sanity"})
  public void teardown(){
	  driver.quit();
  }
  
}

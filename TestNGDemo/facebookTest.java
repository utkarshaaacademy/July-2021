package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookTest {
	@Test(dataProvider = "dp")
	  public void f(String n, String s) {
		  System.out.println(Thread.currentThread().getId());
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys(n);
		  driver.findElement(By.id("pass")).sendKeys(s);
		  //driver.findElement(By.name("q")).sendKeys(s);
	  }

	  @DataProvider(parallel = true)
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "abc@gmail.com", "abc" },
	      new Object[] { "pqr@gmail.com", "pqr" },
	    };
	  }

}

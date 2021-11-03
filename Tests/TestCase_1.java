package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;

public class TestCase_1 {
	@Test
	public void e2eTest() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\eclipse-workspace\\July-2021\\Binary\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/books");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	LoginPage loginpage = new LoginPage(driver);
	
	HomePage homepage = new HomePage(driver);
	
	DashboardPage dpage = new DashboardPage(driver);
	
	loginpage.ClickLogin();
	
	homepage.enterUsername("gunjankaushik");
	homepage.enterPassword("Password@123");
	homepage.closeadd();
	homepage.ClickLogin();
	
	Thread.sleep(2000);
	dpage.getTitle();
	System.out.println(dpage.getTitle());
	dpage.clickLogout();
	
	driver.quit();
	
}
}
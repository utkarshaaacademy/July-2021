package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Without_POM {
	
	@Test
	public void Non_pom_java() throws InterruptedException {

		//Instantiating chrome driver
		System.setProperty("webdriver.chrome.driver", "F:\\software testing and Automation\\jar files\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Opening web application
		driver.get("https://demoqa.com/books");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Locating the Login button and clicking on it
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		
		//Locating the username & password and passing the credentials
		
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		//Click on the login button
		
		driver.findElement(By.id("close-fixedban")).click();
		driver.findElement(By.id("login")).click();
		
		//Print the web page heading
		
		System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

		//Click on Logout button
		
		driver.findElement(By.id("submit")).click();
		
		//Close driver instance
		
		driver.quit();
	}

}

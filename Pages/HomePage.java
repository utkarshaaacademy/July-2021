package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("userName");
	
	By password = By.id("password");
	
	By Login = By.id("login");

	By addclose = By.id("close-fixedban");

	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void closeadd()
	{
		driver.findElement(addclose).click();
	}
	
	public void ClickLogin()
	{
		driver.findElement(Login).click();
	}

}

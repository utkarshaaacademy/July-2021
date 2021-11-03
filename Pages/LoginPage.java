package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {

		this.driver=driver;
	}
	
	By LoginBtn = By.id("login");
	
	public void ClickLogin() {
		driver.findElement(LoginBtn).click();
	}
}

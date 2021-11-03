package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By PageTitle = By.xpath("//*[@id='app']//div[@class='main-header']");
	By LogoutBtn = By.id("submit");
	
	public String getTitle() {
		
		String pagetitle = driver.findElement(PageTitle).getText();
		
		return pagetitle;
		
	}
	public void clickLogout()
	{
		driver.findElement(LogoutBtn).click();
	}
}

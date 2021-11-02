package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupdependency {
	
	@BeforeMethod
	public void launch()
	{
		System.out.println("Launch the app");
	}
	@Test(groups = {"openbrowser"})
	public void OpenBrowser()
	{
		System.out.println("browser open successfully");
	}
	@Test(groups = {"login"})
	public void Login()
	{
		String logintitle = "abc";
		String expectedtitle ="abC";
		Assert.assertEquals(logintitle, expectedtitle);
		System.out.println("Login into application");
	}
	@Test(groups = {"dashboard"})
	public void Dashboard()
	{
		System.out.println("applications Dashbaord");
	}
	@Test(groups = {"logout"})
	public void Logout()
	{
		System.out.println("Logout successfully");
	}
	@AfterMethod
	public void halt()
	{
		System.out.println("Stop the app");
	}
}

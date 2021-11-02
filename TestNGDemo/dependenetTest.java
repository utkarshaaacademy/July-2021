package TestNGDemo;

import org.testng.annotations.Test;

public class dependenetTest {

	@Test
	public void login()
	{
		System.out.println("Login into application");
	}
	@Test(dependsOnMethods = "login")
	public void dashboard()
	{
		System.out.println("applications Dashbaord");
	}
	@Test(dependsOnMethods = "dashboard")
	public void logout()
	{
		System.out.println("Logout successfully");
	}
}

package TestNGDemo;

import org.testng.annotations.Test;

public class abc {

	@Test(groups = {"sanity"})
	public void test()
	{
		System.out.println("The thread ID abc is "+ Thread.currentThread().getId());
		System.out.println("abc test");
	}
}

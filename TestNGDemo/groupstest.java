package TestNGDemo;

import org.testng.annotations.Test;

public class groupstest {
@Test(groups = {"Two wheeler"})
public void hero()
{
	System.out.println("Two wheeler");
	}
@Test(groups = {"Two wheeler"})
public void TVS()
{
	System.out.println("Two wheeler");
	}
@Test(dependsOnGroups = "Two wheeler",groups = {"Four wheeler"})
public void Marutisuzuki()
{
	System.out.println("Four wheeler");
	}
@Test(groups = {"Two wheeler"})
public void yamaha()
{
	System.out.println("Two wheeler");
	
	}
}

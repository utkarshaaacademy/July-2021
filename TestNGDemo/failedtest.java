package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failedtest {

	@Test
	public void first()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void second()
	{
		Assert.assertEquals(true, true);
	}
	@Test
	public void third()
	{
		Assert.assertEquals(true, false);
	}
}

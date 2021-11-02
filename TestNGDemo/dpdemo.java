package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class dpdemo {
  @Test(dataProvider = "dp")
  public void f(Integer a, Integer b, Integer result) {
	  Integer sum = a + b;
	  Assert.assertEquals(sum, result);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][]  {{2, 3 , 5}, {5, 7, 9}};
  }
}

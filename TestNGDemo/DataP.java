package TestNGDemo;

import org.testng.annotations.DataProvider;

public class DataP {
	 @DataProvider(name = "fbtest",parallel = true)
	  public Object[][] dp() {
	    return new Object[][] {
	      { "ravinangare@gmail.com", "1234567899" },
	      { "ravinangare1983@gmail.com", "21314134235" },
	      { "ravi.nangare@gmail.com", "123421412" }
	      };
}
}
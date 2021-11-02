package TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplyTest {
	@Test
	@Parameters({"val1","val2"})
	public void product(int v1, int v2) {
		int finalproduct = v1*v2;
		System.out.println("Final value of product " +finalproduct);
	}
}

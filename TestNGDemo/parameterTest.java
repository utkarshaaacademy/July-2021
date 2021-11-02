package TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {

	@Test
	@Parameters({"val1","val2"})
	public void sum(int v1, int v2) {
		int finalsum = v1+v2;
		System.out.println("Final value of sum " +finalsum);
	}
	@Test
	@Parameters({"val1","val2"})
	public void Diff(int v1, int v2) {
		int finalDiff = v1-v2;
		System.out.println("Final value of Difference " +finalDiff);
	}
}

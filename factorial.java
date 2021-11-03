package mock;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	
		
		int n=5, mul = 1;
    //    Scanner s = new Scanner(System.in);
    //    System.out.print("Enter any integer:");
  //      n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            mul = mul * i;
        }
      System.out.println("Factorial of "+n+" :"+mul);
      //  System.out.println(mul);
		
		
		
		
		
		

	}

}

import java.util.*;

public class primeNumber{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int a=sc.nextInt();
int count=0;

if(a>0){
for(int i=1;i<=a;i++){
	if(a%i==0)
	count++;
}
if(count==2){
	System.out.println("Given number is a prime number");
}else{

	System.out.println("Given number is not a prime number");
}

}else{
	System.out.println("Given number is not prime number");
}
}
}
// Printing Fibonacci Series Upto 100.

public class Fibonacci {
	
	public static void main(String[] args) {
		int a=0,b=0,sum=1;
		while(b<=100) {
		  a=b;
		  b=sum;
		  sum=a+b;	 
		  System.out.print(a+" ");
		 }
	}
}

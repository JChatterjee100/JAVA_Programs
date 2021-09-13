//  A program to reverse a number given by the user.
import java.util.*;
public class Reverse_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		int remainder;
		int reverse=0;
		
		System.out.println("Enter Number To Get It Reversed=");
		number=sc.nextInt();
		
		while(number>0) {
		remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		
		System.out.println("The Reverse Of The Number"+" is "+reverse);
	}
}

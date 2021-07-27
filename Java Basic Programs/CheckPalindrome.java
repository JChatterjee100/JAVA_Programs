//To check if a number is Palindrome Or Not.

public class CheckPalindrome {

	public static void main(String[] args) {
		int number=1221;
		int number1=number;
		int remainder,quotient,sum=0;
		while(number!=0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
		}
		if(number1==sum) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		}
}

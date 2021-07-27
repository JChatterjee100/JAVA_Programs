// To print the factorial of a number. 

public class Factorial {
	public static void main(String[] args) {
		int number=5,fact=1;
		int number1=number;
		while(number>=1) {
			fact=fact*number;
			number--;
		}
		System.out.println("The Factorial Of "+number1+" Is "+fact);
	}
}

//Printing Palindrome Numbers Between 1 and 100.

public class PrintPalindrome {
	public static void main(String[] args) {
	int remainder,sum=0,number;
		for(int i=1;i<=100;i++) {
			number=i;
		while(number!=0) {
			remainder=number%10;   
			sum=(sum*10)+remainder;   
			number=number/10;    
		}
		if(sum==i) {
			System.out.print(i+" ");
		}
		sum=0;
	}
}
}

// To check if a number is Armstrong or Not.

public class Armstrong {
	public static void main(String[] args) {
		int number=1,sum=0,temp,remainder;
		temp=number;
		while(number!=0) {
			remainder=number%10;
			sum=sum+(int)Math.pow(remainder, 3);  // Also sum=sum+(remainder*remainder*remainder);
			number=number/10;
		}
		if(sum==temp) 
			System.out.println("Armstrong Number.");
		else
			System.out.println("Not An Armstrong Number.");
		}
		
	}

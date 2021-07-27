// To check if a number is Prime or Not.

public class CheckPrime {
	public static void main(String[] args) {
		int number=7,counter=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				counter++;
			}
		}
			if(counter==2)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
			}
		}


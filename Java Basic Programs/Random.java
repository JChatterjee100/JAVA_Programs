//Generating random number between 1 and 100 in JAVA.

public class Random {

	public static void main(String[] args) {
		int min=1,max=101; //the min value is inclusive while the max value is exclusive.
		System.out.println((int)(Math.random()*(max-min+1)+min));
	}
}

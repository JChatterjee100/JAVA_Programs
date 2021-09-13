/* To print the ASCII value of the inputed character.
   Eg. The ASCII value of A=65, B=66,.... */ 
import java.util.*;
public class ASCII_Value {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int ascii_value;
		
		System.out.println("Enter Character To Get The Corresponding ASCII Value:");
		ch=sc.next().charAt(0);
		
		ascii_value=(int)ch;
		System.out.println(ascii_value);
	}
}

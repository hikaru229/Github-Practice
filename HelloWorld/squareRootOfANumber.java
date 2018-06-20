package HelloWorld;

import java.util.Scanner;

public class squareRootOfANumber {
private static int i;
private static Scanner in;

public static void main(String[] args) {
	in = new Scanner(System.in);
	
	//get the integer
	System.out.println("Enter an integer:");
	i = in.nextInt();
	//calculate square root of i
	System.out.println("Square root of "+i+": "+ Math.sqrt(i));
}
}

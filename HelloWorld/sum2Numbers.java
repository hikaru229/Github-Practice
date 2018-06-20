package HelloWorld;

import java.util.Scanner;

public class sum2Numbers {
	private static Scanner in;

	public static void main(String args[])
	   {
	      int x, y;
	 
	      System.out.println("Enter two integers to calculate total");
	      in = new Scanner(System.in);
	      //get x; y
	      x = in.nextInt();
	      y = in.nextInt();
	      
	      //Calculate sum of x and y
	      System.out.println("Total:" + x + " + " + y + " = " + (x+y));
	   }
}

package Day2;

import java.util.Scanner;

public class CheckOddEvenOfNumber1 {
	
	private static Scanner in;

	public static void main(String[] args) {
		String input;
		in = new Scanner(System.in);
		//allow user to input number
		System.out.println("Please enter a number:");
		input = in.next();
		
		//check input is number or not
		if(Utility.numberOrNot(input))
        {
            System.out.println("Number: " +input);
            //check input is odd or even
            checkOddEven.isOddEven(input);
        }
        else
        {
            System.out.println("You must input numeric type. Try again...");
            System.out.println("Please enter a number:");
    		input = in.next();
    		//check input is odd or even
    		checkOddEven.isOddEven(input);
        }		
	}
}

//create common class to check input is numeric or not
class Utility{
	static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}

//create common class to check number odd or even
class checkOddEven{
	static void isOddEven(String input) {
		int y = 0;
        //check input is odd or even
		if(y % 2 == 0)
	      {
	         System.out.println("Entered number is an even number");
	      }
	      else if (y % 2 == 1)
	      {
	         System.out.println("Entered number is an odd number");
	      }
	}
}
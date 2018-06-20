package Day2;

import java.util.Scanner;

public class CheckPositiveOrNegativeNumber2 {
	public static Scanner in;
	//ask to input a number
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = in.nextInt();
		//call check number	
		if(in.hasNextInt()){
		    System.out.println("Checking Positive or Negative number...");
		    //check positive or negative
		    if(input == 0) {
		    	System.out.println("Input is Zero.");
		    }
		    else if(input > 0){
		    	System.out.println("Input is positive number.");
		    }
		    else {
		    	System.out.println("Input is negative number.");
		    }
		}
		else {
			//ask user to input again
			System.out.println("You must input numeric type");
			System.out.println("Please enter a number again:");
			int input2 = in.nextInt();
			if(input2 == 0) {
		    	System.out.println("Input is Zero.");
		    }
		    else if(input2 > 0){
		    	System.out.println("Input is positive number.");
		    }
		    else {
		    	System.out.println("Input is negative number.");
		    }
		}
	}
}
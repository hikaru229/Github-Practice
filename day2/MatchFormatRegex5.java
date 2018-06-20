package Day2;

import java.util.Scanner;

public class MatchFormatRegex5 {
private static String input;
private static Scanner in;

public static void main(String[] args) {
	in = new Scanner(System.in);
	boolean a = false;
	 
	 //Scanner string
	 in = new Scanner (System.in);
	 System.out.println("Please input a string: ");
	 //Define format of string
	 //Determine whether format of string is correct or not
	 while(a==false) {
		 input = in.nextLine();
		 if(input.matches("^[A-Z][A-Z\\a-z]+[A-Za-z]$")) {
			 System.out.printf(input + ":  Your message is correct format!!!");	 
			 a = true;
		 }else {
			 System.out.printf("Wrong format, please type again: "); 
		 }
	 }
	 in.close();
}
}

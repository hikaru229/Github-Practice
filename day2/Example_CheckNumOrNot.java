package Day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_CheckNumOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Please input correct numeric value: ");
		boolean verify = false;
		int count = 0;
		while(verify == false && count < 50) {
			try {
				s.nextInt();

			} catch (InputMismatchException ex) {
				// TODO: handle exception
				System.out.println("Wrong type of numeric, please type again: ");
				verify = false;
				System.out.println(verify);
			}
			count++;
		}
		
	}
}

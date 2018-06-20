package Day2;

import java.util.Scanner;

public class PrintNumberBetween2Inputs4 {
	private static Scanner in;

	public static void main(String[] args) {
		int num, num1, num2;
		in = new Scanner(System.in);
		//get numbers
		System.out.print("Insert number 1: ");
		num1= in.nextInt();
		System.out.print("Insert number 2: ");
		num2= in.nextInt();
		//check number 1 < number 2
		if ((num1 - num2) <0){
			System.out.println("All numbers between "+num1+" and "+num2+" are:");
			for (int i=0; i<num2-num1+1;i++){
			num = num1 + i;
			System.out.println(num);
			}
		}
		//check number 1 = number 2
		else if((num1 - num2)==0){
			System.out.println("No number between "+num1+" and "+num2+".");
		}
		//check number 1 > number 2
		else{
			System.out.println("All numbers between "+num1+" and "+num2+" are:");
			for (int i=0; i < num1-num2+1; i++) {
			num = num1 - i;
			System.out.println(num);
			}
		}
		in.close();
	}
}

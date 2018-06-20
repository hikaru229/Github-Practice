package Day2;

import java.util.Scanner;

public class PrintTotalDaysInAMonth3 {
	private static Scanner input;

	public static void main(String[] strings) {
        input = new Scanner(System.in);
        String number_Of_DaysInMonth = "0"; 
        String MonthOfName = "Unknown";
        //get input number
        System.out.print("Input a month number: ");
        String month = input.next();
        //check input is numeric or not
        while(!month.matches("^\\d+(\\.\\d+)?")) {
        	System.out.println("Wrong input type. Please try again.");
        	System.out.println("Enter a valid month:");
        	month = input.next();
        }
        //find the total days of input month
        switch (month) {
            case "1":
                MonthOfName = "January";
                number_Of_DaysInMonth = "31";
                break;
            case "2":
                MonthOfName = "February";
                number_Of_DaysInMonth = "28";
                break;
            case "3":
                MonthOfName = "March";
                number_Of_DaysInMonth = "31";
                break;
            case "4":
                MonthOfName = "April";
                number_Of_DaysInMonth = "30";
                break;
            case "5":
                MonthOfName = "May";
                number_Of_DaysInMonth = "31";
                break;
            case "6":
                MonthOfName = "June";
                number_Of_DaysInMonth = "30";
                break;
            case "7":
                MonthOfName = "July";
                number_Of_DaysInMonth = "31";
                break;
            case "8":
                MonthOfName = "August";
                number_Of_DaysInMonth = "31";
                break;
            case "9":
                MonthOfName = "September";
                number_Of_DaysInMonth = "30";
                break;
            case "10":
                MonthOfName = "October";
                number_Of_DaysInMonth = "31";
                break;
            case "11":
                MonthOfName = "November";
                number_Of_DaysInMonth = "30";
                break;
            case "12":
                MonthOfName = "December";
                number_Of_DaysInMonth = "31";
        }
 
        //print total days
        System.out.print(MonthOfName + " has " + number_Of_DaysInMonth + " days.\n");
    }
}

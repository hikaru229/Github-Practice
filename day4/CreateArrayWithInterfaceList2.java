package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayWithInterfaceList2 {
	private static Scanner in;

	public static void main (String[] agrs) {
		// size of ArrayList
		System.out.println("Please input a number to define size of array: ");
        int n = in.nextInt();
 
        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
 
        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);
 
        // Printing elements
        System.out.println(arrli);
 
        // Remove element at index 3
        arrli.remove(3);
 
        // Displaying ArrayList after deletion
        System.out.println(arrli);
 
        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");
}
}

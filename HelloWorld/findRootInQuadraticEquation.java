package HelloWorld;

import java.util.Scanner;

public class findRootInQuadraticEquation {

	private static Scanner in;

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		in = new Scanner(System.in);
		System.out.println("Give a quadratic equation:");
		//Get a
		System.out.println("Insert 1st  coefficient");
		a = in.nextInt();
		//Get b
		System.out.println("Insert 2nd  coefficient");
		b = in.nextInt();
		//Get c
		System.out.println("Insert 3rd  coefficient");
		c = in.nextInt();
				
		//case a = 0 and b != 0 -> linear equation
		if(a==0&&b!=0)                                   
        {
			System.out.println("We have an equation: "+b+" x "+c+" = 0");
			System.out.println("Root x = "+(-c/b));
			System.exit(0);
        }
		//case a = b = 0, c !=0 -> no equation
        if(a==0&&b==0&&c!=0)
        {
        	System.out.println("We have an equation: "+c+" = 0");
            System.out.println("Invalid equation!!! End job.");
            System.exit(0);
        }
        //case a = b = c = 0
        if(a==0&&b==0&&c==0)
        {
        	System.out.println("We have an equation: "+c+" = 0");
            System.out.print("No need to calculate root. We have no equation here J.");
            System.exit(0);
        }
        
        //print quadratic equation
        System.out.println("We have an equation: "+a+"x2 +"+b+"x +"+c+" = 0");
        //calculate the root
        double d = Math.pow(b,2)-4*a*c;
        if(d<0)
        {
            d=Math.abs(d);
            double x1=(-b+Math.sqrt(d))/2*a;
            double x2=(-b-Math.sqrt(d))/2*a;
            System.out.println("x1="+x1+"i , x2="+x2+"i");
        }
        else{
        	double x1=(-b+Math.sqrt(d))/2*a;
        	double x2=(-b-Math.sqrt(d))/2*a;
        	System.out.println("x1="+x1+" ,x2="+x2);
		}
		
        System.out.println("End job.");
	}
}

package day4;

public class PrintOddAndEven7 {
	public static void main(String[] agrs) {
		int n = 100;
		System.out.println("Even numbers from 1 to 100\n");
		//print even number
		for(int i=1;i<=n;i++) {
			if((i%2)==0){
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers from 1 to 100\n");
		//print odd number
		for(int i=1;i<=n;i++) {
			if((i%2)!=0){
				System.out.println(i);
			}
		}
	}
}

package day4;

public class CheckPalindromeOrNot6 {
		  public static void main(String args[]){
		    //Checking 2 input Strings-inputStr1 & inputStr2
		    String inputStr1="ABCDEFFEDCBA";
		    String inputStr2="ABCDEFFEDCBB";
		    System.out.println(inputStr1+" IS "+((isPalindrome(inputStr1))? "A":"NOT A")+" palindrome");
		    System.out.println(inputStr2+" IS "+((isPalindrome(inputStr2))? "A":"NOT A")+" palindrome");
		 
		    //Checking 2 input numbers-inputStr1 & inputStr2
		    long inputNo1=2345665432l;
		    long inputNo2=234566544l;
		    System.out.println(inputNo1+" IS "+((isPalindrome(inputNo1))? "A":"NOT A")+" palindrome");
		    System.out.println(inputNo2+" IS "+((isPalindrome(inputNo2))? "A":"NOT A")+" palindrome");
		  }
		   
		  //method to check whether input String is a palindrome
		  public static boolean isPalindrome(String inputStr){
		    StringBuffer reverseStr=new StringBuffer("");
		    for(int i=inputStr.length()-1;i>=0;i--){
		      reverseStr.append(inputStr.charAt(i));
		    }
		    if(inputStr.equalsIgnoreCase(reverseStr.toString())){
		      return true;//inputStr is a palindrome
		    }
		    return false;//inputStr is not a palindrome
		  }
		   
		  //method to check whether input number is a palindrome
		  public static boolean isPalindrome(long inputNo){
		    long reverseNo=0;
		    long num=inputNo;
		    while(num > 0){
		      long remainder=num % 10;
		      reverseNo=reverseNo*10+remainder;
		      num = num/10;
		    }
		    if(inputNo == reverseNo){
		      return true;//inputNo is a palindrome
		    }
		    return false;//inputNo is not a palindrome
		  }
		
}

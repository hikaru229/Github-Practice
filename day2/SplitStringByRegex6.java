package Day2;

public class SplitStringByRegex6 {

public static void main(String[] args) {
	String firstSplit, secondSplit;
	String input = "Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
    System.out.println("Before split:\n");
    System.out.println(input);
    
    //Split input string into 2 strings
    String[] inputSplitNewLine = input.split("\\| ");
    System.out.println("\nAfter split:\n");
    firstSplit = inputSplitNewLine[0];
    //System.out.println(firstSplit);
    secondSplit = inputSplitNewLine[1];
    //System.out.println(secondSplit);
    //split 1st divided string
    String[] endSplit1 = firstSplit.split("\\, ");
    System.out.println(endSplit1[0]);
    System.out.println(endSplit1[1]);
    //split 2nd divided string
    String[] endSplit2 = secondSplit.split("\\, ");
    System.out.println(endSplit2[0]);
    System.out.println(endSplit2[1]);
    /*for(int i=0; i<inputSplitNewLine.length; i++){
        System.out.println(inputSplitNewLine[i]);
         
    }*/
}
}

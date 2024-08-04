package CtsQuestion;

import java.util.Iterator;

public class FindingUpperandLower {

public static void main(String[] args) {
	
	String str="WELCome to the World";
	
	int upperCase=0;
	int lowerCase=0;
	
    for (int i = 0; i < str.length(); i++) {
    	
    	char c=str.charAt(i);
    	
    	if(Character.isUpperCase(c)) {
    		upperCase++;
    	}
    	else if(Character.isLowerCase(c)) {
    		lowerCase++;
    	}
		
	}
    System.out.println("Upper Case Count is :"+upperCase );
    System.out.println("Lower Case Count is :"+lowerCase);
}


}

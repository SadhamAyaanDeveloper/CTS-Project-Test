package CtsQuestion;

import java.util.Iterator;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="I love Bangalore";
		
	String[] split = s.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		System.out.print(split[i]);
		
		}
	System.out.println();
	for (int j = split.length-1; j >=0; j--) {
		
		System.out.print(split[j]+" ");
	}
	
	}

}

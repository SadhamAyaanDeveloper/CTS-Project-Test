package CtsQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupString {
	
	public static void main(String[] args) {
		
		String str= "This This is is done by Saket Saket";
	
		String[] split = str.split("\\s");
		
		Set<String> s= new LinkedHashSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			s.add(split[i]);
			System.out.print(split[i]+ " ");
			
	}
		System.out.println();
		for (String string : s) {
			System.out.print(string+" ");
			
		}
	
		
	}

}

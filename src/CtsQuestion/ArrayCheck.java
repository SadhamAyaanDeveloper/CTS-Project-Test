package CtsQuestion;

import java.util.ArrayList;

public class ArrayCheck {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<String>();
		
		al.add("Bismillah");
		al.add(1, "Hirrahumman");
		al.add("Nirrahim");
		al.add(786);
		al.add("You can start from now");
		al.contains(true);
		al.add(123);
		al.remove(5);
		
		
		System.out.println(al);
		al.clear();
		System.out.println("Here all the data cleared and the result will be empty"+al);
		
	}

}

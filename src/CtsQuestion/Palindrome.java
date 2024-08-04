package CtsQuestion;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int givenNumber=1441;
		
		int reversedNumber=0;
		
		
		while (givenNumber!=0) {
			
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			

			if (givenNumber==reversedNumber) {
				System.out.println("It's a palindrome Number");
				return;
				}
			}
		
			System.out.println("It's not a palindrome");
		
	
	}
	
}

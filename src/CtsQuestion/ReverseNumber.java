package CtsQuestion;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		int givenNumber=43533;
		
		 System.out.println("Give Number is :"+givenNumber);
		
		int reversedNumber=0;
	
		
		while (givenNumber!=0) {
			
			reversedNumber = reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		
		
		System.out.println("The reversed Number is :"+reversedNumber);
	}
}

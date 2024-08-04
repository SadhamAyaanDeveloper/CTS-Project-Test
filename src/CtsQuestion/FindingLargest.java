package CtsQuestion;

public class FindingLargest {
	
	public static void main(String[] args) {
		
		int b[]= {1,4,6,8,2,4,3,5,3,45,5,65};
		
		int largest=b[0];
		
		for (int i = 0; i < b.length; i++) {
			
			if(largest<b[i]) {
				largest=b[i];
			}
			
		}
		System.out.println("The largest Number in Array is :"+largest);
	}

}

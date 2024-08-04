package CtsQuestion;

public class DuplicateNum {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,4,5,5,6,6,7,7,};
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate number is :"+arr[i]);
				}
			}
			
		}
	}
	

}

package CtsQuestion;

public class SwapNumber {
	
	public static void main(String[] args) {
		int a=89, b=96;
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("The Number a is after swap :"+a);
	}

}

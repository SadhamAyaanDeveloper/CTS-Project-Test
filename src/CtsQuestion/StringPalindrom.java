package CtsQuestion;

public class StringPalindrom {
	
	public static void main(String[] args) {
		
		String str="MadaM";
		String reversed="";
	
		System.out.println("The String is :"+str);
		
		for (int i = str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
					}
		System.out.println("The reversed String is : "+reversed);
		if (str.equals(reversed)) {
			System.out.println("It's a palindrom");			
		}
		else {
			System.out.println("It's not a palindrom");
		}
	}

}

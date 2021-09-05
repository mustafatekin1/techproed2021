package day28Exceptions;

public class E03 {

	public static void main(String[] args) {
//ArrayIndexOutOfBoundsException
		
		String s[] = {"A","D", "B", "C" }; 
		System.out.println(s[2]);
		
		try {
			System.out.println(s[4]);// java.lang.ArrayIndexOutOfBoundsException
		
		// This is unchecked exception. Because we get after running.
	} 
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please enter an index between 0-3");
		System.out.println("Java message: " + e.getMessage());
		
	}


		
		
}
}

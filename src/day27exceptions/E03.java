package day27exceptions;

public class E03 {
// an "unchecked exception" example
// If there is any exception (checked/unchecked), Java stops compiling at that line.
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Do not make b 'zero' ");
		}
		
		
		//System.out.println(a/b);   // java.lang.ArithmeticException: / by zero

	}

}

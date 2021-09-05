package day28Exceptions;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		// 
		
		
	String s1 = "";
	System.out.println(s1.length());
	
	String s2 = null;
	
	
	try {
		System.out.println(12/0);
		System.out.println(s2.length()); 
	//System.out.println(12/0); // This line is skipped because there is exception
						// Either Java throws exception error or java moves to "catch" block. 
	
	
	// unchecked exception. We get error after running the code
//java.lang.NullPointerException: Cannot invoke "String.length()" because "s2" is null
	} catch (NullPointerException e) {
		System.out.println("Do not use 's.length()' for -null-" );
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
	}
	catch (ArithmeticException e) {
		System.out.println("Dont divide by zero...");
	} 
	
	// When we want to execute the code under both positive and negative condition
	// Then we use "finally"
	// ex:  to end connections from Data Base or somewhere else... 
					//  connection may result in security or may result in data leak
	
	
	// we can use "finally" block instead of "catch" block in try-catch blocks.
	finally {
		System.out.println("Always run this finally block ");
	}
	
	
	System.out.println("Will this code be executed"); 
	// Java does not compile the code ever due to the exception in the line13
	// To handle this we put the exception (NullPointerException) into try-catch block
	}

}

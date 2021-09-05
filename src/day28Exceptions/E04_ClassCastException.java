package day28Exceptions;

public class E04_ClassCastException {

	public static void main(String[] args) {
	// ClassCastException: thrown when Java does not support a casting data type to another	
	//unchecked exception
//		Object obj = 70; // Since "Object" is parent of all classes, acceptable by Java.
//		try {
//			String num = (String) obj;//java.lang.ClassCastException
//		}
//		catch (ClassCastException e) {
//			System.out.println("Do not try to cast integer to String in Java");
//			System.out.println("Java message: " + e.getMessage());
//		}

		
//NumberFormatException
// Unchecked exception.
// thrown when used non-digit character 
// eg: when "parse" methpd is used with a non-digit	in the string as follows in s2...
		
	String s1 = "123";
	Integer.parseInt(s1);
	System.out.println(Integer.parseInt(s1));
	
	String s2 = "12a";
	System.out.println(Integer.parseInt(s2)); //java.lang.NumberFormatException
		
		
	}

}

package day24MultiThreadSyncEncapsulation;

public class MultiThread01 {
public static void main(String[] args) {
	

	String s1 = "Java";
	String s2 = "Java"; // Java uses the s1 instead of s2 because they are the same.
						// This is called "String Pool"
						// If you want to add new container, create a string with "new" as following.
	String s3 = new String ("Java");
	StringBuilder sb = new StringBuilder ("Java");
	
	if (s1 == s2) {
		System.out.println("Two strings" );
	}
	
	if (s1==s3) {
		System.out.println("string with 'new' keyword");
		}													// s3 is created with new keyword.
															// So s3 has different reference and container
	
	if (s1.equals(s3)) 
	{System.out.println("they are same");}

	
	// if (s1==sb) {System.out.println("Comppile error");} We can not compare String and StringBuilder
										// Because they are different data types... compile error
	
	if (s1.equals(sb)) {
		System.out.println("Stringbuilder comparing. They are same");
	} // no error but returns "false"
	
	
}	
}

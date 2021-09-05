package day09_String_Manipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
// 15. substring(): used to get specific part of a str- returns String.

Scanner scan = new Scanner(System.in);

String s = "Java is easy";

  System.out.println(s.substring(5, 7));
  //First index is inclusive, end index is exclusive!!!
  System.out.println(s.substring(1, 4));//ava
  System.out.println(s.substring(8, 12));//easy

  System.out.println(s.substring(8));//easy-starts from the 8th index to the last
		
// Get string. Print the first and last character.
  System.out.println("Enter a string");
  String s2 = scan.nextLine();
  
  //int l = s2.length();
  System.out.println(s2.substring(0, 1)+s2.substring((s2.length()-1), s2.length()));
  
  //Error while typing are `Compile time error`
  //Errors after running (you see on the console) = "Run time error"
		
//Get social sec number 1-9. Print it. convert first 5 digit to *****	
	
  	System.out.println("Please enter your SSN");
	String ssn = scan.nextLine();
	
	String convertedSsn = ssn.substring(5);// last 4 digits==>6789
	
	System.out.println("*****"+ssn.substring(5,9));// or just soc.substring (5)
	
//16. Trim method: just like hair trimming. 
// 	used to remove spaces from the beginning and from the end.
	
String untrimmed = "  Ali   Can    "	;
System.out.println(untrimmed);
System.out.println(untrimmed.trim());
	
//17. isBlank:
String s5 = "";
String s6 = "  ";
System.out.println(s5.isBlank()); //true
System.out.println(s6.isBlank()); //true
System.out.println(s6.isEmpty()); // False

// 18. replaceAll(); used like replace.- returns String

String s8 = "Java is not lava";
System.out.println(s8.replaceAll("a", "x")); 
	// Similar to replace(). There are some differences:
// 1. replace can use both char ans String replaceAll just STring
// 2. replaceAll uses "regex:regular expressions"
	//a. \\d stands for all digits : 0,1,2....9.
		String s9 = "a.,3hd 98adk";
		System.out.println(s9.replaceAll("\\d", ""));// will remove all the numbers
	//	\\D stands for characters other than numbers (digits)
		String s10 = "qw,/89 34_ ";
		System.out.println(s10.replaceAll("\\D", ""));// just numbers= 8934
		
	//b. \\w stands for "_ and a-z and A-Z and 0-9"
	//	\\W stands for " different than _ and a-z and A-Z and 0-9"
		
	//c. \\s stands for space 
	//	\\S stands for characters other than spaces.
		
	//d. \\A beginning of the String
	//  \\Z at the end of the String
		
	//e. [a,b,c ...] to change any letter.
	//   [^a,b,c ...] to change the letters other than the written ones. 	
		
		
		
	}

}

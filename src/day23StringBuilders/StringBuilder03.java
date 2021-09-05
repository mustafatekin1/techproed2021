package day23StringBuilders;

public class StringBuilder03 {

	public static void main(String[] args) {
		// 

		StringBuilder sb1 = new StringBuilder ("Java");
		StringBuilder sb2 = new StringBuilder ("Java");
		StringBuilder sb3 = new StringBuilder ("abcd");
		System.out.println(sb1.equals(sb2)); // false
		
	// equal method
/*1st way: Convert to String
 
 */
	
		System.out.println(sb1.toString().equals(sb2.toString()));	
		
		
		
/*2nd way:  use compareTo method
 * 
*/
		
	System.out.println(sb1.compareTo(sb2));// If we get "0", they are equal. 
	System.out.println(sb1.compareTo(sb3));// If we get negative, they are not equal.	
		
sb3.substring(1,2);
System.out.println(sb3);
System.out.println(sb3.substring(1,2));

int index = sb3.indexOf("a", 5);
	System.out.println(index);
	
	String str = "Learn";
	str = str + "Java";
	System.out.println(str);
	
	
	}

}

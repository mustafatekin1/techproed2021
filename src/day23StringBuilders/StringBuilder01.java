package day23StringBuilders;

public class StringBuilder01 {

	public static void main(String[] args) {
		/* What is mutable? Immutable?
		 Mutable: It can be changed.
		Immutable: It can be changed.

	How to create a string Builder	by using 'StringBuilder' Class 
		*/
		
//1 st way
		StringBuilder sb = new StringBuilder (); 
		System.out.println(sb);
		System.out.println(sb.capacity()); //the "default" capacity is 16
		System.out.println(sb.length());
	sb.append("Ali");
	System.out.println(sb);
	sb.append(" Can"); // Since we use StringBuilder we could update the string. 
						// Which means that StringBuilder is mutable.
	System.out.println(sb);	
	
	String str = "Veli";
	str.toUpperCase();
	System.out.println(str);// Because strings are "immutable" we still get "Veli"
							// That's why we can not update the original string by the command "str.upperCase"

//2 nd way (most common way)
	
	StringBuilder sb1 = new StringBuilder("Veli is my friend. ");
	System.out.println(sb1);
	sb1.append("He is very clever.");
	System.out.println(sb1);
	
// 3 rd way
	
	StringBuilder sb2= new StringBuilder(5); // 5 is the capacity of characters.
	
	sb2.append("javaxyz"); //Java allows to enter more than the capacity.
	// It is about memory usage. If we do not use the capacity, 
	//							the default memory usage will be the default 16.
	
	System.out.println(sb2);
	
	System.out.println(sb2.capacity());
	System.out.println(sb2.length());
	
// StringBuilder as a chain
//1st : append
	StringBuilder sb3 = new StringBuilder ("Java");
	sb3.append('a').append('b').append('c');//Javaabc
	System.out.println(sb3);
	
//2nd: append (	sb3,1,3); we can add specified characters of a String
	sb3.append("Ahmet", 1, 3); // 1. index included 3rd index excluded are added: hm
	System.out.println(sb3);
	
//3rd: charAt : specific index - return character
	System.out.println(sb3.charAt(5));
	
//4th: delete: 
	System.out.println(sb3.delete(2, 4)); //Jaabchm: deletes the 2nd and 3rd index. 2nd inclusive, 4th exclusive
	System.out.println(sb3.deleteCharAt(4)); //deletes the specific index: 'c'


	}

}

package day23StringBuilders;

public class StringBuilder02 {

	public static void main(String[] args) {
//1st method : equals		
StringBuilder sb1 = new StringBuilder ("Java123");
StringBuilder sb2 = new StringBuilder ("Java123");	
// how to compare
System.out.println(sb1.equals(sb2)); // false why?
/*Because the equal method in StringBuilder looks for the complete equity with double equal sign ==
 * public boolean equals(Object obj) {
        return (this == obj);
 */

System.out.println(sb1.equals(sb1));// The only way to get 'true' from this method is to compare same objects


//2nd method: indexOf
	System.out.println(sb1.indexOf("a"));//1: gives the index number of"a"
	System.out.println(sb1.indexOf("1"));//1
	System.out.println(sb1.indexOf("0"));
	System.out.println(sb1.indexOf("b"));
	System.out.println(sb1.indexOf("y"));
	System.out.println(sb1.indexOf("4"));
	
//3rd method: insert
	
	sb1.insert(2, "ILAVE");
	System.out.println(sb1);
	
	sb1.insert(0, sb2, 2, 4);//2nd index of sb2 is inclusive and the 4th index is exclusive ==> va
	System.out.println(sb1);//will be added to the 0th index.
	
//4th method: reverse ... a common interview question with for loop
	sb2.reverse();
	System.out.println(sb2);
	sb2.reverse();
	System.out.println(sb2);
	//Lets remember the reverse with for loop:
	String sb3 = "Java";
	String sb4 = "";
	for (int i=sb3.length()-1; i>=0; i--) {
		sb4 = sb4 + sb3.charAt(i);
		
	}
	System.out.println(sb4);
	
//5th method replace
	
	sb2.replace(0, 4, "****");
	 
	System.out.println(sb2);//****123
	
//6th method : setcharAt()
	sb2.setCharAt(0, 'H');
	System.out.println(sb2);
	
//7th method: trimToSize: reduce the size of the String
	
	sb2.trimToSize();
	sb2.append("789");
	System.out.println(sb2);
	System.out.println(sb2.capacity());
	sb2.trimToSize();
	System.out.println(sb2.capacity());
	
	
	
	
	
	}

}

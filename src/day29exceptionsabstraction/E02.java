package day29exceptionsabstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {

	public static void main(String[] args) {
// StringIndexOutOfBoundsException
		
	String s = "Java is easy";
	System.out.println(s.charAt(3));
	//System.out.println(s.charAt(12));//java.lang.StringIndexOutOfBoundsException
	
// IllegalStateException
	// If you use a method at an inappropriate time we get this.
	
List <Integer> list = new ArrayList<>();
list.add(21);
list.add(22);
list.add(23);
	
System.out.println(list);	


Iterator <Integer> listItr = list.iterator();

// listItr.next(); We would assign element with this method.

//listItr.remove();
// Since we don't assign element with the upper line listItr.next(): we get this exception
// Because we do use the method inappropriate time!
	}

}

package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayasList_Method {

	public static void main(String[] args) {
		// How to convert an array to a List

		
		char c [] = new char[4];
		
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		System.out.println(c); // does not print as an array
		
		System.out.println(Arrays.toString(c));// With this method we print as an array.

		//1st way is Loops:
		// We have to use this method for primitives. You'll see it in the 2nd way examples.
		// This way, we can use all methods since we are creating a List in a normal way.
		
		List<Character> converted = new ArrayList<>();
		for (int i=0; i<c.length; i++) {
			
			converted.add(c[i]);
		}
		converted.add('g');
		System.out.println(converted);
		
		
		
//2nd way: Java creates a conversion method to make it.
//Converting from a "primitive data type of Array" with this method creates problem! Look 2-b and 2-c
//So the array should be non-primitive as 2-a, 2-d	or 2-e
		//2-a
		String s[]= {"Ali","Can","Veli"};
		
		List<String> s2 = Arrays.asList(s);
		System.out.println(s2);
		
		//2-b
		int primitive []= {1,0,5,6};
		List<int[]> primitive2 = Arrays.asList(primitive);
		System.out.println(primitive2);
		
		//2-c
		Arrays.asList(c);
		//System.out.println(c); It does not print List because we have to put this conversion
		// to a container which is a list. So lets create a list:
		
		List<char[]>  c2 = Arrays.asList(c);
		System.out.println(c2);
		//2-d
		Character chr [] = {'a','z','v'};
		List<Character> chr2 = Arrays.asList(chr);
		System.out.println(chr2);
		
		
		
		//2-e
		Integer nonPrimitive [] = {1,5,6,3} ;
		List<Integer> nonPrimitive2 = Arrays.asList(nonPrimitive);
		System.out.println(nonPrimitive2);
		
		// Question: Can we add elements to these converted Lists?
		//nonPrimitive2.add(12);
		//System.out.println(nonPrimitive2);
		
		//java.lang.UnsupportedOperationException we get this error. Because the list is not a real list!
		// Answer: We can not add elements to the converted lists. 
		// Because the arrays have fixed lengths.
		// So we can not use .clear, .remove, .add ... methods
		
		nonPrimitive2.set(0, 100);
		System.out.println(nonPrimitive2);
		
		System.out.println(nonPrimitive2.contains(100));
		
		
	}

}

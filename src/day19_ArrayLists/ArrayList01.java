package day19_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array length is fixed
		// ArrayList is not fixed. It is flexible, it is resizable.
		// ArrayList also can not store multiple data types.
		
// 1st way about syntax. 
		ArrayList<Integer> list = new ArrayList<>();
	
		System.out.println(list);// We just need to write the name of the ArrayList.
				// Note that in order to print the arrays we have to use Arrays.toString() method
	
		list.add(12);
		
		System.out.println(list);
		list.add(5);
		System.out.println(list);
		list.add(30);
		System.out.println(list);
		
		list.add(0, 400); // We put the "100" at the beginning - 0th index.
		System.out.println(list);
		
		list.add(1, 300); // 1st index so 2nd character.
		System.out.println(list);
		
		//list.add(20, 10000); because the index is out of the range.
		
		//Sorting lists:
		Collections.sort(list);
		System.out.println(list);//sort ascending: 5,12, 30,100,300
		
		System.out.println(list.get(3));//100... we use "get" method to get the specific element.
		list.add(-2);
		
		/*
		 * Print min and max elements of the list
		 */
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1)); // list.size(): refers to the last index.
		
		
		
		
// How to check if a list is empty or  not?
		
		System.out.println(list.isEmpty());
		
		ArrayList<Integer> emptyList = new ArrayList<>();
		System.out.println(emptyList.isEmpty());
// To remove elements
	list.remove(0);
		System.out.println(list);
	list.remove(list.size()-1);	// removes the last item
		System.out.println(list);
		
		
	System.out.println(list.remove(2));	
	System.out.println(list);
	list.remove(list.indexOf(300));
	System.out.println(list);
	
// an ArrayList with strings
	ArrayList<String> list2 = new ArrayList<> (); 
	
	list2.add("Ali");
	list2.add("Veli");
	list2.add("John");
	list2.add("Ayse");
	list2.add("Can");
	
	System.out.println(list2);
	
	list2.remove("Ali");
	System.out.println(list2);
	
	
	
	
	}

}

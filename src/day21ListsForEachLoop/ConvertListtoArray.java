package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListtoArray {

	public static void main(String[] args) {
		// How to convert an array to a list?
		// Normally we do not prefer this, because arrays are less useful than Lists

		List <Integer> list = new ArrayList<>();
		list.add(3);
		list.add(14);
		list.add(20);
		list.add(8);
		
		System.out.println(list);
		
		
		// Teacher's way
		Integer arr1 []= list.toArray(new Integer[0]);
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		// My way :)
		Object[] arr = list.toArray();
		System.out.println(arr);// we get just the address of the array.
		System.out.println(Arrays.toString(arr));// we get the array as a list. 
		
	}

}

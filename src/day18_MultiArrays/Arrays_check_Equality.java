package day18_MultiArrays;

import java.util.Arrays;

public class Arrays_check_Equality {

	public static void main(String[] args) {
		//Arrays same? Both the elements and orders should be the same. 

		String s1 [] = {"Veli", "Can","Ali" };
		String s2 [] = {"Can", "Ali","Veli" };
		
		System.out.println(s1.equals(s2)); // false
		
		// How to check if 2 arrays have any same elements ignoring the indexes.
		//1. sort
		//2. equals: return boolean
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		System.out.println(Arrays.equals(s1, s2));
		
		
		
	}

}

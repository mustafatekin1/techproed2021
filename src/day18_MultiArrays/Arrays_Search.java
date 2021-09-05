package day18_MultiArrays;

import java.util.Arrays;

public class Arrays_Search {

	public static void main(String[] args) {
		// How to check if an element exists or not
	// 1. sort () method
	// 2. Use binarySearch ()	 method
		
		
		char crr [] = {'c','A','k', 'm'};
//check x exists or not
	Arrays.sort(crr);
	System.out.println(Arrays.binarySearch(crr,'x'));
	// -5 why? A, c, k,m because the x comes after 'm' The order number is 5 (index+1)
	System.out.println(Arrays.binarySearch(crr, 'e'));
	// -3 : A, c "e - but non existing" then the other elements. in the order it would have been the 3rd character
	
	// negative value means does not exist
	// positive value gives the index
	
	System.out.println(Arrays.binarySearch(crr, 'q'));
	
	}

}

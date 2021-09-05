package day18_MultiArrays;

import java.util.Arrays;

public class MultiDimensional_multi_to_oneDimensional {

	public static void main(String[] args) {
		// From 2 dimensional to one dimensional
		
		int arr [][] = {{1,2,5}, {3,4,5},{6,7,8}};
		
		int arrLength = 0; 
		for (int i=0; i<arr.length; i++) {
			arrLength = arr [i].length + arrLength;
		}
		
		
		int brr [] = new int [arrLength];
		int idx = 0;
		
		for (int i=0; i<arr.length; i++) {
			int sum = 0;
			for (int k=0; k<arr[i].length; k++) {
				
				brr [idx] = arr [i] [k];
				idx++;
				
			}
			
		}
		
		String newArray = Arrays.toString(brr);
		System.out.println(Arrays.toString(brr));
		System.out.println(newArray);
		
		int arr1 [] = {2,3};
		int brr1 [] = {2,3};
		
		System.out.println(arr.equals(brr));
		System.out.println(Arrays.equals(arr1, brr1));
		
		
	}

}

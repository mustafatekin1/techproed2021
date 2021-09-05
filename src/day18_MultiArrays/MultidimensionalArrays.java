package day18_MultiArrays;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// It is like arrays in array
		// Normally 2 ones are enough.
		
		
		int oneDimension [] = new int [3];
		System.out.println(Arrays.toString(oneDimension));
		
		
		int arr [] []= new int[3][2];//1st brackets symbolize outer array. So outer has 3 elements
		
		System.out.println(Arrays.toString(arr));// This does not work for multidimensional ones.
		System.out.println(Arrays.deepToString(arr)); // This is for multi-dimensional arrays
		
		arr [0][0] = 3;
		arr [0][1] = 2;
		
		arr [1][0] = 11;
		arr [1][1] = -5;
		
		arr [2][0] = 1;
		arr [2][1] = 0;
		System.out.println(Arrays.deepToString(arr));
		
		
//		int brr [][] = new int [4][];
//		System.out.println(Arrays.deepToString(brr)); It gives null exception error
//		
//		brr [0][1] = 11; 
//		brr [1][1] = 12; 
//		brr [3][2] = 11; 
//		System.out.println(Arrays.deepToString(brr));
		
		
		// Lets make it more flexible with different numbers of elements
		
		int brr [][] = {{2,3}, {12,13,14,16,15}, {7}, {-2,-3,-4} };
		System.out.println(Arrays.deepToString(brr));
				
		
		
		
	}

}

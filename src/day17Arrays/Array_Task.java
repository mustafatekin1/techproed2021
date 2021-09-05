package day17Arrays;

public class Array_Task {

	public static void main(String[] args) {
		// Create a "double" array whose length is 6. 
		// Type a program to add all elements in the array.
		// Print the sum on the console.
		
		
		double d [] = {1.2, 3.5, 4.21}; // short way
		
		// long way
//		d[0] = 2.5;
//		d[1] = 5;
//		d[2] = 10.0;
//		d[3] = 5.5;
//		d[4] = 20;
//		d[4] = 12.0;	
		
		
		
		
		
		double sum=0;
		for (int i=0; i<d.length; i++) {
			sum = sum + d[i];
			System.out.println("ara toplamlar= " + sum);
		}
		System.out.println(sum);
		
		
	}

}

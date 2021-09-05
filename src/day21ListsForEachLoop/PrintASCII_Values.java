package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class PrintASCII_Values {

	public static void main(String[] args) {
// 2nd task :  print the ASCII values of the characters/
		
		List<Character> list = new ArrayList<>();
		list.add('x');
		list.add('z');
		list.add('a');
		list.add('m');
		list.add('e');
		
		int a=0;
		for (Character w:list) {
			a = (char)(w);
		System.out.print(w+ ": " +a+", ");
		}
		System.out.println();
		// or
		
		for (Character w: list) {
			System.out.print(w+ ": " + (int)w + ", ");
		}
		System.out.println();
		
		// Find the sum of ASCII values of list elements.
		int sum = 0;
		for (Character w:list) {
			sum = sum + w;
		}
		System.out.println("The sum of the ASCII values: " + sum);

// 3rd task: Print the characters whose ASCII values are even.
		for (Character w: list) {
			if (w%2 == 0) {
				System.out.print(w+" ");
			}
		}
// 4th task: Stop printing the characters when the ASCII value is less than 100.
		
		for (Character w: list) {
			
			if (w<100) {
			System.out.println("Error... The ASCII value of '" + w + "' is less than 100" );
			break;}
			
			System.out.println(w);
		}
// We can use for-each in Arrays also.
// 5th task: Print the array elements which do not end with "n"		
		String arr[] = { "Ali", "Can", "Hasan", "Ekrem"};
		
		for (String w:arr) {
			if (!w.endsWith("n")) {
				System.out.println(w);
			}
		}
	
	
	}

}

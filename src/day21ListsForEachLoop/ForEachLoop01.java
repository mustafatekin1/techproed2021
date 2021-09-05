package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// faster and most improved loop is this loop: For each Loop.
		
		List <Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('z');
		list1.add('m');
		list1.add('a');
		System.out.println(list1);
		
		// Use standard for loop:
		
		for (int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i)+"! ");//x! z! m! a! 
		}
		
		System.out.println();
		// for-each loop
		
		for (Character w : list1) { 	
			System.out.print(w +"! ");//x! z! m! a! 

	}

}}

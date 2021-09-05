package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_RemoveRepeatedElements {

	public static void main(String[] args) {
		// write a program to remove repeated elements.
		// Hint: Use a new ArrayList
		
		List<Character> rep = new ArrayList<>(); 
		
		rep.add('a');
		rep.add('b');
		rep.add('a');
		rep.add('c');
		rep.add('a');
		rep.add('b');
		rep.add('t');
		
		
		List<Character> nonRep = new ArrayList<>();
		for (int i=0; i<rep.size(); i++) {
			
			if (!nonRep.contains(rep.get(i))) {
					nonRep.add(rep.get(i));
				
				
			}
			
			
		}
		System.out.println(nonRep);
		System.out.println(rep);
		
	
	
	}

}

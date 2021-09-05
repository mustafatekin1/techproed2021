package day20ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_find_closest {

	public static void main(String[] args) {
		// from an array list, find min difference of the elements.
		
		List<Integer> find = new ArrayList<>();
		
		find.add(2);
		find.add(153);
		find.add(31);
		find.add(281);
		find.add(114);
		find.add(16);
		find.add(67);
		find.add(359);
		find.add(120);
		find.add(168);
		find.add(128);
	
		
		List<Integer> diff = new ArrayList<>();
		//Collections.sort(find);
		for (int i=0; i<find.size(); i++) {
			for (int k=i+1; k<find.size(); k++) {
				diff.add(Math.abs(find.get(i)-find.get(k)));
					
				}
				
				
				
			}
			
		System.out.println(diff);	
		Collections.sort(diff);
		
		System.out.println(diff);
		System.out.println(diff.get(0));
		
		
		
		}
		
		
	}



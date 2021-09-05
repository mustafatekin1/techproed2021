package day30exceptionsinterfacesiteratorscollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("Ali");
		list1.add("Can");
		list1.add("Aliye");
		list1.add("Canan");
		
		for (String w: list1) {
			w =w+"!";
		System.out.println(w);
		}
		System.out.println(list1);
		// we can not change the collection elements with the for-each loop above.
		
		// We can do this with "iterators"
		
		ListIterator<String> iterator1 = list1.listIterator();
		
		while (iterator1.hasNext()) {
			String element = iterator1.next()+"!";
			System.out.println(element);	
		}
		
	}

}

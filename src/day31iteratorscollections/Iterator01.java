package day31iteratorscollections;

import java.util.ArrayList;
import java.util.Collections;
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
				String elements = iterator1.next();
				iterator1.set(elements+"!");
				System.out.println(elements);
			}
			System.out.println(list1);
			
List<String> list2 = new ArrayList<>();
			
			list2.add("Apple");
			list2.add("Samsung");
			list2.add("Huawei");
			System.out.println(list2);
			
// Task: update elements with *...* eg: *Apple*
			// And make the list reversed.
			
			ListIterator<String> list2Itr = list2.listIterator();
			
			while (list2Itr.hasNext()) { 
				list2Itr.next();
			} // This while loop moves the pointer to the end: hasNext() then .next 
			
			while (list2Itr.hasPrevious()) {
				String elements = list2Itr.previous();
				list2Itr.set("*"+elements+"*");
			}// This loop hasPrevious() then .previous(): allows us to handle the elements in reversed order
			System.out.println("========");
			Collections.reverse(list2);
			System.out.println(list2);
				
// How to remove all elements by using ListIterator
		
		List<String> list3 = new ArrayList<>();
			list3.add("A");
			list3.add("B");
			list3.add("C");
			
			ListIterator<String> list3Itr = list3.listIterator();
			while(list3Itr.hasNext()) {
			list3Itr.next();
			list3Itr.remove();
			}
 			System.out.println(list3);
		}
}

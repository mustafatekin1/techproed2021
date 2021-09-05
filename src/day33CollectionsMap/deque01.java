package day33CollectionsMap;

import java.util.Deque;
import java.util.LinkedList;

public class deque01 {

	public static void main(String[] args) {
		/*Deque: Double ended Queue: You can add/remove the element from the beginning/end
		 * So we can use both FIFO and LIFO with Deque.
		 * Null sometimes can be used as an element in Deque.
		 * 
		 */
		
		Deque <String> dq1 = new LinkedList <>();

		dq1.add("A");
		dq1.add("BB");
		dq1.add("CCC");
		dq1.add("DDDD");
		dq1.add("A");
		dq1.add("BB");
		dq1.add("CCC");
		dq1.add("DDDD");
		dq1.add("A");
		dq1.add("BB");
		dq1.add("CCC");
		dq1.add("DDDD");
		
		dq1.addFirst("0");
		dq1.addLast("ZZZZ");
		
		dq1.offerFirst("offerfirst");
		dq1.offerLast("addlast");
		
		dq1.peekFirst();
		dq1.peekLast();
		
		dq1.pollFirst();
		dq1.pollLast();
		
		dq1.removeFirst();
		dq1.removeLast();
		
		dq1.removeFirstOccurrence("A");
		dq1.removeLastOccurrence("BB");
		
		dq1.add(null);
		
		System.out.println(dq1);
		// How do we understand a specific element is repeated? 
		Deque <String> dq2 = new LinkedList <>();
		dq2.add("A");
		dq2.add("B");
		dq2.add("A");
		dq2.add("C");
		dq2.add("A");
		
		dq2.removeFirstOccurrence("A");
		if (dq2.removeLastOccurrence("A")) { 
			System.out.println("The element A is repeated");
			
		} else {
			System.out.println("A is not repeated");
		}
		
		dq2.removeFirstOccurrence("B");
		if (dq2.removeLastOccurrence("B")) { 
			System.out.println("The element B is repeated");
			
		} else {
			System.out.println("B is not repeated");
		}
		
	}

}

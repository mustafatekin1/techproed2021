package day33CollectionsMap;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		/* We use Queue for FIFO: First in First out {for LIFO: Last in First Out we have Deque}
		 * 1) Queue is an interface. So we can not assign object from Queue. But we can select this as data type
		 * 2) Queue focuses on the first element due to FIFO.
		 * --- So we have many methods dealing with the first element.
		 * 3) If use LinkedList constructor, elements will be in insertion order.
		 * 4) If use PriorityQueue constructor, elements will be in Java Priority order - we dont know.
		 * 							// We can also declare sorting rules in Lambda.
		 */
		
		Queue<String> q1 = new LinkedList <>();
		Queue<String> q2 = new LinkedList <>();
		
		q1.add("Rick");
		q1.add("Maggie");
		q1.add("Glen");
		q1.add("Megan");
		q1.add("Daryl");
		
		System.out.println(q1);
		
		
		q1.element (); // Retrieves, but does not remove, the head of this queue. This is like copy paste
										// if none, throws NoSuchElementException 
		//q2.peek ();// Retrieves, but does not remove- Like copy paste. If none we get null (not exception)
		
		q1.poll(); //  * Retrieves and removes the head of this queue,
	     			//	* or returns {@code null} if this queue is empty.
		
		// q1.remove(); //      * Retrieves and removes the head of this queue.  This method differs
	    // * from {@link #poll() poll()} only in that it throws NoSuchElementException exception if this queue is empty.		
	
	q1.offer("XXXX");// same with the add. The only difference is this (offer) is better for capacity restrictions
	q1.add("ZZZZ");//  
	
	
	}

}

package day31iteratorscollections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
	
		LinkedList <String> ll1 = new LinkedList<>();		
		
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		ll1.add("Ali");
		ll1.add("Tom");
		ll1.add("Can");
		
System.out.println(ll1);
	//For unique elements ; set
//

ll1.element(); // copy and pastes the first element. 1st element is not removed.
System.out.println(ll1);// And throws "NoSuchElementException" if the list is empty.


ll1.poll(); // cuts and pastes the first element... 1st element is removed
System.out.println(ll1);// Also this method does not throw exception (gives null)

ll1.peek(); // gives 1st element like copy and paste.
			// does not throw exception (gives null)
			

ll1.removeFirstOccurrence("Ali");
System.out.println(ll1);

//ll1.removeIf(null) : we will learn this during "lambda" lessons.

ll1.set(ll1.lastIndexOf("Tom"), "Tommix");
System.out.println(ll1);

System.out.println(ll1.subList(1, 4)); // Mark, Tom, Tommix



	}

}

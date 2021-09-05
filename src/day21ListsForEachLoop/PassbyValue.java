package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class PassbyValue {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("before method call: "+ a);
		increase(a);
		System.out.println("after method call: " + a);
		/* Pass by Value:
		- Java does not update the original value in any methods. Instead Java uses a copy.
		- Thus prevents many problems by keeping the original value.
		 If you insist to update the original value, you can make assignment.
		 
		 - This is similar in non-primitive data types such as String.
		 
*** NOTE: IN THE LIST, THE METHOD UPDATES THE LIST! Because the list are mutable
*													While the strings are immutable.
*For Immutable (updateable) objects: Java copies the objects so	
*								original object is not updated ==> as in String
*
*For mutable objects: Java copies the reference. So
*						original object is updated ==> as in List
*
*
*	
		 */
	List<String> list = new ArrayList<>();	
	list.add("Hi");
	list.add("Woovv");
	list.add("Sorry");
	System.out.println("before: " +list);
	
	List<String> list1 = new ArrayList<>();
	list1 = List.copyOf(list); // We have to copy the list to keep the original one.
	
	putExc(list); 
	System.out.println("after: " +list1);

	System.out.println("After copying: " + list );
	
	
	}

	public static int increase (int x) {
		return x*3;
	}
	
	public static List<String> putExc (List<String> list) {
		for (int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+"!");
		}
	return list;
	
	}
	
	
	
}

package day33CollectionsMap;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		/* Hashset for unique elements
		 * TreeSet for order
		 * So we use Hashset then convert it to Treeset to nake it faster.
		 * 
		 */
/*LinkedHashSet puts the elements in the insertion order-- 
 * HashSet is faster: because HashSet is random.
 * 
 */
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("YZ");
		lhs1.add("N");
		lhs1.add("P");
		lhs1.add("C");
		lhs1.add("ABC");
		System.out.println(lhs1);
	}

}

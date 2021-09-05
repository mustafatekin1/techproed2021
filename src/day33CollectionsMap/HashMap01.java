package day33CollectionsMap;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		/*Set means no repetition :)
		 *
		 *Maps are like dictionary.
		 *Map means key-value pattern.
		 *Keys are unique// values may be repeated. 
		 * 
		 * HashMap: 
		 * Hash means random - no order.
		 * Tree: natural order
		 * TreeMap: Keys are in natural order.
		 * 
		 */
		
		/*HashMap has key-value pattern
		 * 1) Random order
		 * 2) When same key is put, the key is overwritten
		 * 3) Keys are unique but values are NOT UNIQUE
		 * 4) we can use null in keys (once) or in values (multiple times)
		 * 5) HashMaps are not thread-safe and not synchronized.
		 */

		HashMap <Integer, String> hm1 = new HashMap<>(); // We have 2 data types key and value
		
		hm1.put(100, "Ali Can"); // {100=Ali Can}
		hm1.put(101, "Veli Han");//{100=Ali Can, 101=Veli Han}
		hm1.put(102, "Mark Stone"); 
		hm1.put(103, "Angie Ocean");
		hm1.put(100, "Ali dan"); // Ali Can is overwritten with "Ali dan"
		hm1.put(101, "Veli can");
		hm1.put(106, "Mark tone"); 
		hm1.put(107, "Angie dean");
		hm1.put(108, "Ali weer");
		hm1.put(109, "Veli Han");
		hm1.put(110, "Mark Stone"); 
		hm1.put(null, null); // we can use null in keys (once) or in values (multiple times)
		hm1.put(111, null);
		
		
	
		System.out.println(hm1.get(120)); // returns null for non existent elements
		
		System.out.println(hm1.getOrDefault(112, "No value for that key"));
		
		System.out.println(hm1.keySet());
	
		System.out.println(hm1.values());
		
		/* Returns {@code true} if this map contains a mapping for the specified key.*/
		System.out.println(hm1.containsKey(120));// false
		System.out.println(hm1.containsKey(101));// true
		
		System.out.println(hm1.containsValue("Veli can")); //true
		System.out.println(hm1.containsValue("Aaaaaaaaaaaa")); // false
		
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(112, "Angie dean");
		hm2.put(113, "Ali weer");
		hm2.put(114, "Veli Han");
		
		hm1.putAll(hm2);
		System.out.println(hm1);
		
		hm2.putIfAbsent(101, "will be added since the key is NOT existing");
		System.out.println(hm2);
		
		hm2.putIfAbsent(112, "wont be added");
		System.out.println(hm2);
		
		System.out.println(hm2.replace(112, "replacing"));
		System.out.println(hm2);// returns the old value, so that the developer knows what is removed.
		
		hm2.replace(113, "Ali w", "Kaan"); // will check both key and old value conditions to replace.
		System.out.println(hm2);
		
		System.out.println(hm1.size());
		
		
		
		
	}

}

package day34Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
/* 1) Ascending order
 * 2) not thread safe and not synchronized
 * 3) the slowest map
 * 4) just accepts "null" (multiple also) as value (null as a key gives exception)
		
 * 
 */
	
	
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(101, "Ali");
		tm1.put(1, "Veli");
		tm1.put(23, "Ahmet");
		tm1.put(2, "Jack");
		tm1.put(0, "Mike");
		
		tm1.put(12, null);// just accepts "null" (multiple also) as value (null as a key gives exception)
		System.out.println(tm1);
		
		// We can convert hashmap to treemap
		HashMap <Integer, String> hm1 = new HashMap<>(); // We have 2 data types key and value
		
		hm1.put(100, "Ali Can"); 
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone"); 
		hm1.put(103, "Angie Ocean");
		
		
		TreeMap<Integer, String> tm2 = new TreeMap<>(hm1);
		System.out.println(tm2);
		
		tm1 = new TreeMap<>(hm1);
		System.out.println(tm1);
		
		
		
	}

}

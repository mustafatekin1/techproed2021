package day34Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {

	public static void main(String[] args) {
		// How to iterate HashMap

		
HashMap <Integer, String> hm1 = new HashMap<>(); // We have 2 data types key and value
		
		hm1.put(100, "Ali Can"); 
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone"); 
		hm1.put(103, "Angie Ocean");
		System.out.println(hm1);//{100=Ali Can, 101=Veli Han, 102=Mark Stone, 103=Angie Ocean}
								// Each element is -100=Ali Can- called "entry"
		
		//1st way for-each loop and using the method Map.entrySet()
	System.out.println(hm1.entrySet());
		
		
		for (Map.Entry<Integer, String>  w : hm1.entrySet()) {
			System.out.print(w.getKey() + " ");
			
			System.out.println();
			
			System.out.print(w.getValue() + " ");

		}
		System.out.println();
		System.out.println("==========");
		//2.Way: Iterator on Map.Entry<K, V>
				Iterator<Map.Entry<Integer, String>> hm1Itr = hm1.entrySet().iterator();
				
				while(hm1Itr.hasNext()) {
					
					Map.Entry<Integer, String> entry = hm1Itr.next();
					
					System.out.print(entry.getValue()+ " ");
					System.out.println(entry.getKey());
					
				}

	}

}

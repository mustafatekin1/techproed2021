package day34Maps;

import java.util.Hashtable;

public class HashTable01 {

	public static void main(String[] args) {
	
// Hashtable is threadsafe and synchronized (capable of multithreading) unlike HasMap
// Also random order as HashMap
// does not allow "null" neither as key nor value unlike HashMap
// 	Because of threadsafe/synchronization and checking "null" Hashtable is slower	
		
		
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		ht1.put(100, "Ali");
		ht1.put(101, "Veli" );
		ht1.put(102, "can");
		//ht1.put(null, "Memet");// throws NullPointerException for all "null"
		
System.out.println(ht1);
	}

}

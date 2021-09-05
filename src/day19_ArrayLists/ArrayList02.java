package day19_ArrayLists;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<String> list2 = new ArrayList<> (); 
		
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
	
	System.out.println("before set method: " + list2);	
		
	list2.set(2, "Ahmet");
	System.out.println(list2);
	
	list2.set(list2.indexOf("Ayse"), "Fatma");
	System.out.println(list2);
	
	
	}

}

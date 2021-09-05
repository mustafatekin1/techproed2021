package day30exceptionsinterfacesiteratorscollections;

// interface is a storage for "abstract methods" and "public static final variables"
// we can use "multiple inheritance" in interfaces (we can not in classes as we already know)
// Interfaces do not have constructors so we can not create objects from interfaces.


// All variables in interface are "public", "static" and "final". 
// Because all of the variables are "static" and "public", we can reach them from other classes!

public interface I01 {
	
	
	// Variables
	int x = 12; // This is public, static and final as it is said above. 
	public static final int y = 10; // This is also public, static and final as it is said above.
	String s = "Ali";
	//char d; this complains because "final" variables must be initialized.
	
	//Methods
// All methods are "public" and "abstract" automatically.	
	
	// After Java 9, we can add concrete methods:
// 1st way to create concrete method in interfaces:
//We have to use "default" (a specific keyword for interfaces) and "void"
	
	default void concrete (int x, int y) {
		System.out.println("1st concrete method result is "+ x*y);
	}
// 2nd way to create concrete method in interfaces:	
// Use "static" keyword
	 static void concrete2 (int x, int y) {
		 System.out.println("2nd concrete method result: " +(x+y));
	 }
	
	
	
	public void add (int a, int b);
	// All methods are "abstract".  no need to use abstract.
	
	abstract void add (int a, int b, int c); // This is also abstract
	
	
}

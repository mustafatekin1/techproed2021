package day30exceptionsinterfacesiteratorscollections;

public interface Engine {

	int price = 8000;
	String name = "Eco"; 
	
	void gasUsage ();
	
	void speedLimit ();
	
	default void accelerate () {
		System.out.println("Accelerate engine...");
	}
	
	
}

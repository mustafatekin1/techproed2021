package day30exceptionsinterfacesiteratorscollections;

public interface Music {

	String system = "Surround";
	int price = 2000;
	
	void sound ();
	void tune ();
	
	static void volume () {
		System.out.println("Music volume");
	}
	
}

package day26InheritanceOverriding;

public class Mammal extends Animal {

	String name = "Mammal";
	int height = 22;
	byte ageOfMammal = 2;
	
	public Mammal (int height) {
		System.out.println("height: " + height + " cm");
	}

	public void move() {
		System.out.println("Mammals move...");
	}
	public void feed() {
		System.out.println("Mammals feed their babies...");
	}
	
}

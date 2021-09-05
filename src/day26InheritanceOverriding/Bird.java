package day26InheritanceOverriding;

public class Bird extends Mammal {
	String name = "Bird";
	int height = 11;
	byte ageOfBird = 1;
	
	public Bird () {
	super(3); // We do not have to type it. Java automatically assigns this for one constructor!
	// If you want to call other constructors from parent class use "super()"
	
	
	System.out.println(super.ageOfAnimal);
	System.out.println(super.ageOfMammal);
	System.out.println(super.height);
	System.out.println(super.name);
		
	System.out.println("Child constructor - bird- runs");
	
	super.move();
	this.move();
	
}
	public void move() {
		System.out.println("Birds move...");
	}
	public void fly() {
		System.out.println("Birds fly..");
	}
	
}

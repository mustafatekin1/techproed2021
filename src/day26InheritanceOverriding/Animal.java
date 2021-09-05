package day26InheritanceOverriding;

public class Animal {
	String name = "Animal";
	int height = 33;
	byte ageOfAnimal = 3 ;
	
	public Animal () {
		System.out.println("Parent constructor runs");
	}

	public Animal (String name) {
		this();
		System.out.println("Parent constructor with parameters runs");
	}

public void move() {
	System.out.println("Animals move...");
	}
public void eat() {
	System.out.println("Animals eat...");
}

}

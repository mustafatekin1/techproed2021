package day15Constructors;

public class Animal {

	String name;
	int age;
	boolean isCarnivarous;
	String specy;
	char gender;
	
	static int counter;

	public Animal() {
	counter++;	
	}
/*We use instance variables in constructors as parameters. Because constructors create objects. 
 * In other words, constructors use instance variables. Class variables are not directly related with objects.
 */
	/*
	 * Locate cursor in the class. Click Source>> Generate Constructor using fields>>Select members and Location
	 * Click on finish.
	 */
	
	public Animal(String name, int age, boolean isCarnivarous, String specy, char gender) {
		
		this.name = name;
		this.age = age;
		this.isCarnivarous = isCarnivarous;
		this.specy = specy;
		this.gender = gender;
		
		counter++;
	}
public Animal(String name, int age, char gender) {
	// super(); we will learn this later
	this.name = name;
	this.age = age;
	this.gender = gender;
	
	counter++;
}
public Animal(String specy) {
	
	this ("Bobby", 11, 'M');
	/*
	 this() is used to call Contructor.
	 this() should be at first line.
	 this () can be used just once. (just in the first line)
	 
	 What is the difference:
	 this () calls constructs. this calls variables this.name ... 	
	 
	 */
	this.specy = specy;
	
	counter++;
}
	
	
}

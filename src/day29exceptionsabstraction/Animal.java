package day29exceptionsabstraction;

public abstract class Animal {
// If a method does not have body it is called "abstract"
// make the parent class abstract but child classes have to be "concrete" (withot abstract) to use methods
			//or if you do not override then make the child classes "abstract" 
// add 'abstract' and 'void' for the method.
// 'private' access modifier is not allowed.	
	
// abstract classes can have concrete methods but vice a versa is not allowed.	
// we have to override abstract methods in the child classes.
// we can not create objects from abstract classes.
// Abstract can have constructors but they are not used to create objects but initialize variables.
	
	
public abstract void eat(); // abstract method

public void drink () {
	System.out.println("They drink..."); // concrete method
}
	
	
}

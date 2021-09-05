package day29exceptionsabstraction;

public class Cat extends Animal {

	@Override
	public void eat () {
	System.out.println("Cats eat...");
}

	public static void main(String[] args) {
	Cat c1 = new Cat ();
	
	c1.eat();
	
	}


}
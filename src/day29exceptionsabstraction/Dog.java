package day29exceptionsabstraction;

public class Dog extends Animal {

	@Override
	public void eat () {
		System.out.println("Dogs eat fast and strongly");
	}
	public static void main(String[] args) {
		Dog d1 = new Dog(); 
		d1.eat();
		d1.drink();
	}
	
	
}

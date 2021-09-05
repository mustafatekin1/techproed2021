package day14_Method_Creation;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a01 = new Animal ();
		Animal a02 = new Animal (5, "Bobby", "Bulldog");
		Animal a03 = new Animal (8, "Lessie");
		
		System.out.println(Animal.counter);
	}

}

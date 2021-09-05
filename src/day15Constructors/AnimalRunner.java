package day15Constructors;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal a01 = new Animal("puppie");
		
		System.out.println(a01.age); 
		System.out.println(a01.name); 
		System.out.println(a01.specy); 
		System.out.println(a01.gender); 
		System.out.println(a01.isCarnivarous); 
		
		System.out.println(Animal.counter);
	}

}

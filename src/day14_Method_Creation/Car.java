package day14_Method_Creation;

public class Car {

	String make; // instance or object var
	int price; // instance
	int year; // instance
	String model;// instance
	String color;// instance
	
	static int soldCarCounter = 0; // class variable
	
	public static void main(String[] args) {
		// syntax of object creation:
		// Class name object name = new Contructor
		
		Car car01 = new Car ("Audi", 20000, 2019, "q5", "White");
			
		System.out.println(car01.make);
		System.out.println(car01.color);
		System.out.println(car01.model);
		System.out.println(car01.year);
		System.out.println(car01.price);
		
		Car car02 = new Car ("Honda", 20000, 2009, "civic", "red");
		
		System.out.println(car02.make);
		System.out.println(car02.color);
		System.out.println(car02.model);
		System.out.println(car02.year);
		System.out.println(car02.price);
		
		Car car03 = new Car ("Honda", 12000, 2020, "accord");
		
		System.out.println(car03.make);
		System.out.println(car03.color);
		System.out.println(car03.model);
		System.out.println(car03.year);
		System.out.println(car03.price);
		
		
Car car04 = new Car (12000, 2020);
		
		System.out.println(car04.make);
		System.out.println(car04.color);
		System.out.println(car04.model);
		System.out.println(car04.year);
		System.out.println(car04.price);
	
Car car05 = new Car ();
		
		System.out.println(car05.make);
		System.out.println(car05.color);
		System.out.println(car05.model);
		System.out.println(car05.year);
		System.out.println(car05.price);		
		
		System.out.println(soldCarCounter);// The right usage.
		System.out.println(car01.soldCarCounter);// gives the same result but it is longer
		// no need to use objects. The right usage is the upper one
		
	}

	public Car (String make, int price, int year, String model, String color) {
	this.make = make; 
	this.price = price;
	this.year = year;
	this.model = model;
	this.color = color;
	soldCarCounter++;	
	}
	
	public Car (String make, int price, int year, String model) { 
		this.make = make;
		this.price = price;
		this.year = year;
		this.model = model;
		soldCarCounter++;
	}
	
	public Car (int price, int year) { 
		this.price = price;
		this.year = year;
		soldCarCounter++;}
		
	public Car ()
	{
		soldCarCounter++;
		
	}
	
	
}

package day24MultiThreadSyncEncapsulation;

public class Student {
	/* Data Hiding process is called "encapsulation". 
	 To hide class members:
	 * 1. Use private access modifier
	 * 		Do not create toString() method. Or just use the properties 
	 * 		that you want to be seen in the toString().
	 * 
	 * 2. To read hidden variables, we create "getters". By getters we can read the values.
	 
	 * 3. To update value of a variable for a specific student use "setters".
	 * So, if we don't use "setters" and if we use "private" the class is 'immutable'.
	 * 
	 * getters and setters are called "beans" or "Java beans"
	 
	 Note:
	 *a) getter method names: get + Variable Name
	 *		if it is boolean: is + Variable Name
	 
	 *b) setter method names: set + Variable Name
	 *	if it is boolean: set+VariableName without "is"
	 *
	 *ex: boolean old=true;
	 *getter ==> isOld()
	 *setter ==> setOld()
	 */
	
	private String name="Mark";
	private int age=17;
	private boolean isSuccessful = false;
	
//@Override
//	public String toString() {
//		return "Student Name=" + name + ", age=" + age + ", isSuccessful=" + isSuccessful;
//	} we have to comment out to hide the details from another class.

public Student(String name, int age, boolean isSuccessful) {
		
		this.name = name;
		this.age = age;
		this.isSuccessful = isSuccessful;
	}

	public Student() {
		super();
	}
	
	public static void main(String[] args) {
	
		// How to create objects
	// 1st way to create object: Use default constructor
	Student std1 = new Student();
	
	// 2nd way: Create constructors with parameters
	
	Student std2 = new Student ("Ali", 16, true);
	
	
	
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}
	
	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	
	public void setAge(int age) {
		this.age = age;
	}



	
}

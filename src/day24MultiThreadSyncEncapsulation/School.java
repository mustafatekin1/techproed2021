package day24MultiThreadSyncEncapsulation;

public class School {

	public static void main(String[] args) {
	//1st way default constructor	
	Student std1 = new Student();
	System.out.println(std1.getName());
	
	//2nd way constructor with parameters
	Student std2 = new Student("Veli", 15, false);
	System.out.println(std2.getName());
	
	// 3rd way: Create object with default constructor then
	// update values by setter
	
	Student std3 = new Student ();
	System.out.println(std3.getName());
	
	std3.setName("Claire");
	std3.setAge(22);
	std3.setSuccessful(true); 
	System.out.println(std3.getName() + ", " + std3.getAge() + ", "+std3.isSuccessful());
	}

}

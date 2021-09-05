package day30exceptionsinterfacesiteratorscollections;

public class CustomExceptions01 {

	public static void main(String[] args) {
		// We can create our own checked/unchecked exception

		try {
			checkGrade(80);
		} catch (IllegalGradeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public static void checkGrade (int grade) throws IllegalGradeException {
		if (grade<0 || grade>100) {
			throw new IllegalGradeException ("Grades must be between 0-100.");
		}
	System.out.println("Your grade is " + grade);
	
	}
	
}


class IllegalGradeException extends Exception {
	// when we extend to Exception: checked exception as here
	// when we extend to RuntimeException: unchecked exception (in other class) 
	public IllegalGradeException (String message) {
		super(message);
	}
}
package day30exceptionsinterfacesiteratorscollections;

public class CustomsUncheckedExceprion {

	public static void main(String[] args) {
		// lets handle this unchecked exception
		
		try {
		divide(5,2);
		} catch (DivideByOneException e) {
			System.out.println("Division should be other than 1");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
public static void divide (int a, int b) {
	if (b==1) {
		throw new DivideByOneException ("No need to divide by one. It is the same!");
	}
	else {System.out.println("The result is " + a/b);}
	}

}
	
class DivideByOneException extends RuntimeException {
	public DivideByOneException (String message) {
		super (message);
	}
}

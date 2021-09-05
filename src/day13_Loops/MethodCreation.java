package day13_Loops;

public class MethodCreation {

	public static void main(String[] args) {
		//anything outside main method is never initiated

		System.out.println(multiply (3,5,8));
		System.out.println(multiply (2,4,4)); {
// The values we used inside the main method instead of these parameters are "arguments"	
		}
		
	}
// Lets create a method and then use it in main method.
// The variables inside the method paranthesis  like a,b,c are "paameters"	
// The values we used inside the main method instead of these parameters are "arguments"	
/*Method overloading:
 * Same name
 * different parameters
 * in the same class
 *  Note: Using different return types does not work
 *  Note2: Using different access types does not work/
 *  Note3: Using different parameter names do not work.
 * 
 * 	
 */
	
	
	public static double multiply (int a, int b, int c) {
		return a*b*c;
	
	}
	
}

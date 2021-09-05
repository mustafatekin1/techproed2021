package day14_Method_Creation;

public class Method_Overloading01 {

	public static void main(String[] args) {
		
System.out.println(add(2,3));
System.out.println(add(2.5,3));
System.out.println(add(2,3.5));
System.out.println(add(2.5,3.5));
System.out.println(add(2,5,6));

System.out.println(add(2,3,4,7));

}

	
	public static double add (int a, int b) {
		System.out.println("int+int");
		return a+b;
	}
	public static double add (double a, int b) {
		System.out.println("double + int");
	return a+b;
	}
	/*default for
	 * whole numbers ==> int
	 * decimals 	==> double
	 */
	
	public static double add (int a, double b) {
		System.out.println("int + double");
	return a+b;}
	
	public static double add (double a, double b) {
		System.out.println("double + double");
	return a+b;}
	
	public static double add (int a, int b, double c) {
		System.out.println("int+int");
		return a+b;
	}
	
	public static double add (int...a ) {
		System.out.println("this is varargs");
		return 3;}
	}
	
	
	
	


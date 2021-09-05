package day11_For_Loops;
import java.util.Scanner;

public class For_Loop_Reversed_Triangle {

	public static void main(String[] args) {
		// Get a number from the user				eg=3   * * *
		// Make a reversed triangle as this example==> 		* *
						//									 * 	
	
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the side length");
		int l = scan.nextInt();
		
		for (int i=l; i>0; i--) {
			
			for (int j=0; j<l-i; j++ ) {
				System.out.print(" ");
			}
			
			for (int k=1; k<i+1; k++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
			/* For second nested for teacher's solution:
			 * for (int k=l; k>l-i; k--) {System.out.print("* ");}
			 * 
			 */
			
			
		}
 	
	}

}

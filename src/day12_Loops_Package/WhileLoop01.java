package day12_Loops_Package;
import java.util.Scanner;
public class WhileLoop01 {

	public static void main(String[] args) {
		// get a number. Make a multiplication table:
		// eg 3: 3x1=3, 3x2=6, ...3x10=30
	
		
	System.out.println("Please enter a number");	
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	int i=1;
	int mult = 1;
	
	while (i<11) { mult = num * i;
		
		System.out.println(num+"x"+i+"="+ mult);
		i++;
	}
	
	
	
	
	
	
	
	
	}

}

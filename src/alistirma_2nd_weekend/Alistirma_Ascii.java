package alistirma_2nd_weekend;

import java.util.Scanner;

public class Alistirma_Ascii {

	public static void main(String[] args) {
		// get any string form the user. Print the ascii value.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any character");
		
		String any = scan.nextLine();
		
		for (int i = 0; i<=any.length()-1; i++ ) {
		char k = any.charAt(i); 
		int l = k;
			System.out.println(l);
			
		}
		short price = 245;
		byte newPrice = (byte) price; 
	System.out.println(newPrice);
		
	/* Get any String form the user.
    Print the Ascii number equivalent for every character.
    
    */
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string for get ASCI numbers of the chars");
    
    String s = scanner.nextLine();
    
    for(  int i = 0     ; i <s.length()       ; i++ ) {
        
        int num = s.charAt(i);
        System.out.print(num + " ");
        
    }
	
	
	
		scan.close();
	}

}

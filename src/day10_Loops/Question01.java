package day10_Loops;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*Ask use to enter firstname and lastname under given conditions;
            
            1)If user uses space characters at the beginning or at the end remove them.
            2)If user enters nothing or just space character, give a message like
              "Just space characters or nothing is not valid"
            3)If user does not use space character between first and last name 
              give a message like "One of the lastname and first name is not entered 
              or space is not used between firstname and lastname"
            4)If user uses multiple space characters between firstname and lastname 
              make it single  
            5)Initials of firstname and lastname should be uppercase, 
              other characters should be lowercases.
              If user does not enter the name in this format fix it.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first and last name");
		
		String name = scan.nextLine();
		
		name = name.trim(); // we assigned to change the string
		if (name.isBlank()) { System.out.println("Just enter letters");	
		}
		
		if (!name.contains(" ")) {
			System.out.println(" Please enter space between names");
		}
		
		if (name.indexOf(" ")!=name.lastIndexOf(" ")) { 
			int firstIdx = name.indexOf(" ");
			int lastIdx = name.lastIndexOf(" ");
			
			name = name.substring(0, firstIdx)+" " + name.substring(lastIdx+1);
			
			;
			
			System.out.println(name);	
		}
		
		name = name.substring(0).toUpperCase()+
				name.substring(1, name.indexOf(" ")).toLowerCase();
		
		
		System.out.println(name);
		
if(!(name.charAt(0)>='A' && name.charAt(0)<='Z')) {
			
String firstNameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();
			
System.out.println(firstNameFormatted);
		}
		
if(!(name.charAt(name.indexOf(" ") + 1)>='A' && name.charAt(name.indexOf(" ")+1)<='Z')) {
			
String lastNameFormatted = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2).toLowerCase();
			
System.out.println(lastNameFormatted);
		}
	

// If you create a variable in curly braces, we can use them inside curly braces

		
		
		
		

	}

}

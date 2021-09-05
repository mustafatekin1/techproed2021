package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02TryCatch {

	public static void main(String[] args) {
		// Unexpected problems are called "exceptions"
				// eg: 12/0 leads to no answer. 
				//We should type the code preventing such problems (handling exceptions)
			// There are some exceptions. here are 10 of them
				/*1. FileNotFoundException
				 * 	- The file in the path does not exist
				 * 	- Or the file is inaccessible.
				 *2. IO Exception
				 *	- It can handle all the input/output issues just like 911 emergency calls. 
				 		IOException is the parent of FileNotFoundException
				 		
				 		2 options:
				 		- using "throws" declaration in method line
				 *		- using "try-catch" block
				 *
				 *
				 */
		
		
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("asrc/day27exceptions/TextFile01");
			 int i = 0;
				while ((i=fis.read()) != -1) {
						System.out.print((char)i);
			 
					}
				fis.close();		}
		
		
				catch (FileNotFoundException e) {
		
			System.out.println("There is a problem in file");
			System.out.println(e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Errors in reading the file");
		}
				
				
		
	}	
	
}

package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01ThrowsException {

	public static void main(String[] args) throws IOException {
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
		 		- using "throws" declaration inmethod line
		 *		- using "try-catch" block
		 *
		 *
		 */
		
		FileInputStream fis = new FileInputStream("src/day27exceptions/TextFile01");
		
		int i = 0;
		while ((i=fis.read()) != -1) {
			System.out.print((char)i);
			
		}
		fis.close();
	}

	
	
	
}

package day28Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) {
		// throws exceptions: FileNotFoundException, IOException
		// try-catch exception
		// ArithmrticException
		
		// Let's learn to read line by line (it is faster).

		try {
			BufferedReader br = new BufferedReader(new FileReader("src/day27exceptions/TextFile01"));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		br.close();	
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("A problem with file or directory");
		} catch (IOException e) {
			System.out.println("A problem with reading " + e.getMessage());
		}		
		
	}

}

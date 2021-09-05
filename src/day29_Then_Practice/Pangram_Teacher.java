package day29_Then_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pangram_Teacher {

	//Write a function to check whether a string is pangram or 
	//not assuming that the string passed in does not have any punctuation.
	//Pangrams are words or sentences containing every letter of the alphabet at least once.
	
	
	
	
	static boolean isPangram (String str) {
		str = str.replace(" ", "").toUpperCase();
		String [] arr = str.split("");
		
		List <String> list = Arrays.asList(arr);
		
		HashSet<String> set = new HashSet<> (list);
		
		return set.size() == 26;
		
	}
	public static void main(String[] args) {
 


	
	
	}

}

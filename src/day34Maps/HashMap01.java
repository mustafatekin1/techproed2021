package day34Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
// How to count the number of occurrences of the words in a sentence.
// " Java is easy. Type codes to learn Java. To earn money, learn Java"
// Java=3, is=1...		
		
		String str = "Java is easy. Type codes to learn Java. To earn money, learn Java";
		
		HashMap <String, Integer> result = new HashMap<>();
		
		System.out.println(str);
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		System.out.println(str);
		
		String splitstr [] = str.split(" "); 
		System.out.println(Arrays.toString(splitstr));
		
		for (String w : splitstr) {
			Integer numOfValues = result.get(w);// gives the value of the key. Our key is w in the loop.
			
			if (numOfValues == null) { 
			result.put(w, 1);
			} 
			else {
				result.put(w, numOfValues +1);
			}
		}
			
	
		System.out.println(result);
		
		

	}

}

package day21ListsForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachPrint_notVowels {

	public static void main(String[] args) {
		// Print non-vowel characters of a list on the console.
		
		List<Character> nonVowel = new ArrayList<>();
		nonVowel.add('x');
		nonVowel.add('z');
		nonVowel.add('a');
		nonVowel.add('m');
		nonVowel.add('e');
		
		for (Character w : nonVowel) {
			if ((w != 'a') && (w!='i') && (w!='o') &&(w != 'e') && (w!='u')){
				System.out.print(w + "! ");
			}
			
		}
		
		
		
	}

}

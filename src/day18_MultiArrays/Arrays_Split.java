package day18_MultiArrays;

import java.util.Arrays;

public class Arrays_Split {

	public static void main(String[] args) {
		// Split a string for ex: into words.
		
		String s4 = "Ali Can went school";
		String words [] = s4.split(" ");
		System.out.println(Arrays.toString(words)); // The split character is removed
		
		String o_ [] = s4.split("o");
		System.out.println(Arrays.toString(o_)); // the split character is removed: both "o" are removed.
		
		// great method to make array for all characters split ("")
		
		String allCharacters [] = s4.split("");
		System.out.println(Arrays.toString(allCharacters));
		System.out.println(allCharacters.length);
		
		
		// How many characters are there other than spaces.
		String justCharacters [] = s4.replace(" ", "").split("");
		System.out.println(justCharacters.length);
		System.out.println(Arrays.toString(justCharacters));
		
		// How many "a" is used in the string "Mama may I go to Alabama"
		
		String s5  = "Mama may I go to Alabama";
		String s5Arr [] = s5.split("");
		System.out.println(Arrays.toString (s5Arr));
		
		String s5Withouta = s5.replace("a", "");
		String s5WithoutaArray [] = s5Withouta.split("");
		System.out.println(Arrays.toString(s5WithoutaArray));
		
		int aCount = s5Arr.length - s5Withouta.length();
		System.out.println(aCount);
		
		
		//Long way:
		String s6 []= s5.split("a"); 
		//Here there are 4 diff options to reach the right result!
		//syso: [M, m,  m, y I go to Al, b, m]
		// 1st option:  "a" is not  at the beginning and at the end.==> length-1
		//2nd option: "a" is both at the beginning and end ==> length
		//3rd option: "a" is just at the beginning (not at the end)
		//4th option: "a" is at one of them==> directly length
		
		System.out.println(Arrays.toString(s6));//[M, m,  m, y I go to Al, b, m]
		System.out.println(s6.length);//6
		
		int length = 0;
		if (!(s5.startsWith("a")) && !(s5.endsWith("a"))){
			length = s6.length-1;
			System.out.println(Arrays.toString(s6));
		}
		else if ((s5.startsWith("a")) && (s5.endsWith("a"))){
			System.out.println(Arrays.toString(s6));
			length = s6.length;
		}
		else if (s5.startsWith("a")) {
			length = s6.length-1;
		}
		else {
			length = s6.length;
			System.out.println(Arrays.toString(s6));
		}
		
		System.out.println(length);
	// 3rd way= for Loop
		
		int count = 0;
		
		for (int i=0; i<s5.length(); i++) {
			
		if (s5.charAt(i)=='a') {
			count ++;}
		
		}
		
		System.out.println("Loop way= " +count);
		
		//4.way: Use replaceAll
		
		String a_ = s5.replaceAll("a", "" );
		int counter = s5.length()- a_.length();
		System.out.println("regex method: " + counter);
		
		// 5.way: Use replaceAll regex
		String regex = s5.replaceAll("[^a]","");
		System.out.println("regex method: " + regex.length());
		
		
		
		
		
	}

}

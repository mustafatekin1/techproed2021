package day17Arrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		

		String s[] = new String [4];
		s[0]= "Ali Can";
		s[1]= "Veli Han";
		s[2]= "Ayse Tan";
		s[3]= "Kevin gray";
		
		System.out.println(Arrays.toString(s));
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	System.out.println("Same output with 'for' loop");
		for (int i=0; i<s.length; i++) {
		System.out.println(s[i]);}
		
	}

}

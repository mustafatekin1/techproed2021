package day25EncapsulationReview_InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_SecondWay {

	public static void main(String[] args) {
		// COmpare 2 strings.
		// If they are anagram or not
		// Anagram: letters or numbers are the same in the other string
		//ex: mary and army
	
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 1st string");
	String s1 = scan.nextLine().toUpperCase();
	
	System.out.println("Enter the 2nd string");
	String s2 = scan.nextLine().toUpperCase();
	
	isAnagram(s1, s2);
	
	
	}

public static void isAnagram(String s1, String s2)	{
	String arr1 []= s1.split("");
	String arr2 []= s2.split("");
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	
	if (arr1.length!=arr2.length) {System.out.println("Their lengths are different so NOT anagram");
		}
	else if (s1.isBlank()) {
		System.out.println("Your strings are empty- NOT Anagram");
	}
	else if (Arrays.equals(arr1, arr2)) {System.out.println("This is an Anagram");}
	else {
		System.out.println("Not an Anagram");
	}
		
	}
	
}
	


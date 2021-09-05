package day10_Loops;

import java.util.Scanner;

// import java.util.Scanner;


public class ForLoops01 {

	public static void main(String[] args) {
	// For loop
	// We have for (starting; condition; increment or decrement) {}
		
		for (  int i = 1 ;  i<=10 ; i++ ) { System.out.println("Hello World");}
			
	// Print integers 13 - 15 in the sama line with space between them.
		
		for (int j = 13; j < 16; j++) {
			System.out.print(j+" ");
		}
System.out.println();
	for  (int i = 16; i >13; i--) { 	
		System.out.print(i + " ");
		
	}
	
	System.out.println();
	
	// Print even integers 15-100
	
	// 1st way. this is better
	
	for (int i = 16; i< 101; i=i+2) {
		
		
		System.out.print(i + " ");
	}
	System.out.println();
	
	// 2nd way. with if. 
	for (int i = 16; i<101; i++) {
		
		if (i%2==0) {
			System.out.print(i + " ");
		}
		
	}
	
	System.out.println();
	// print odds from 120 - 65
	
	for (int i = 119; i>64; i-=2) {
		System.out.print(i+ " ");
	}
	
	
	System.out.println();
	for (int i=120; i>64; i--) {
		
		if (i%2==1) {
			System.out.print(i + " ");
		}	
		
	}
	
	System.out.println();
	// divisible by 4 and 6 from 13-130/
	
	for (int i = 13; i<131; i++) {
		
		if (i%4==0 && i%6==0) {
			System.out.print(i+" ");
			
		}
	}
	
	System.out.println();
	for (int i = 24; i<131; i+=12) {
		System.out.print(i+ " ");
	}
	
	System.out.println();
	//print every character with adding a space for an entered String
	System.out.println("Enter a name");
	Scanner scan = new Scanner (System.in);
	String name = scan.nextLine();
	
	
	for (int i = 0; i <name.length(); i++ ) {
		System.out.print(name.charAt(i)+ " ");
	}
	System.out.println();
	
	// Print the letters with even indexes/
	
	// 1st way
	for (int i=0; i<name.length(); i+=2) {
		System.out.print(name.charAt(i)+ " ");
	}
	//2nd way
	System.out.println("Enter a name");
	String name2 = scan.nextLine();
	
	for (int i=0; i<name2.length(); i++) {
		if (i%2==0) {
			System.out.print(name2.charAt(i)+ " ");
		}}
	
	
	// Ebay interview question:
	// Print non-repeated characters of any given string
	System.out.println("Enter a string");
	String ebay = scan.nextLine();
	for (int i=0; i<ebay.length(); i++ ) {
		if (ebay.indexOf(ebay.charAt(i)) == ebay.lastIndexOf(ebay.charAt(i))) {
			System.out.print(ebay.charAt(i)+ " ");
		}
	}
	System.out.println();
	// Common interview question
	// ASk user to enter a string. print the string reversed order.
	
	for (int i = ebay.length()-1; i>=0; i--) {
		System.out.print(ebay.charAt(i));
	}
	
	
	
	
	
	
		
	}}


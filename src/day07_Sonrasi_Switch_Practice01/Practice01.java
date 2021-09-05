package day07_Sonrasi_Switch_Practice01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// enter 1, 2 or 3. Program writes pressed number. Otherwise "Not allowed"
		
		
		System.out.println("Please enter 1, 2 or 3");
		Scanner scan = new Scanner(System.in);
		
		byte a = scan.nextByte();
		
		switch (a) {
		
		case 1:
		System.out.println("1");
		break;
		
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
		break;
		
		default:
			System.out.println("Not allowed");
		
		}
		
		
scan.close();
	}

}

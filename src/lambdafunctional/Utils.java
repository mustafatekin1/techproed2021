package lambdafunctional;

import java.util.List;
import java.util.stream.Stream;

public class Utils {

//1. Create a method to print elements in one line with one space.
	public static void printElInOneLineWithOneSpace(Object o){
	System.out.print(o + " ");
	}

//a method to print even elements in One line with one space.	
	public static boolean checkEven (int x) {
		
		return x%2==0;
	
	}

// finding min element
	public static void minEl(List<Integer> l) {
		int minEl = Integer.MAX_VALUE;
		for (int i=0; i<l.size(); i++) {
			if (l.get(i)<minEl) 
			{
				minEl=l.get(i);
			}
		}
		System.out.println(minEl);
		//return minEl;
	}
// find max el
public static void maxEl (List<Integer>l) {
	int maxEl = Integer.MIN_VALUE;
		for (int i=0; i<l.size(); i++) {
			if(maxEl>l.get(i)) {
				maxEl = l.get(i);
			}
		
		System.out.println(maxEl);
		
		
		
		}
	
	
}
	
	
	
public static boolean greaterThanSeven(int x) {
	return x>7;
}
public static boolean greaterThanFive(double x) {
	return x>5;
}
public static double getHalf(double x) {
	return x/2;
}
public static void printList(List<Integer> l ){
	for (int i=0; i<l.size(); i++) {
		System.out.println(l.get(i));
	}
}
public static int getSquare(int x) {
	
	return x*x;
}

public static void sum(List<Integer> l) {
	Integer t = 0;
	for (int i=0; i<l.size(); i++) {
	t = l.get(i) + t;
	}
System.out.println(t);
}
public static Integer sumOfDigits(int n) {
	
	int digits = 0;
	
	do {
		digits = digits + n%10;
		n = n/10;
		
	}while (n>0);
	
	return digits;
}


}

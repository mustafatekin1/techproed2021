package lambdafunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Functional04 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(12);
		l.add(9);
		l.add(13);
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(4);	
		l.add(12);
		l.add(15);	

	System.out.println(sumOfAll(l));
	System.out.println();
	
	getSumOfAll2(l);

	getSumOfIntFrom7To100();
	
	getSumOfIntFrom7To100B();	
	
	multOfIntFrom2To11A();
	
	factorialOfAGivenNumber(5);
	
	getSumOfEvenInt(8,3);
	
	System.out.println();
	sumOfDigits (12,14);
	
	
	
	
	
	}
//1. Find the sum of all elements.
//1st way
	public static int sumOfAll(List<Integer> l) {
	Integer sum = l.stream().reduce(0, (t,u)->t+u);

return sum;
}
//2nd way
	public static void getSumOfAll2(List<Integer>l) {
		int sum = l.stream().reduce(0, Math::addExact);
	System.out.println(sum);
	}
// 2.Find the sum of integers from 7-100.	
//1st way
	public static void getSumOfIntFrom7To100()	{
	int sumFrom = IntStream.range(7, 101).reduce(0, Math::addExact);
	System.out.println(sumFrom);
}
//2nd way
	public static void getSumOfIntFrom7To100B()
	{
		int sum = IntStream.rangeClosed(7, 100).sum(); // both are inclusive
		System.out.println(sum);
	}
//3. Find multiplication of int from 2 to 11 both inclusive
	
public static void multOfIntFrom2To11A() {
	int mult = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
	System.out.println(mult);

}
	
//4. Calculate the factorial of a given number	 - Common Interview question
	public static void factorialOfAGivenNumber(int fact) {
	
	
	int mult = IntStream.rangeClosed(1, fact).reduce(1,Math::multiplyExact);
		System.out.println(mult);
		
	}
//5. Find sum of even integers between given two integers
	public static void getSumOfEvenInt(int a, int b) {
		int sum = IntStream.rangeClosed(a, b).filter(Utils::checkEven).sum();
	
		System.out.println(sum);
	}
//6. Calculate sum of digits of every integers between two integers.	
public static void sumOfDigits (int a, int b) {
	int digits = IntStream.rangeClosed(a, b).map(Utils::sumOfDigits).sum();
System.out.println(digits);
}
	
}

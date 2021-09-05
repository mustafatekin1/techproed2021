package lambdafunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Functional02 {
/* Method references:
 * Class Name :: Method Name without method paranthesis
 * eg; for length method in String class ==> String :: length
 * eg: for size method in ArrayList      ==> ArrayList :: size
 
 If Java has method we use that one. 
 If Java does not have we create a method in Utils class and use that method with the method reference.
 With this usage, functional Programming becomes perfect.
 */
	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<>();

		l.add(12);
		l.add(9);
		l.add(13);
		l.add(4);
		l.add(9);
		l.add(10);
		l.add(4);	
		l.add(12);
		l.add(15);
	
	
		printElOneLine2(l);
	System.out.println();
	
	printEvenElOneLine(l);
	
	System.out.println();
	getMinEl1(l);
	
	System.out.println();
	minEvenElementGreaterThanSeven (l);
	
	System.out.println();
	minEvenElementGreaterThanSeven2 (l);
	
	System.out.print(l +"\n");
	getHalfOfElementsGreaterThan5(l);
	
	}
//1. Create a method to print elements in one line with one space.
	public static void printElOneLine(List<Integer> l ) {
		l.stream().forEach(t-> System.out.print(t + " "));
	}
// 1. with Method reference:
	
	public static void printElOneLine2(List<Integer> l ) {
	l.stream().forEach(Utils :: printElInOneLineWithOneSpace);

	}
//2. create a method to print even elements in One line with one space.	
public static void printEvenElOneLine(List<Integer> l) {
	l.stream().distinct().filter(Utils::checkEven).forEach(Utils::printElInOneLineWithOneSpace);
}
	
//7. Find the min value from the list
public static void getMinEl1(List<Integer> l) {
System.out.println(l.stream().distinct().reduce(Integer.MAX_VALUE, Math::min));
//

}
//8.Find min value greater than 7 and even.
public static void minEvenElementGreaterThanSeven (List<Integer> l) {
Integer el = l.stream().distinct().filter(t->t>7&&t%2==0).reduce(Integer.MAX_VALUE, Math::min);
System.out.println("With Lambda...min value greater than 7 and even: "+ el);
}
// lets make all of the lambda expressions to method references:
public static void minEvenElementGreaterThanSeven2 (List<Integer> l) {
Integer el = l.stream().distinct().filter(Utils::checkEven).
filter(Utils::greaterThanSeven).reduce(Integer.MAX_VALUE, Math::min);
System.out.println("With method references...min value greater than 7 and even: "+ el);
}
//10. Find half of the elements greater than 5 and print as a list in reversed order
// to make them more readable click enter after every dot:
public static void getHalfOfElementsGreaterThan5(List<Integer> l) {
List<Double> list = l.
					stream().
					distinct().
					filter(Utils::greaterThanFive).
					map(Utils::getHalf).
					sorted(Comparator.reverseOrder()).
					collect(Collectors.toList());

					System.out.println(list);
}



}

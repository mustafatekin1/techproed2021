package lambdafunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional01 {
/* Structured programming is the one we have been executing in core Java
 * Functional programming is using Java methods to accomplish the tasks. 
 */
	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<>();
	
	l.add(12);
	l.add(9);
	l.add(131);
	l.add(14);
	l.add(9);
	l.add(10);
	l.add(14);	
	l.add(12);
	l.add(8);	
	
	productOfCubesOfDistinctEvens(l);
	System.out.println();
	
	printMax(l);
	System.out.println();
	
	printMin(l);
	System.out.println();
	printMax2ndWay(l);
	
	System.out.println();
	printMin2ndWay(l);
	
	System.out.println();
	minValue(l);
	
	System.out.println();
	minValue2ndWay(l);
	
	System.out.println();
	minValue3rdWay(l);
	
	System.out.println(l);
	halfOfElGreaterThan5(l);
	}
//Task 6: Create a method to calculate the product of the cubes of distinct even elements.
public static void productOfCubesOfDistinctEvens(List<Integer> l) {

	Integer multiply = l.stream().distinct().filter(t-> t%2==0).map(t->t*t*t).reduce(1, (t,u)-> t*u);
	System.out.println("The product ot multiplication ... " + multiply);// t is first 1, then the result
	// We use reduce() method when the number of elements are reduced.  // u is always from the stream 
	
}


// 7: method to find the max value of the list
//1st way: 
public static void printMax(List<Integer> l) {
	Integer max =  l.stream().reduce(Integer.MIN_VALUE, (t,u)->t>u?t:u);
	System.out.println(max);
}
//2nd way
public static void printMax2ndWay(List<Integer> l) {
	Integer max2ndWay =  l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
	System.out.println(max2ndWay);

}


//8: method to find the min value of the list
//1st way
public static void printMin(List<Integer> l) {
	Integer min = l.stream().reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u);
	System.out.println("min of the elements: " + min );
}
//2nd way with sorted method
public static void printMin2ndWay(List<Integer> l ) {
	Integer min2ndWay = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)-> u);
	System.out.println(min2ndWay);
}

// 9: method find min value greater than 7 and even.
//1st way:
public static void minValue(List<Integer> l) {
	Integer minValue = l.stream().distinct().filter(t-> t%2==0&&t>7).reduce(Integer.MAX_VALUE, (t,u)->t>u?u:t);
	System.out.println("Min value even and greater than 7: " + minValue);
}
//2nd way:
public static void minValue2ndWay(List<Integer> l) {
	Integer minValue2 = l.stream().distinct().filter(t->t>7&&t%2==0).
	sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
	System.out.println("2nd way for min even greater than 7 =" + minValue2);
}
//3rd way similar to 2nd way
public static void minValue3rdWay(List<Integer> l) {
	Integer minValue3 = l.stream().distinct().filter(t->t%2==0&&t>7).sorted().findFirst().get();
	System.out.println(minValue3);
}

//10. Create a method to find the half of the elements which are distinct and greater than 5 in reversed order

public static void halfOfElGreaterThan5(List<Integer> l) {
 List<Double> resultList = l.stream().distinct().filter(t-> t>5).map(t-> t/2.0).
 sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(resultList);
}


}


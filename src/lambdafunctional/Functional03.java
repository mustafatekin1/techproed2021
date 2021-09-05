package lambdafunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional03 {

	public static void main(String[] args) {
		// Lets deal with functional programming in String
		
List<String> l = new ArrayList<>();		
l.add("Ali");
l.add("aise");
l.add("Xmark");
l.add("Amanda");
l.add("XChristopher");
l.add("Jackson");
l.add("Mary");
l.add("Alberto");
l.add("XTucker");
l.add("Ben");

System.out.println(l);
System.out.println();

printUppercase1(l);
System.out.println();

printUppercase2(l);
System.out.println();

printSortByLength(l);
System.out.println();

printSortByLastChar(l);
System.out.println();

printSortedByLengthAndFirstChar(l);

System.out.println();
printSortedByLengthThenFirstChar(l);

System.out.println();
//removeElementsGreaterThan5(l);

removeIfStartsWithAaEndsWithNn(l);
	
System.out.println();
printSquaresOfLengthsReversed(l);

System.out.println();
checkLengthsLessTwelve(l);

System.out.println();
checkInitalsNotX(l);

System.out.println();
checkInitalsNotX2(l);


System.out.println();
checkInitalsNotX3(l);

System.out.println();
checkLastCharRr (l);

}

//1. print all list elements in uppercase
//1st way
	public static void printUppercase1(List<String> l)	{
l.stream().map(String::toUpperCase).forEach(Utils::printElInOneLineWithOneSpace);
}
//2nd way
	public static void printUppercase2(List<String> l)	{
l.replaceAll(String::toUpperCase);
System.out.println(l);	
	}
// 2. (Important) print the elements sorting according to length.
	public static void printSortByLength(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);;
	}
// Sort distinct elements according to last characters
	public static void printSortByLastChar(List<String> l) {
		l.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
		forEach(System.out::println);
	}
// Sort distinct according to length "and"  first char
	public static void printSortedByLengthAndFirstChar(List<String> l) {
l.stream().distinct().sorted(Comparator.comparing(String::length)).
sorted(Comparator.comparing(t->t.charAt(0))).forEach(System.out::println);
	}
// Sort distinct according to length "then"  first char !!! Please note that this is different
	public static void printSortedByLengthThenFirstChar(List<String> l) {
l.stream().distinct().sorted(Comparator.comparing(String::length).
		thenComparing(t->t.charAt(0))).forEach(System.out::println);
//l.stream().filter(t->t.)
	}
//remove the elements if the length is greater than 5
//public static void removeElementsGreaterThan5(List<String> l )	{
//l.removeIf(t->t.length()>5); 
//System.out.println(l);
//}

// Remove the elements if they start with A, a ends with n or N.
public static void removeIfStartsWithAaEndsWithNn(List<String> l) {
l.removeIf(t->t.charAt(0)=='A' || t.charAt(t.length()-1)=='N' || t.charAt(0)=='a'
|| t.charAt(t.length()-1)=='n');	
System.out.println(l);
}

// 7. Take the square of the length of every element print them distictly in reversed order
public static void printSquaresOfLengthsReversed(List<String> l) {
	l.stream().map(String::length).map(Utils::getSquare).distinct().
			sorted(Comparator.reverseOrder()).forEach(Utils::printElInOneLineWithOneSpace);;
}

//8. Check if the element lengths are less than 12.
public static void checkLengthsLessTwelve(List<String> l) {
	boolean twelve = l.stream().allMatch(t->t.length()<12);
	System.out.println(twelve);	
}

//check if any element initial is "Not 'X' "
//1st way: Herhangi biri ilk harfi X degil ise True; tamami X ise false 
public static void checkInitalsNotX(List<String>l) {
boolean check = l.stream().anyMatch(t->t.charAt(0)!='X');
	System.out.println(check);
}
//2nd way: Herhangi biri ilk harfi X  degil ise True; tamami X ise false 
public static void checkInitalsNotX2(List<String>l) {
boolean check = l.stream().anyMatch(t->!t.startsWith("X"));
	System.out.println(check);
}
//Asil cevap: Hicbir eleman X ile baslamaz ise true// Herhangi biri ilk harfi X ise False
public static void checkInitalsNotX3(List<String>l) {
boolean check = l.stream().noneMatch(t->t.startsWith("X"));
	System.out.println(check);
}

//10. Check if any element ends with 'r' or 'R'
//Herhangi biri R veya r ile bitiyorsa true aksi durumda (hicbiri r veya R ile bitmiyorsa false)
public static void checkLastCharRr (List<String>l) {
	boolean check = l.stream().anyMatch(t->t.endsWith("R")|| t.endsWith("r"));
	System.out.println(check);
}


}

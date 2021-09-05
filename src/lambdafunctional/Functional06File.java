package lambdafunctional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Functional06File {

	public static void main(String[] args) throws IOException {
//1. How to read text from file with methods (with functional programming)

Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).forEach(System.out::println);
		 
System.out.println("=============");
	
//2. How to convert all characters in the file to  upper case.	
	
Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);	
	
System.out.println("=============");
	
//3. How to check a specific word (eg: "Lambda") exists in the text.
	
	boolean check = Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
	System.out.println(check);
	System.out.println("=============");	
//4. ***** Print distinct words in the file ***** difficult
	
System.out.println(Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).map(t->t.split(" ")).// split returns array!!!
	flatMap(Arrays::stream).distinct().collect(Collectors.toList())); 		// flatMap changes arrays to stream.
									// with collectors we can print them as a list.
							// We can print them each with forEach also as seperate lines also.

System.out.println("=============");
Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).map(t->t.split(" ")).// split returns array!!!
flatMap(Arrays::stream).distinct().forEach(System.out::println); 

System.out.println("=============");
//5. Get the words which end with "e" and print them on the console.
//1st way
Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).
filter(t->t.charAt((t.length())-1)=='e').forEach(System.out::println); 
System.out.println("=============");

//2nd way: we can use endsWith method also - Since the method requires String we use "e"
Files.lines(Paths.get("src/lambdafunctional/LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).
filter(t->t.endsWith("e")).forEach(System.out::println); 
					
	}

	
	
	
}

package lambdafunctional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional05 {

	public static void main(String[] args) {
	
		Course courseTurkishDay = new Course ("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course ("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course ("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course ("Winter", "English Night", 93, 144);
		

		
		List <Course> courseLists = new ArrayList<>();
		
		courseLists.add(courseTurkishDay);
		courseLists.add(courseTurkishNight);
		courseLists.add(courseEnglishDay);
		courseLists.add(courseEnglishNight);
		
		System.out.println(courseLists);
	
		
		System.out.println();
		
		System.out.println(checkAvgScoreMoreThan91A (courseLists));
		
		
		System.out.println(checkContainsTurkish (courseLists));
		
		getCourseWithHighestAvgScore(courseLists);
		getCourseWithLowestAvgScore(courseLists);
		
		System.out.println();
		System.out.println(ascOrderSkipFirstAndSecond(courseLists));
		System.out.println(ascOrderWithAvgScore(courseLists));
		
		System.out.println(ascOrderGet3rdListElement(courseLists));
		
		
	}

//1. Check if all average scores are grater than 91.	
	public static boolean checkAvgScoreMoreThan91A (List<Course> courseLists) {
		return courseLists.stream().allMatch(t->t.getAvgScore()>91);	
	}
// 2. Check if at least one course has "Turkish" word in the course name.	
public static boolean checkContainsTurkish (List <Course> courseLists)	{
	return courseLists.stream().anyMatch(t->t.getCourse().contains("Turkish"));
}
// 3. Print the course name whose avg scrore is highest.
public static void getCourseWithHighestAvgScore(List<Course> courseLists) {
String m = courseLists.stream().sorted(Comparator.comparing(Course::getAvgScore).//we get ascending order of courses
			reversed()).findFirst().get().getCourse(); // we sort reversed then get the course
System.out.println(m);								// with highest score then we get course name with "getCourse"
}
//3b. Get course name with lowest Avg score
public static void getCourseWithLowestAvgScore(List<Course> courseLists) {
String n = courseLists.stream().sorted(Comparator.comparing(Course::getAvgScore)).findFirst().get().getCourse();
System.out.println(n);}
//4a. Sort with avg score in ascending order and print as a list
public static List<Course> ascOrderWithAvgScore(List<Course> courseLists){
	return courseLists.stream().sorted(Comparator.comparing(Course::getAvgScore)).collect(Collectors.toList());
}

//4b. Sort list elements according to avg score in ascending order then skip the first 2 elements
public static List<Course> ascOrderSkipFirstAndSecond(List<Course> courseLists) {
	return courseLists.stream().sorted(Comparator.comparing(Course::getAvgScore)).skip(2).collect(Collectors.toList());
}

//5.Sort list elements according to avg score in ascending order then print 3rd one
public static List<Course> ascOrderGet3rdListElement(List<Course> courseLists){
	return courseLists.stream().sorted(Comparator.comparing(Course::getAvgScore)).skip(2).limit(3).collect(Collectors.toList());
}




}

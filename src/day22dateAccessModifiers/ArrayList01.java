package day22dateAccessModifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class ArrayList01 {

	public static void main(String[] args) {
		// How to create a date object
		// variable+method=object
		
		LocalDate currentDate1 = LocalDate.now();// alittle different format-memorize it :)
		System.out.println(currentDate1);
		System.out.println(currentDate1.plusDays(8));
		System.out.println(currentDate1.plusMonths(1));
		System.out.println(currentDate1.plusYears(-10));
		System.out.println(currentDate1.minusYears(10));
		
		
		
		System.out.println(currentDate1.plusDays(10).plusMonths(10).plusYears(10));
		
		System.out.println(currentDate1.getMonth());
		System.out.println(currentDate1.getMonthValue());
		
		System.out.println(currentDate1.getYear());
		System.out.println(currentDate1.getDayOfMonth());
		System.out.println(currentDate1.getDayOfWeek());
		
		
		LocalDate date = LocalDate.of(1980, 01, 21);
		System.out.println(date);
		
		System.out.println(currentDate1.isAfter(date)); 
		
		LocalDate today = LocalDate.of(2021, 7, 18);
		System.out.println(today.equals(currentDate1));
		System.out.println(today.isBefore(currentDate1));
		System.out.println(today.isEqual(date));
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2) ;
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd//MMM//y");
	/* M- Months (m is minutes!)
	 	*  M	: the number of the month as 1, 2, ...
	 	*  MM 	: the number of the month as 01, 02...
	 	*  MMM 	: First 3 characters
	 	* MMMM 	: Full name of the month	
	 */
	
		System.out.println(myFormat.format(date));// Jan
		
		LocalDateTime time2 = LocalDateTime.now();
		System.out.println(time2);
		
		
		LocalTime time3 = LocalTime.now();
		System.out.println(time3);//20:05:33... so Lets format this. 
		DateTimeFormatter format3	= DateTimeFormatter.ofPattern("HH//mm");
		System.out.println(format3.format(time3));
		
		DateTimeFormatter format4 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(format4.format(time3));
	
		
		/*hh: am-pm
		 *HH: 24-hour format
		 *mm: minutes 
		 *MM: is for dates so it gives error. 
		 */
		
// Task: How to find the difference of two dates:
	LocalDate today2 = LocalDate.now();
	LocalDate date2 = LocalDate.of(1995, 5, 25);
	myFormat.format(today2);
	myFormat.format(date2);
	
	
		
	Period ageSon = Period.between(today2, date2)	;
		System.out.println(ageSon);//P-26Y-1M-25D
	
	LocalDate dateSon = LocalDate.of(2011, 7, 11);	
	Period ageSon2 = Period.between(dateSon, today2);//P10Y8D
	System.out.println(ageSon2);
	
	System.out.println(Period.between(today2, date2).getYears());
	System.out.println(Period.between(date2, today2).getYears());	
	}



}

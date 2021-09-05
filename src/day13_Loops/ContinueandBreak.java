package day13_Loops;

public class ContinueandBreak {

	public static void main(String[] args) {
		// continue is used to skip any value.
		// break is used to break the loop.
		// eg: Print all integers 1-11 except 7 and 9.
		
		
		for (int i=1; i<12; i++)
		{
			
			if (i==7||i==9) {continue;}
			System.out.print(i+" ");
		;	
		}
		
		
	}

}

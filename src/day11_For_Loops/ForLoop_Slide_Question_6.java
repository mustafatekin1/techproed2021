package day11_For_Loops;

public class ForLoop_Slide_Question_6 {

	public static void main(String[] args) {
		// print counting numbers less than 200 and divisible by 5
		
		for (int i=1; i<201; i++) {
			if (i%5==0) {System.out.print(i+ " ");
			}
		}
			
		// Second solution
		System.out.println("\nSecond solution");
		for (int i=5; i<201; i+=5) {
			System.out.print(i+" ");
		}

	}

}

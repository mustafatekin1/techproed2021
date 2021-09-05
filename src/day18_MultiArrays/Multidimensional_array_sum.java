package day18_MultiArrays;

public class Multidimensional_array_sum {

	public static void main(String[] args) {
		//  {{2,3},{12,13,14}   } find the sum of the elements

		int arr [][] = {{2,3},{12,13,14} };
		System.out.println(arr[0].length);//2
		System.out.println(arr[1].length);//3
		
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			int sumInner = 0;
			for (int j=0; j<arr [i].length; j++) {
				sumInner = sumInner + arr[i][j];
			
			System.out.println("inner sum= " + sumInner);
			};
			sum = sum + sumInner;	
			System.out.println("General Sum = "+ sum);	
			
		}
		
		System.out.println(sum);
		
		
		
	}

}

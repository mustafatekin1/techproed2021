package day18_MultiArrays;

public class MultiDimensional02 {

	public static void main(String[] args) {
		// Find sum of the elements whose indexes are the same in arr1 and arr2
		int arr1 [][] = {{1,2}, {3,4,5},{6}};
		int arr2 [][] = {{7,8,9},{10,11},{12}};
		
		int sum = 0;
		int outerlen = arr1.length<arr2.length?arr1.length:arr2.length;
		for (int i=0; i<outerlen; i++) {
	     int sumInner = 0;
		 int innerlen = arr1 [i].length<arr2[i].length?arr1 [i].length:arr2[i].length;
			
			for (int k=0; k<innerlen; k++) {
				
					sumInner = sumInner + arr1 [i][k] + arr2 [i][k];
					System.out.println("inner sum+ " + sumInner);
					
				}
			sum = sum + sumInner;
			
			System.out.println("General sum= " + sum);
			}
			
			
			
		}
		
		
		
	}



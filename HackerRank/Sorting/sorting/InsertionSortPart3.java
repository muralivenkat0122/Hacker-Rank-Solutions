/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class InsertionSortPart3 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		 int n = ar.length;  
		 int count = 0;
	        for (int j = 1; j < n; j++) {  
	            int key = ar[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( ar [i] > key ) ) {  
	                ar [i+1] = ar [i];  
	                i--;  
	                count++;
	            }  
	            ar[i+1] = key;  
	        }  
		System.out.println(count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}


}

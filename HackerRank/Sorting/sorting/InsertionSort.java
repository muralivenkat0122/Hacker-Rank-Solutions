/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class InsertionSort {

	public static long insertSort(int[] ar) {
		long count = 0;
		// Compute the required count
		//int n = ar.length;
		for (int j = 1; j < ar.length; j++) {
			int key = ar[j];
			//int i = j - 1;
			while ((j-1 > -1) && (ar[j-1] > key)) {
				ar[j] = ar[j-1];
				j--;
				count++;
			}
			ar[j] = key;
		}
		return count;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			for (int j = 0; j < n; j++) {
				ar[j] = in.nextInt();
				// System.err.println(ar[j]);
			}
			//long c = insertSort(ar);
			System.out.println(insertSort(ar));

		}
		in.close();
	}
}

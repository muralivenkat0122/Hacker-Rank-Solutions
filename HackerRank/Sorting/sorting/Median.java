/*
*In the Quicksort challenges, you sorted an entire array. Sometimes, you just need specific information about a list of numbers, and doing a full sort would be unnecessary. Can you figure out a way to use your partition code to find the median in an array?

Challenge 
Given a list of numbers, can you find the median?

Input Format 
There will be two lines of input:

 - the size of the array
 -  numbers that makes up the array
Output Format 
Output one integer, the median.

Constraints

 is odd
Sample Input

7
0 1 2 4 6 5 3
Sample Output

3
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class Median {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);
	

		int med = 0;
		if((arr.length / 2) != 0){
			med = arr[(arr.length / 2)];
		}else if((arr.length / 2) == 0){
			med = arr[(arr.length / 2)] + arr[(arr.length / 2) + 1];
		}
		System.out.println(med);
		scan.close();
	}

}

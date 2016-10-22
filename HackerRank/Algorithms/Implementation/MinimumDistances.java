/**
 * Consider an array of n integers, A = [a0, a1, a2,...., an-1]. The distance 
 * between two indices, i and j, is denoted by di,j = |i - j|.
===============================================================================

Given A, find the minimum di,j such that ai = aj and i != j. In other words, 
find the minimum distance between any pair of equal elements in the array. If 
no such value exists, print -1.

Note: |a| denotes the absolute value of a.
===============================================================================

Input Format

	The first line contains an integer, n, denoting the size of array A. 
	The second line contains n space-separated integers describing the 
	respective elements in array A.
===============================================================================

Constraints

	1 <= n <= 10^3
	1 <= ai <= 10^5
===============================================================================
	
Output Format

	Print a single integer denoting the minimum di,j in A; if no such value 
	exists, print -1.
===============================================================================

Sample Input

6
7 1 3 4 1 7
--------------------------------------------------------------------------------

Sample Output

3
---------------------------------------------------------------------------------

Explanation 

Here, we have two options:

 a1	and a4 are both 1, so d1,4 = |1 - 4| = 3.
 a0 and a5 are both 7, so d0,5 = |0 - 5| = 5.
 
The answer is min(3,5) = 3.
===============================================================================

 */
package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class MinimumDistances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}

		int minimumDistance = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j] && i != j) {
					minimumDistance = Math.abs(i - j);
					arr.add(minimumDistance);
				}
			}
		}
		Collections.sort(arr);
		
		
		
		if (!arr.isEmpty() && arr.get(0) > 0) {
			System.out.println(arr.get(0));
		}else{
			System.out.println("-1");
		}
		in.close();
	}

}

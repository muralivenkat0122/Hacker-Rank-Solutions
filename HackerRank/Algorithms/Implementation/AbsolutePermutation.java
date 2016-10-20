/**
 * We define P to be a permutation of the first N natural numbers in the range 
 * [1,N]. Let posi denote the position of i in permutation P (please use 
 * 1-based indexing).

P is considered to be an absolute permutation if abs(posi - i) = K holds true 
for every i belongs [1,N].

Given N and K, print the lexicographically smallest absolute permutation, P; if 
no absolute permutation exists, print -1.
================================================================================

Input Format

	The first line of input contains a single integer, T, denoting the number 
	of test cases. 
	Each of the T subsequent lines contains 2 space-separated integers 
	describing the respective N and K values for a test case.
================================================================================

Constraints

	1 <= T <= 10
	1 <= N <= 10^5
	0 <= K < N
================================================================================

Output Format

	On a new line for each test case, print the lexicographically smallest 
	absolute permutation; if no absolute permutation exists, print -1.
================================================================================

Sample Input

3
2 1
3 0
3 2
--------------------------------------------------------------------------------

Sample Output

2 1
1 2 3
-1
--------------------------------------------------------------------------------

Explanation

Test Case 0:

			Position		1		2
			Permutation		2		1
	Absolute Difference		1		1
--------------------------------------------------------------------------------

Test Case 1:

			Position		1		2		3
			Permutation		1		2		3
	Absolute Difference		0		0		0
--------------------------------------------------------------------------------

Test Case 2: 

No absolute permutation exists, so we print -1 on a new line.
================================================================================
 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class AbsolutePermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] pos = new int[n];

			if (k == 0) {
				for (int i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}
			} else if ((k <= n / 2) && (n % k == 0) && ((n / k) % 2 == 0)) {
				for (int i = 0; i < n; i++) {
					if (((i / k) % 2) == 0) {
						pos[i] = Math.abs(i + k + 1);
					} else {
						pos[i] = Math.abs(i - k + 1);
					}
				}
				for (int i = 0; i < n; i++) {
					System.out.print(pos[i] + " ");
				}
			} else {
				System.out.print("-1");
			}
			System.out.println();
		}
		in.close();
	}

}

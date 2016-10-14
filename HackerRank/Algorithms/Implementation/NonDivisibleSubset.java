/**
 * Given a set, S, of n distinct integers, print the size of a maximal subset, S', of S where the sum of any 
 * 2 numbers in S' are not evenly divisible by k.
==============================================================================================================

Input Format

The first line contains 2 space-separated integers, n and k, respectively. 
The second line contains n space-separated integers (we'll refer to the ith value as ai) describing the 
unique values of the set.
==============================================================================================================

Constraints

	1 <= n <= 10^5
	1 <= k <= 100
	1 <= ai <= 10^9
	All of the given numbers are distinct.
==============================================================================================================

Output Format

Print the size of the largest possible subset (S').
==============================================================================================================

Sample Input

4 3
1 7 2 4
--------------------------------------------------------------------------------------------------------------

Sample Output

3
--------------------------------------------------------------------------------------------------------------

Explanation

The largest possible subset of integers is S'={1,7,4}, because no two integers will have a sum that is 
evenly divisible by k = 3:
 
 	1 + 7 = 8; and 8 is not divisible by 3.
	1 + 4 = 5; and 5 is not divisible by 3.
 	4 + 7 = 11; and 11 is not divisible by 3.

The number 2 cannot be included in our subset because it will produce an integer that is evenly divisible 
by k = 3 when summed with any of the other integers in our set:

	1 + 2 = 3, and 3/3 = 1(remainder 0).
	4 + 2 = 6, and 6/3 = 2(remainder 0).
	7 + 2 = 9, and 9/3 = 3(remainder 0).		

Thus, we print the length of S' on a new line, which is 3.
==============================================================================================================

 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class NonDivisibleSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[] rem = new int[k];
		for (int i = 0; i < n; i++) {
			rem[arr[i] % k] += 1;
		}
		
		int ans = 0;
		if (rem[0] != 0) {
			ans += 1;
		}
		
		if (k % 2 == 0 && rem[k / 2] != 0) {
			ans += 1;
			rem[k / 2] = 0;
		}
		for (int i = 1; i <= k / 2; i++) {
			ans += (rem[i] > rem[k - i]) ? rem[i] : rem[k - i];
		}
		System.out.println(ans);

		scan.close();
	}

}

/**
 * Watson gives two integers (A and B) to Sherlock and asks if he can count 
 * the number of square integers between A and B (both inclusive).
==============================================================================

Note: A square integer is an integer which is the square of any integer. For
example, 1, 4, 9, and 16 are some of the square integers as they are squares 
of 1, 2, 3, and 4, respectively.
==============================================================================

Input Format

	1. The first line contains T, the number of test cases. T test cases follow, 
		each in a new line. 
	2. Each test case contains two space-separated integers denoting A and B.
==============================================================================

Constraints

	1 <= T <= 100
	1 <= A <= B <= 10^9
==============================================================================

Output Format

	For each test case, print the required answer in a new line.
==============================================================================

Sample Input

	2
	3 9
	17 24
------------------------------------------------------------------------------

Sample Output

	2
	0
------------------------------------------------------------------------------

Explanation

	Test Case #00: In range [3,9], 3 and 4 are the two square numbers. 
	Test Case #01: In range [17, 24], there are no square numbers.
==============================================================================

 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class SherlockAndSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int result = 0;
			int min = in.nextInt();
			int max = in.nextInt();
			result = (int)(Math.floor(Math.sqrt(max))) - (int)(Math.ceil(Math.sqrt(min))) + 1;
			System.out.println(result);
		}
		in.close();
	}

}

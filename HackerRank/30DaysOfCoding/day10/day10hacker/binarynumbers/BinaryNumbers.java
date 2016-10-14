/**
 * Objective 

Today, we're working with binary numbers. Check out the Tutorial tab for learning 
materials and an instructional video!
===========================================================================================

Task 

Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10
integer denoting the maximum number of consecutive 1's in n's binary representation.
===========================================================================================

Input Format

A single integer, n.
===========================================================================================

Constraints
	
	1 <= n <= 10^6
===========================================================================================

Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the 
binary representation of n.
===========================================================================================

Sample Input 1

5
-------------------------------------------------------------------------------------------

Sample Output 1

1
===========================================================================================

Sample Input 2

13
-------------------------------------------------------------------------------------------

Sample Output 2

2
===========================================================================================

Explanation

Sample Case 1: 

The binary representation of  is , so the maximum number of consecutive 's is .
-------------------------------------------------------------------------------------------

Sample Case 2: 

The binary representation of  is , so the maximum number of consecutive 's is .
===========================================================================================

Code Explanation:

rem=n%2 checks the state of the bit in the LSB (bit 0). n=n/2 is equivalent to logical bit 
shift right.
This code is equivalent to the use of left/right bit-shift operators in C++!
===========================================================================================
 *
 */
package day10hacker.binarynumbers;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class BinaryNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rem = 0, s = 0, count = 0;
		
		while (n > 0) {
			rem = n % 2;
			n = n / 2;
			if (rem == 1) {
				s++;
				if (s >= count)
					count = s;
			} else {
				s = 0;
			}
		}

		System.out.println(count);

		in.close();
	}

}

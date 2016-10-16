/**
 * Objective 
 
Today, we're building on our knowledge of Arrays by adding another dimension. Check out 
the Tutorial tab for learning materials and an instructional video!
==========================================================================================

Context 

Given a 6 * 6 2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices falling in this pattern 
in A's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
===========================================================================================

Task 

Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass 
sum.
===========================================================================================

Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 
2D Array A; every value in A will be in the inclusive range of -9 to 9.
===========================================================================================

Constraints

	-9 <= A[i][j] <= 9
	0 <= i, j <= 5
===========================================================================================	

Output Format

Print the largest (maximum) hourglass sum found in A.
===========================================================================================

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
-------------------------------------------------------------------------------------------

Sample Output

19
-------------------------------------------------------------------------------------------

Explanation

A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4
===========================================================================================
 */
package day11hacker.twoDarrays;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class TwoDArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int maxHourSum = -64;
		int hourSum;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				hourSum = arr[i + 1][j + 1];
				for (int k = 0; k < 3; k++) {
					hourSum = hourSum + arr[i][j + k] + arr[i+2][j+k];
				}
				if(hourSum > maxHourSum){
					maxHourSum = hourSum;
				}
			}
		}

		System.out.println(maxHourSum);
		scan.close();
	}

}

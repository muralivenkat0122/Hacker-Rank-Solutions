/**
 * Bob has a strange counter. At the first second, t = 1, it displays the number 3. At each subsequent 
 * second, the number displayed by the counter decrements by 1.

The counter counts down in cycles. In the second after the counter counts down to 1, the number becomes
2*(times) the initial number for that countdown cycle and then continues counting down from the new 
initial number in a new cycle. The diagram below shows the counter values for each time t in the first 
three cycles:

				time value			time value			time value
				  1	  3				  4	   6			  10   12
				  2   2				  5	   5			  11   11
				  3	  1				  6    4	  	   	  12   10
				  					  7	   3			  13    9
				  					  8    2	  	 	  14	8
				  					  9    1			  15 	7
				  					  					 ...   ...
				  					  					  21	1
	
Given a time, t, find and print the value displayed by the counter at time t.
==========================================================================================================

Input Format

A single integer denoting the value of t.
==========================================================================================================

Constraints

	1 <= t <= 10^12
==========================================================================================================

Subtask
	
 	1 <= t <= 10^5 for 60% of the maximum score.
==========================================================================================================

Output Format

Print the value displayed by the strange counter at the given time t.
==========================================================================================================

Sample Input

4
----------------------------------------------------------------------------------------------------------

Sample Output

6
----------------------------------------------------------------------------------------------------------

Explanation

Time t = 4 marks the beginning of the second cycle in which the counter displays a number that is double 
the initial number displayed at the beginning of the previous cycle (i.e., 2 x 3 = 6). This is also shown 
in the diagram in the Problem Statement above.
==========================================================================================================
 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class StrangeCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Long t = in.nextLong();
		Long value = (long) 3;

		while (t > value) {
			t -= value;
			value *= 2;
		}
		System.out.println(value - t + 1);

		/*
		 * SECOND Solution 
		 * Long value = (long) 2; 
		 * while(3 * (n -1) < t){ 
		 * 			n *= 2; 
		 * }
		 * System.out.println(3 * (n-1) - t + 1);
		 */

		in.close();
	}

}

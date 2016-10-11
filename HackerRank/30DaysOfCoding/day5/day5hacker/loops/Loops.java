/**
Objective 
In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to
learn more.

Task 
Given an integer, n, print its first 10 multiples. Each multiple  n x i(where 1 <= i <= 10) should be printed on a new line 
in the form: n x i = result.

Input Format

A single integer, n.

Constraints
2 <= n <= 20

Output Format

Print  lines of output; each line  i(where 1 <= i <= 10) contains the  of  in the form: 
n x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 * 
 */
package day5hacker.loops;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int i = 1;
	        while(i <= 10){
	            int result = n * i;
	            System.out.println(n + " x " + i + " = " +  result);
	            i++;
	        }
			in.close();
	}

}

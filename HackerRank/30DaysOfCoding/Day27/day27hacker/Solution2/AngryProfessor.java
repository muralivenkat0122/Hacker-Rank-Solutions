/**
 * A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, 
 * he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.
=============================================================================================================

Input Format

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the 
class) and K (the cancelation threshold). The second line contains N space-separated integers (a1,a2,a3,....,an) 
describing the arrival times for each student.

Note: Non-positive arrival times (ai <= 0) indicate the student arrived early or on time; positive arrival 
times (ai > 0) indicate the student arrived ai minutes late.
==============================================================================================================

Constraints

	1 <= T <= 10
	1 <= N <= 1000
	1 <= K <= N
	-100 <= ai <= 100, where i belongs [1, N]
==============================================================================================================

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

Note 
If a student arrives exactly on time (ai = 0), the student is considered to have entered before the class 
started.
==============================================================================================================

Sample Input

2
4 3
-1 -3 4 2
4 2
0 -1 2 1
-------------------------------------------------------------------------------------------------------------

Sample Output

YES
NO
-------------------------------------------------------------------------------------------------------------

Explanation

For the first test case, K = 3. The professor wants at least 3 students in attendance, but only 2 have 
arrived on time (-3 and -1). Thus, the class is canceled.

For the second test case, . The professor wants at least  students in attendance, and there are  who have 
arrived on time ( and ). Thus, the class is not canceled.
==============================================================================================================
 */
package day27hacker.Testing;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class AngryProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t = 5;

		Students s = new Students();
		s.getCount(4, 3,new int[] {-1, 0, 4, 2});
		s.getCount(4, 2,new int[] {0, -1, 2, 1});
		s.getCount(3, 3,new int[] {-1, 0, 1});
		s.getCount(6, 1,new int[] {-1, 0, 1, -1, 2, 3});
		s.getCount(7, 3,new int[] {-1, 0, 1, 2, 3, 4, 5});
		s.getCount(5, 3,new int[] {-1, 90, 999, 100,0});

		
	}

}

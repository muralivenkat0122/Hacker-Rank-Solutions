/**
 * Two people are playing Nimble! The rules of the game are:

The game is played on a line of n squares, indexed from 0 to n-1. Each 
square i (where 0 <= i < n) contains ci coins. 

		0(0) 1(2) 2(3) 3(0) 4(6) ---- number in brackets is number of coins
	
	The players move in alternating turns. During each move, the current 
	player must remove exactly 1 coin from square i and move it to square j 
	if and only if 0 <= j < i.
	The game ends when all coins are in square 0 and nobody can make a move. 
	The first player to have no available move loses the game.
=================================================================================

Given the value of n and the number of coins in each square, determine 
whether the person who wins the game is the first or second person to move. 
Assume both players move optimally.
=================================================================================

Input Format

	The first line contains an integer, T, denoting the number of test cases. 
	Each of the 2T subsequent lines defines a test case. Each test case is 
	described over the following two lines:

	1. An integer, n, denoting the number of squares.
	2. n space-separated integers, c0, c1, c2,...., cn-1, where each ci 
	describes the number of coins at square i.
=================================================================================
	
Constraints

	1 <= T <= 10^4
	1 <= n <= 100
	0 <= ci <= 10^9
=================================================================================

Output Format

	For each test case, print the name of the winner on a new line (i.e., 
	either First or Second).
=================================================================================

Sample Input

	2
	5
	0 2 3 0 6
	4
	0 0 0 0
----------------------------------------------------------------------------------

Sample Output

	First
	Second
=================================================================================

 */
package gametheory;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class Nimble {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t-- > 0) {
	            int n = in.nextInt();
	            int r = 0;
	            for (int i = 0; i < n; i++) 
	                if (in.nextInt() % 2 == 1)
	                    r ^= i;
	            if (r == 0)
	                System.out.println("Second");
	            else
	                System.out.println("First");
	        }
	        in.close();
	    }

}

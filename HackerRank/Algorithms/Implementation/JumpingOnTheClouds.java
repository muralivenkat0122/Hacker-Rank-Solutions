/**
 * Emma is playing a new mobile game involving n clouds numbered from 0 to n-1. A player 
 * initially starts out on cloud c0, and they must jump to cloud cN-1. In each step, she 
 * can jump from any cloud i to cloud i+1 or cloud i+2.

There are two types of clouds, ordinary clouds and thunderclouds. The game ends if Emma 
jumps onto a thundercloud, but if she reaches the last cloud (i.e.,cN-1 ), she wins the 
game!

	(4) (6) {5} {2} (3) (1) (0)

Can you find the minimum number of jumps Emma must make to win the game? It is guaranteed 
that clouds c0 and cN-1 are ordinary-clouds and it is always possible to win the game.
===========================================================================================

Input Format

The first line contains an integer, n (the total number of clouds). 
The second line contains n space-separated binary integers describing clouds c0,c1,..,cN-1.

If ci = 0, the ith cloud is an ordinary cloud.
If ci = 1, the ith cloud is a thundercloud.
============================================================================================

Constraints

	2 <= N <= 100
	ci belongs {0,1}
	c0 = cN-1 = 0
===========================================================================================

Output Format

Print the minimum number of jumps needed to win the game.
===========================================================================================

Sample Input 0

7
0 0 1 0 0 1 0
-------------------------------------------------------------------------------------------

Sample Output 0

4

===========================================================================================

Sample Input 1

6
0 0 0 0 1 0
-------------------------------------------------------------------------------------------

Sample Output 1

3
===========================================================================================

Explanation

Sample Case 0: 
Because c2 and c5 in our input are both 1, Emma must avoid c2 and c5. Bearing this in mind, 
she can win the game with a minimum of 4 jumps:

	(6) <- (4) <- (3) <- (1) <- (0) 
			{5}			{2}

------------------------------------------------------------------------------------------------
Sample Case 1: 

The only thundercloud to avoid is c4. Emma can win the game in 3 jumps:

	(5) <- (3) <- (2) <- (0)			 (1)
		{4}
 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class JumpingOnTheClouds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        int count = 0,i;
	        for(i = 0; i < n - 2; i++){
	        	if(c[i + 2] == 0){
	        		count++;	
	        		i++;
	        		continue;
	        	}
	        	count++;
	        }
	        if(i < n-1){
	        	count++;
	        }
	        System.out.println(count);
	        
	      in.close();  
	}

}

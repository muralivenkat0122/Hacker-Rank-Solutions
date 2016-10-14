/**
 * John's clothing store has a pile of n loose socks where each sock i is labeled with an integer, ci, 
 * denoting its color. He wants to sell as many socks as possible, but his customers will only buy them 
 * in matching pairs. Two socks, i and j, are a single matching pair if ci = cj.

Given n and the color of each sock, how many pairs of socks can John sell?
============================================================================================================

Input Format

The first line contains an integer, n, denoting the number of socks. 
The second line contains n space-separated integers describing the respective values of c0, c1, c2,....,cn-1.
=============================================================================================================

Constraints

	1 <= n <= 100
	1 <= ci <= 100
=============================================================================================================

Output Format

Print the total number of matching pairs of socks that John can sell.
=============================================================================================================

Sample Input

9
10 20 20 10 10 30 50 10 20
-------------------------------------------------------------------------------------------------------------

Sample Output

3
-------------------------------------------------------------------------------------------------------------

Explanation

sock.png

			(10 -> 10)  (10 -> 10) 50  30 (20 -> 20) 20

As you can see from the figure above, we can match three pairs of socks. Thus, we print 3 on a new line.
==============================================================================================================
 */
package implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class SockMerchant {

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
        Arrays.sort(c);
        int count = 0;
        
        for(int i = 0; i < n - 1 ; i++){
        	if(c[i] == c[i+1]){
        		count++;
        		i++;
        	}
        }
        System.out.println(count);
        
        in.close();
	}

	
}

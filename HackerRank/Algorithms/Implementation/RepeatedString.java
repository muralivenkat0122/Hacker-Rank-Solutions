/**
 * Lilah has a string, s, of lowercase English letters that she repeated infinitely many 
 * times.

Given an integer, n, find and print the number of letter a's in the first n letters of 
Lilah's infinite string.
==========================================================================================

Input Format

The first line contains a single string, s. 
The second line contains an integer, n.
==========================================================================================

Constraints

	1 <= |s| <= 100
	1 <= n <= 10^12
	For 25% of the test cases, n <= 10^6
==========================================================================================
	
Output Format

Print a single integer denoting the number of letter a's in the first n letters of the 
infinite string created by repeating s infinitely many times.
==========================================================================================

Sample Input 0

aba
10
------------------------------------------------------------------------------------------

Sample Output 0

7
------------------------------------------------------------------------------------------

Explanation 0 

The first n=10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we 
print 7 on a new line.
==========================================================================================

Sample Input 1

a
1000000000000
------------------------------------------------------------------------------------------

Sample Output 1

1000000000000
------------------------------------------------------------------------------------------

Explanation 1 

Because all of the first n=1000000000000 letters of the infinite string are a, we print 
n=1000000000000 on a new line.
=========================================================================================
 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class RepeatedString {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int numOfAs = s.length() - s.replace("a", "").length();
        long len = s.length();
        long quo = n/len;
        long rem = n%len;
        
        if(rem == 0){
        	System.out.println(numOfAs * quo);
        }else{
        	int remNumOfAs = s.substring(0, (int)rem).length() - s.substring(0, (int) rem).replace("a", "").length();
        	System.out.println(numOfAs * quo + (remNumOfAs));
        }
        
        in.close();
	}

}

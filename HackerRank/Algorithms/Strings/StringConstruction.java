/**
 * Amanda has a string, s, of m lowercase letters that she wants to copy into 
 * a new string, p. She can perform the following operations any number of 
 * times to construct string [:

	Append a character to the end of string p at a cost of 1 dollar.
	Choose any substring of p and append it to the end of p at no charge.
=================================================================================

Given n strings (i.e., s0, s1, s2,...., sn-1), find and print the minimum 
cost of copying each si to pi on a new line.
=================================================================================

Input Format

	The first line contains a single integer, n, denoting the number of 
	strings. 
	Each line i of the n subsequent lines contains a single string, si.
=================================================================================

Constraints
	
	1 <= n <= 5
	1 <= m <= 10^5
-------------------------------------------------------------------------------

Subtasks

	1 <= m <= 10^3 for 45% of the maximum score.
=================================================================================
	
Output Format

	For each string si (where 0 <= i < n), print the minimum cost of 
	constructing string pi on a new line.
=================================================================================

Sample Input

2
abcd
abab
-------------------------------------------------------------------------------

Sample Output

4
2
-------------------------------------------------------------------------------

Explanation

Query 0: We start with s = "abcd" and p = "".

	Append character 'a' to p at a cost of 1 dollar, p = "a".
	Append character 'b' to p at a cost of 1 dollar, p = "ab".
	Append character 'c' to p at a cost of 1 dollar, p = "abc".
	Append character 'd' to p at a cost of 1 dollar, p = "abcd".

Because the total cost of all operations is 1 + 1 + 1 + 1 = 4 dollars, we 
print 4 on a new line.
---------------------------------------------------------------------------------

Query 1: We start with s = "abab" and p = "".

	Append character 'a' to p at a cost of 1 dollar, p = "a".
	Append character 'b' to p at a cost of 1 dollar, p = "ab".
	Append substring "ab" to p at no cost, p = "abab".

Because the total cost of all operations is 1 + 1 = 2 dollars, we print 2 on 
a new line.
=================================================================================

Note

	A substring of a string S is another string S' that occurs "in" S 
	(Wikipedia). For example, the substrings of the string "abc" are "a", "b" 
	,"c", "ab", "bc", and "abc".
=================================================================================
	
 */
package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Murali Venkat
 *
 */
public class StringConstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			char[] c = s.toCharArray();
			
			
			/* SOLUTION 2: BUT TERMINATING DUE TO TIME OUT
  			String p = "";
			int count = 0;
			for (int i = 0; i < c.length; i++) {
				if (p.contains(String.valueOf(c[i]))) {
					p += c[i];
				} else {
					p += c[i];
					count++;
				}
			}
			System.out.println(count);*/
			
			Set<Character> p = new HashSet<>();
			
			for(char ch: c){
				p.add(ch);
			}
			System.out.println(p.size());
			
		}
		in.close();
	}

}

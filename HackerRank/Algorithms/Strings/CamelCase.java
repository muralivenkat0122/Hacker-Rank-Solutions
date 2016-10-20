/**
 * Alice wrote a sequence of words in CamelCase as a string of letters, s, 
 * having the following properties:

	It is a concatenation of one or more words consisting of English letters.
	All letters in the first word are lowercase.
	For each of the subsequent words, the first letter is uppercase and rest 
	of the letters are lowercase.
	
Given s, print the number of words in  on a new line.
================================================================================

Input Format

A single line containing string s.
================================================================================

Constraints

	1 <= |s| <= 10^5
================================================================================
	
Output Format

Print the number of words in string .
================================================================================

Sample Input

saveChangesInTheEditor
--------------------------------------------------------------------------------

Sample Output

5
--------------------------------------------------------------------------------

Explanation

String  contains five words:

	1. save
	2. Changes
	3. In
	4. The
	5. Editor

Thus, we print 5 on a new line.
=================================================================================

Need help? Try this problem first to get familiar with HackerRank environment.
=================================================================================
 */
package contests;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner in = new Scanner(System.in);
	        String s = in.next();
	        System.out.println(s.length() - s.replaceAll("[A-Z]", "").length() + 1);
		    in.close();
	}

}

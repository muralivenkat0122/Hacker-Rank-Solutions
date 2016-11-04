/** SOLUTION #1
 * Objective 

Today, we're working with regular expressions. Check out the Tutorial tab for 
learning materials and an instructional video!
=======================================================================================

Task 

Consider a database table, Emails, which has the attributes First Name and Email ID. 
Given N rows of data simulating the Emails table, print an alphabetically-ordered 
list of people whose email address ends in @gmail.com.
=======================================================================================

Input Format

	The first line contains an integer, N, total number of rows in the table. 
	Each of the N subsequent lines contains 2 space-separated strings denoting a 
	person's first name and email ID, respectively.
=======================================================================================

Constraints

	2 <= N <= 30
	Each of the first names consists of lower case letters [a-z] only.
	Each of the email IDs consists of lower case letters [a-z],@  and . only.
	The length of the first name is no longer than 20.
	The length of the email ID is no longer than 50.
=======================================================================================

Output Format

	Print an alphabetically-ordered list of first names for every user with a gmail 
	account. Each name must be printed on a new line.
=======================================================================================

Sample Input

	6
	riya riya@gmail.com
	julia julia@julia.me
	julia sjulia@gmail.com
	julia julia@gmail.com
	samantha samantha@gmail.com
	tanya tanya@gmail.com
----------------------------------------------------------------------------------------

Sample Output

	julia
	julia
	riya
	samantha
	tanya
=======================================================================================

 */
package day28hacker.Solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Murali Venkat 
 *
 */
public class RegExPatternDatabases {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String regex = "@gmail.com";
		Pattern p = Pattern.compile(regex);
		List<String> list = new ArrayList<>();
		for(int i = 0; i < t; i++){
			String name = scan.next();
			String email = scan.next();
			Matcher m = p.matcher(email);
			if(m.find()){
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		for(String name: list){
			System.out.println(name);
		}
		scan.close();
	}

}

/**
 *

Sample Challenge 

This is a simple challenge to get things started. Given a sorted array (ar) and a number (V), can you print 
the index location of  in the array?
============================================================================================================
The next section describes the input format. You can often skip it, if you are using included methods.

============================================================================================================

Input Format 

There will be three lines of input:

V - the value that has to be searched.
n - the size of the array.
ar - n numbers that make up the array.
============================================================================================================

Output Format 

Output the index of V in the array.
============================================================================================================

The next section describes the constraints and ranges of the input. You should check this section to know 
the range of the input.
============================================================================================================

Constraints

	1 <= n <= 1000
	-1000 <= V <= 1000, V belongs to ar
	It is guaranteed that B will occur in ar exactly once.
============================================================================================================

This "sample" shows the first input test case. It is often useful to go through the sample to understand a 
challenge.

Sample Input

4
6
1 4 5 7 9 12
------------------------------------------------------------------------------------------------------------
Sample Output

1
Explanation 
V = 4. The value  is the nd element in the array, but its index is 1 since array indices start from 0, so 
the answer is 1. 
=============================================================================================================
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class SortingIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n];
		int i;
		for(i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		
		for(i = 0; i < arr.length;){
			if(arr[i] == val){
				System.out.println(i);
			}
			i++;
		}
		
		scan.close();

	}
}

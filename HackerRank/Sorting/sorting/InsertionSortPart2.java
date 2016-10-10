/**
In Insertion Sort Part 1, you sorted one element into an array. Using the same approach repeatedly,
 can you sort an entire unsorted array?
========================================================================================================

Guideline: You already can place an element into a sorted array. How can you use that code to build 
up a sorted array, one element at a time? Note that in the first step, when you consider an element 
with just the first element - that is already "sorted" since there's nothing to its left that is smaller.
========================================================================================================

In this challenge, don't print every time you move an element. Instead, print the array after each 
iteration of the insertion-sort, i.e., whenever the next element is placed at its correct position.

Since the array composed of just the first element is already "sorted", begin printing from the second
 element and on.
========================================================================================================

Input Format 

There will be two lines of input:

	s - the size of the array
	ar - a list of numbers that makes up the array
========================================================================================================

Output Format 

On each line, output the entire array at every iteration.
========================================================================================================

Constraints 

 1 <= s <= 10000
 -1000 <= x <= 10000, x belongs ar
========================================================================================================

Sample Input

6
1 4 3 5 6 2
========================================================================================================

Sample Output

1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 
========================================================================================================

Explanation 

Insertion Sort checks 4 first and doesn't need to move it, so it just prints out the array. Next, 3 is
 inserted next to , and the array is printed out. This continues one element at a time until the entire 
 array is sorted.
========================================================================================================

Task 

The method insertionSort takes in one parameter: ar, an unsorted array. Use an Insertion Sort Algorithm 
to sort the entire array.
========================================================================================================
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		int n = ar.length;
		int i, j, temp = 0, count = 0;

		// Manipulate the array as required
		for (i = 1; i < n; i++) {
			count++;
			for (j = 0; j <= count; j++) {
				// System.out.println("Going In");
				if (ar[j] > ar[count]) {
					temp = ar[count];
					ar[count] = ar[j];
					ar[j] = temp;
				} else {
					continue;
				}
			}
			// The code for Input/Output is already provided
			printArray(ar);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}

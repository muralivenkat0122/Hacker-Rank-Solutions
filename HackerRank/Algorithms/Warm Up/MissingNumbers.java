

/**
 * Numeros, the Artist, had two lists A and B, such that B was a permutation of A. 
 * Numeros was very proud of these lists. Unfortunately, while transporting 
 * them from one exhibition to another, some numbers were left out of A. 
 * Can you find the missing numbers?
 * 
 * =======================================================================

Notes

If a number occurs multiple times in the lists, you must ensure that the 
frequency of that number in both lists is the same. If that is not the case, 
then it is also a missing number. You have to print all the missing numbers
in ascending order. Print each missing number once, even if it is missing 
multiple times. The difference between maximum and minimum number in 
is less than or equal to .
===========================================================================
Input Format 
There will be four lines of input:

-- n is the size of the first list 
--This is followed by n space-separated integers that make up the first list. 
-- m is the size of the second list 
-- This is followed by m space-separated integers that make up the second list.
=============================================================================
Constraints

Output Format 
Output the missing numbers in ascending order.
==============================================================================

Sample Input

10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
===============================================================================

Sample Output

204 205 206
===============================================================================
Explanation

204 is present in both arrays. Its frequency in A is 2, 
 while its frequency in B is 3. Similarly, 205 and 206 occur 
 twice in A, but thrice in B. So, these three numbers 
 are our output. The rest of the numbers have thesame 
 frequency in both lists.
 */
package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class MissingNumbers {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Integer> arr1 = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			arr1.add(num);
		}

		int m = scan.nextInt();

		List<Integer> arr2 = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int num = scan.nextInt();
			arr2.add(num);
		}

		scan.close();

		Collections.sort(arr1);

		Collections.sort(arr2);

		List<Integer> missingNumbers = new ArrayList<>();

		int i = 0, j = 0;
		while (i < arr2.size()) {
			if (j < arr1.size()) {
				int n1 = arr1.get(j);
				int n2 = arr2.get(i);
				if (n1 == n2) {
					i++;
					j++;
				} else {
					if (!missingNumbers.contains(n2)) {
						missingNumbers.add(n2);
					}
					i++;
				}
			} else {
				if (!missingNumbers.contains(arr2.get(i))) {
					missingNumbers.add(arr2.get(i));
				}
				i++;
			}

		}

		Collections.sort(missingNumbers);

		for (Integer num : missingNumbers) {
			System.out.print(num + " ");
		}

	}

}

/**
 * You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed 
 * on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation 
four sticks are left (of non-zero length), whose lengths are the following: 

3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length 
sticks).
==============================================================================================================

Input Format 

The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of the 
ith stick.
-------------------------------------------------------------------------------------------------------------

Output Format 

For each operation, print the number of sticks that are cut, on separate lines.
=============================================================================================================

Constraints

	1 <= N <= 1000
	1 <= ai <= 1000
=============================================================================================================

Sample Input 0

6
5 4 4 2 2 8
-------------------------------------------------------------------------------------------------------------

Sample Output 0

6
4
2
1
=============================================================================================================

Sample Input 1

8
1 2 3 4 3 3 2 1
-------------------------------------------------------------------------------------------------------------

Sample Output 1

8
6
4
1
=============================================================================================================

Explanation

Sample Case 0 :

sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE

=============================================================================================================

Sample Case 1

sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE

==============================================================================================================
 *
 */
package implementation;


import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class CutTheSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
       // calculateLength(n, arr);
        
        calclateUsingWhileLoop(n, arr);
     
        in.close();
	}

	/**
	 * @param n
	 * @param arr
	 */
	private static void calclateUsingWhileLoop(int n, int[] arr) {
		int numOfSticks = n;
        while(numOfSticks > 0){
        	System.out.println(numOfSticks);
        	int min = 1000;
        	for(int i  = 0; i < arr.length; i++){
        		if(arr[i] < min && arr[i] > 0){
        			min = arr[i];
        		}
        	}
        	
        	for(int i = 0; i < arr.length; i++){
        		arr[i] = arr[i] - min;
        		if(arr[i] == 0){
        			numOfSticks--;
        		}
        	}
        }
	}

// Second Logic	
	/**
	 * @param n
	 * @param arr
	 */
//	private static void calculateLength(int n, int[] arr) {
//		Arrays.sort(arr);
//        System.out.println(n);
//        for(int i = 0; i < arr.length -1; i++){
//        	if(arr[i] != arr[i+1]){
//        		System.out.println(n-(i+1));
//        	}
//        }
//	}

}

/**
 * 
 */
package hacker;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class BigSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = scan.nextInt();
	        }
	        scan.close();
	        long sum = 0;
	        for(int arr_i = 0; arr_i < n; arr_i++){
	        	System.out.println("Value before sum: " + sum);
	            sum += arr[arr_i];
	        	System.out.println("Value after sum: " + sum);
	        }
	        System.out.println(sum);
	}
	

}

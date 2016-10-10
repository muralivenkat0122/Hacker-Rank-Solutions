/**
 * 
 */
package hacker;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class DiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = scan.nextInt();
            }
        }
        int left = 0, right = 0;
        for(int i = 0; i < n; i++){
        	 left += a[i][i];
        	 right += a[i][n-1-i];
       }
        
        
        System.out.println(Math.abs(((left-right))));
        
        scan.close();
	}

}

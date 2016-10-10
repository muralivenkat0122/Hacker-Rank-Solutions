/*
*Consider a staircase of size n=4:

   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

 Write a program that prints a staircase of size n.
 * 
 */
package hacker;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class StairCase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){ 							
        	for(int j = 1; j <= n; j++){							
        		if((i + j) > n){									
            		System.out.print('#');        			
        		}else{
        			System.out.print(" ");
        		}
        	}
        	 System.out.println();
        }
       
        
        in.close();
    }
}

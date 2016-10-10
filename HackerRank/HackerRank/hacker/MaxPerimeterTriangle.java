/**
 * 
 */
package hacker;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class MaxPerimeterTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(a);
		int x, y, z;
		for(x = n-3, y = n-2, z = n-1; a[x] + a[y] <= a[z]; x--, y--, z--){
			if(x == 0){
				System.out.println(-1);
				return;
			}
		}
		System.out.printf("%d %d %d", a[x], a[y], a[z]);
	}

}

/**
 * 
 */
package hacker;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class CircularArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < q; i++) {
			int m = in.nextInt();

			System.out.println(a[((m - k) % n + n) % n]);
		}
		in.close();
	}

}

/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class CounterSort3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			scan.nextLine();
			arr[i] = num;
		}
		scan.close();
	
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int pivot = i;
			for (int j = 0; j < n; j++) {
				if (pivot == arr[j]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}

	}

}

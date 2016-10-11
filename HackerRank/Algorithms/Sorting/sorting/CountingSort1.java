/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class CountingSort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		scan.close();

//		int count = 0;
//		for(int i = 0; i < 100; i++){
//			int pivot = i;
//				for(int j = 0; j < arr.length; j++){
//					if(pivot == arr[j]){
//						count++;
//					}
//				}
//				System.out.print(count + " ");
//				count = 0;
//		}
		
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		System.out.println();
	}

}

/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class SortingIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n];
		int i;
		for(i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		
		for(i = 0; i < arr.length;){
			if(arr[i] == val){
				System.out.println(i);
			}
			i++;
		}
		
		scan.close();

	}
}

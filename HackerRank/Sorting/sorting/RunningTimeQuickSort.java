/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class RunningTimeQuickSort {
	
	public static int cnt1 = 0; 
	public static int cnt2 = 0;

	public static void insertionSort(int[] ar) {
		// Fill up the code for the required logic here
		 int n = ar.length;  
		    for (int j = 1; j < n; j++) {  
	            int key = ar[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( ar [i] > key ) ) {  
	                ar [i+1] = ar [i];  
	                i--;  
	                cnt1++;
	            }  
	            ar[i+1] = key;  
	        }  
	}
	
	/**
	 * @param ar
	 * @param min
	 * @param max
	 * @return 
	 */
	private static void quickSort(int[] ar, int min, int max) {
		// TODO Auto-generated method stub
		
		if (min < max) {
			int pivot = ar[max];
			int idx = min;
			int temp = 0;
			for (int i = min; i < max; i++) {
				if (pivot > ar[i]) {
					temp = ar[idx];
					ar[idx] = ar[i];
					ar[i] = temp;
					idx++;
					if(idx != i){
						cnt2++;
					}
					if(i == idx){
						cnt2++;
					}
				}else{
					temp = ar[max];
					ar[max] = ar[i];
					ar[i] = temp;
					cnt2++;
				}
			}			
			ar[max] = ar[idx];
			ar[idx] = pivot;
			if(idx == max){
				cnt2++;
			}
			quickSort(ar, min, idx - 1);
			quickSort(ar, idx + 1, max);
			
		}
	}
	
	
	
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
		quickSort(ar, 0, s - 1);
		System.out.println(cnt1 - cnt2);
		in.close();
	}

}

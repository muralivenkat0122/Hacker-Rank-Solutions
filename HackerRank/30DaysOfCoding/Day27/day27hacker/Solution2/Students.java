/**
 * 
 */
package day27hacker.Testing;

/**
 * @author Murali Venkat 
 *
 */
public class Students {

	private static int n;
	private static int k;
	private static int[] arr;
	/**
	 * @return the n
	 */
	public static int getN() {
		return n;
	}
	/**
	 * @param n the n to set
	 */
	public static void setN(int n) {
		Students.n = n;
	}
	/**
	 * @return the k
	 */
	public static int getK() {
		return k;
	}
	/**
	 * @param k the k to set
	 */
	public static void setK(int k) {
		Students.k = k;
	}
	/**
	 * @return the arr
	 */
	public static int[] getArr() {
		return arr;
	}
	/**
	 * @param arr the arr to set
	 */
	public static void setArr(int[] arr) {
		Students.arr = arr;
	}
	
	public Students(){
		
	}
	
	public Students(int n, int k, int[] arr){
		Students.n = n;
		Students.k = k;
		Students.arr = arr;
	}
	
	public static void getCount(int n, int k, int[] arr){
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= 0) {
				count++;
			}
		}
		
		if (count >= k) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
	
}

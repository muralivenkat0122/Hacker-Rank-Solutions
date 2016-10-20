/**
 * 
 */
package day14hacker.scope;

import java.util.Arrays;

/**
 * @author Murali Venkat 
 *
 */
public class Difference {



	public int maximumDifference;
	public int[] elements;
	
	public Difference(int[] a){
		this.elements = a;
	}

	/**
	 * 
	 */
	public void computeDifference() {
		// TODO Auto-generated method stub
		Arrays.sort(elements);
		int n = elements.length;
		maximumDifference = elements[n-1] - elements[0];
	}

}

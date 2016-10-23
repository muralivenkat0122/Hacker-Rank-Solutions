/**
 * 
 */
package day17hacker.Exceptions;

/**
 * @author Murali Venkat
 *
 */
public class Calculator {

	/**
	 * @param n
	 * @param p
	 * @return
	 * @throws Exception 
	 */
	public int power(int n, int p) throws Exception {
		// TODO Auto-generated method stub
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(n, p);
		}

	}

}

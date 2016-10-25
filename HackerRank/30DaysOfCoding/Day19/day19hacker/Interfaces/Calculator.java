/**
 * 
 */
package day19hacker.Interfaces;

/**
 * @author Murali Venkat
 *
 */
public class Calculator implements AdvancedArithmetic {
	/*
	 * (non-Javadoc)
	 * 
	 * @see day19hacker.Interfaces.AdvancedArithmetic#divisorSum(int)
	 */
	@Override
	public int divisorSum(int n) {
		int sum = 1;
		// TODO Auto-generated method stub
		for(int i = 2; i <= n; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}

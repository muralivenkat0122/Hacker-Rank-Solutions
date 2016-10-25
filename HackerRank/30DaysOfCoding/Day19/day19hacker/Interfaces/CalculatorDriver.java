/**
 * 
 */
package day19hacker.Interfaces;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class CalculatorDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        
	      	AdvancedArithmetic myCalculator = new Calculator(); 
	        int sum = myCalculator.divisorSum(n);
	        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
	        System.out.println(sum);
	}

}

/**
 * 
 */
package day2hacker.Operators;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	        double billCost = mealCost + (mealCost * (tipPercent)/100) + (mealCost * (taxPercent)/100);
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(billCost);
	      
	        // Print your result
	        System.out.println("The total meal cost is " + totalCost + " dollars.");
	        
	}

}

/**
 * 
 */
package day17hacker.Exceptions;

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
		  Scanner in = new Scanner(System.in);
	        int T=in.nextInt();
	        while(T-->0)
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try
	            {
	                int ans=myCalculator.power(n,p);
	                System.out.println(ans);
	                
	            }
	            catch(Exception e)
	            {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	}

}

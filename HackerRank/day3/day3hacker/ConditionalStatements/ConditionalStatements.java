/**
 * 
 */
package day3hacker.ConditionalStatements;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class ConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	    
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	         // Complete the code 
	          if(n%2 == 0 && (n >= 2 && n <= 5)){
	                      ans = "Not Weird";
	          }else if(n%2 == 0 && (n >= 6 && n <= 20)){
	                      ans = "Weird";
	          }else if(n%2 == 0 && n >= 20){
	        ans = "Not Weird";
	          
	      }
	    
	}
	      System.out.println(ans);
	      scan.close();

}
}
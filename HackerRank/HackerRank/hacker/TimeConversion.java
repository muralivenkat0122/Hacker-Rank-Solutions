/**
 * Time Conversion: Input: 05:42:42PM ========> Output: 17:42:42
 */
package hacker;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);
        String time = in.next();
        
        if(time.contains("AM")){
        	time = time.replace("AM", "");
        	String[] t = time.split(":");
        	if(t[0].equals("12")){
        		t[0] = "00";
        	}
        	time = t[0] + ":" + t[1] + ":" + t[2];
        }else if(time.contains("PM")){
        	time = time.replace("PM", "");
        	String[] t = time.split(":");
        	if(!t[0].equals("12")){
        		t[0] = Integer.toString(Integer.parseInt(t[0]) + 12);
        	}
        	time = t[0] + ":" + t[1] + ":" + t[2];
        }
        System.out.println(time);
    
        in.close();
	}

}

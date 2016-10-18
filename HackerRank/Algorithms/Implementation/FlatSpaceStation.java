/**
 * Flatland is a country with n cities, m of which have space stations. Its cities (c) are numbered from 
 * 0 to n-1, where ith city is referred to as ci.

Between each ci and ci+1 (where 0 <= i < n), there exists a bidirectional road 1 km long.

For example, if n = 5 and cities c0 and c4 have space stations, Flatland would look like this:

				(0) ----> (1) ----> (2) ----> (3) ----> (4)


For each city, determine its distance to the nearest space station and print the maximum of these 
distances.
==========================================================================================================

Input Format

	The first line consists of two space-separated integers, n and m. 
	The second line contains m space-separated integers c0,c1,c2,.....,cm-1 denoting the index of each 
	city having a space station. These values are unordered and unique.
==========================================================================================================

Constraints

	1 <= n <= 10^5
	1 <= m <= n
	It is guaranteed that there will be at least 1 city with a space station, and no city has more than 
	one.
==========================================================================================================

Output Format

	Print an integer denoting the maximum distance that an astronaut in a Flatland city would need to 
	travel to reach the nearest space station.
==========================================================================================================

Sample Input 0

5 2
0 4
----------------------------------------------------------------------------------------------------------

Sample Output 0

2
----------------------------------------------------------------------------------------------------------

Explanation 0

This sample corresponds to the example given in the problem statement above. The distance to the nearest 
space station for each city is listed below:

	c0 has distance 0 km, as it contains a space station.
	c1 has distance 1 km to the space station in c0.
	c2 has distance 2 km to the space stations in c0 and c4.
	c3 has distance 3 km to the space station in c4.
	c4 has distance 0 km, as it contains a space station.

We then take max(0,1,2,1,0) = 2, and print 2 as our answer.
==========================================================================================================

Sample Input 1

6 6
0 1 2 4 3 5
----------------------------------------------------------------------------------------------------------

Sample Output 1

0
----------------------------------------------------------------------------------------------------------

Explanation 1

In this sample, n = m so every city has space station and we print 0 as our answer.
==========================================================================================================

 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat 
 *
 */
public class FlatSpaceStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int c[] = new int[m];
	        for(int c_i=0; c_i < m; c_i++){
	            c[c_i] = in.nextInt();
	        }
	     	        
	        int max = 0, result = 0;
	        if(m == n){
	        	max = 0;
	        }else{
	        	for(int i = 0; i < n; i++){
	        		result = Math.abs(c[0] - i); 
	        		for(int j = 0; j < m; j++){
	        			if(Math.abs(c[j] - i) < result){
	        				result = Math.abs(c[j] - i);
	        			}
	        		}
	        		if(max < result){
	        			max = result;
	        		}
	        	}
	        }
	        System.out.println(max);
	        in.close();
	}

}

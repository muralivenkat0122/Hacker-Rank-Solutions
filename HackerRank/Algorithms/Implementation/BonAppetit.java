/**
 * Anna and Brian order n items at a restaurant, but Anna declines to eat any of the kth 
 * item (where 0 <= k < n) due to an allergy. When the check comes, they decide to split 
 * the cost of all the items they shared; however, Brian may have forgotten that they 
 * didn't split the kth item and accidentally charged Anna for it.
===========================================================================================

You are given n, k, the cost of each of the n items, and the total amount of money that 
Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon 
Appetit; otherwise, print the amount of money that Brian must refund to Anna.
===========================================================================================

Input Format

	The first line contains two space-separated integers denoting the respective values 
	of n(the number of items ordered) and k (the 0-based index of the item that Anna did 
	not eat). 
	
	The second line contains n space-separated integers where each integer i denotes the 
	cost, c[i], of item i (where 0 <= i < n). 

	The third line contains an integer, b-charged, denoting the amount of money that 
	Brian charged Anna for her share of the bill.
===========================================================================================

Constraints

	2 <= n <= 10^5
	0 <= k < n
	0 <= c[i] <= 10^4
	0 <= b <= sum of (c[i])
===========================================================================================
	
Output Format

	If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print 
	the difference (i.e., ((b-charged) - (b-actual))) that Brian must refund to Anna 
	(it is guaranteed that this will always be an integer).
===========================================================================================

Sample Input 0

4 1
3 10 2 9
12
-------------------------------------------------------------------------------------------

Sample Output 0

5
-------------------------------------------------------------------------------------------

Explanation 0 

Anna didn't eat item c[1] = 10, but she shared the rest of the items with Brian. The total 
cost of the shared items is 3 + 2 + 9 = 14 and, split in half, the cost per person is 
b-actual = 7. Brian charged her b-charged = 12 for her portion of the bill, which is more 
than the 7 dollars worth of food that she actually shared with him. Thus, we print the 
amount Anna was overcharged, (b-charged)-(b-actual) = 12 - 7 = 5, on a new line.
===========================================================================================

Sample Input 1

4 1
3 10 2 9
7
-------------------------------------------------------------------------------------------

Sample Output 1

Bon Appetit
-------------------------------------------------------------------------------------------

Explanation 1 

Anna didn't eat item c[1] = 10, but she shared the rest of the items with Brian. The total 
cost of the shared items is 3 + 2 + 9 = 14 and, split in half, the cost per person is 
b-actual = 7. Because this matches the amount, b-charged = 7, that Brian charged Anna for 
her portion of the bill, we print Bon Appetit on a new line.
===========================================================================================
 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class BonAppetit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] arr = new int[n];

		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		int charged = scan.nextInt();

		int deductedAmount = arr[k];

		sum -= deductedAmount;

		sum /= 2;

		if ((charged - sum) == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(charged - sum);
		}
		scan.close();
	}
}

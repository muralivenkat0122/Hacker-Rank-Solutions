/**
 * Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

	There are n chapters in Lisa's workbook, numbered from 1 to n.
	The i-th chapter has ti problems, numbered from 1 to n.
	Each page can hold up to k problems. There are no empty pages or unnecessary spaces, so only the 
	last page of a chapter may contain fewer than k problems.
	Each new chapter starts on a new page, so a page will never contain problems from more than one 
	chapter.
	The page number indexing starts at 1.
	
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number 
where it's located. Given the details for Lisa's workbook, can you count its number of special problems?

Note: See the diagram in the Explanation section for more details.
==========================================================================================================

Input Format

The first line contains two integers n and k — the number of chapters and the maximum number of problems 
per page respectively. 
The second line contains n integers t1,t2,....,tn, where ti denotes the number of problems in the i-th 
chapter.
==========================================================================================================

Constraints

	1 <= n,k,ti <= 100
==========================================================================================================
	
Output Format

Print the number of special problems in Lisa's workbook.
==========================================================================================================

Sample Input

5 3  
4 2 6 1 10
----------------------------------------------------------------------------------------------------------

Sample Output

4
----------------------------------------------------------------------------------------------------------

Explanation

The diagram below depicts Lisa's workbook with  n = 5 chapters and a maximum of 3 problems per page. 
Special problems are outlined in red, and page numbers are in yellow squares.

		count = 0 // count increments when page number and problem number are identical
		
		Chapter 1: (1)---2---3 === Page (1) == count++;
		Chapter 1:  4          === Page (2) 
		Chapter 2: 	1---2 	   === Page (3) 
		Chapter 3: 	1---2---3  === Page (4) 	
		Chapter 3: 	4--(5)--6  === Page (5) == count++;
		Chapter 4: 	1		   === Page (6) 
		Chapter 5: 	1---2---3  === Page (7) 
		Chapter 5: 	4---5---6  === Page (8) 								
		Chapter 5:  7---8--(9) === Page (9) == count++;						
		Chapter 5: (10)		   === Page (10)== count++; 
		
		
		// Final Count value = 4;

There are 4 special problems and thus we print the number 4 on a new line.

==========================================================================================================

 */
package implementation;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class LisasWorkBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int m[] = new int[n];
		int pageNum = 0, count = 0;
		int question = 0, chapter = 0;

		for (int i = 0; i < n; i++) {
			m[i] = scan.nextInt();
			pageNum++;
			chapter++;
			question = 0;
			for (int j = 1; j <= m[i]; j++) {
				question++;
				if ((k != 1) && (question > k) && (question % k == 1)) {
					pageNum++;
				}
				if (j == pageNum) {
					count++;
				}
				if ((k == 1) && (question % k == 0)) {
					pageNum++;
				}
			}
		}
		System.out.println(count);

		scan.close();
	}

}

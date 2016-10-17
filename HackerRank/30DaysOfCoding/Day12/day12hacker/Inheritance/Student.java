/**
 * 
 * Objective 
Today, we're delving into Inheritance. Check out the Tutorial tab for learning materials and an 
instructional video!
=========================================================================================================

Task 

You are given two classes, Person and Student, where Person is the base class and Student is the derived 
class. Completed code for Person and a declaration for Student are provided for you in the editor. 
Observe that Student inherits all the properties of Person.
=========================================================================================================

Complete the Student class by writing the following:

	A Student class constructor, which has 4 parameters:
	A string, firstName.
	A string, lastName.
	An integer, id.
	An integer array (or vector) of test scores, scores.
	A char calculate() method that calculates a Student object's average and returns the grade 
	character representative of their calculated average:
	Grading.png
	
									Grading Scale
								-----------------------------
								Letter			Average
								  O			90 <= avg <= 100
								  E			80 <= avg < 90
								  A	 		70 <= avg < 80
								  P		 	55 <= avg < 70
								  D			40 <= avg < 55
								  T		 		avg < 40
==========================================================================================================

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary 
arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin: 
The first line contains firstName, lastName, and if, respectively. The second line contains the number 
of test scores. The third line of space-separated integers describes scores.
==========================================================================================================

Constraints

	4 <= |firstName|, |lastName| <= 10
	|id| = 7
	0 <= score, average <= 100
==========================================================================================================

Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class 
constructor and calculate() method are properly implemented.
==========================================================================================================

Sample Input

Heraldo Memelli 8135627
2
100 80
----------------------------------------------------------------------------------------------------------

Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
----------------------------------------------------------------------------------------------------------

Explanation

This student had 2 scores to average: 100 and 80. The student's average grade is (100 + 80)/2 = 90. An 
average grade of 90 corresponds to the letter grade O, so our calculate() method should return the 
character 'O'.
===========================================================================================================
 */
package day12hacker.Inheritance;

/**
 * @author Murali Venkat
 *
 */
public class Student extends Person {

	private int[] testScores;

	/**
	 * @param firstName
	 * @param lastName
	 * @param identification
	 * @param testScores2
	 */
	Student(String firstName, String lastName, int identification, int[] testScores2) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores2;
	}

	char calculate() {

		char res = 0;
		double sum = 0, avg;
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}

		avg = sum / testScores.length;

		if (avg >= 90 && avg <= 100) {
			res = 'O';
		} else if (avg >= 80 && avg < 90) {
			res = 'E';
		} else if (avg >= 70 && avg < 80) {
			res = 'A';
		} else if (avg >= 55 && avg < 70) {
			res = 'P';
		} else if (avg >= 40 && avg < 55) {
			res = 'D';
		} else {
			res = 'T';
		}

		return res;
	}

}

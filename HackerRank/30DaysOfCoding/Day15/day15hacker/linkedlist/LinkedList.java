/**
 * 
 */
package day15hacker.linkedlist;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class LinkedList {

	public static Node insert(Node head, int data) {
		// Complete this method
		if (head == null) {
			return new Node(data);
		} else if (head.next == null) {
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}
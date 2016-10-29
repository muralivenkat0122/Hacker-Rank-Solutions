/**
 * 
 */
package day22hacker.BinarySearchTree;

import java.util.Scanner;

/**
 * @author Murali Venkat
 *
 */
public class BinarySearchTree {

	public static int getHeight(Node root) {
		// Write your code here
		int leftHeight = 0;
		int rightHeight = 0;
		if(root == null){
			return -1;
		}
		if (root.left != null) {
			leftHeight = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			rightHeight = getHeight(root.right) + 1;
		}
		return (leftHeight > rightHeight ? leftHeight : rightHeight);
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}

}

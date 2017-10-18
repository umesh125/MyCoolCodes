package PrintLevelWithMaximumNodeOfBST;

import java.util.*;

public class PrintLevelWithMaximumNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(8);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.right.left = new Node(7);
		root.right.right = new Node(12);
		root.right.right.right = new Node(15);

		LevelOrder(root);
	}

	public static void LevelOrder(Node root) {
		int n = 0;
		int l = 0;
		int ml = l;
		int maxNode = 0;
		if (root != null) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while (!q.isEmpty()) {
				n = q.size();
				//System.out.println("Number of Node " + n + " Level: " + l);
				
				if (maxNode < n) {
					maxNode = n;
					ml = l;
				}
				l++;
				while (n > 0) {
					Node t = q.remove();
					System.out.print(" " + t.data);
					if (t.left != null) {
						q.add(t.left);
					}
					if (t.right != null) {

						q.add(t.right);
					}
					n--;
				}
				System.out.println();
			}

		}

		System.out.println("Level With Maximum Node :" + ml+" Number Of Node :"+maxNode);
	}

}

class Node {
	Node left;
	Node right;
	int data;

	Node(int input) {

		data = input;
		left = null;
		right = null;

	}

}
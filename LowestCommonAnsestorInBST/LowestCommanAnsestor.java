package LowestCommonAnsestorInBST;

import java.util.LinkedList;
import java.util.Queue;


public class LowestCommanAnsestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node T = new Node(15);
		T.left = new Node(10);
		T.right = new Node(20);
		T.left.left = new Node(9);
		T.left.right = new Node(12);
		T.right.left = new Node(16);
		T.right.right = new Node(25);
		T.right.right.left = new Node(24);
		T.right.right.right = new Node(27);

		Node root=new Node(10);
		root.left=new Node(6);
		root.right=new Node(25);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right.left=new Node(15);
		root.right.right=new Node(26);
		root.left.left.left=new Node(1);
		root.left.left.right=new Node(4);
		root.left.right.left=new Node(7);
		root.left.right.right=new Node(9);
		root.right.left.left=new Node(14);
		root.right.left.right=new Node(16);
		root.right.right.left=new Node(23);
		root.right.right.right=new Node(27);
		
		
		
		
		LevelOrderPrint(root);
		LCA(root, 1, 9);

		// System.out.println(contain(T, 15));

	}

	static void LevelOrderPrint(Node root) {
		int size = 0;
		Queue q = new LinkedList();
		if (root != null) {
			q.add(root);

			while (!q.isEmpty()) {

				size = q.size();
				while (size > 0) {

					Node Temp = (Node) q.remove();
					// lp=lp*Temp.data;
					System.out.print(" " + Temp.data + " ");
					if (Temp.left != null) {
						q.add(Temp.left);

					}
					if (Temp.right != null) {
						q.add(Temp.right);

					}
					size--;

				}
				// System.out.print("  ---------- >:"+lp);
				System.out.println();

			}

		}

	}

	static boolean contain(Node root, int k) {
		if (root == null) {

			return false;

		}
		if (k == root.data) {

			return true;

		}

		return contain(root.left, k) || contain(root.right, k);

	}

	static void LCA(Node root, int f, int s) {

		if (root == null) {
			return;
		}

		if (!(contain(root, f) && contain(root, s)))
			return;

		if (root.data < f && root.data < s) {

			LCA(root.right, f, s);
		} else if (root.data > f && root.data > s) {

			LCA(root.left, f, s);
		} else {

			System.out.println(root.data);
			return;

		}

	}

}

class Node {
	Node left;
	Node right;
	int data;

	Node(int input) {
		left = null;
		right = null;
		this.data = input;

	}

}
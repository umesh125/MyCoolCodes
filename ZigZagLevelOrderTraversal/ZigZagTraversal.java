package ZigZagLevelOrderTraversal;

import java.util.*;

public class ZigZagTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		LOrder(root);
		spiralOrZigzagLevelOrder(root);

	}

	static void spiralOrZigzagLevelOrder(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		int ln = 0;
		boolean directionflag = false;
		while (!stack.isEmpty()) {
			Stack<TreeNode> tempStack = new Stack<TreeNode>();

			while (!stack.isEmpty()) {
				ln = stack.size();
				while (ln > 0) {
					TreeNode tempNode = stack.pop();
					System.out.printf("%d ", tempNode.data);
					if (!directionflag) {
						if (tempNode.left != null)
							tempStack.push(tempNode.left);
						if (tempNode.right != null)
							tempStack.push(tempNode.right);
					} else {
						if (tempNode.right != null)
							tempStack.push(tempNode.right);
						if (tempNode.left != null)
							tempStack.push(tempNode.left);
					}

					ln--;

				}
			}
			// for changing direction
			directionflag = !directionflag;

			stack = tempStack;
		}

	}

	static void ZigZag(TreeNode root) {
		int ln = 0;
		if (root != null) {
			Stack<TreeNode> s = new Stack<TreeNode>();
			s.push(root);
			while (!s.empty()) {
				ln = s.size();
				Stack<TreeNode> s2 = new Stack<TreeNode>();
				boolean f = true;

				TreeNode t = s.pop();
				System.out.print(" " + t.data + " ");
				/* if (f) { */
				if (t.left != null)
					s.push(t.left);
				if (t.right != null)
					s.push(t.right);

				/*
				 * } else { if (t.right != null) s2.push(t.right);
				 * 
				 * if (t.left != null) s2.push(t.left);
				 * 
				 * }
				 */

				f = !f;
				s = s2;
				// System.out.println();
			}

		}

	}

	static void LOrder(TreeNode r) {
		int ln = 0;
		if (r != null) {
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			q.add(r);
			while (!q.isEmpty()) {
				ln = q.size();
				while (ln > 0) {
					TreeNode t = q.remove();
					System.out.print(" " + t.data + " ");
					if (t.left != null)
						q.add(t.left);
					if (t.right != null)
						q.add(t.right);
					ln--;

				}
				System.out.println();

			}

		}

	}

}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	TreeNode(int input) {
		this.data = input;

	}

}

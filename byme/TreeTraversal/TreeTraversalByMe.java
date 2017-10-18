package byme.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalByMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tree Traversal By Me");
		int a[] = { 6, 3, 9, 2, 4, 8, 10, 1, 3, 5, 7, 11 };
		BT b = new BT();
		for (int i = 0; i < a.length; i++) {
			b.insert(a[i]);
		}
		b.inorder();
		b.preorder();
		b.postorder();
		System.out.println("Inorder traversal without recursion");
		b.InOrderTraversalWithoutRecc();
		System.out.println();
		System.out.println("height of tree " + b.height());
		b.LevelOrederTraversal();
		b.LOT();
		b.mirror();
		b.LOT();
		b.LevelOrederTraversal();
		b.inorder();
		b.preorder();

		b.postorder();
	}

}

class BTNode {
	/*
	 * creating class node of tree whic contain left right and data as tree
	 * Requires
	 */
	BTNode left, right;
	int data;

	BTNode(int n) {
		/*
		 * calling constructor of class in which we initialize left and right
		 * with null and data with n
		 */
		left = null;
		right = null;
		data = n;

	}

}

/* End of class BTNode */

class BT {
	private BTNode root; // object of BTNode

	BT() {
		/*
		 * constructor of BTNode in which we initialize object of BTNode of with
		 * null
		 */
		root = null;

	}

	private void mirror(BTNode root) {

		if (root == null)
			return;

		BTNode current = root;
		mirror(current.left);
		mirror(current.right);

		BTNode Tmp = current.left;
		current.left = current.right;
		current.right = Tmp;

	}

	public void mirror() {

		System.out.println("Mirroring tree");

		mirror(root);

	}

	static void printTreeByLevel(BTNode root) {
		Queue<BTNode> q = new LinkedList<BTNode>();
		int levelNodes = 0;
		if (root != null) {
			q.add(root);
			while (!q.isEmpty()) {
				levelNodes = q.size();
				// System.out.println(q.size());
				while (levelNodes > 0) {
					BTNode tmp = q.remove();
					System.out.print("|" + tmp.data + "|");
					if (tmp.left != null)
						q.add(tmp.left);

					if (tmp.right != null)
						q.add(tmp.right);

					levelNodes--;
				}
				System.out.println();

			}

		}

	}

	public void LevelOrederTraversal() {
		// System.out.println("Level Order Traversal");
		// LevelOrederTraversal(root);

		System.out.println(" New Level Order Traversal");
		printTreeByLevel(root);

	}

	private void LOTraversalByMe(BTNode u) {
		Queue<BTNode> q = new LinkedList<BTNode>();
		if (u != null) {
			q.add(u);
			while (!q.isEmpty()) {
				BTNode n = q.remove();
				System.out.print(" (" + n.data + ") ");
				if (n.left != null)
					q.add(n.left);

				if (n.right != null)
					q.add(n.right);

				// System.out.println(q.toString());

			}
		}
		System.out.println();
	}

	public void LOT() {

		System.out.println("LOT by me");
		LOTraversalByMe(root);
	}

	private void LevelOrederTraversal(BTNode r) {
		/* This is function to print each level at separate line */

		Queue<BTNode> q = new LinkedList<BTNode>();
		/* we used Queue which work in first in first out Manner */
		int LevelNodes = 0; /* this store number of node at particular level */
		if (r != null) {
			q.add(r); /* first add root */

			while (!q.isEmpty()) {

				LevelNodes = q.size(); /*
										 * count size when we insert root then
										 * size is 1
										 */

				while (LevelNodes > 0) {

					BTNode n = q.remove();
					System.out.print("[" + n.data + "]"); /*
														 * remove and print prev
														 * q.size number of
														 * nodes remove only
														 * which available
														 */

					/*
					 * insert next 2*q.size() number of node in queue which is
					 * maximum num of node at next level .insert only which
					 * available in tree
					 */

					if (n.left != null)
						q.add(n.left);

					if (n.right != null)
						q.add(n.right);

					LevelNodes--;
				}

				System.out.println();

			}

		}

	}

	public int height() {

		return Height(root);

	}

	private int Height(BTNode r) {
		if (r == null)
			return 0;

		return 1 + Math.max(Height(r.left), Height(r.right));

	}

	public void InOrderTraversalWithoutRecc() {

		Stack s = new Stack();
		BTNode tmp = null;
		BTNode n = root;
		LeftNodeToStack(s, n);
		// System.out.println("stack "+s);
		while (!s.empty()) {
			tmp = (BTNode) s.pop();
			System.out.print("  " + tmp.data);
			tmp = tmp.right;
			LeftNodeToStack(s, tmp);

		}

	}

	private void LeftNodeToStack(Stack s, BTNode n) {
		while (n != null) {
			s.push(n);
			n = n.left;
		}
	}

	public void insert(int data) {
		root = insert(root, data);

	}

	private BTNode insert(BTNode node, int data) {

		if (node == null) {

			node = new BTNode(data);
		} else {
			if (node.data < data) {
				node.right = insert(node.right, data);
			} else {
				node.left = insert(node.left, data);
			}

		}

		return node;

	}

	public void inorder() {
		System.out.println("IN-Order");
		inorder(root);
		System.out.println();

	}

	private void inorder(BTNode r) {
		if (r != null) {
			inorder(r.left);
			System.out.print("" + r.data + "  ");
			inorder(r.right);
		}
	}

	public void preorder() {
		System.out.println("Pre-Order");
		preorder(root);
		System.out.println();
	}

	private void preorder(BTNode r) {
		if (r != null) {
			System.out.print("" + r.data + "  ");
			preorder(r.left);
			preorder(r.right);

		}
	} // end of preorder

	private void postorder(BTNode r) {
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data + "  ");

		}

	}

	public void postorder() {
		System.out.println("PostOrder");
		postorder(root);
		System.out.println();

	}
}// end of BT class


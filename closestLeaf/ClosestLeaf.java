package closestLeaf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ClosestLeaf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST tree = new BST(10);
		tree.left = new BST(6);
		tree.right = new BST(25);
		tree.left.left = new BST(3);
		tree.left.right = new BST(8);
		tree.left.left.left = new BST(1);
		tree.right.left = new BST(15);
		tree.right.right = new BST(26);
		/*tree.right.right.right = new BST(36);
		tree.right.right.right.right = new BST(56);*/
		// print(tree);
		// printLeaf(tree);
		//printBranch(tree, new ArrayList<Integer>());
		//ClosestLeaf(tree,1,9999);
		System.out.println(clDist(tree));
		//print(tree);

	}

	
	static int clDist(BST root)
	{
	if(root==null)	
		return 0;
	
	return 1+ Math.min(clDist(root.left), clDist(root.right));
		
		
	}
	
	
	static void ClosestLeaf(BST root,int lev,int d)
	{
		if(root==null)
			return;
		
		if(root.left==null && root.right==null)
		{
			if(lev<d)
			{
				d=lev;
				System.out.println(d);
				return;
			}
			
			
		}
		
		ClosestLeaf(root.left,lev+1,d);
		ClosestLeaf(root.right,lev+1,d);
		
		
		
	}
	
	
	
	
	static void printBranch(BST root, ArrayList<Integer> branch) {

		if (root == null)
			return;
		branch.add(root.data);
		if (root.left == null && root.right == null) {
			System.out.println(branch);

		}

		printBranch(root.left, new ArrayList<Integer>(branch));
		printBranch(root.right, new ArrayList<Integer>(branch));

	}

	static void printLeaf(BST root) {

		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.print(" " + root.data + " ");
		}

		printLeaf(root.left);
		printLeaf(root.right);

	}

	static void print(BST root) {
		Queue<BST> q = new LinkedList<BST>();
		int levelNodes = 0;

		if (root != null) {
			q.add(root);
			while (!q.isEmpty()) {
				levelNodes = q.size();
				while (levelNodes > 0) {
					BST t = q.remove();
					System.out.print(" " + t.data + " ");

					if (t.left != null) {
						q.add(t.left);

					}
					if (t.right != null) {

						q.add(t.right);

					}

					levelNodes--;
				}

				System.out.println();

			}

		}

	}

}

class BST {
	BST left;
	BST right;
	int data;

	BST(int input) {

		this.data = input;
		left = null;
		right = null;

	}

}

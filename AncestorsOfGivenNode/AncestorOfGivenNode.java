package AncestorsOfGivenNode;

import java.util.*;

public class AncestorOfGivenNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BTNode root = new BTNode(7);
		root.left = new BTNode(4);
		root.right = new BTNode(10);
		root.left.left = new BTNode(3);
		root.left.right = new BTNode(5);
		root.right.left = new BTNode(8);
		root.right.right = new BTNode(12);
		root.right.right.left = new BTNode(11);
		root.right.right.right = new BTNode(26);
		root.left.left.left = new BTNode(2);
		LevelOrderTraversal(root);
		ArrayList branch=new ArrayList();
		printBranches(root,branch);
		PrintAncestor(root, 26);

		// printAncestorIterative(root,8);

	}

	
	
	static void printBranches(BTNode root,ArrayList  brnch)
	{
		if(root==null)
			return;
		
		brnch.add(root.data);

		if(root.left==null && root.right==null)
		{
			System.out.println(brnch);
			return;
			
		}
		
		printBranches(root.left,new ArrayList(brnch));
		printBranches(root.right,new ArrayList(brnch));
		
	}
	
	
	static void LevelOrderTraversal(BTNode root) {
		if (root == null)
			return;

		Queue<BTNode> q = new LinkedList();
		if (root != null) {
			int levelNode = 0;
			q.add(root);
			while (!q.isEmpty()) {
				levelNode = q.size();
				while (levelNode > 0) {
					BTNode tmp = q.remove();
					System.out.print(" " + tmp.data + " ");
					if (tmp.left != null)
						q.add(tmp.left);

					if (tmp.right != null)
						q.add(tmp.right);

					levelNode--;
				}
				System.out.println();

			}

		}

	}

	static void printAncestorIterative(BTNode root, int target) {
		if (root == null)
			return;

		Stack<BTNode> s = new Stack<BTNode>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (true) {
			while (root != null) {
				s.push(root);

				al.add(root.data);

				if (root.data == target) {
					System.out.println(al);
					return;

				}

				root = root.left;
			}
			if (s.empty()) {
				return;
			}

			root = s.pop();
			root = root.right;

		}

	}

	static void PrintAncestor(BTNode root, int target) {
		System.out.println("Ancestor Of " + target);
		PrintAncestor(root, target, new ArrayList<Integer>());
		System.out.println();

	}

	static void PrintAncestor(BTNode root, int target, ArrayList<Integer> anc) {
		if (root == null)
			return;

		anc.add(root.data);

		if (root.data == target) {

			// System.out.println(anc);
			for (int i = 0; i < anc.size() - 1; i++)
				System.out.print(" " + anc.get(i));

			return;

		}
		PrintAncestor(root.left, target, new ArrayList<Integer>(anc));
		PrintAncestor(root.right, target, new ArrayList<Integer>(anc));

	}

}

class BTNode {
	BTNode left;
	BTNode right;
	int data;

	BTNode(int input) {
		this.data = input;
		left = null;
		right = null;

	}

}
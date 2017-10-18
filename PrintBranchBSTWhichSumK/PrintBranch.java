package PrintBranchBSTWhichSumK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintBranch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Print Barnch of LinkedList Sum");

		BTNode root = new BTNode(7);
		root.left = new BTNode(4);
		root.right = new BTNode(10);
		root.left.left = new BTNode(3);
		root.left.right = new BTNode(5);
		root.right.left = new BTNode(8);
		root.right.right = new BTNode(12);
		root.right.right.left = new BTNode(11);
		root.right.right.right = new BTNode(26);
		// PrintBranch(root);
		// printLeaf(root);
		//printLeafItr(root);
		printAllRootToLeafPaths(root, new ArrayList());
	}

	public static void printAllRootToLeafPaths(BTNode node,ArrayList<Integer> path) 
	{
		
	    if(node==null)
	    {
	        return;
	    }
	    path.add(node.data);

	    if(node.left==null && node.right==null)
	    {
	    	int sum=0;
	        System.out.println(path);
	        for(int i=0;i<path.size();i++)
	        {
	        	//System.out.println(path.get(i));
	        	sum=sum+path.get(i);
	        }
	        System.out.println(sum);
	        return;
	    }
	    else
	    {
	    	printAllRootToLeafPaths(node.left, new ArrayList(path));
	    	printAllRootToLeafPaths(node.right, new ArrayList(path));
	    }      
	}
	
	
	
	
	
	
	static void printLeaf(BTNode root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.print(" " + root.data + " ");
		}

		printLeaf(root.left);
		printLeaf(root.right);

	}

	static void printLeafItr(BTNode root) {
		if (root == null)
			return;
		int sum = 0;
		int key = 25;

		Stack<BTNode> s = new Stack<BTNode>();
		// Stack<BTNode> s2 = new Stack<BTNode>();
		Queue <BTNode> q=new LinkedList<BTNode>();

		while (true) {
			while (root != null) {
				s.push(root);

				System.out.println(root.data + "     ");
				sum = sum + root.data;
		//		System.out.println(sum);
				/*if (key == sum) {
					while (!s.empty()) {
						System.out.print(s.pop().data + " ");
					}

					return;
				}
*/
				root = root.left;

			}

			if (s.empty()) {
				return;
			}

			
			root = s.pop();
			
			System.out.println("Poped:"+root.data+"  ");
			root = root.right;

		}

	}

	static void PrintBranch(BTNode root) {

		int leftmax = 0;
		for (int j = root.data; j > 0; j--)
			leftmax = leftmax + j;

		System.out.println(leftmax);
		if (root == null)
			return;
		Stack<BTNode> fin = new Stack<BTNode>();

		while (root != null) {

			fin.push(root);
			System.out.print(root.data + "  ");
			root = root.left;

		}

		if (fin.isEmpty()) {
			return;
		}

		if (fin.peek().left == null && fin.peek().right == null) {
			fin.pop();
		}

		root = fin.peek().right;
		System.out.println("right " + root.data);

		if (fin.peek().left == null && fin.peek().right == null) {
			fin.pop();
		}
		root = fin.peek().right;

		System.out.println("right " + root.data);
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
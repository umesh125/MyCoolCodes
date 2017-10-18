package IterativePostOrderTraversal;

import java.util.*;

public class IterativePostOrder {

	/**Basic Idea:
     best Idea for iterarive post order 
	 * lets have tree with level order traversal:7,4,10,3,5,8,12
	 * Inorder Traversal:3,4,5,7,8,10,12
	 * PreOrder Traversal:7,4,3,5,8,10,12
	 * Let Modifies Pre Order (root ,Left, Right) by considering(root,right ,left)
	 * Then Modified PreOrder Traversal became: 7,10,12,8,4,5,3 
	 * which exactly Opposite to Post order Traversal so save it in stack and print its pop valeus 
	 * 
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
		
		IterativePostorder(root);
		preorder(root);

	}

	static void IterativePostorder(BTNode root) {
		System.out.println("Iterative Post Order");
		if (root == null)
			return;
		Stack<BTNode> fin = new Stack<BTNode>();
		Stack<BTNode> tmp = new Stack<BTNode>();
		while (true) {
			// standard code for generating pre order traversal but here we consider right node first and then left node
			while (root != null) {
				tmp.push(root);
				fin.push(root);// pushing result of modified pre order traversal on final stack
				root = root.right;//moving right instead of left we modified here pre order traversal

			}
			if (tmp.isEmpty()) {
				break;
			}
			root = tmp.pop();
			root = root.left;//moving left ,not according to traditional pre order traversal
		}

		while (!fin.empty()) {
			// printing final result
			System.out.print(fin.pop().data + "  ");

		}

		System.out.println();
	}

	static void preorder(BTNode root)
	{
		if(root==null)
			return;
		Stack <BTNode>s=new Stack<BTNode>();
		while(true) //or while(root!=null || !s.empty())
		{
			while(root!=null)
			{
				
				s.push(root);
				System.out.print(root.data+"  ");
				root=root.left;
				
			}
			
			if(s.empty())
				return;
			
			root=s.pop();
			root=root.right;
			
			
			
		}
		
		
		
	}
	
	
	
	
	static void LevelOrder(BTNode root) {
		if (root == null)
			return;

		int nodes = 0;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);
		while (!q.isEmpty()) {
			nodes = q.size();
			while (nodes > 0) {
				BTNode tmp = q.remove();
				System.out.print(tmp.data + " ");

				if (tmp.left != null) {
					q.add(tmp.left);
				}

				if (tmp.right != null) {
					q.add(tmp.right);

				}

				nodes--;
			}
			System.out.println();

		}

	}

	static void recPost(BTNode root) {
		if (root == null)
			return;

		recPost(root.left);
		recPost(root.right);
		System.out.print(root.data + "  ");

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
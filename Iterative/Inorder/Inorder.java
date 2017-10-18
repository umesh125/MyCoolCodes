package Iterative.Inorder;

import java.util.Stack;
/* while (true) loop
 * contain multiple other statement
 * to exit from while(true) loop all statement in while (true) loop should meet their terminal
 * condition
 * while(true) loop continue until all statement in loop meet terminal or exit condition
 * 
 * 
 *  */
public class Inorder {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(77);
		
		// System.out.println(root.left.right.data);
		System.out.println("Recursive In Order Traversal");
		RecInorder(root);
		System.out.println();
		System.out.println("Iterative IN Order");
		IteIn(root);

	}

	
	
	static void IteIn(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		while (true) // or while(root!=null || !s.empty()) 
		{
			
			
			
			while (root != null) {
				s.push(root);
				root = root.left;

			}

			if (s.empty()) {
				return;
			}

			root = s.pop();

			System.out.print(" " + root.data + " ");
			
			/*if(root.left==null && root.right==null)
			{
				System.out.print(" data:" + root.data + " ");
				System.out.print("size: "+s.size());
				
			}
*/
			root = root.right;  /* very first time here root becomes null but
			 that time stack is not empty so root value change from null to next pop 
			 value and while(true) is continue until both condition of root==null
			  and stack is empty true same time  */
			
			

		}

	}

	static void RecInorder(TreeNode root) {

		if (root != null) {

			RecInorder(root.left);
			System.out.print(" " + root.data + " ");
			RecInorder(root.right);

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

package Iterative.Preorder;
import java.util.Stack;
public class Preorder {

	public static void main(String[] args)
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		System.out.println("Pre Order Traversal");
		pre(root);
		System.out.println();
		System.out.println("Iteretive Pre Order Traversal");
		IterativePreorder(root);
	}
	
	static void IterativePreorder(TreeNode root)
	{
		Stack<TreeNode> s=new Stack<TreeNode>();
		while(true)
		{
		while(root!=null)
		{
			
			s.push(root);
			System.out.print(" "+root.data+" ");
			root=root.left;
			
		}
		if(s.empty())
		{
			return;
		}
		
		root=s.pop();
		root=root.right;
		}
		
		
		
		
	}
	
	static void pre(TreeNode root)
	{
		if(root==null)
			return;
		
		if(root!=null)
		{
			
			System.out.print(" "+root.data+" ");
			pre(root.left);
			
			pre(root.right);
			
		}
		
		
	}
	
	
}
class TreeNode
{
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int input)
	{
		this.data=input;
		
	}
	
	
	
}

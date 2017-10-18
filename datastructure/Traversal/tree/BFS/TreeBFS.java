package datastructure.Traversal.tree.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {

	/**
	 * @param args
	 */
	
	static int height(Node root)
	{
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
		
		
		
		
	}
	
	
	public static void LevelOrderTraversal(Node root)
	{
		
		
		int nodes=0;
		
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)
		{
			q.add(root);
			while(!q.isEmpty())
			{
				nodes=q.size();
				while(nodes>0)
				{
				Node n=q.remove();
				System.out.print(" "+n.data+" ");
				if(n.left!=null)
					q.add(n.left);
				
				if(n.right!=null)
					q.add(n.right);
				nodes--;
				}
				System.out.println();
			}
			}
		}
	
	
	
	public static void inorder(Node root)
	{
		
		if(root!=null)
		{
			
			inorder(root.left);
			System.out.print(" "+root.data+" ");
			
			inorder(root.right);
			
			
		}
			
		
		
		
		
	}
	
	
	
	public static void preorder(Node root)
	{
		
		if(root!=null)
		{
			
			System.out.print(" "+root.data+" ");
			preorder(root.left);
			preorder(root.right);
			
			
		}
			
		
		
		
		
	}
	
	
	public static void postorder(Node root)
	{
		
		if(root!=null)
		{
			
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(" "+root.data+" ");
			
			
		}
			
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BFS Traversal with tree");
		Node root=new Node(5);
		root.left=new Node(10);
		root.right=new Node(15);
		root.left.left=new Node(20);
		root.left.right=new Node(25);
		root.right.left=new Node(35);
		root.right.right=new Node(40);
		System.out.println("Inorder Traversal ");
		inorder(root);
		System.out.println();
		System.out.println("Level order  Traversal ");
		LevelOrderTraversal(root);
		System.out.println();
		System.out.println("PreOrder Traversal ");
		preorder(root);
		System.out.println();
		System.out.println("Post Order Traversal ");
		postorder(root);
		System.out.println();
		System.out.println("Height of Tree "+height(root));
		
		
		
	}

}

class Node
{
	Node left,right;
	int data;
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
}
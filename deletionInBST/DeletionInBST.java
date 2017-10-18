package deletionInBST;
import java.util.*;
//import Iterative.Inorder.TreeNode;



public class DeletionInBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		
		
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(80);
		root.left.left.left = new TreeNode(10);
		root.left.left.left.left = new TreeNode(5);
		//root.data=5;
		//root.left.left.left=root.left.left.left.left;
		
		//root.right.right = null;
		
		//levelOrder(root);
		delete(root,20);
	}

	 public static TreeNode locate (TreeNode root, int toFind)
	  {
	    for (TreeNode c=root; c!=null; c = toFind<c.data ? c.left : c.right)
	      if (toFind == c.data)
	        return c;

	    return null;
	  }
	
	
	static void delete(TreeNode root,int key)
	{
		TreeNode t;
		for( t=root;t!=null;t=key<t.data?t.left:t.right)
		{
			if(key==t.data)
				break;
		}
		System.out.println(t.data);
		TreeNode t2=t;
		while(t2.left!=null)
		{
			t2=t2.left;
		}
		while(t2.right!=null)
		{
			t2=t2.right;
			
			
		}
		
		System.out.println("root "+t.data);
		System.out.println("Extream From Root"+t2.data);
		
		
		
		
		
	}
	 
	 
	 
	 
	 
	static void levelOrder(TreeNode root)
	{
		if(root==null)
			return;
		int ln=0;
		Queue <TreeNode>q=new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			ln=q.size();
			while(ln>0)
			{
				TreeNode temp=q.remove();
				System.out.print(" "+temp.data+" ");
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					
					q.add(temp.right);
				}
				
				
				ln--;
			}
			
			System.out.println();
			
			
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
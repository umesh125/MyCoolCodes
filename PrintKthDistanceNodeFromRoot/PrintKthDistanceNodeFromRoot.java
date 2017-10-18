package PrintKthDistanceNodeFromRoot;

import java.util.*;






public class PrintKthDistanceNodeFromRoot {

	/**
	 * @param args
	 */
	static int dst=-1;
	static ArrayList al=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BTNode root=new BTNode(10);
		root.left=new BTNode(6);
		root.right=new BTNode(25);
		root.left.left=new BTNode(3);
		root.left.right=new BTNode(8);
		root.right.left=new BTNode(15);
		root.right.right=new BTNode(26);
		root.left.left.left=new BTNode(1);
		root.left.left.right=new BTNode(4);
		root.left.right.left=new BTNode(7);
		root.left.right.right=new BTNode(9);
		root.right.left.left=new BTNode(14);
		root.right.left.right=new BTNode(16);
		root.right.right.left=new BTNode(23);
		root.right.right.right=new BTNode(5);
		
		/*Print(root);
		System.out.println();
		LevelOrderPrint(root);*/
		//PrintKthDistanceNodes(root,2);
		//LevelOrderPrint(root);
		//System.out.println(dst);
		//DistFromRoot(root,25,0);
		//System.out.println(dst);
		//PrintKthDistanceNodes(root.right,2);
		//PrintKthDistanceNodes(root,2-dst);
		System.out.println("Maximum height is: "+Height(root));
		System.out.println("is BST: "+isBST(root));
		Pre(root);
		System.out.println(al);
		ArrayList  al2=al;
		al2.add(122);
		Collections.sort(al2);
		System.out.println(al);
		
		System.out.println(al2.equals(al));
		
	}

	static void Pre(BTNode r)
	{
		
		Stack <BTNode>s=new Stack<BTNode>();
		
		while(true)
		{
		while(r!=null)
		{
			s.push(r);
			r=r.left;
		}
		if(s.isEmpty())
			return;
		
		r=s.pop();
		//System.out.print(" "+r.data);
		al.add(r.data);
		r=r.right;
		
		
		
		
		}
		
		
	}
	
	
	
	static boolean isBST(BTNode r)
	{
		if (!(r.data>r.left.data && r.data<r.right.data))
		{
		return false;
		}
		
		if (r.data>r.left.data && r.data<r.right.data)
		{
			return true;
		}
		
		
		return isBST(r.left) && isBST(r.right);
		
	}
	
	
	
	static int Height(BTNode r) {
		if (r == null)
			return 0;

		return 1 + Math.min(Height(r.left), Height(r.right));

	}
	
	
	
	
	static void DistFromRoot(BTNode root,int target,int d)
	{
		if(root==null)
			return;
		
		if(root.data==target)
		{
			//System.out.println(d);
			dst=d;
		}
		
		if(root.data<=target)
			DistFromRoot(root.right,target,d+1);
		else
			DistFromRoot(root.left,target,d+1);
		
		
	}
	
	
	
	
	
	
	static void Print(BTNode root)
	{
		if(root==null)
			return;
		
		
		System.out.print(" "+root.data+" ");
		Print(root.left);
		
		Print(root.right);
		
		
		
	}
	
	static void LevelOrderPrint(BTNode root)
	{int size=0;
		Queue q=new LinkedList();
		if(root!=null)
		{
			q.add(root);
			
			
			while(!q.isEmpty())
			{
				
				
			size=q.size();	
				while(size>0)
				{
					
				BTNode Temp=(BTNode) q.remove();
				//lp=lp*Temp.data;
				System.out.print(" "+Temp.data+" ");
				if(Temp.left!=null)
				{
					q.add(Temp.left);
					
				}
				if(Temp.right!=null)
				{
					q.add(Temp.right);
					
				}
				size--;
				
				}
				//System.out.print("  ---------- >:"+lp);
				System.out.println();
				
				
			}
			
			
		
			
		}
		
		
		
		
	}
	
	static void PrintKthDistanceNodes(BTNode root,int dist)
	{
		if(root==null)
			return;
		
		if(dist==0)
		{
			System.out.print(" "+root.data+" ");
			return;
		}
		
		PrintKthDistanceNodes(root.left,dist-1);
		PrintKthDistanceNodes(root.right,dist-1);
		
		
	}
	
	
	
	
}



class BTNode
{
	BTNode left;
	BTNode right;
	int data;
	BTNode (int input)
	{
		this.data=input;
		left=null;
		right=null;
				
		
		
	}
	
	
	
}
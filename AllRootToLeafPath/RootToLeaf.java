package AllRootToLeafPath;

import java.util.ArrayList;
import java.util.Arrays;



public class RootToLeaf {

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
		root.left.left.left=new BTNode(2);

		printRootToLeaf(root);
		
		/*BranchWithSumk(root,16);
		NoOfBranchWithSumk(root,16);
		BranchesWithSums(root);*/
	
	}

static void BranchesWithSums(BTNode root)
{
	System.out.println("---------------------------------------");
	BranchesWithSums(root,new ArrayList<Integer>());
	System.out.println("---------------------------------------");
	
}

static void BranchesWithSums(BTNode root,ArrayList<Integer> path)
{
	if(root==null)
		return;
	
	path.add(root.data);
	if(root.left==null && root.right==null)
	{
		int sum=0;
		for(int i=0;i<path.size();i++)
		{
			sum=sum+path.get(i);
		}
		System.out.println("Branch : "+path+" Sum: "+sum);
		return;
		
	}
	BranchesWithSums(root.left,new ArrayList<Integer>(path));
	BranchesWithSums(root.right,new ArrayList<Integer>(path));
	
	
	
	
}




	static void NoOfBranchWithSumk(BTNode r,int sum)
	{
		System.out.println("No of Branch with Sum "+sum+" :"+NoOfBranchWithSumk(r,new ArrayList<Integer>(),sum));
		
	}
	
	
	static int NoOfBranchWithSumk(BTNode root,ArrayList<Integer>path,int k)
	{
		if(root==null)
			return 0;
		
		path.add(root.data);
		if(root.left==null && root.right==null)
		{
			
			int sum=0;
			
			for(int i=0;i<path.size();i++)
				sum=sum+path.get(i);
			
			if(sum==k)
			{
			//System.out.println(path+" "+sum);
			return 1;
			}
			
			
			
			
			
		}
		
		
			
			
			return NoOfBranchWithSumk(root.left,new ArrayList(path),k) +NoOfBranchWithSumk(root.right,new ArrayList(path),k);
		
		
		
	}
	
	
	
	
	
	
	static void BranchWithSumk(BTNode root,int k)
	{
		
		rootToLeaf(root,new ArrayList<Integer>(),k);
		
	}
	
	
	/* root to leaf using arraylist  */  
	
	static void rootToLeaf(BTNode root,ArrayList<Integer> path,int k)
	{
		if(root==null)
			return;
		path.add(root.data);
		if(root.left==null && root.right==null)
		{
			
			int sum=0;
			
			for(int i=0;i<path.size();i++)
				sum=sum+path.get(i);
			
			if(sum==k)
			{
			System.out.println("Branch : "+path+"   Sum: "+sum);
			
			}
			
			
			
			return;
			
		}
		else
		{
			rootToLeaf(root.left,new ArrayList(path),k);
			rootToLeaf(root.right,new ArrayList(path),k);
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	static void printRootToLeaf(BTNode root)
	{
		int path[]=new int[1000];
		printRootToLeaf(root,path,0);	
	}
	
	
	static void printRootToLeaf(BTNode root, int path[],int pl)
	{
	
		if(root==null)
			return;
		
		path[pl]=root.data;
		pl++;
		
		if(root.left==null && root.right==null)
		{
			//System.out.println(Arrays.toString(path));
			
			for(int i=0;i<pl;i++)
			System.out.print(" "+path[i]+" ");
			
			System.out.println();
			return;
			
		}
		else
		{
		printRootToLeaf(root.left,path,pl);
		printRootToLeaf(root.right,path,pl);
		}
		
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
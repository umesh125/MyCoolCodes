package tree.PrintEachLevelSum;

import java.util.LinkedList;
import java.util.Queue;



public class Tree {

	static TNode insert(TNode node,int data )
	{

		if(node==null)
		{
			node=new TNode(data);
			
		}
		else
		{
			if(node.data<data)
			{
				node.right=insert(node.right,data);
			}
			else
			{
				node.left=insert(node.left,data);
			}
				
				
			}
			
	return node;
		
	}
	
	
	static void printTreeByLevel(TNode root)
	{
		Queue <TNode>q=new LinkedList<TNode>();
		int levelNodes=0;
		int product=1;
		if(root!=null)
		{
			;
			q.add(root);
			int l=0;
			while(!q.isEmpty())
			{
				
				l++;
				levelNodes=q.size();
				//System.out.println(q.size());
				int sum=0;
				System.out.print(" level "+ l+" ");
				while(levelNodes>0)
				{
					
					TNode tmp=q.remove();
					System.out.print("["+tmp.data+"]");
					sum=sum+tmp.data;
					if(tmp.left!=null)
						q.add(tmp.left);
					
					
					if(tmp.right!=null)
						q.add(tmp.right);
					
						
					levelNodes--;
				}
				
				
				System.out.print(" sum--->" +sum);
				product=product*sum;
				System.out.println();
				
			}
			
			
			System.out.println(" Total Product of Tree "+product);
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TNode umesh = null;
 
int a[]={6,3,9,2,4,8,10,1,3,5,7,11};

for(int i=0;i<a.length;i++)
{
	umesh=insert(umesh,a[i]);
	
}



printTreeByLevel(umesh);


		
		
	}

}





class TNode
{
	TNode left;
	TNode right;
	int data;
	TNode(int input)
	{
		this.data=input;
		left=null;
		right=null;
		
	}
}
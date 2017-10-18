package tree.Traversal;








public class TreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BST bst = new BST();
		int TD[]={5,7,1,15,9,2,14,8,7,3};
		   for(int a=0;a<=TD.length-1;a++)
		   {
			   bst.insert(TD[a]);
			   
		   }
			   
		   System.out.print("\nPost order : ");
			bst.postorder();
			System.out.print("\nPre order : "); 
			bst.preorder(); 
			System.out.print("\nIn order : ");
			bst.inorder();
		
		
	}

}



class BSTNode
{
	BSTNode left,right;
	int data;
	public BSTNode() /*calling constructor*/
	{
		left=null;
		right=null;
		data=0;
		
	}
	
	public BSTNode(int n)
	{
		left=null;
		right=null;
		data=n;
	}
	public void setLeft(BSTNode n)
	{
		left=n;
	}
	
	public void setRight(BSTNode n)
	{
	right=n;
	}
	

	public BSTNode getLeft()
	{
		return left;
	}
    public BSTNode getRight()
    {
    	
    	return right;
    	
    }



public void setData(int d)
{
	
	data=d;
}




public int getData()
{
	return data;
}

/*end of node class*/
}


class BST { private BSTNode root;

public BST() 
{ root = null; } 
/* Function to check if tree is empty */
public boolean isEmpty() { return root == null; }
/* Functions to insert data */
public void insert(int data)
{ 
	root = insert(root, data);
	}
/* Function to insert data recursively */ 
private BSTNode insert(BSTNode node, int data) 
{ 
	if (node == null) node = new BSTNode(data);
	else { 
		if (data < node.getData()) node.left = insert(node.left, data);
		else node.right = insert(node.right, data);
		} return node; }

public void inorder() { inorder(root); } 
private void inorder(BSTNode r)





{
	if (r != null)
{ 
		inorder(r.getLeft());
System.out.print(r.getData() +" "); 
inorder(r.getRight()); } } 




/* Function for preorder traversal */ 
public void preorder() { preorder(root); } 
private void preorder(BSTNode r) 
{ if (r != null) { System.out.print(r.getData() +" ");
preorder(r.getLeft());
preorder(r.getRight());
} 
} /* Function for postorder traversal */ 
public void postorder() { postorder(root); } 
private void postorder(BSTNode r) { if (r != null) { postorder(r.getLeft());
postorder(r.getRight());
System.out.print(r.getData() +" "); } }



}


package Add_Number_Represented_By_LinkedList;

public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1=new Node(1);
		n1.next=new Node(4);
		n1.next.next=new Node(5);
		
		Node n2=new Node(5);
		n2.next=new Node(6);
		n2.next.next=new Node(8);
		print(n1);
		System.out.println();
		print(n2);
		System.out.println();
		add(n1,n2,0);
		
	}

	static void print(Node root)
	{
		if(root==null)
			return;
		System.out.print(" "+root.data+" ");
		print(root.next);
		
		
	}
	
	
	static void add(Node n1,Node n2,int c)
	{
		if(n1==null && n2==null)
			return;
		
		
		
		
		add(n1.next,n2.next,c);
		System.out.print(" "+(c+n1.data+n2.data)%10+" ");
		c=(c+n1.data+n2.data)/10;
		System.out.print("c="+c+" ");
		
		
	}
	
	
	
}
class Node
{
	Node next;
	int data;
	Node(int input)
	{
		next=null;
		this.data=input;
		
		
	}
	
	
	
}

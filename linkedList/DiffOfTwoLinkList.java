package linkedList;

public class DiffOfTwoLinkList {

	/**
	 * @param args
	 */
	
	
	static Node LLDiff(Node l1,Node l2)
	{
		Node l3=new Node(l1.data-l2.data);
		Node tmp=l3;
		while(l1.next!=null && l2.next!=null)
		{
			
			tmp.next=new Node(l1.next.data-l2.next.data);
			tmp=tmp.next;
			l1=l1.next;
			l2=l2.next;
			
			
		}
		
return l3;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node l1=new Node(6);
		l1.next=new Node(5);
		l1.next.next=new Node(3);
		l1.next.next.next=new Node(0);
		
		Node l2=new Node(4);
		l2.next=new Node(5);
		l2.next.next=new Node(2);
		l2.next.next.next=new Node(0);
		Node um=LLDiff(l1,l2);
	System.out.println(um.next.data);
		
		
	}

}


class Node
{
	Node next;
	int data;
	Node(int n)
	{
		this.data=n;
		next=null;
		
	}
	
	
	
	
}



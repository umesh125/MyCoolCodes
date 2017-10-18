package ReversingLinkedListBothWay;

public class ReversingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Node list=new Node(1);
		list.next=new Node(2);
		list.next.next=new Node(3);
		list.next.next.next=new Node(4);
		list.next.next.next.next=new Node(5);
		print(list);
	}

	static void print(Node l)
	{
		while(l!=null)
		{
		
			System.out.print(l.data+" ");
			l=l.next;
		}
		
	}
	
	
}


class Node
{
	Node next;
	int data;
	Node(int input)
	{
		this.data=input;
		next=null;
	}
	
}
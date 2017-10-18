package LinkedListPrintingDiffWay;

import java.util.Stack;

public class LinkedListPrinting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node list = new Node(10);
		list.next = new Node(20);
		list.next.next = new Node(30);
		list.next.next.next = new Node(40);
		list.next.next.next.next = new Node(50);
		
		Node n1=new Node(1);
		n1.next=new Node(5);
		n1.next.next=new Node(6);
		Node n2=new Node(6);
		n2.next=new Node(8);
		n2.next.next=new Node(7);
		System.out.println("first Number");
		Print(n1);
		System.out.println();
		System.out.println("Second  Number");
		Print(n2);
		/*System.out.println("Printing Reverse Linked List Using Recursion");
		PrintRev(list);
		System.out.println();
		Print(list);
		IterativePRev(list);
*/
	}

	static void IterativePRev(Node root)
	{
		System.out.println();
		System.out.println("Iterative Reverse Print");
		if(root==null)
			return;
		
		
		Stack <Node>s=new Stack<Node>();
		while(root!=null)
		{
			s.add(root);
			root=root.next;
		}
		while(!s.empty())
		{
			System.out.print(s.pop().data+" ");
			
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	static void Print(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		Print(root.next);
		
		
	}
	
	static void PrintRev(Node root) {
		if (root == null)
			return;

		PrintRev(root.next);

		System.out.print(root.data + " ");

	}

}

class Node {
	Node next;
	int data;

	Node(int input) {
		this.data = input;
		next = null;
	}

}
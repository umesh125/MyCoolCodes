package AddingTwoLinkedListAsNumber;

public class AddingTwoLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node num1=new Node(1);
		num1.next=new Node(4);
		num1.next.next=new Node(4);
		Node num2=new Node(2);
		num2.next=new Node(2);
		num2.next.next=new Node(3);
		//print(num1);
		//print(num2);
		//add(num1,num2);
		Node demo=null;
		demo=new Node(122);
		
		demo=addlast(demo,100);
		//demo=new Node(100);
		print(demo);
		
		
		
		
	}

	static Node addlast(Node head,int val)
	{
		if(head==null)
		{
			System.out.println("Head is Null");
			head=new Node(val);
			
			
		}
		else
		{
			while(head!=null)
			{
				head=head.next;
			}
			head=new Node(val);
			
		}
		return head;
		
	}
	
	
	static void add(Node n1,Node n2)
	{
		Node res=null;
		if(size(n1)==size(n2))
		{
			res.data=n1.data+n2.data;
			res=res.next;
			n1=n1.next;
			n2=n2.next;
			
		}
		
		
		
		
		
	}
	
	
	static int size(Node head)
	{
		if(head==null)
		{
			return 0;
			
		}
		int size=0;
		while(head!=null)
		{
		size++;
		head=head.next;
			
		}
		
		
		
		return size;
	}
	
	
	static void print(Node head)
	{
		if(head==null)
			return;
		
		while(head!=null)
		{
			System.out.print(" "+head.data+" ");
			head=head.next;
		}
		
		System.out.println();
		
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
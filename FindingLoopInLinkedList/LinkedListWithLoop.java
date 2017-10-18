package FindingLoopInLinkedList;

public class LinkedListWithLoop {

	/**
	 * @param args
	 */
	
	static void Add(Node head,int data)
	{
		Node tmp=new Node(data);
		if(head.data==null)
		{
			
			head=tmp;
			
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
				
			}
			
			current.next=tmp;
			
		}
	}
	
	
	static void LoopCheck(Node list)
	{
		Node Temp=list;
		Node fp=list;
		Node sp=list;
		if(list==null || list.next==null)
		{
			System.out.println("Loop Not Found");
			return;
		}
		
		
		while(fp.next.next!=null && sp.next!=null)
		{
			fp=fp.next.next;
			sp=sp.next;
			if(fp==sp)
			{
				System.out.println("Loop found");
               return;	
				
			}
			
			
		}
		
	
			System.out.println("Loop Not Found !");
			
	
		
		
		
	}
	
	
	
	static void print(Node head)
	{
		if(head==null)
			return;
		
		Node Temp=head;
		while(Temp!=null)
		{
			System.out.print(" "+Temp.data+" ");
			Temp=Temp.next;
			
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node list=new Node(5);
		list.next=list;
		//list.next=new Node(10);
		//list.next.next=new Node(15);
		//list.next.next.next=new Node(20);
		//list.next.next.next.next=list;
		
		
		//print(list);
		
		LoopCheck(list);
	}

}


class Node
{
	Node next;
	Object data;
	Node(Object data)
	{
		
		this.data=data;
		next=null;
	}
	
	
	
	
}
package LL.RevAlternateNode;

public class RevAltNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Reversing alternate Node of LL");
		//System.out.println(2%2);
		
		//Node l1=new Node(32);
		Node l1=null;
		l1=Add(l1,1);
		Add(l1,2);
		Add(l1,3);
		Add(l1,4);
		Add(l1,5);
		Add(l1,6);
		//System.out.println(l1.next.data);
		print(l1);
		RevAltntNode(l1);
		
		print(l1);
		
		
	}

	static void print(Node head)
	{
		if(head==null)
			return;
		
		Node Current=head;
		while(Current!=null)
		{
			System.out.print(" "+Current.data+" ");
			Current=Current.next;
			
			
			
			
		}
		
		System.out.println();
		
	}
	
	
	
	static Node Add(Node head,int data)
	{
		Node Tmp=new Node(data);
		if(head==null)
		{
			head=new Node(data);
			return head;
			
		}
		else
		{
			Node Current=head;
			
			while(Current.next!=null)
			{
				Current=Current.next;
			}
			Current.next=Tmp;
			return head;
			
		}
		
		
		
		
		
		
	}
	
	
	static void RevAltntNode(Node head)
	{

		
		
		
		
		Node tmp=head;
		int data,count=0;
		while(tmp.next!=null)
		{
			if(count%2==0)
			{
				data=tmp.data;
				tmp.data=tmp.next.data;
				tmp.next.data=data;
				
				
			}
			
			count++;
			tmp=tmp.next;
			
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


package sorting.mergeSort.LL;

public class MergeSortForLL {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListImpl l=new LinkedListImpl();
		LinkedListImpl l2=new LinkedListImpl();
		for(int i=10;i>=1;i--)
		{
			l.add(i*10);
			
		}
		
		l.print();
		//System.out.println(l);
		
		//System.out.println("size "+l2.size());
		l2.add(55);
		l2.print();
		//MergeS(l);
		l.s();
		
		//l.print();
		
	}

	

}

class LinkedListImpl
{
	
private Node head;

LinkedListImpl()
{
	head=new Node(null);
}


public static Node MergeS( Node head)
{
	if(head==null || head.next==null)
	{
		return head;
	}
	int sz=0;
	
	Node temp1=head;
	
	while(temp1!=null)
	{
		sz++;
		temp1=temp1.next;
	}
//	System.out.print("sz    "+sz);
	int mid=sz/2;
	
	Node tleft=head;
	Node right=null;
	
	Node temp2=head;
	int count=0;
	
	while(temp2!=null )
	{
		count++;
		if(count<mid)
		{
			tleft=tleft.next;	
		}
		
		
		temp2=temp2.next;
		
}
	right=tleft.next;
	tleft.next=null;
	
	System.out.println("left.value "+tleft.value);
	
	System.out.println("right.value "+right.value);
	System.out.println(" count "+count);
	
		
	Node left=tleft;
	
	
	
	System.out.println();
	
	
	Node h1=MergeS(left);
	Node h2=MergeS(right);
	return head;
	
}






public void s()
{
	MergeS(head);	
}

public void add(Object  data)	
{
	Node Temp=new Node(data);
if(head.value==null)
{
	head=Temp;
	
}

else
{
Node Current=head;
while(Current.next != null)
{
	Current=Current.next;
	
}
Current.next=Temp;

	
}

}

public int size()
{
	
Node Current=head;
	
int sz=0;
	while(Current != null)
	{
		
		
		sz++;
		Current=Current.next;
		
		
	}
	return sz;
	
}




public void print()
{
	Node Current=head;
	
	while(Current != null)
	{
		
		
		System.out.print(" "+Current.value);
		Current=Current.next;
		
		
	}
	
	System.out.println();
	
}
	




class Node
{
	Node next;
	Object value;
	Node (Object data)
	{
		next=null;
		value=data;
		
	}
	
	
}


}
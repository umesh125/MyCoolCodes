package AddingTwoNoRepresentedByLinkedList;

public class AddingTwoNoRepresentedByLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		// TODO Auto-generated method stub

		Node list1=new Node(5);
		list1.next=new Node(6);
		list1.next.next=new Node(3);
		Node list2=new Node(8);
		list2.next=new Node(4);
		list2.next.next=new Node(2);
		Node res=new Node(-66);
		//print(list1);
		//print(list2);
		//print(res);
		
		//printSum(list1,list2);
		//
		//print(res);
		
		addRev(res,12);
		addRev(res,15);
		
		print(res);
		
	}

	static  void addRev(Node T,int data)
	{
		
		if(T==null)
		{
		T=new Node(data);	
			
		}
		else
		{
		Node tmp=new Node(data);
		Node rootNext=tmp.next;
		tmp.next=rootNext;
		T=null;
		T=tmp;
			
			
		}
		
		
	}
	
	
	
	static void printSum(Node l1,Node l2) 
	{
		if(l1==null)
		{
			return;
		}
		
		printSum(l1.next,l2.next);
		
		
		System.out.print("  "+(l1.data+l2.data)+"  ");
		
		
	}
	
	
	
	
	static void print(Node N)
	{
		if(N==null)
			return;
		
		Node Temp=N;
		while(Temp!=null)
		{
		System.out.print(" "+Temp.data+" ");	
			
			Temp=Temp.next;
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
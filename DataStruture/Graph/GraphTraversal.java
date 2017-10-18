package DataStruture.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class GraphTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Implementing graph");
	
	Graph g=new Graph(6);
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	
	g.addEdge(1, 2);
	g.addEdge(1, 3);
	g.addEdge(3, 4);
	g.addEdge(2, 3);
	g.addEdge(4, 0);
	g.addEdge(4, 1);
	g.addEdge(4, 5);
	g.BFS(1);
	
	
		
		
		
	}

}

class Node
{
	int dest;
	Node next;
	public Node( int d)
	{
		dest=d;
		next=null;
	}
	
}

class adjList
{
	Node head;
	
}



class Graph
{
	int V;
	adjList array[];
	public Graph(int V)
	{
		this.V=V;
		array=new adjList[V];
		for(int i=0;i<V;i++)
		{
		array[i]=new adjList();
		//System.out.println(" data    "+array[i].head);
	//	array[i].head=null;
		System.out.println(Arrays.toString(array));
		}
		
		
		
	}
	
	
	
	public void addEdge(int s,int d)
	{
		
		Node n=new Node(d);
		n.next=array[s].head;
		array[s].head=n;
		System.out.println(" in add edge "+n.dest);
		
		
		
	}
	
	
	
	public void BFS(int startVertext)
	{
		
		boolean visited[]=new boolean[V];
		Queue <Integer> q=new LinkedList<Integer>();
		q.add(startVertext);
		while(!q.isEmpty())
		{
			int n=q.poll();
			System.out.print(" "+n+" ");
			visited[n]=true;
			Node head=array[n].head;
			while(head!=null)
			{
				if(!visited[head.dest])
				{
					q.add(head.dest);
					visited[head.dest]=true;
				}
				head=head.next;
				
			}
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}












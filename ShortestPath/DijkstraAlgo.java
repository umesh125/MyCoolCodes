package ShortestPath;

import java.util.Arrays;

public class DijkstraAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=0;
		int d=4;
		int inf=9999;
		int mat[][]={{0,5,inf,10,11},{5,0,4,1,inf},{inf,4,0,1,2},{10,1,1,0,4},{11,inf,2,4,0}};
		boolean visited[]=new boolean[5];
		visited[s]=true;
		int min=9999;
		int dist[]=mat[s];
		int nxtNode=0;
	//System.out.println(Arrays.toString(dist));
		for(int c=0;c<5;c++)
		{
			min=99999;
			
		for(int i=0;i<dist.length;i++)
		{
			if(!visited[i] &&  dist[i]>0 )
			{
				
				if(min>dist[i])
				{
				min=dist[i];
				nxtNode=i;
				}
				
			}
			
		}
			
			
		visited[nxtNode]=true;
		
		
		for(int i=0;i<dist.length;i++)
		{
			if(!visited[i]&&mat[nxtNode][i]>0 && dist[i]>0)
			{
				if(min+mat[nxtNode][i]<dist[i])
				{
				dist[i]=min+mat[nxtNode][i];
				}
				
			}
			
}
}
		
		System.out.println(Arrays.toString(dist));
System.out.println("Minimum Cost from "+s+" to "+d+ ":  "+dist[d]);		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}

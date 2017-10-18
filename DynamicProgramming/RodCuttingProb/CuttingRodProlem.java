package DynamicProgramming.RodCuttingProb;

public class CuttingRodProlem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Rod Cuting Problem");
int len=8;
int l[]={1,2,3,4,5,6,7,8};
int p[]={1,5,8,9,10,17,17,20};
System.out.println("Maximum Profite  "+RCP(l,p,len));

	}

	
	static int RCP(int l[],int p[],int len)
	{
		int pl=p.length;
		int sol[][]=new int[pl+1][len+1];
		
		for(int r=1;r<pl+1;r++)
		{
			
			for(int c=1;c<len+1;c++)
			{
				if(l[r-1]<=c)
				{
					
					sol[r][c]=Math.max(p[r-1]+sol[r-1][c-l[r-1]], sol[r-1][c]);
					
				}
				else
				{
					
					
					sol[r][c]=sol[r-1][c];
					
					
				}
				
			}
			
			
		}
		
		
		
		
		return sol[pl][len];
		
		
		
	}
	
}

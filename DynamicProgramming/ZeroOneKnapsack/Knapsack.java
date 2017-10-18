package DynamicProgramming.ZeroOneKnapsack;

public class Knapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Implementing 0/1 Knapsack Problem");

int tw=20;
int wt[]={2,3,4,5,9};
int p[]={3,4,5,8,10};
System.out.println("max profit      	"+KnpSck(wt,p,tw));

	}							

	
	static int KnpSck(int wt[],int p[],int tw)
	{
		
		int wl=wt.length;
		int sol[][]=new int[wl+1][tw+1];
		
		for(int r=1;r<wl+1;r++)
		{
			for(int c=1;c<tw+1;c++)
			{
				if(wt[r-1]<=c)
				{
					
					sol[r][c]=Math.max(p[r-1]+sol[r-1][c-wt[r-1]], sol[r-1][c]);
					
				}
				else
				{
					
					sol[r][c]=sol[r-1][c];
					
				}
				
				
			}
			
		}
		
		
		
		
		return sol[wl][tw];
	}
	
}

package DynamicProgramming.NoOfWayCoinChange;

public class CoinChangeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amnt=5;
		int coin[]={5,1,2};
		System.out.println(" "+CoinChange(coin,amnt));
		
	}
	
	static int CoinChange(int coin[],int amnt)
	{
		int cl=coin.length;
		int sol[][]=new int[cl+1][amnt+1];
		for(int r=0;r<cl+1;r++)
		{
			sol[r][0]=1;
		}
		for(int r=1;r<cl+1;r++)
		{
			for(int c=1;c<amnt+1;c++)
			{
				
				if(coin[r-1]<=c)
				{
					
					sol[r][c]=sol[r-1][c]+sol[r][c-coin[r-1]];
				}
				
				else
				{
					sol[r][c]=sol[r-1][c];
					
				}
			}
			
			
		}
		
		
		
		
		
		
		return sol[cl][amnt];
		
	}
	
	

}

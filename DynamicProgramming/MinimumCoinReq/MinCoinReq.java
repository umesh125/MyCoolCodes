package DynamicProgramming.MinimumCoinReq;

import java.util.Arrays;

public class MinCoinReq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amnt=100;
		int coin[]={1,2,3};
		System.out.println(MinCoinReq(coin,amnt));
		
	}

	static int MinCoinReq(int coin[],int amnt)
	{
		int cl=coin.length;
		int sol[]=new int[amnt+1];
		for(int c=1;c<amnt+1;c++)
		{
			sol[c]=999999;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                 
		
		System.out.println(Arrays.toString(sol));
		for(int r=0;r<cl;r++)
		{
			for(int  c=1;c<amnt+1;c++)
			{
				
				if(coin[r]<=c)
				{
					if(sol[c-coin[r]] <sol[c])
					{
						sol[c]=sol[c-coin[r]]+1;
					}
					
					
				}
				
				
			}
			
			
			
			
		}
		
		
		System.out.println(Arrays.toString(sol));
		
		
		
		return sol[amnt];
		
		
	}
	

	
	
	
	
	
	//end of method
}

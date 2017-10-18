package CoinChangeMinNoOfCoin;

import java.util.Arrays;

public class MinCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coin[]={2,500};
		MinCoins(coin,20);
		
	}

	static void MinCoins(int coin[],int amount)
	{
		int sol[]=new int[amount+1];
		for(int i=1;i<amount+1;i++)
			sol[i]=99999;
		
		for(int r=0;r<coin.length;r++)
		{
			for(int c=1;c<amount+1;c++)
			{
				if(coin[r]<=c && sol[c-coin[r]]+1<sol[c] )
				{
					sol[c]=sol[c-coin[r]]+1;
					
				}
				
				
			}
			
			
			
		}
		
		System.out.println(sol[amount]);
		System.out.println(Arrays.toString(sol));
		
	}
	
}

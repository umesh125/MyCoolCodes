package CoinChangeNoOfWay;

public class CoinChnges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int coin[] = { 1, 2, 3 };
		NoOfWay(coin,5);
	}

	static int NoOfWay(int coin[], int amount) {
		int cl = coin.length;

		int sol[][] = new int[cl + 1][amount + 1];
		for (int r = 0; r < cl + 1; r++)
			sol[r][0] = 1;
		for(int r=1;r<cl+1;r++)
		{
		for(int c=1;c<amount+1;c++)
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
		
		for(int i=0;i<cl+1;i++)
		{
			for(int j=0;j<amount+1;j++)
			{
				System.out.print("["+sol[i][j]+"]");
			}
		System.out.println();
		
		}
		
		System.out.println(sol[cl][amount]);
		

		return sol[cl][amount];
	}
}

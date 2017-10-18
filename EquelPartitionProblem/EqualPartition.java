package EquelPartitionProblem;

public class EqualPartition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int in[] = { 3, 1, 1, 2, 2, 1 };
		
		EqPar(in);
		

	}

	static boolean EqPar(int a[]) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++)
			sum = sum + a[i];

		if (sum % 2 != 0)
			return false;

		boolean sol[][] = new boolean[len + 1][sum / 2 + 1];

		for(int r=0;r<len + 1;r++)
		sol[r][0]=true;
			
	for(int r=1;r<len+1;r++)
	{
		
		for(int c=1;c<sum/2+1;c++)
		{
			sol[r][c]=sol[r-1][c]; /*Most Important Step */
			if(a[r-1]<=c)
			{
				sol[r][c]=sol[r][c]||sol[r-1][c-a[r-1]];
			}
			
			
		}
				
	}

		
		
		
		System.out.println(sol[len][sum/2]);
		
		return sol[len ][sum / 2 ];
	}

}

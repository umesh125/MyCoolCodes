package algo.UpperTriangular;

public class PrintUpperTriangular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]=new int[5][5];
		int val=10;
		for(int r=0;r<5;r++)
		{
			for(int c=0;c<5;c++)
			{
				mat[r][c]=++val;
			}
			
		}
		
		for(int r=0;r<5;r++)
		{
			for(int c=0;c<5;c++)
			{
				
				System.out.print("["+mat[r][c]+"]");
			}
			System.out.println();
			
		}
		
		
		
		
		
		for(int r=0;r<5;r++)
		{
			for(int c=0;c<5;c++)
			{
				if(r>=c)
				System.out.print("["+mat[c][r]+"]");
			}
			System.out.println();
			
		}
		
		
	}

}

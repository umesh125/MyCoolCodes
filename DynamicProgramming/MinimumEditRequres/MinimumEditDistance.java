package DynamicProgramming.MinimumEditRequres;

public class MinimumEditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Minimum Edit Required to equate Two String");
String s1="back";
String s2="jacky";
System.out.println("Min edit Requires to equate "+s1+"  "+s2+"  " +MinEditReq(s1,s2));

	}
	
	static int MinEditReq(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int sol[][]=new int[l1+1][l2+1];
		for(int r=1;r<l1+1;r++)
		{
			sol[r][0]=r;
			
		}
		
		
		for (int c=1;c<l2+1;c++)
		{
			sol[0][c]=c;
			
		}
		
		
		for(int r=1;r<l1+1;r++)
		{
			
			for(int c=1;c<l2+1;c++)
			{
				if(s1.toLowerCase().charAt(r-1)==s2.toLowerCase().charAt(c-1))
				{
					sol[r][c]=sol[r-1][c-1];
				}
				else
				{
					
					sol[r][c]=Math.min(sol[r-1][c-1], Math.min(sol[r-1][c],sol[r][c-1]))+1;
					
				}
				
			}
			
			
		}
		
		for(int i=0;i<l1+1;i++)
		{
			for(int j=0;j<l2+1;j++)
				System.out.print("["+sol[i][j]+"]");
		System.out.println();
		}
		return sol[l1][l2];
		
		
	}
	

}

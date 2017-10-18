package StringInterLeaving;

public class SI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(IsIL("xy","x","xxy"));
		
		
	}

	static boolean IsIL(String s1,String s2,String s3)
	{
		
		if((s1.length()+s2.length())!=s3.length())
		{
			return false;
		}
		
		boolean sol[][]=new boolean[s1.length()+1][s2.length()+1];
		
		
		
		
		for(int r=0;r<sol.length;r++)
		{
			for(int c=0;c<sol[0].length;c++)
			{
			
				int l=r+c-1;
				if(r==0 && c==0)
				{
					
					sol[r][c]=true;
				}
				else if(r==0)
				{
					if(s3.charAt(l)==s2.charAt(c-1))
					{
						sol[r][c]=sol[r][c-1];
					}
					
					
				}
	
				else if(c==0)
				{
					
					if(s3.charAt(l)==s1.charAt(r-1))
					{
						
						sol[r][c]=sol[r-1][c];
						
					}
					
				}
				else if(s3.charAt(l)==s2.charAt(c-1) && s3.charAt(l)!=s1.charAt(r-1))
				{
					
					sol[r][c]=sol[r][c-1];
					
				}
				else if(s3.charAt(l)!=s2.charAt(c-1) && s3.charAt(l)==s1.charAt(r-1))
				{
					
					sol[r][c]=sol[r-1][c];
					
				}
				
				else if(s3.charAt(l)==s2.charAt(c-1) && s3.charAt(l)==s1.charAt(r-1))
				{
					
					sol[r][c]=sol[r-1][c]||sol[r][c-1];
					
				}
				
				
				
				
			}
			
			
	}
		
		
		for(int i=0;i<sol.length;i++)
		{
			for(int j=0;j<sol[0].length;j++)
			{
				
				System.out.print("["+sol[i][j]+"]");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		return sol[s1.length()][s2.length()];
	}
	
}

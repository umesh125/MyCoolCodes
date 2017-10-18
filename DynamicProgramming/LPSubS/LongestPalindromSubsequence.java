package DynamicProgramming.LPSubS;

public class LongestPalindromSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Longest Pal Subsequnce");
		String s="abaoiytgioruigygytu iuiordugiouiofdugoidugio udfioguoifdug iofdu";
	//
		System.out.println("len of Longest Palindrom subsequence  using dp  "+DP_LPSS(s.toCharArray()));
		
		//System.out.println("lenght of longest palindromic subsequence  using recursion "+LPSRecursive(s.toCharArray(),0,s.length()));
	}

	static int DP_LPSS(char str[])
	{
		int sol[][]=new int[str.length+1][str.length+1];
		for(int r=0;r<str.length;r++)
		{
			sol[1][r]=1;
		}
		
		for(int r=0;r<str.length+1;r++)
		{
			for(int c=0;c<str.length+1;c++)
			{
				System.out.print("["+sol[r][c]+"]");
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		for(int c=2;c<=str.length;c++)
		{
			for(int r=1;r<=str.length-c+1;r++)
			{
				
				if(str[r-1]==str[r-1+c-1] && c==2)
				{
					sol[c][r]=2;
				}
				else if(str[r-1]==str[r+c-2])
				{
					sol[c][r]=sol[c-2][r+1]+2;
				}
				else
				{
					sol[c][r]=Math.max(sol[c-1][r+1], sol[c-1][r]);
				}
			}
			
			
			
		}
		
		
		for(int r=0;r<str.length+1;r++)
		{
			for(int c=0;c<str.length+1;c++)
			{
				System.out.print("["+sol[r][c]+"]");
			}
			System.out.println();
			
		}
		
		
		
		
		return sol[str.length][1];
	}
	
	
	
	
	
	static int LPSRecursive(char str[],int start,int len)
	{
		if(len==0)
			return 0;
		if(len==1)
			return 1;
		
		if(str[start]==str[start+len-1])
		{
			return 2+LPSRecursive(str,start+1,len-2);
			
		}
		else
		{
			return Math.max(LPSRecursive(str,start+1,len-1),LPSRecursive(str,start,len-1));
			
		}
		
		
		
	}
	
	
}

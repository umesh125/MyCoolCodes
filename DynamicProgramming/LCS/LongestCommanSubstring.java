package DynamicProgramming.LCS;

public class LongestCommanSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Finding Longest Comman Substring");
String s1="xyz";
String s2="abcy";

LongestCommanSubstring o=new LongestCommanSubstring();
System.out.println(" "+o.LCS(s1, s2));

}

	int LCS(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int max=0;
		int sol[][]=new int[l1+1][l2+1];
		
		
		for(int r=1;r<l1+1;r++)
		{
			for(int c=1;c<l2+1;c++)
			{
				if(s1.toLowerCase().charAt(r-1)==s2.toLowerCase().charAt(c-1))
				{
					sol[r][c]=sol[r-1][c-1]+1;
					if(sol[r][c]>max)
						max=sol[r][c];
				}
				
				
				
				
			}
			
			
		}
		
		
		for(int r=1;r<l1+1;r++)
		{
			for(int c=1;c<l2+1;c++)
			{
				System.out.print(" "+sol[r][c]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		return max;
	}
	
}

package DynamicProgramming.LCSubS;

public class LongestCommonSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Implementing Longest Comman Subsequence");
String s1="umesh";
String s2="uamxecsgh";
System.out.println("Length of the longest comman subsequece "+LCSubS(s1,s2));

//LongestCommonSubSequence o=new LongestCommonSubSequence();

	}
	
	
	
	
 static int LCSubS(String s1,String s2)
{

int max=0;
int l1=s1.length();
int l2=s2.length();
int sol[][]=new int[l1+1][l2+1];
for (int r=1;r<l1+1;r++)
{
	for(int c=1;c<l2+1;c++)
	{
		if(s1.toLowerCase().charAt(r-1)==s2.toLowerCase().charAt(c-1))
		{
			sol[r][c]=sol[r-1][c-1]+1;
		}
		else
		{
			sol[r][c]=Math.max(sol[r-1][c], sol[r][c-1]);
		}
		
	}
	
	
	
}

return sol[l1][l2];
}
	
	
}

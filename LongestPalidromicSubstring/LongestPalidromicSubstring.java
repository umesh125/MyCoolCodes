package LongestPalidromicSubstring;

public class LongestPalidromicSubstring {

	/**
	 * @param args
	 * Algorithm:
	 * 1.for i where i<string lenght -1
	 * if string length is even  then assign leftIndex=i and RightIndex=i+1
	 * else
	 * assign leftIndex=i and RightIndex=i
	 * Then LeftSubstring=LeftSubstring+input[l] and RigthtSubstring=RightSubstring+Input[r]
	 * if both substring are equal then update max lenght =r-1+1
	 * then if possible then leftIndex-- and RightIndex++
	 * continue above step util i<stringlen-1
	 * 
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub

		LongPalLen("aabbaa");
	}

	static void LongPalLen(String s)
	{
		String lp="";
		int a=0;
		int len=s.length();
		for(int i=0;i<len-1;i++)
		{
			String left="";
			String right="";
			int l=0;
			int r=0;
			if(len%2==0)
			{
				/* even lenght palindrom possible */
			l=i;
			r=i+1;
			}
			else
			{
				/* Odd length palindrom possible*/
			 l=i;
			 r=i;
			}
			while(l>=0 && r<len)
			{
				left=left+s.charAt(l);
				right=right+s.charAt(r);
				
				System.out.println("left :"+left+" right:"+right);
				if(left.equalsIgnoreCase(right))
				{
					a=Math.max(a, r-l+1);
					
					
				}
				
				
				l--;
				r++;
				
			}
			
			
			
			
			
		}
		
		System.out.println(a);
		System.out.println(lp);
		
	}
	
	
	
}

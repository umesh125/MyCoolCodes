package PatternMathing.KMP;

import java.util.Arrays;

public class KMP_SbstringSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ptrn="umesh";
		String txt="  umesh jhghjgj ";
		CmptTempArr(ptrn.toCharArray());
		KMP(txt.toCharArray(),ptrn.toCharArray());
		
	}

	static int[] CmptTempArr(char ptrn[])
	{
		int lps[]=new int[ptrn.length];
		int indx=0;
		
		for(int i=1;i<ptrn.length;)
		{
		if(ptrn[indx]==ptrn[i])
		{
			lps[i]=indx+1;
			i++;
			indx++;
			
			
		}
		else
		{
			if(indx==0)
			{
				lps[i]=0;
				i++;
				
			}
			else
			{
				indx=lps[indx-1];	
			}
			
			
		}
		
		
			
		}
		
		
		
		
		return lps;
		
		
	}
	
	
	
	static boolean KMP(char txt[],char[] pattern)
	{
		int[] lsp=CmptTempArr(pattern);
		int t=0;
		int p=0;
		while(t<txt.length && p<pattern.length)
		{
			if(txt[t]==pattern[p])
			{
				t++;
				p++;
				
			}
			else
			{
				if(p!=0)
				{
					p=lsp[p-1];
				}
				else
				{
					t++;
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		if(p==pattern.length)
		{
		
			
			System.out.println("found at "+((t-p)+1));
			return true;
			
		}
			
		
		
		
		
		return false;
	}
	
	
	
}

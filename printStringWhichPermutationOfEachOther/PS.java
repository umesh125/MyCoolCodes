package printStringWhichPermutationOfEachOther;

import java.util.Arrays;

public class PS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub                   
		String input="act cat dog tac abc god bac";
		String ia[]=input.split(" ");
		//Arrays.sort(ia);
		System.out.println(Arrays.toString(ia));
		String oa[]=new String[ia.length];
		for(int i=0;i<oa.length;i++)
		{
			oa[i]=schar(ia[i]);
			
		}
		System.out.println(Arrays.toString(oa));
		
		boolean printed[]=new boolean[ia.length];
		
		System.out.println(Arrays.toString(printed));
		for(int j=0;j<oa.length;j++)
		{
			for(int k=j+1;k<oa.length;k++)
			{
				if(!printed[j] && oa[j].equals(oa[k]))
				{
					System.out.print(" "+ia[j]);
					System.out.print(" "+ia[k]);
					printed[j]=true;
					//printed[k]=true;
					
				}
				
				
			}
			
			
			
		}
		System.out.println(Arrays.toString(printed));
		
		
	}

	static String schar(String i)
	{
		char t[]=i.toLowerCase().toCharArray();
		Arrays.sort(t);
		//System.out.println(Arrays.toString(t).replace(" ","").replace(",","").replace("[","").replace("]",""));
		return Arrays.toString(t).replace(" ","").replace(",","").replace("[","").replace("]","");
		
	}
	
}

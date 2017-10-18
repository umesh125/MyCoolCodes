package DynamicProgramming.MaximumSumOfContiIncSubArray;

import java.util.Arrays;

public class MaximumSumOfContIncSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int input[]={712121,1,5,8,2,5,6,9,10,25,11,10,9,8,7,6,5,4,3,700,6565};
		System.out.println("Maximum sum "+maximumSum(input));
		
		String s="451.12";
		float f=Float.parseFloat(s);
		System.out.println(f);
		
	}
	
	
	static int maximumSum(int input[])
	{
		int max=0;
		int sol[]=new int[input.length];
		for(int i=1;i<input.length;i++)
		{
			if(input[i-1]<input[i])
			{
				sol[i]=Math.max(input[i-1]+input[i], sol[i-1]+input[i]);
				if(max<sol[i])
					max=sol[i];
			}
			
			
			
		}
		
		
		
		System.out.println(Arrays.toString(sol));
		
		
		return max;
	}

}

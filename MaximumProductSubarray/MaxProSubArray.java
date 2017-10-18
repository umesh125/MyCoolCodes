package MaximumProductSubarray;

import java.util.Arrays;

public class MaxProSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={-6,-3,-10,2};
		
		myMethod(a);
		
		
	}

	static void myMethod(int a[])
	{
		if(a==null||a.length==0)
			return;
	
		
		int mx=a[0];
		int min=a[0];
		int g=a[0];
		
		
		for(int i=1;i<a.length;i++)
		{
			int tmp=mx;
			mx=Math.max(Math.max(a[i]*mx, a[i]), a[i]*min);
			min=Math.min(Math.min(a[i]*tmp, a[i]), a[i]*min);
			g=Math.max(g, mx);
			
			
			
			
		}
		
		
		System.out.println(g);
		
	}
		
		
		
}

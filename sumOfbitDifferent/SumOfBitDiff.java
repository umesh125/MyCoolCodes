package sumOfbitDifferent;

public class SumOfBitDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

		
		int a[]={1,2,5,3};
		int len=a.length;
		int x=60;
		
		
		System.out.println(1<<x);
		sumOfbitDiff(a);
		
	}

	static void sumOfbitDiff(int a[])
	{
		
		int ans=0;
		
		for(int i=0;i<32;i++)
		{
			int c=0;
			
			
			for(int j=0;j<a.length;j++)
			{
				if((a[j]&1<<i)!=0)
				{
					c++;
				//System.out.println(a[j]&1<<i);
				}
				
			}
			
			
			ans+=(c*(a.length-c)*2);
			
		}
		
		
		
		System.out.println(ans);
		
	}
	
}

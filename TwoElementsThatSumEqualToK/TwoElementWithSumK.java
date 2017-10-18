package TwoElementsThatSumEqualToK;

public class TwoElementWithSumK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={12,1,2,3,4,5,6,9,8,7,5};
		Elements(a,16);
		
	}

	static void Elements(int a[],int k)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(k==a[i]+a[j])
				{
					System.out.println(a[i]+","+a[j]);
					return;
				}
				
			}
			
			
		}
		
		
		
		
	}
}

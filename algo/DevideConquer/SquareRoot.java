package algo.DevideConquer;

public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("finding SquareRoot");
	//	System.out.println("Squar root of 5 is "+SqrR(5));

		int n=17;
		int sqr=0;
		
		int s=1;int end=17;
		int mid=(s+end)/2;
		if(mid*mid==n)
		{
			sqr=mid;
		}
									
		for(int i=1;i<=n;i++)
		{
			if(i*i<=n)
			{
				sqr=i;
				
			}
			
		}
		
		
		System.out.println("square root "+sqr);

	}


	
	
	
}

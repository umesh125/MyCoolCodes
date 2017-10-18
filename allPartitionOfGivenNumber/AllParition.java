package allPartitionOfGivenNumber;

public class AllParition {

	/**
	 * @param args
	 */
	static int p[]=new int[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		Partition(n,n,0);
		
		
	}

	static void Partition(int n,int k,int indx)
	{
		if(n==0)
		{
			for(int i=0;i<indx;i++)
			{
				
				System.out.print(p[i]);
				
			}
			System.out.println();
			
		}
		
		
		for(int i=k;i>0;i--)
		{
			if(i>n)
				continue;
			
			p[indx]=i;
			
			
			
			Partition(n-1,i,indx+1);
			
		}
		
		
		
	}
	
}

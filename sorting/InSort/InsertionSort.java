package sorting.InSort;

import java.util.Arrays;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={10,9,8,7,6,5,4,3,2,1};
		System.out.println("unsorted:"+Arrays.toString(a));
		
		/*for(int i=1;i<a.length;i++)
	{
			 System.out.print("["+a[i]+"]"	);   
		}
		
		
	System.out.println();*/
		
	
	
		InsrtnSrt(a);
		 System.out.println("sorted:"+Arrays.toString(a));
		
		
	}

	static void InsrtnSrt(int a[])
	{
		int i,key,j;
		for(i=1;i<a.length;i++)
		{
			
			
			for(j=i;j>0;j--)
			{
				
				if(a[j-1]>a[j])
				{
					
					int tmp=a[j-1];
					a[j-1]=a[j];
					a[j]=tmp;
				}
			}	
			
			
			
			
		}
		
		
		
	}
	
}

package sorting.bbl_sort;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub

int a[]={100,90,80,70,60,50,40,30,20,10};

System.out.println("Before Sorting :"+Arrays.toString(a));

bblsrt(a);
System.out.println("After Sorting   :"+Arrays.toString(a));
		
		
	}


	static void bblsrt(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
				
				//System.out.println("Before Sorting :"+Arrays.toString(a));	
			}
			
			
			//System.out.println("Pass "+(i+1)+" "+Arrays.toString(a));
		}
		
		
	}
	
	
	
}

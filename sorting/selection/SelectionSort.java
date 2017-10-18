package sorting.selection;
import java.util.Arrays;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={33,54,0,7,63,963,76,56,6565,-1,-66565};
		System.out.println("unsorted cgh "+Arrays.toString(a));
		SelSort(a);
		 System.out.println("sorted  "+Arrays.toString(a));
	}
	static void SelSort(int a[])
	{
		int len=a.length;
		int i,j,min_idx;
		for(i=0;i<len;i++)
		{
			min_idx=i;
			for( j=i+1;j<len;j++)
			{
			if(a[min_idx]>a[j])
				min_idx=j;
				
			}
			swap(i,min_idx,a);
			
		}
		
	}
	
	
	
	
	
static void swap(int i,int j,int a[])
	
	{
	int tmp=a[i];
	a[i]=a[j];
	a[j]=tmp;
	}	
		
	
	
	
}

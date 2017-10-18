package sorting.qsort;
import java.util.Arrays;

public class QSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={33,54,0,7,63,963,76,56};
		System.out.println("unsorted  "+Arrays.toString(a));
		 QckSrt(0,a.length-1,a);
		 System.out.println("sorted  "+Arrays.toString(a));
		
	}

	static void QckSrt(int lwr,int hir, int a[])
	{
	
		int i=lwr;
		int j=hir;
		int pvt=a[lwr+(hir-lwr)/2];
		
		while(a[i]<pvt)
		{
			i++;
		}
		
		while(pvt<a[j])
		{
			j--;
			
		}
		
		if(i<=j)
		{
			swap(i,j,a);
			i++;
			j--;
			
		}
		
		if(lwr<j)
			QckSrt(lwr,j,a);
		
		if(i<hir)
			QckSrt(i,hir,a);
	
	}
		
static void swap(int i,int j,int a[])
	
	{
	int tmp=a[i];
	a[i]=a[j];
	a[j]=tmp;
	}	
		
	
}

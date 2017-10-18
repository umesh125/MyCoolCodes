package sorting.merge;

import java.util.Arrays;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		System.out.println("unsorted  "+Arrays.toString(a));
		MrgSort(a,0,a.length-1);
		System.out.println("sorted  "+Arrays.toString(a));
		
	}

	static void  MrgSort(int a[], int lwr,int hir)
	{
		if(lwr<hir)
		{
			int mid=lwr+(hir-lwr)/2; /* same as (hir-lwr)/2 ,but avoid overflow for large hir, lwr    */
			
			
			MrgSort(a,lwr,mid);
			//System.out.println("  after left  lwr :"+lwr+"  hir:"+hir+"  mid:"+mid);
			MrgSort(a,mid+1,hir);
			//System.out.println("  after right  lwr :"+lwr+"  hir:"+hir+"  mid:"+mid);
			Merge(a,lwr,mid,hir);
		}
	}
	
	static void  Merge(int a[], int lwr,int mid,int hir)
	{
	
		int i,j,k;
		int l1=mid-lwr+1;
		int l2=hir-mid;
		
		int L[]=new int[l1];
		int R[]=new int[l2];
		
		
		for(i=0;i<l1;i++)
			L[i]=a[i+lwr];
		System.out.println("L:"+Arrays.toString(R));
	
		
		for(j=0;j<l2;j++)
			R[j]=a[mid+1+j];
		
		System.out.println("R:"+Arrays.toString(R));
		
		i=0;
		j=0;
		k=lwr;
		
		while (i<l1 && j<l2)
		{
			
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else 
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		
		while(i<l1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		
		
		while(j<l2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
		
		
		
	}
	
}

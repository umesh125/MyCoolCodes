package com.algo.ngn;

import java.util.Arrays;

public class Nxt_GN {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fndng nx grr n ");
		
		 
		 int a[]={5,3,4,9,7,6};
		
		
		System.out.println(Arrays.toString(a));
		NextGint(a);
	
		String um="5651556655";
		char[] cm=um.toCharArray();
		
		
		
		System.out.println(Arrays.toString(cm));
		
		String s=Arrays.toString(a).replace("]","").replace("[","").replace(",","").replace(" ","");
		
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		
		
		
	}
	
	static void NextGint(int a[])
	{
		int i;
		for( i=a.length-1;i>0;i--)
			if(a[i-1]<a[i])
				break;
		
		if(i==0)
		{
			System.out.println("NOT POSSIBLE");
			return;
		}
		
		System.out.println("x "+a[i-1]);
		System.out.println("i "+i);
		int x=a[i-1];
		int smallest=i;
		for ( int k=i+1;k<a.length;k++)
		{
			
			
			if(x<a[smallest] && a[smallest] >a[k])
			{
				
			
				smallest=k;
				
				
			}
			
			
		}
		
		
swap(i-1,smallest,a);
System.out.println(Arrays.toString(a));
	Qsort(i,a.length-1,a);

	}
	
	
	
	
	
	
	
	
	
	static void swap(int i,int j,int a[])
	
	{
	int tmp=a[i];
	a[i]=a[j];
	a[j]=tmp;
	}
	
	public static void Qsort(int lwr,int hir, int a[])
	{
	
		
		int i=lwr;
		int j=hir;
		
		int pvt =a[lwr+(hir-lwr)/2];
		
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
			Qsort(lwr,j,a);
		
		if(i<hir)
			Qsort(i,hir,a);
	
	}

}

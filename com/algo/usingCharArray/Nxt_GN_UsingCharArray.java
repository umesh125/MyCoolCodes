package com.algo.usingCharArray;

import java.util.Arrays;
import java.util.Scanner;


public class Nxt_GN_UsingCharArray {

	/**
	 * @param args
	 */
	
	static String finalString = "";
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int Cs=scr.nextInt();
		for(int i=0;i<Cs;i++)
		{
		int output;
		
		int num=scr.nextInt();
		//String ons="534976";
		String ons=""+num;
		char[] a=ons.toCharArray();
		int on=Integer.parseInt(ons);
		//System.out.println(on);
		output=NextGint(a);
		//output=""+Arrays.toString(a).replace("]","").replace("[","").replace(",","").replace(" ","");
		if(output!=0)
		{
		finalString=finalString+output;
		}
		else 
		{
			finalString=finalString+"NOT POSSIBLE";	
		}
		finalString=finalString+"@";
		}
		
		
		
		String strs[] = finalString.split("@");
		for(int i=0; i < strs.length; i++)
		System.out.println("Case #"+(i+1)+": " + strs[i]);


		
		

		


		 
	}

	
	static int NextGint(char a[])
	{
		
		int i;
		for( i=a.length-1;i>0;i--)
			if(a[i-1]<a[i])
				break;
		
		if(i==0)
		{
			//System.out.println("NOT POSSIBLE");
			return 0;
		}
		
		
		int pvt=a[i-1];
		int indexOfsmallest=i;
		for ( int k=i+1;k<a.length;k++)
		{
			
			
			if(pvt<a[indexOfsmallest] && a[indexOfsmallest] >a[k])
			{
				
			
				indexOfsmallest=k;
				
				
			}
			
			
		}
		
		
swap(i-1,indexOfsmallest,a);

	Qsort(i,a.length-1,a);
	String s=Arrays.toString(a).replace("]","").replace("[","").replace(",","").replace(" ","");
	
	int n=Integer.parseInt(s);
	//System.out.println(n);
	
	return n;
	}
	
	
	
	
	
	
	
	public static void Qsort(int lwr,int hir, char a[])
	{
	
		
		int i=lwr;
		int j=hir;
		
		char pvt =a[lwr+(hir-lwr)/2];
		
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
	
static void swap(int i,int j,char a[])
	
	{
	char tmp=a[i];
	a[i]=a[j];
	a[j]=tmp;
	}
	
	
	
}

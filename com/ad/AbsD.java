package com.ad;

import java.util.Scanner;
import java.util.Arrays;

public class AbsD {

	/**
	 * @param args
	 */
	
	public static long fib(int n)
	
	{
		long rs[]=new long[n+1];
		rs[1]=1;
		rs[2]=1;
		for(int i=3;i<=n;i++)
		{
			rs[i]=rs[i-1]+rs[i-2];
		}
		return rs[n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System .in);
		int s=sc.nextInt();
		for (int i=2;i<=s;i++)
		System.out.println(fib(i)+"  ");
		
	}

}

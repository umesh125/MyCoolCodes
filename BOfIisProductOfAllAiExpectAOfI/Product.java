package BOfIisProductOfAllAiExpectAOfI;

import java.util.Arrays;

public class Product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

int a[]={1,2,3,415,665656,32,36,95,44,56};

Product(a);
}

	static void Product(int a[])
	{
		long b[]=new long[a.length];
		long p=1;
		
		for(int i=0;i<a.length;i++)
			p=p*a[i];
		
	//	System.out.println(p);
		
		for(int j=0;j<b.length;j++)
			b[j]=(p/a[j]);

		System.out.println(Arrays.toString(a));
		System.out.println(p);
		System.out.println(Arrays.toString(b));
		
		
	}
	
}

package algo.Recursion.ReverseArray;

import java.util.Arrays;

public class RevArrUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reverse array using recursion");
		int a[]={1,2,3,4,5,6,7,8,9,45,55,55,65,65,87,65,65,45,62,65,65,98,65,32,12,45,78,44,22,33,66,11,89,898,21,23};
		RevArray(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		IterativePower(12,10);
		
		System.out.println("Power  "+power(12,10));
	}

	static long power(int n,int index)
	{
		if(index==0)
			return 1;
		
		if(index==1)
			return n;
		
		return n*power(n,index-1);
}
	
	
	static void IterativePower(int num,int index)
	{
	
		
		
	if(index==0)
	{
		System.out.println(1);
		return;
	}
		
	if(index==1)
	{
		System.out.println(num);
		return;
	}
	long p=1;
	for(int i=0;i<index;i++)
	{
		
		p=p*num;
		
	}
	
	System.out.println(num+" ^ "+index+" ="+p+ "        Using iterative approach");
	
	
		
	}
	
	 static void RevArray(int a[],int i,int j)
	 {
		 if(i<j)
		 {
			 int tmp=a[i];
			 a[i]=a[j];
			 a[j]=tmp;
			 
			 RevArray(a,i+1,j-1);
			 
			 
		 }
		 
	 }
	
}

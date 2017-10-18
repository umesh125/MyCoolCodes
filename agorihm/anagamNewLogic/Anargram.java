package agorihm.anagamNewLogic;

import java.util.Arrays;

public class Anargram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println("Implemanting Anargram Wit different logic");
		String w1="replicationss";
		String w2="inspectorials";
		char c1[]=w1.toLowerCase().toCharArray();
		char c2[]=w2.toLowerCase().toCharArray();
		System.out.println(" "+w1);
		System.out.println(" "+w2);
		//Arrays.sort(c1);
		//Arrays.sort(c2);
		qsort(c1);
		qsort(c2);
		System.out.println(" "+Arrays.toString(c1));
		System.out.println(" "+Arrays.toString(c2));
		if((Arrays.toString(c1)).equals(Arrays.toString(c2)))
		{
			System.out.println(w1+" , "+w2+" Are anagrams");
			
		}
		
		else
		{
			
			System.out.println(w1+" , "+w2+" Are Not anagrams");
		}
		}
	
	static void qsort(char a[])
	{
		int len=a.length;
		qsort(a,0,len-1);
		
	}
	static void qsort(char a[],int l,int h)
	{
		char p=a[l+(h-l)/2];
		int i=l;
		int j=h;
		while(a[i]<p)
		{
			i++;
		}
		
		while(p<a[j])
		{
			j--;
		}
		if(i<=j)
		{
			char tmp=a[i];
			a[i]=a[j];
			a[j]=tmp;
			i++;
			j--;
			
			
		}
		if(i<=h)
			qsort(a,i,h);
		
		if(j>=l)
			qsort(a,l,j);
		
	}
	

}

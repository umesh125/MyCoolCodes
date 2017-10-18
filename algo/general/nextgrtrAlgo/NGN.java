package algo.general.nextgrtrAlgo;

import java.util.*;


public class NGN {

	/**
	 * @param args
	 * Algorithm:
	 * if all digit are sort descending  order then next greater number is not possible
	 * consider number 218765 
	 * Now find such number from right (from 5) whose break ascending order of digit in above case 
	 * that number is 1
	 * now find smallest digit from right side of 1 such that whose value greater than 1 that number will be 5
	 * swap 1 with 5 we will get 258761
	 * sort right side array of 5 number becomes 251678 
	 * That is next greater number
	 *  
	 * 
	 * 
	 */
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number");
		String num=scr.next();
		System.out.println("Given No "+num);
	//char numA[]=num.toCharArray();
	/*System.out.println(" Array "+Arrays.toString(numA));
	System.out.println("lenght "+numA.length);*/
	NxtGrtrNo(num.toCharArray());
	
	//Qsort(numA,0,numA.length-1);
	
	/*System.out.println(" Array "+Arrays.toString(numA));*/
	}
	
	static void NxtGrtrNo(char a[])
	{
		// check first digit  which does not follow ascending sequence from right  consider as special number 
		// in number 218765 special number will be 1
		int len=a.length;
		int i=0,j;
		for(i=len-1;i>0;i--)
		{
			
			if(a[i-1]<a[i])
			{
				
				break;
			}
			
			
		}
		// if such number is not found then Next Greater Number Not Possible for example 4321 
		
		
		if(i==0)
		{
			System.out.println("NOT POSSIBLE");
			return;
		}
		int x=a[i-1]; //x is special digit 
		int smlst=i;// next to x is consider as smallest in  right side smlst is index of that 
		for(j=i+1;j<len;j++) // from right side entire number finding smallest digit whose value greater than special digit  
		{
			if(a[j]> x && a[j] <a[smlst] ) 
			{
				smlst=j;
			}
			
		}
		
		char tmp=a[i-1];//swaping smallest digit with special number
		a[i-1]=a[smlst];
		a[smlst]=tmp;
		
		Qsort(a,i,len-1);//sort number digits with is right side to new updated special number
		

		System.out.println(" "+Arrays.toString(a).replace(",", "").replace("[","").replace("]", "").replace(" ",""));
		
		
		
		
	}
	
	
	static void Qsort(char a[],int l,int h)
	{
		char pvt=a[l+(h-l)/2];
		int i=l,j=h;
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
			char tmp=a[i];
			a[i]=a[j];
			a[j]=tmp;
			i++;
			j--;
			
		}
		
		
		if(l<j)
		{
		Qsort(a,l,j);	
		}
		
		
		
		if(i<h)
		{
			Qsort(a,i,h);
		}
		
		}
		
		
	}



package NextGreaterEvenNumber;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scr=new Scanner(System.in);
		System.out.println("Enter No");
		int input=scr.nextInt();
		//String s=""+input;
		//char no[]=s.toCharArray();
		//System.out.println(" "+NGN(no));
		nextE(input);
		
	}

	static void nextE(int n)
	{
		String s=""+n;
		char no[]=s.toCharArray();
		int rs=NGN(no);
		//System.out.println("rs    " +rs);
		if( rs%2==0)
		{
			System.out.println(rs);
			return; 
		}
		
		if( rs==-1)
		{
			System.out.println("Not Possible ");
			return; 
		}
		
		nextE(rs);
		
		
	}
	
	
	static int NGN(char no[])
	{
		int l=no.length;
		
		int i;
		for(i=l-1;i>0;i--)
		{
			if(no[i-1]<no[i])
			{
				
				break;
				
				
			}
			
		
		}
		
		if(i==0)
		{
			return -1;
		}
		
		int sn=no[i-1];
		int indxofsmallest=i;
		for(int a=i+1;a<l;a++)
		{
			if(sn<no[a] && no[indxofsmallest]>no[a])
			{
				
				indxofsmallest=a;
				
			}
			
			
		}
		
		char tmp=no[indxofsmallest];
		no[indxofsmallest]=(char) sn;
		no[i-1]=tmp;
		sort(no,i,l-1);
		
		String r=Arrays.toString(no).replace("[","").replace("]","").replace(",", "").replace(" ","");
		
		int res=Integer.parseInt(r);
		
		
		
		
		
		
		
		return res;
	}
	
	
	static void sort(char a[],int l,int h)
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
			char t=a[i];
			a[i]=a[j];
			a[j]=t;
			
			i++;
			j--;
	}
	
		if(l<j)
		{
			sort(a,l,j);
			
		}
		
		if(h>i)
		{
			sort(a,i,h);
			
			
		}
		
		
		
	}
	
	
	
	
}

package DiagonalDiff;

import java.util.Scanner;

public class DD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr=new Scanner(System.in);
		
		
		
		int N=scr.nextInt();
		int a[][]=new int[N][N];
		//System.out.println(a.length);
		//System.out.println(a[0].length);
		int d1=0;
		int d2=0;
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				
				a[r][c]=scr.nextInt();
				
				if(r==c)
				{
					d1=d1+a[r][c];
				}
				
				if((r+c)==a.length-1)
				{
					
					d2=d2+a[r][c];
				}
				
			}
			
		}
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("Abs Difference :"+Math.abs(d1-d2));
	}

}

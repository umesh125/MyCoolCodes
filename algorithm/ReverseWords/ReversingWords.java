package algorithm.ReverseWords;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class ReversingWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Sentence ");
		Scanner scr=new Scanner(System.in);
		String s=scr.nextLine();
		String sa[]=s.split(" ");
		System.out.println(" "+Arrays.toString(sa));
		for(int i=0;i<sa.length-i;i++)
		{	String tmp=sa[i];
				sa[i]=sa[sa.length-1-i];
				sa[sa.length-1-i]=tmp;
				
		}
		
		System.out.println("output : "+Arrays.toString(sa).replace("[","").replace("]","").replace(",", ""));
		
		
		
	}

}

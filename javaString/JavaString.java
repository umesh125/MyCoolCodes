package javaString;
import java.util.*;

public class JavaString {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int num=100;
		char ch='b';
		
		switch(ch)
		{
		case 'a':
			System.out.println("One");
			break;
		case 'b':
			System.out.println("Ten");
			break;
			default:
				System.out.println("Wrong Number");
			
			
		
		
		
		
		
		
		}
		
		
		
		
		int[] a = { 12, 32, 65, 322 };

		String str = "A";
        //convert String to byte array
        byte[] byteArr = str.getBytes();
        System.out.println("String to byte array : "+Arrays.toString(byteArr));
		
		
		String u1 = "umesh";
		String u2 = "umesh";

		char arr[]=u1.toCharArray();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]+" ");
		
		
		
		System.out.println(u1.compareTo(u2));
		System.out.println(u1.equals(u2));

		/*
		 * String s="bnbabnb"; System.out.println(s);
		 * System.out.println(s.toUpperCase());
		 * 
		 * 
		 * String u=s.replaceAll("b", "x"); System.out.println(u);
		 * 
		 * isPal(s);
		 */
		/*
		 * System.out.println(s);
		 * 
		 * String s1="madam"; StringBuilder s2=new StringBuilder(s1);
		 * s2.reverse(); System.out.println(s1+" "+s2);
		 */

	}

	static void isPal(String input) {
		int l = input.length();

		for (int i = 0; i < l / 2; i++) {
			if (input.charAt(i) != input.charAt(l - 1 - i)) {
				System.out.println("Not Palindrom");
				return;

			}

		}
		System.out.println("It is Palindrom");

	}

}

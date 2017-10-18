package Anagrams;

import java.util.Arrays;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Listen";
		String s2="silent";
		isAnagram(s1,s2);
		
		
		
	}
	
	static void isAnagram(String s1,String s2)
	{
		
		
		char sc1[]=s1.replace(" ", "").toLowerCase().toCharArray();
		char sc2[]=s2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(sc1);
		Arrays.sort(sc2);
		System.out.println(sc1);
		System.out.println(sc2);
		if((sc1.toString()).equals(sc1.toString()))
		{
			
			System.out.println(s1+" "+s2+" are  Anagram");
		}
		else
		{
			
			System.out.println(s1+" "+s2+" Not Anagram");
		}
		
		
	}

}

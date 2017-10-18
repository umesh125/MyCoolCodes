package LongestStringWithEqualNumberOfZeroAndOne;
import java.util.*;
public class LongestStringWithEqualZeroOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub

		String input="1100000000001";
		maxlen(input.toCharArray());
		
		
	}
	
	
	static void maxlen(char in[])
	{
		Arrays.sort(in);
		System.out.println(Arrays.toString(in));
		int pvt=0;
		int ans=0;
		for(int i=0;i<in.length;i++)
		{
		
			if(in[i]!=in[i+1])
			{
				pvt=i+1;// first 1 ns index
				if(pvt<=in.length/2)
					ans=(pvt)*2;
				else
					ans=(in.length-pvt)*2;

				break;
			}
		}
		
		
		
		
		
		
	
		System.out.println("ANS: "+ans);
		
	}
	
	}
	


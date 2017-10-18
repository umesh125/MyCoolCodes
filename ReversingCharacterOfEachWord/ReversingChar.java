package ReversingCharacterOfEachWord;

public class ReversingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		String s="Information Technology";
		s=s+" ";
		String w="";
		String output="";
		for(int i=0;i<s.length();i++)
		{
			
			w=w+s.charAt(i);
			
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
			
			for(int j=w.length()-1;j>=0;j--)
			{
				
				output=output+w.charAt(j);
				
			}
			
			
	        w="";			
				
			}
			
			
			
			
			
		}
		
		
		
		
		output=output.substring(1);
		System.out.println(output);
		
	}

}

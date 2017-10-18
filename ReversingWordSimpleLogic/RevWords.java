package ReversingWordSimpleLogic;

public class RevWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String u="umesh";
		//System.out.println(u.substring(0, 3));
		
		String s="one two three four five six seven eight";
		s="this is morgan stanley Interview question";
		s=s+" ";
		String out="";
		String w="";
		System.out.println(s+":");
		for(int i=0;i<s.length();i++)
		{
			
				w=w+s.charAt(i);
				
			
			
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				//System.out.println(w+ "l:"+w.length());
			    out=w+out;
				w="";
				
			}
			
				}
		
		
		out=out.substring(0,out.length()-1);
	System.out.println(out+":");
		
		
	}

}

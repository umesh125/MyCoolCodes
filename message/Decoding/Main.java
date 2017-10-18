package message.Decoding;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="262626";
		
		
		System.out.println("Get Count:"+getCount(s,0));
	}

	
	
	static int getCount(String s,int i)
	{
		
		//System.out.println("");
		if(i+2>s.length())
		{
			
			return 1;
		}
		else
		{
			
			return getCount(s,i+1)+(Integer.parseInt(s.substring(i,i+2))<=26?getCount(s,i+2):0);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}

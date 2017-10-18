package cm.fct;

public class Factorial {

	/**
	 * @param args
	 */
	
	
	public static long fct(long n)
	{
		
		
		if(n<=1)
		{
		return 1;
		}
		
		else
		{
			return n*fct(n-1);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" fc "+fct(12));
	}

}

package general.palindrom;

public class CheckingPalindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ammmmmmmmmmma";
		System.out.println(Pldrm(s));
		
	}
static boolean Pldrm(String s)
{
	boolean isPalindrom=true;
	int sl=s.length();
	
	for(int i=0,j=sl-1;i<=j;i++,j--)
	{
		if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(j))
		{
			isPalindrom=false;
		}
		
		
		
	}
	
	
	
	
	return isPalindrom;
}
}

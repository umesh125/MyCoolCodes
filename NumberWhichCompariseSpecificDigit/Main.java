package NumberWhichCompariseSpecificDigit;

public class Main {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for(int start=1;start<100;start++)
		{
			String s=""+start;
			if(!s.contains("6")&&!s.contains("7")&&!s.contains("8")&&!s.contains("9")&&!s.contains("0"))
			{
			System.out.println(" "+start+" ");
			count++;
			}
			
			
			
		}
		System.out.println();
		
		System.out.println(" No Count  "+count);
		
	}

}

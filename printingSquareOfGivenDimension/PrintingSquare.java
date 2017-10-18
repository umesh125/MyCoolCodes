package printingSquareOfGivenDimension;

public class PrintingSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=0;x<10;x++)
		{
			for(int y=0;y<10;y++)
			{
				if(y==0 || y==9 || x==0 || x==9 || x==4 || y==4)
				{
					System.out.print("*");
				}
				else
				{
					
					System.out.print(" ");
				}
				
				//System.out.print("*");
				//System.out.println();
				
			}
			System.out.println();
			
			
		}
		
		
		
	}

}

package StartIndexOfStringInMat;

public class StrartingIndexOfStringInMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[][]={
				
				{'a','b','F','D','k'},{'s','r','l','o','j'},{'A','p','e','g','k'},{'o','s','A','y','n'}
				
		};
		String s="dog";
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				String t=""+a[r][c];
				
				if(s.toLowerCase().charAt(0)==t.toLowerCase().charAt(0))
				{
					System.out.print(r+"  "+c);
				}
				
			}
			
			System.out.println();
			
		}
		
		
	}

}

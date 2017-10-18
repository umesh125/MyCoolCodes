package rotatingMatrix;

public class Rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]={{10,20,30},{40,50,60},{70,80,90}
				
				};
		
		
		//System.out.println("r " +mat.length);
		
		System.out.println("c   "+mat[0].length);
		
		
		for(int r=0;r<mat.length;r++)
		{
			for(int c=0;c<mat[0].length; c++)
			{
				
				System.out.print("["+mat[r][c]+"]");
				
				
			}
			System.out.println();
			
			
			
		}
		
		/*rotateMat(mat,90);
		rotateMat(mat,180);
		rotateMat(mat,270);

		rotateMat(mat,0);*/
		PrintRotation(mat);
		
		
		}
	
	static void PrintRotation(int mat[][])
	{
		System.out.println(" Printing Rotation ");
		
		for(int r=0;r<mat.length;r++)
		{
			for(int c=0;c<mat[0].length;c++)
			{
				
				System.out.print(" "+mat[mat.length-1-c][r]+" ");
				
			}
			System.out.println();
			
			
		}
		
		
		
		
	}
	
	
	
	
	static void rotateMat(int mat[][],int angle)
	{
		int r=mat.length;
		int c=mat[0].length;
		int rMat[][]=new int[r][c];
		if(angle==90||angle==270)
		{
			
		rMat=new int[c][r];
		}
		
		
		
		int tmp[][]=mat;
		
		
		
		
		
		
		
		
		
		
		for(int rr=0;rr<rMat.length;rr++)
		{
			for(int cc=0;cc<rMat[0].length;cc++)
			{
				if(angle==90)
				{
				rMat[rr][cc]=mat[mat.length-1-cc][rr];
				}
				else if(angle==270)
				{
				rMat[rr][cc]=mat[cc][mat[0].length-1-rr];
				}
				else if(angle==180)
				{
				rMat[rr][cc]=mat[mat.length-1-rr][mat[0].length-1-cc];
				}
				else
				{
					rMat[rr][cc]=mat[rr][cc];
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		System.out.println("Matrix after Rotation :"+angle);
		
		for(int i=0;i<rMat.length;i++)
		{
			for(int j=0;j<rMat[0].length;j++)
			{
				
				System.out.print("["+rMat[i][j]+"]");
			}
			
			System.out.println();
		}
		
		
		
		}
		
		
		
		
		
		
		
		
	
	

}

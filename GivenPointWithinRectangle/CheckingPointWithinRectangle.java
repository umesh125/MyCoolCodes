package GivenPointWithinRectangle;

public class CheckingPointWithinRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		// TODO Auto-generated method stub

		//PointInsideRectangle(16,34,8,20,47,16,39,2,46,15);
		PointInsideRectangle(0,0,0,5,5,0,5,5,0,0);
		
		
	}

	static void PointInsideRectangle(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int p1,int p2)
	{
		double RecA=2*TriangleArea(x4,y4,x2,y2,x3,y3);
		System.out.println("RecA "+RecA);
		double t1A=TriangleArea(p1,p2,x1,y1,x2,y2);
		System.out.println("t1A "+t1A);
		double t2A=TriangleArea(p1,p2,x1,y1,x4,y4);
		System.out.println("t2A "+t2A);
		double t3A=TriangleArea(p1,p2,x3,y3,x4,y4);
		System.out.println("t3A "+t3A);
		double t4A=TriangleArea(p1,p2,x2,y2,x3,y3);
		System.out.println("t4A "+t4A);
		double sum=t1A+t2A+t3A+t4A;
		System.out.println("sum "+sum);
if(sum<=RecA)	
{
	
	System.out.println("Point ("+p1+","+p2+") lies inside " );
}
else
{
	System.out.println("Point ("+p1+","+p2+") lies outside " );
	
}	

		
	}
	
	
	
	
	
	static double TriangleArea(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		
		return (double) Math.abs(((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)))/2.0);
		
	}
	
}

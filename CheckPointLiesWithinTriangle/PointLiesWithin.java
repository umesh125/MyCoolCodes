package CheckPointLiesWithinTriangle;
import static java.lang.Math.*;
public class PointLiesWithin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiesWithin(0,0,0,5,5,0,2,2);
		
	}

	static void LiesWithin(int x1,int y1,int x2,int y2,int x3,int y3,int p1,int p2)
	{
		float A=area(x1,y1,x2,y2,x3,y3);
		System.out.println(A);
		float A1=area(p1,p2,x2,y2,x3,y3);
		System.out.println(A1);
		float A2=area(x1,y1,p1,p2,x3,y3);
		System.out.println(A2);
		float A3=area(x1,y1,x2,y2,p1,p2);
		System.out.println(A3);
		if((A1+A2+A3)<=A)
		{
			System.out.println("Point ("+p1+","+p2+") lies inside " );
			
		}
		else
		{
			System.out.println("Point ("+p1+","+p2+") lies outside " );
			
		}
		
		
	}
	
	static float area(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		
		return abs(((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)))/2);
	}
	
	
}

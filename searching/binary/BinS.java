package searching.binary;

public class BinS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,2,3,7,8,9,10,15,16};
int num=17;
System.out.println( num+"  found at    "+ BS(0,a.length-1,num,a));	
	}
	
	
	static int BS(int lwr,int hir,int k,int a[])
	{
		if(lwr<hir)
		{
		int mid=lwr+(hir-lwr)/2;
		if(a[mid]==k)
			return mid;
		
		if(a[mid]>k)
			return BS(lwr,mid-1,k,a);
			
		
		if(a[mid]<k)
			return BS(mid+1,hir,k,a);
		}
		return -1;
		
	}
	
}

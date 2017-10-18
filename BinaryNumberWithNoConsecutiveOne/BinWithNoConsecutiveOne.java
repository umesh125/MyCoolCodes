package BinaryNumberWithNoConsecutiveOne;

public class BinWithNoConsecutiveOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h=1231212;
		
		String s=""+h;
		
		System.out.println("String of Integer   "+s);
		
		int binary=0;
		String ones="11";
		String bin="";
	for(int dec=1;dec<15;dec++)
		{
			int i=dec;
		
		//int i=8;
			bin="";
			if(i==0)
				bin=bin+0;
			
			while(i!=0)
			{
				
				bin=(i%2)+bin;
				i=i/2;
				
				
			}
			

			
			binary=Integer.parseInt(bin);
			//System.out.println("binary Integer "+binary);
			
			if(!bin.contains(ones))
			{
				System.out.println(dec+"   "+bin);	
				
			}
			
		}		
			
			
		}
		
		
		
		
		
		
		
	}



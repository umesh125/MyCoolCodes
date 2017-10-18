package PrintingDoubleWithoutArithmeticOperation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int n=1;
		DecToBinary(5);
		DecToBinary(5<<1);
		System.out.println(5<<1);
	//	DecToBinary(n);
//		System.out.println(n<<1);
	//	System.out.println(n);
		//System.out.println(n>>1);
		//System.out.println(n<<1);
		
	}

	static void DecToBinary(int num)
	{
		if(num==0)
		{
			System.out.println("0");
			return;
		}
		
		String bin="";
		while(num!=0)
		{
			bin=(num%2)+bin;
			num=num/2;
			
			
		}
		System.out.println(bin);
		
		
	}
	
}

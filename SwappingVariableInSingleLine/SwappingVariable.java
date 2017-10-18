package SwappingVariableInSingleLine;

public class SwappingVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Swapping Variable in Single line");
/* we are using bitwise xor operation  
 * in xor if A and B are different then output is 1
 * if A and B are same then output is 0
 * 0^0->0
 * 1^1->0
 * 0^1->1
 * 1^0->1
 * 
 * 
 *  
 *  */
		int x=2; // binary 0010 
		int y=4; // binary 0100
		
		System.out.println("before Swapping a:" + x + " b:" + y);
		
		x=x^y; // x=6 and y=4
		y=x^y; // x=6 and y=2
		x=x^y; // x=4 and y=2
		System.out.println("After Swapping Swapping a:" + x + " b:" + y);
		
		
		int a = 2;
		int b = 3;
		System.out.println("a b before Swapping a:" + a + " b:" + b);
		a = a ^ b ^ (b = a);

		System.out.println("a b After Swapping a:" + a + " b:" + b);

	}

}

package LongestEvenLength;

import java.util.Arrays;

public class LongestEvenLen {
	
	/**
	 * @param args
	 * Algorithm:
	 * in loop starting from first to length -1
	 * take element and its next element and add to left sum and rigth sum 
	 * then go to prev element of first if possible and same rimes go next elemet of second
	 * process above step again and again if possible update left and rigth sum
	 * if leftsum==right sum and update answer=r-l+1
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String arg[]) {
		System.out.println("Implementing longest even length");
		FindL("1533");
	}

	static void Print2DAraay(int a[][]) {

	}

	static void FindL(String s) {
		int len = s.length();
		int ans = 0;
		System.out.println(s);
		for (int i = 0; i < len - 1; i++) {

			System.out.println("------------------------------");
			System.out.println("i :" + i);
			int l = i;
			int r = i + 1;
			System.out.println("charAt(l)==" + s.charAt(l) + " charAt(r)=="
					+ s.charAt(r));
			int lsum = 0, rsum = 0;
			while (r < len && l >= 0) {
				System.out.println("charAt(l)== "+ s.charAt(l) + " charAt(r)== "+ s.charAt(r));
				lsum += Integer.parseInt("" + s.charAt(l));
				rsum += Integer.parseInt("" + s.charAt(r));

				System.out.println("l==" + l + " r==" + r);

				System.out.println("lsum " + lsum + " rsum " + rsum);
				if (lsum == rsum) {
					System.out.println("if (lsum==rsum) l==" + l + " r==" + r);
					System.out.println("if (lsum==rsum)   lsum " + lsum
							+ " rsum " + rsum);
					ans = Math.max(ans, r - l + 1);
				}
				r++;
				l--;

			} // end of while

			System.out.println("------------------------------");

		}

		System.out.println(ans);

	}

}

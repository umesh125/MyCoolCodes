package algo.Primes;

import java.util.Arrays;

public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sieve of Eratosthenes");

		SieveEratosthenes(1, 100);

	}

	static void SieveEratosthenes(int start, int range) {
		boolean NotPrime[] = new boolean[range + 1];
		/*
		 * for(int i=0;i<Prime.length;i++) {
		 * 
		 * Prime[i]=true;
		 * 
		 * }
		 */

		for (int p = 2; p <= Math.sqrt(range) + 1; p++) {

			for (int i = p * 2; i <= range; i = i + p) {
				NotPrime[i] = true;

			}

		}

		System.out.println();
		// System.out.println(Arrays.toString(NotPrime));

		/*
		 * for(int p=2;p<=range;p++) {
		 * 
		 * if(!NotPrime[p] && !NotPrime[p+2] && (p+2)<=range) {
		 * System.out.print(" "+p+" "+(p+2)); break; } }
		 */

		for (int p = start; p <= range; p++) {
			if (!NotPrime[p])
				System.out.println(" " + p);
		}

	}

}

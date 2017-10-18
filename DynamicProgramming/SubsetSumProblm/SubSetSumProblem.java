package DynamicProgramming.SubsetSumProblm;

class SubSetSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Implementing Subset Sum Problem");
		int sum = 1;
		int s[] = { 1, 2, 3, 4 };
		System.out.println(" " + SubSum(s, sum));

	}

	static boolean SubSum(int s[], int sum) {
		int sl = s.length;
		boolean sol[][] = new boolean[sl + 1][sum + 1];
		for (int r = 0; r < sl + 1; r++) {
			sol[r][0] = true;
		}
		for (int r = 1; r < sl + 1; r++) {

			for (int c = 1; c < sum + 1; c++) {
				sol[r][c] = sol[r - 1][c]; /* Most Important Step  Copying data from top*/

				if (s[r - 1] <= c) {
					sol[r][c] = sol[r - 1][c] || sol[r - 1][c - s[r - 1]];

				}

			}

		}

		return sol[sl][sum];

	}

}

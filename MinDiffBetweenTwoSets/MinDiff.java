package MinDiffBetweenTwoSets;

public class MinDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 5,6,11,13,25,14 };
		minDiff(input);

	}

	static void minDiff(int a[]) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + a[i];
		}

		boolean sol[][] = new boolean[len + 1][sum + 1];
		for (int r = 0; r < len + 1; r++) {
			sol[r][0] = true;

		}

		for (int r = 1; r < len + 1; r++) {
			for (int c = 1; c < sum + 1; c++) {
				 sol[r][c]=sol[r-1][c]; /*Most Important Step */
				if (a[r - 1] <= c) {
					sol[r][c] = sol[r][c] || sol[r - 1][c - a[r - 1]];
				}

			}

		}

		/*
		 * for(int i=0;i<len+1;i++) { for(int j=0;j<sum+1;j++) {
		 * System.out.print(" [ "+sol[i][j]+" ]"); } System.out.println();
		 * 
		 * }
		 */
		int d = 0;
		for (int c = sum / 2; c >= 0; c--) {
			if (sol[len][c]) {

				d = sum - 2 * c;
				break;

			}
		}

		System.out.println( d);

	}

}

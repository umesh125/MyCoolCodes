package algo.general.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ajghjghgjhgjhgjhjhjnjhhnhkh";
		System.out.println(s);
		RmvDupl(s.toCharArray());

	}

	static void RmvDupl(char a[]) {
		int prv = 0;
		int next = 1;
		Arrays.sort(a);
		while (next < a.length) {
			if (a[prv] == a[next]) {
				next++;
			} else {
				// System.out.println("a[prv]==a[next]");
				a[prv + 1] = a[next];
				prv++;

			}

		}

		char tmp[] = new char[prv + 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = a[i];
		}
		// tmp=a;

		System.out.println("After Removing Duplicate: "
				+ Arrays.toString(tmp).replace("[", "").replace("]", "")
						.replace(",", "").replace(" ", ""));

	}

}

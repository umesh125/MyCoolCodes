package Top_K_OccurirgWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TopNOccuringWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String s = "user user user user the Session Session Session Session hijacking, also known as TCP session hijacking, is a method of taking over a Web user session by surreptitiously obtaining the session ID and masquerading as the authorized user. Once the user's session ID has been accessed through session prediction, the attacker can masquerade as that user and do anything the user is authorized to do on the network. The session ID is normally stored within a cookie or URL. For most communications, authenticationprocedures are carried out at set up. Session hijacking takes advantage of that practice by intruding in real time, during a session. The intrusion may or may not be detectable, depending on the user's level of technical knowledge and the nature of the attack. If a Web site does not respond in the normal or expected way to user input or stops responding altogether for an unknown reason, session hijacking is a possible cause";
		String Sa[] = s.replace(",", "").replace(".", "").split(" ");
		// System.out.println(Arrays.toString(Sa));
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set <Integer> ss=new HashSet<Integer>();
		for (int i = 0; i < Sa.length; i++) {

			String k = Sa[i].toLowerCase();

			Object val = wordMap.get(k);
			if (val == null) {
				wordMap.put(k, 1);
			} else {
				wordMap.put(k, (Integer) val + 1);

			}
			ss.add(wordMap.get(k));

		}
		

		//Collections.sort(ss);
		for (String k : wordMap.keySet()) {
			// System.out.println(k + " : " + wordMap.get(k));
			al.add(wordMap.get(k));

		}

	System.out.println("set :"+ss);
	System.out.println("list :"+al);

	//al=(ArrayList<Integer>) ss;
	
	System.out.println("list :"+al);
		Collections.sort(al);
		Collections.reverse(al);
		

		if (al.size() >= 5) {
			al.subList(5, al.size()).clear();
		}
		

		System.out.println(al);

		System.out.println();
		
		System.out.println("Top 5 Words");

		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {

				if (entry.getValue()==al.get(i) && count<5) {

					System.out.println(entry.getKey() + " : "
							+ entry.getValue());
					count++;

				}

			}

		}

	//	System.out.println("count:" + count);
	}

}

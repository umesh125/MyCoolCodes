package javaCollection;

import java.util.*;
import java.util.Map.Entry;

public class javaCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		hmap.put(5, "this is five");
		System.out.println(hmap);

		// using for loop
		for (int k : hmap.keySet()) {
			System.out.println("key :" + k + " value:" + hmap.get(k));
		}

		// using key set and for loop
		Set<Integer> ks = hmap.keySet();

		for (int k : ks) {

			System.out.println("k,v " + k + "," + hmap.get(k));

		}

		// using entry set and for loop

		for (Entry<Integer, String> es : hmap.entrySet()) {

			System.out.println("value :" + es.getValue() + "       key :"
					+ es.getKey());

		}

		// using key set and iterator
		Set<Integer> t = hmap.keySet();
		Iterator it = t.iterator();

		while (it.hasNext()) {
			int k = (Integer) it.next();
			System.out.println(" using iterator key :" + k + " Value:"
					+ hmap.get(k));
		}
		// using Entry set and iterator

		Set<Entry<Integer, String>> ent = hmap.entrySet();
		Iterator itt = ent.iterator();

		while (itt.hasNext()) {
			Entry<Integer, String> entr = (Entry<Integer, String>) itt.next();
			System.out.println(entr.getKey() + " , " + entr.getValue());

		}

	}

}

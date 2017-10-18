package SortingHashMap;

import java.util.HashMap;
import java.util.*;


public class SortingHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

       /* System.out.println("Before Sorting:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
              Map.Entry me = (Map.Entry)iterator.next();
              System.out.print(me.getKey() + ": ");
              System.out.println(me.getValue());
        }*/
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
        System.out.println("After Sorting:");
		for(int k:map.keySet())
		{
			
			System.out.println(k+" "+map.get(k));
			
		}
		
		
		 
		
		
	}

}

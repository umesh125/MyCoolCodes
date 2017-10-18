package CharWithMaximumOccurance;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class CharWithMaxOcc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="qqqqqqqqqqqqqqqqqqqqqqqqqwwwwwwwwwwwwwwwwwwwwwwwwwgggggggggggkjhgfjfffffffbbbbbbbbbjhrgbjdbjhdgfhdgfhdgjhgjdkgjhdkjghdjkghvjdhvngkdsnlfgsvfgjnfkjhdsfhuishiufhiusdfiuncuuisdhcuihiufuidshciuhdsichisdoafhishfis";
		char sa[]=s.toCharArray();
		//System.out.println(Arrays.toString(sa));
		Hashtable<Character,Integer> table=new Hashtable<Character,Integer>();
		int max=0;
		char maxOccurChar;
		for(int i=0;i<sa.length;i++)
		{
			char tmp=sa[i];
			
		Object val=table.get(tmp);
		
		if(val==null)
		{
			table.put(tmp,1);
			
		}
		else
		{
			table.put(tmp, (Integer)val+1);
			if(max<(Integer)val+1)
			{
			max=(Integer)val+1;
			
			}
			
		}
		
		
		
	}
	
		//System.out.println(table);
		//System.out.println(max);
		
	for(Map.Entry<Character,Integer> entry:table.entrySet())
	{
		
		if(max==entry.getValue())
		{
			
			System.out.println(entry.getKey());
			
		}
		
		
		
	}
		
		
		
		
		
		
	}

}

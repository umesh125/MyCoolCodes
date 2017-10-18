package by.me;

public class SR {
public static void main(String[] args)
{
	
	String s="I am Umesh Naik god";
	String r="";
	String tmp="";
	String fin="";
	
	
	for(int i=s.length()-1;i>-1;i--)
	{
		
		if(i!=0)
		{
		r=r+s.charAt(i);
		}
		else
		{
			r=r+s.charAt(i)+" ";
			
		}
		
		if(s.charAt(i)==' '|| i==0)
		{
			
			for(int j=r.length()-1;j>=0;j--)
			{
				
				fin=fin+r.charAt(j);
			}
			r="";
		}
		
		
		
	}
	
	
	System.out.println(fin);
	
	
	
}
	
	
	
}

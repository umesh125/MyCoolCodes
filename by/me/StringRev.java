package by.me;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
class StringRev
{

static String finalString = "";
 
public static void main (String[] args)throws IOException
	{
//System.out.println("Input");

String str="I am Jack Sparrow";
int len=str.length();
String temp="";
	for(int i=len-1;i>=0;i--)
		{
			//temp+=i!=0?str.charAt(i):str.charAt(i)+" ";
			
			if(i!=0)
			{
				temp=temp+str.charAt(i);
			}
			else
			{
				temp=temp+str.charAt(i)+" ";
				
			}

            //System.out.println(temp); 
			
			if(str.charAt(i)==' '|| i == 0)
			{
				for(int j=temp.length()-1; j>=0; j--)
				{
				finalString+=temp.charAt(j);
				}
				
				temp = "";
                 

			}
			
			

		}
	System.out.println(finalString);
 

}  
} 







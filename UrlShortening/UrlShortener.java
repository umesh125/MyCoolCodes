package UrlShortening;

public class UrlShortener {

	/**
	 * @param args
	 */
	static String map="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long l1=3034636232641L;
		
		
		
		String s="www.umeshnaik.com/myachievemen/college/sport";
		
		
		IdToShortUrl(l1);
		UrlToId("1ABwxfV");
	}

	static String IdToShortUrl(long id)
{

		
		
		String shorturl="";
		
		while(id>0)
		{
			
			shorturl=map.charAt((int) (id%62))+shorturl;
			
			id=id/62L;
			
		}
		//shorturl.reverse();
		
		System.out.println("shorturl:"+shorturl);
		return shorturl;
		
	}
	
	static void UrlToId(String url)
	{
		
		
		long id=0;
		
		for(int i=0,l=url.length();i<l;i++)
			
		{
			id=id*62+map.indexOf(url.charAt(i));
			
			
		}
		
		
		System.out.println(" id: "+id);
		
		
	}
	
}

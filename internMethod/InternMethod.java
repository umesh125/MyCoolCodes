package internMethod;

public class InternMethod {
	public static void main(String[] args) {

		String s11 = new String("pankaj");
		String s22 = new String("PANKAJ");
		System.out.println(s11 == s22);
		
		
		String s1 = "umesh";
		String s2 = "umesh";
		String s3 = new String("umesh");
		String s4 = new String("umesh");
		String s33 = s3.intern();
		String s44 = s4.intern();
		System.out.println(s4 == s3);// return false
		System.out.println(s1 == s2);// return true
		System.out.println(s1 == s3);// return false
		System.out.println(s1 == s3.intern());// return true
		System.out.println(s33 == s44);// return true
		System.out.println(s4.intern() == s3.intern());// return true
	}

}

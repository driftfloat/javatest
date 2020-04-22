package base.string;
/*  Author: kevin
 *	Date: 2020年4月14日
**/
public class TestEquals {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		String s4 = "ab" + "c";
		String s5 = new String("abc");
		String s6 = new String("abc");
		
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s2 == s4);
		System.out.println(s3 == s5);
		System.out.println(s6 == s5);
		
	}

}

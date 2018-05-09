package temp;

public class Test {

	public static void main(String[] args) {
		Object o = "t";
		String s = (String)o;
		o = null ;
		s = (String)o;
		System.out.println(s);
	}

}

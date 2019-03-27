package base.string;

public class TestString {

	public static void main(String[] args) {
		byte[] b = {56, 54, 54, 52, 95, 57, 56, 49, 57, 57, 95, 52, 51};
		String s = new String(b);
		System.out.println(s);
		s = new String(b);
	}

}

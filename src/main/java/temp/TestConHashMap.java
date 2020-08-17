package temp;

public class TestConHashMap {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(n>>>1);
		System.out.println(n>>>2);
		n = n - (n>>>2);
		System.out.println(n);
	}

}

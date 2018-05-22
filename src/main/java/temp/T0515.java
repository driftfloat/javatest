package temp;

public class T0515 {

	public static void main(String[] args) {
		String s = "test";
		System.out.println(String.class.getClassLoader());
		System.out.println(s.getClass().getClassLoader());
		T0515 t0515 = new T0515();
		System.out.println(T0515.class.getClassLoader());
		int i = 1;
		i = i++;
		System.out.println(i);
	}

}

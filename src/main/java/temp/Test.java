package temp;

import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Object o = "t";
		String s = (String) o;
		o = null;
		s = (String) o;
		System.out.println(s);
		OutputStreamWriter ow;
		ArrayList l;

		String[] elementData = { "", "" };
		elementData = new String[11];

		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(oldCapacity+"\t"+newCapacity);
		Class c = int.class;
		c = "".getClass();
		c = byte.class;
		for(int i=-5;i<5;i++) {
			System.out.println(i+" & 1:" + (i & 1));
//			System.out.println(System.nanoTime());
		}
	}

}

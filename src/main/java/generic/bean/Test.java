package generic.bean;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		// List<? extends Fruit> list = new ArrayList<>();
		// Pear p = new Pear();
		// Fruit f = new Fruit();
		// list.add(f);
		// list.size();

		// List<? extends Number> list = new ArrayList<>();
		// list.add(Long.valueOf(1));

		List<? super Number> list = new ArrayList<>();
		list.add(1);
		List<Integer> listb = new ArrayList<>();
		listb.add(2);
//		list = listb;
		
		List<? super Number> eList = null;
		eList = new ArrayList<>();
		eList.add(1);
		eList = new ArrayList<>();
		eList.add(2L);
	}

	public void test(List<? extends Fruit> list) {
		// list.add("");
		// list.add(new Fruit("f"));
		// list.add(new Pear("p"));
		// list.add(new Apple("a"));
	}

}

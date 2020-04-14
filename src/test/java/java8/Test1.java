package java8;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

import org.junit.Test;

/*  Author: kevin
 *	Date: 2019年12月30日
**/
public class Test1 {
	
	
	public void test1() {
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return Integer.compare(x, y);
			}
		};
		
		TreeSet<Integer> tree = new TreeSet<Integer>(com);
		tree.add(new Random().nextInt(100));
		tree.add(new Random().nextInt(100));
		tree.add(new Random().nextInt(100));
		System.out.println(tree);
	}
	
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y) ;
		TreeSet<Integer> tree = new TreeSet<Integer>(com);
		tree.add(new Random().nextInt(100));
		tree.add(new Random().nextInt(100));
		tree.add(new Random().nextInt(100));
//		System.out.println(tree);
		tree.forEach(System.out::println);
	}
	
}

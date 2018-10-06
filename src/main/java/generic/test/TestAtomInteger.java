package generic.test;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger  count = new AtomicInteger(2);
		System.out.println(count.getAndAdd(4));
		System.out.println(count.addAndGet(3));
	}

}

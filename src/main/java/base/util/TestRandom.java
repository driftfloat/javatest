package base.util;

import java.util.Random;
import java.util.stream.IntStream;

public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			System.out.println(r.ints(20000, 60000).limit(1).findFirst().getAsInt());
		}
	}

}

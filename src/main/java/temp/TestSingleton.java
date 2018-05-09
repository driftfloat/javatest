package temp;

import java.time.LocalTime;

public class TestSingleton {
	private TestSingleton() {
		System.out.println(LocalTime.now()+"\t"+ "TestSingleton()");
	}
	
	private static class Holder{
		static TestSingleton ton = new TestSingleton();
		static {
			System.out.println(LocalTime.now()+"\t"+ "static Holder");
		}
		
	}
	public static TestSingleton getInstance() {
		System.out.println(LocalTime.now()+"\t"+ "getInstance");
		return Holder.ton;
	}
	static {
		System.out.println(LocalTime.now()+"\t"+ "static TestSingleton");
	}
}


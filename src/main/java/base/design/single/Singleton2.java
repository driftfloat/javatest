package base.design.single;

public class Singleton2 {
	private static Singleton2 ton ;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance() {
		if(ton == null) {
			ton = new Singleton2();
		}
		return ton;
	}

}

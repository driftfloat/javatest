package base.design.single;

/**
 * 饿汉，两步null 捡 ，只第一次同步
 * https://www.cnblogs.com/runningwang/p/6155039.html
 */
public class Singleton4 {
	private static Singleton4 ton;
	private Singleton4() {}
	public static Singleton4 getInstance() {
		if(ton == null) {
			synchronized(Singleton4.class) {
				if(ton == null) {
					ton = new Singleton4();
				}
			}
		}
		return ton;
	}
}

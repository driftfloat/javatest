package base.design.single;

/**
 * https://www.cnblogs.com/wmmang-blog/p/3865010.html
 * 单例模式的性能优化
 */

public class Singleton3 {
	private Singleton3() {}
	private static class Holder {
		private static Singleton3 instance = new Singleton3() ;
	}
	public static Singleton3 getInstance() {
		return Holder.instance;
	}

}

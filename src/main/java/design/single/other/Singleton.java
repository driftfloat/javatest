package design.single.other;

/*
 * https://blog.csdn.net/reliveIT/article/details/52874833
 * 为什么静态内部类的单例可以实现延迟加载
 */
public class Singleton {
	// 静态内部类实现单例
	private static class Inner {
		static {
			System.out.println("单例的内部类被解析了");
		}
		// 单例对象
		private static Singleton singleton = new Singleton();
		// 类加载分为加载、链接、初始化三大步骤
		// 其中链接又分为验证、准备和解析三小个步骤
		// 类中静态的内容在编译阶段都会被编译到类构造函数<clinit>()中，在初始化步骤调用
		// 因此这个代码块的调用标志着内部类被初始化了
		
	}

	// 私有化构造函数
	private Singleton() {
		System.out.println("内部类的构造函数");
		// 判断单例对象是否已经存在，用于控制非法反射单例类的构造函数
		if (Inner.singleton != null)
			try {
				throw new IllegalAccessException("单例对象已经被实例化，请不要非法反射构造函数");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
	}
	
	static {
		System.out.println("外部类被解析了");
	}

	// 合法获取单例对象的途径
	public static Singleton getInstance() {
		System.out.println("进入getInstance()");
		return Inner.singleton;
	}
}

package base.design.single.other;

public class Test {
	public static void main(String[] args) {
		Class<Singleton> clazz = null ;
		try {
			clazz = (Class<Singleton>) Class.forName("base.design.single.other.Singleton");
//			clazz.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("外部类成功解析:"+clazz);
//		System.out.println(Singleton.getInstance());
	}
}














package base.design;

public class SingleTon {
	private static SingleTon ton = new SingleTon();
	private SingleTon() {}
	public static SingleTon getInstance() {
		return ton;
	}
	
	public static void main(String[] args) {
		System.out.println(SingleTon.getInstance());
		System.out.println(SingleTon.getInstance());
	}

}

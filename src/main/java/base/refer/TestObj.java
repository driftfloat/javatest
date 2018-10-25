package base.refer;

public class TestObj {
	public static void main(String[] args) {
		Foo foo = new Foo();
		change(foo);
		System.out.println(foo.getMsg());
	}
	public static void change(Foo foo) {
		foo.setMsg("change");
	}
}

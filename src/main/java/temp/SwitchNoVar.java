package temp;

/**
 * http://www.cnblogs.com/wuzhenbo/archive/2012/04/25/2469223.html
 * 不使用第三个变量交换两个变量的值
 * 
 * @author Administrator
 *
 */
public class SwitchNoVar {

	public static void main(String[] args) {
		int a=1, b=2;
//		method1(a, b);
//		method2(a, b);
		method3(a, b);
	}
	
	public static void method1(int a, int b) {
		System.out.println("begin:\t"+a+"\t"+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after:\t"+a+"\t"+b);
	}
	
	public static void method2(int a, int b) {
		System.out.println("begin:\t"+a+"\t"+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after:\t"+a+"\t"+b);
	}
	
	public static void method3(int a, int b) {
		System.out.println("begin:\t"+a+"\t"+b);
//		a = b + (b = a) * 0;  
//		or
		a = ( a + b ) - (b = a);
		System.out.println("after:\t"+a+"\t"+b);
	}

}

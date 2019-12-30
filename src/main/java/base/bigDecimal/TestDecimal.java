package base.bigDecimal;

import java.math.BigDecimal;

/**
 * https://blog.csdn.net/h4x0r_007/article/details/45171141
 * BigDecimal除法精确计算及坑点
 * 
 */
public class TestDecimal {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(1);
		BigDecimal b = new BigDecimal(2);
//		BigDecimal c = a + b ;
//		if (a > b) {
//			a.compareTo(b) ;
//		}
		System.out.println(a.add(b) );
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		System.out.println(BigDecimal.TEN);
		System.out.println(BigDecimal.ONE);
		System.out.println(BigDecimal.ZERO);
		
		BigDecimal num1 = new BigDecimal("1");
//		System.out.println("坑点写法2："+num1.divide(new BigDecimal("3")).setScale(2, BigDecimal.ROUND_DOWN));  
        System.out.println("正确写法：" +num1.divide(new BigDecimal("3"), 2, BigDecimal.ROUND_HALF_DOWN));  
	}
}

package base.bigDecimal;

import java.math.BigDecimal;

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
	}
}

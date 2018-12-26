package javatest.base;

import org.junit.Test;

/*  Author: kevin
 *	Date: 2018年11月22日
**/
public class TestFlower {
	@Test
	public void flower() {
		for(int i=100;i<1000;i++) {
			if(isFlower(i)) {
				System.out.println(i);
			}
		}
//		System.out.println(isFlower(153));
	}
	private static boolean isFlower(int n) {
		boolean rtn = false;
		int h = n /100 ;
		int t = n /10 % 10;
		int d = n %10 ;
		if( n == h*h*h + t*t*t + d *d *d  ) {
			rtn = true;
		}
		return rtn ;
	}
}

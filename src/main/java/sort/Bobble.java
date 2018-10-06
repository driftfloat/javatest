package sort;

import java.util.Arrays;
import java.util.Random;

public class Bobble {
	static Random random = new Random();
	static int LENGTH = 40;
	static int MAX = 400;
	static int switchCount = 0; 
	
	public static void main(String[] args) {
//		int[] a = genericNumber();
		int[] a = {85, 131, 190, 334, 303, 98, 242, 323, 259, 397, 356, 235, 274, 124, 179, 325, 12, 63, 390, 187, 368, 271, 132, 176, 47, 128, 258, 197, 335, 198, 310, 200, 219} ;
		System.out.println(Arrays.toString(a));
		long start = System.nanoTime();
		a= bobble(a);
		System.out.println(System.nanoTime() - start);
		System.out.println(Arrays.toString(a));
		System.out.println(switchCount);
	}
	
	public static int[] bobble(int[] a) {
		int tmp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					switchCount ++ ;
				}
			}
		}
		return a;
	}
	
	public static int[] genericNumber() {
		int length = random.nextInt(LENGTH);
		while(length<2) {
			length = random.nextInt(LENGTH);
		}
		int[] a = new int[length];
		for(int i=0;i<length;i++) {
			a[i] = random.nextInt(MAX);
		}
		return a;
	}

}

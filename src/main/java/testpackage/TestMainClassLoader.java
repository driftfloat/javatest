package testpackage;
/*  Author: 陈荣凯
 *	Date: 2018年4月2日
 * https://www.cnblogs.com/yejg1212/p/3270152.html
 * 关于Class.getResource和ClassLoader.getResource的路径问题
**/

public class TestMainClassLoader {
	public static void main(String[] args) {
		TestMainClassLoader t = new TestMainClassLoader();
        System.out.println(t.getClass().getClassLoader().getResource(""));
        
        System.out.println(t.getClass().getClassLoader().getResource("1.properties"));
        System.out.println(t.getClass().getClassLoader().getResource("testpackage/2.properties"));
        System.out.println(t.getClass().getClassLoader().getResource("testpackage/subpackage/3.properties"));
    }
}

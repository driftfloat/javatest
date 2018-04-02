package testpackage;
/*  Author: 陈荣凯
 *	Date: 2018年4月2日
 * https://www.cnblogs.com/yejg1212/p/3270152.html
 * 关于Class.getResource和ClassLoader.getResource的路径问题
**/
public class TestMainClass {
    public static void main(String[] args) {
    	 // 当前类(class)所在的包目录
        System.out.println(TestMainClass.class.getResource(""));
        // class path根目录
        System.out.println(TestMainClass.class.getResource("/"));
        
        // TestMain.class在<bin>/testpackage包中
        // 2.properties  在<bin>/testpackage包中
        System.out.println(TestMainClass.class.getResource("2.properties"));
        
        // TestMain.class在<bin>/testpackage包中
        // 3.properties  在<bin>/testpackage.subpackage包中
        System.out.println(TestMainClass.class.getResource("subpackage/3.properties"));
        
        // TestMain.class在<bin>/testpackage包中
        // 1.properties  在bin目录（class根目录）
        System.out.println(TestMainClass.class.getResource("/1.properties"));
    }
}

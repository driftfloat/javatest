package base.refer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过Java反射调用方法
 * https://blog.csdn.net/ichsonx/article/details/9108173
 *
 */

public class TestRef {

    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Foo foo = new Foo("这个一个Foo对象！");
        Class clazz = foo.getClass(); 
        Method m1 = clazz.getDeclaredMethod("outInfo");
        Method m2 = clazz.getDeclaredMethod("setMsg", String.class);
        Method m3 = clazz.getDeclaredMethod("getMsg");
        m1.invoke(foo); 
        m2.invoke(foo, "重新设置msg信息！"); 
        String msg = (String) m3.invoke(foo); 
        System.out.println(msg); 
    } 
} 

class Foo { 
    private String msg; 

    public Foo(String msg) { 
        this.msg = msg; 
    } 

    public void setMsg(String msg) {
        this.msg = msg; 
    } 

    public String getMsg() { 
        return msg; 
    } 

    public void outInfo() {
        System.out.println("这是测试Java反射的测试类"); 
    }
}

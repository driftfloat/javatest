package base.static1;


/*
 * https://blog.csdn.net/jiese1990/article/details/40154329
 * Java误区: 静态代码块，会在类被加载时自动执行？
*/


class MyClass1 {  
    static {//静态块  
        System.out.println("static block ");  
    }  
    
    static Class[] classArray = {  
            MyClass1.class//这样引用该类，必然需要将该类加载到虚拟机中  
    };  
    public static void main(String[] args){  
        System.out.println("hello word");  
    }  
} 

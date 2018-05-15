package base.static1;

public class Main {
	static Class[] classArray = {  
            MyClass1.class//这样引用该类，必然需要将该类加载到虚拟机中  
    };  
    public static void main(String[] args){  
        System.out.println("hello word");  
    }   
}

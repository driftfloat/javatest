package base.static1;

import java.lang.reflect.Field;
import java.util.Vector;

public class Main2 {
	public static void main(String[] args){  
        ClassLoader loader = Thread.currentThread().getContextClassLoader();  
        printClassesOfClassLoader(loader);  
        System.out.println("-------------------- hello " + MyClass1.class + " --------------------");  
        printClassesOfClassLoader(loader);  
  
    }  
      
    public static void printClassesOfClassLoader(ClassLoader loader){  
        try {  
            Field classesF = ClassLoader.class.getDeclaredField("classes");  
            classesF.setAccessible(true);  
            Vector<Class<?>> classes = (Vector<Class<?>>) classesF.get(loader);  
            for(Class c : classes) {  
                System.out.println(c);  
            }  
        } catch (NoSuchFieldException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        }  
    }  
}

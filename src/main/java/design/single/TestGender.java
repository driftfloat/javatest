package design.single;
import java.lang.reflect.Constructor;  

public class TestGender {  
    public static void main(String[] args) throws Exception {  
        Class<Gender> clazz = Gender.class;  
        @SuppressWarnings("unchecked")  
        Constructor<Gender>[] constructors = (Constructor<Gender>[]) clazz.getDeclaredConstructors();  
        for (Constructor<Gender> c : constructors)  
            System.out.println(c);  
  
        Constructor<Gender> constructor = clazz.getDeclaredConstructor(String.class, int.class);  
        constructor.setAccessible(true);  
        Gender gender = constructor.newInstance("MALE", 0);  
        System.out.println(gender);  
    }  
}  

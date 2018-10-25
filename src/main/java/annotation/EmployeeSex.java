package annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface EmployeeSex {
	enum Sex{Man,Woman}//定义性别枚举
    Sex employeeSex()  default Sex.Man;
}

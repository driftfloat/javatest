package annotation;

import java.util.Map;

// https://blog.csdn.net/qq_23901559/article/details/79116558
// 如何编写自定义注解
public class TestEmployeeRun {

	public static void main(String[] args) {
		Map fruitInfo = EmployeeInfoUtil.getEmployeeInfo(EmployeeInfo.class);
        System.out.println(fruitInfo);
	}

}

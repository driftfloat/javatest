package generic;

import java.util.ArrayList;
import java.util.List;

//https://www.cnblogs.com/coprince/p/8603492.html
//java 泛型详解-绝对是对泛型方法讲解最详细的，没有之一

public class T1 {

	public static void main(String[] args) {
		List<String> stringArrayList = new ArrayList<String>();
		List<Integer> integerArrayList = new ArrayList<Integer>();

		Class classStringArrayList = stringArrayList.getClass();
		Class classIntegerArrayList = integerArrayList.getClass();

		if(classStringArrayList.equals(classIntegerArrayList)){
//		    Log.debug("泛型测试","类型相同");
			System.out.println("类型相同");
		}
	}

}

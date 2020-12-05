package reflect;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        int size = 4;
        ArrayList<Integer> squares = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            squares.add(i * i);
        }
        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer(); // 创建一个上面定义的分析类ObjectAnalyzer的对象
        System.out.println(objectAnalyzer.toString(squares)); // 分析ArrayList<Integer>对象的实际值

        Employee employee = new Employee("小明", "18", "爱好写代码", 1, "Java攻城狮", 100); // 分析自定义类Employee的对象的实际值
        System.out.println(objectAnalyzer.toString(employee));
    }
}

package freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

/*  Author: kevin
 *	Date: 2018年12月7日
**/
public class TestFreemarker {
	static String filePath = "E:/edit/github/javatest/WebContent/WEB-INF/ftl";
	
	@Test
	public void first() throws Exception{
//		1.把freemarker的jar包添加
//		2.freemarker不依赖web容器，创建一个测试方法
//		3.创建一个Configuration
		Configuration configuration = new Configuration(Configuration.getVersion());
//		4.告诉configuration 模板文件存放的路径
		configuration.setDirectoryForTemplateLoading(new File(filePath));
//		5.设置config的默认字符集，一般是utf8
		configuration.setDefaultEncoding("utf-8");
//		6.从config对象中获得模板对象，需要指定一个模板文件的名字
		Template t = configuration.getTemplate("first.ftl");
//		7.创建模板需要的数据集，可以是一个map或者pojo，把数据方法数据集
		Map root = new HashMap();
		root.put("hello", "Hello Freemarker");
//		8.创建Writer对象，指定生成的文件保存的路径和文件名
		Writer out = new FileWriter("t:/first.html");
//		9.调用模板对象的Process方法生成静态文件，需要两个参数：数据集和writer
		t.process(root, out);
//		10.关闭writer
		out.flush();
		out.close();
	}
	
	@Test
	public void second() throws Exception{
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(filePath));
		configuration.setDefaultEncoding("utf-8");
		Template t = configuration.getTemplate("second.ftl");
		Map root = new HashMap();
		root.put("title", "Hello Freemarker");
		root.put("student", new Student(1,"zhangsan","xian"));
		Writer out = new FileWriter("t:/second.html");
		t.process(root, out);
		out.flush();
		out.close();
	}
	
	@Test
	public void list() throws Exception{
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File(filePath));
		configuration.setDefaultEncoding("utf-8");
		Template t = configuration.getTemplate("list.ftl");
		Map root = new HashMap();
		root.put("title", "list student");
//		root.put("student", new Student(1,"zhangsan","xian"));
		List<Student> stulist = new ArrayList<>();
		stulist.add(new Student(1,"zhangsan","xian"));
		stulist.add(new Student(2,"lisi","luoyang"));
		stulist.add(new Student(3,"wangwu","beijing"));
		root.put("students", stulist);
		
		Writer out = new FileWriter("t:/list-student.html");
		t.process(root, out);
		out.flush();
		out.close();
	}
}

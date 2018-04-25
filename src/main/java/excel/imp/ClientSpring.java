package excel.imp;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class ClientSpring {
	private String importFilePath;

	@Value("${importFilePath}")
	public void setImportFilePath(String importFilePath) {
		this.importFilePath = importFilePath;
	}

	public String getImportFilePath() {
		return importFilePath;
	}

//    public static void main(String[] args) throws IOException {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/conf/spring-mybatis.xml");
//		EmployeeService employeeService = (EmployeeService) context.getBean(EmployeeService.class);
//		// System.out.println(employeeService.getAllEmployee().size()); // Invalid bound
//		// statement : xml no implement
//		// System.out.println(employeeService.queryEmployeeList(new
//		// EmployeePageCondition()).size());
//		// PropertyPlaceholderConfigurer propertyPlace = (PropertyPlaceholderConfigurer)
//		// context
//		// .getBean("propertyConfigurer");
//		// System.out.println("importFile:" + filePath() );
//		ImportEmployeeProjectInfo importEmployeeProjectInfo = (ImportEmployeeProjectInfo) context
//				.getBean(ImportEmployeeProjectInfo.class);
//		System.out.println(importEmployeeProjectInfo.getImportFilePath());
//		String filePath = importEmployeeProjectInfo.getImportFilePath() ;
////		importFile(filePath);
//		test2013(filePath);
//    }
    
    public static void test2013(String filePath) throws IOException{
    	String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
        String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
        excel2010 = filePath;
        // read the 2003-2007 excel
//        List<Student> list = new ReadExcel().readExcel(excel2003_2007);
//        if (list != null) {
//            for (Student student : list) {
//                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
//            }
//        }
//        System.out.println("======================================");
        // read the 2010 excel
        
        List<Student> list1 = new ReadExcel().readExcel(excel2010);
        if (list1 != null) {
            for (Student student : list1) {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
            }
        }
    }
}

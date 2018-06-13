package spring.thread;
/*  Author: kevin
 *	Date: 2018年6月10日
**/

import javax.annotation.Resource;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Configuration
//@SpringBootApplication
@Component("taskExecutorExample")
public class TaskExecutorExample  {
	@Bean
	public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
		ThreadPoolTaskExecutor t = new ThreadPoolTaskExecutor();
		t.setCorePoolSize(10);
		t.setMaxPoolSize(50);
		t.setThreadNamePrefix("YJH2");
		return t;
	}
	
	public TaskExecutorExample() {}

	@Resource
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	private TaskExecutor taskExecutor;

	
	public TaskExecutorExample(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public void printMessages() {
		for (int i = 0; i < 25; i++) {
			taskExecutor.execute(new MessagePrinterTask("Message" + i));
		}
	}

	private class MessagePrinterTask implements Runnable {
		private String message;

		public MessagePrinterTask(String message) {
			this.message = message;
		}

		public void run() {
			System.out.println(Thread.currentThread().getName()+"\t"+message);
		}
	}

	public static void main(String[] args) {
		 ApplicationContext appContext = new
		 ClassPathXmlApplicationContext("spring/thread/thread.xml");
//		ApplicationContext appContext = new FileSystemXmlApplicationContext(
//				"E:/edit/github/spring-mvc-showcase/src/main/webapp/WEB-INF/spring/root-context.xml"
//				,"E:/edit/github/spring-mvc-showcase/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
		TaskExecutorExample te = (TaskExecutorExample) appContext.getBean("taskExecutorExample");
		te.printMessages();
		System.out.println("11111111111111111111111");
	}

}

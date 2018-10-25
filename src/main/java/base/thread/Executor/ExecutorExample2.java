package base.thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*  Author: kevin
 *	Date: 2018年6月9日
 *   Spring 3.x企业应用开发实战（高清版）.pdf  ch 13.5.1 异步任务
 *  
**/
class SimpleTask2 implements Runnable{
	private String taskName;

	public SimpleTask2(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println("do "+taskName+" in Thread:"+Thread.currentThread().getId());
	}
}
public class ExecutorExample2 {
	private ExecutorService executorService;
	
	public void setExecutorService(ExecutorService executorService) {
		this.executorService = executorService;
	}
	
	public ExecutorService getExecutorService() {
		return executorService;
	}

	public void executeTasks() {
		for(int i=0;i<6;i++) {
			executorService.execute(new SimpleTask("task"+i));
		}
	}

	public static void main(String[] args) {
		ExecutorExample2 ee = new ExecutorExample2();
		ee.setExecutorService(Executors.newCachedThreadPool());
		ee.executeTasks();
		ee.getExecutorService().shutdown();
	}
}




























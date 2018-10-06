package base.thread.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*  Author: kevin
 *	Date: 2018年6月9日
 *   Spring 3.x企业应用开发实战（高清版）.pdf  ch 13.5.1 异步任务
 *  
**/
class SimpleTask implements Runnable{
	private String taskName;

	public SimpleTask(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println("do "+taskName+" in Thread:"+Thread.currentThread().getId());
	}
}
public class ExecutorExample {
	private Executor executor;
	
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	public void executeTasks() {
		int i=0;
//		for(int i=0;i<6;i++) {
			executor.execute(new SimpleTask("task"+i));
//		}
	}

	public static void main(String[] args) {
		ExecutorExample ee = new ExecutorExample();
		ee.setExecutor(Executors.newCachedThreadPool());
		ee.executeTasks();
	}
}




























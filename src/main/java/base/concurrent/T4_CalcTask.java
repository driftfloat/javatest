package base.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CalcTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }
}

public class T4_CalcTask {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Callable<String>> taskList = new ArrayList<Callable<String>>();
		/* 往任务列表中添加5个任务 */
		for (int i = 0; i < 5; i++) {
		    taskList.add(new CalcTask());
		}
		/* 结果列表:存放任务完成返回的值 */
		List<Future<String>> resultList = new ArrayList<Future<String>>();
		try {
		    /*invokeAll批量运行所有任务, submit提交单个任务*/
		    resultList = exec.invokeAll(taskList);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		try {
		    /*从future中输出每个任务的返回值*/
		    for (Future<String> future : resultList) {
		        System.out.println(future.get());//get方法会阻塞直到结果返回
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		} catch (ExecutionException e) {
		    e.printStackTrace();
		}
	}
}

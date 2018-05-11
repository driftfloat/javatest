package base.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class T7_ExecutorService_FutureTask {

	public static void main(String[] args) {
		FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
		    @Override
		    public Integer call() throws Exception {
		        System.out.println("futureTask is wokring 1+1!");
		        TimeUnit.SECONDS.sleep(3);
		        return 2;
		    }
		});
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(futureTask);//也可以使用execute，证明其是一个Runnable类型对象
		executor.shutdown();
		while(!futureTask.isDone()){
		    System.out.println("子线程还没做完，我再睡会");
		    try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
		    System.out.println("子线程运行的结果："+futureTask.get());
		} catch (InterruptedException | ExecutionException e) {
		    e.printStackTrace();
		}
	}

}

package base.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class T5_isDone {
	public static void main(String[] args) {
		/*新建一个Callable任务*/
		Callable<Integer> callableTask = new Callable<Integer>() {
		    @Override
		    public Integer call() throws Exception {
		        System.out.println("Calculating 1+1!");
		        TimeUnit.SECONDS.sleep(4);//休眠2秒
		        return 2;
		    }
		}; 
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> result = executor.submit(callableTask);
		executor.shutdown();
		while(!result.isDone()){//isDone()方法可以查询子线程是否做完
		    System.out.println("子线程正在执行");
		    try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//休眠1秒
		}
		try {
		    System.out.println("子线程执行结果:"+result.get());
		} catch (InterruptedException | ExecutionException e) {
		    e.printStackTrace();
		}
	}
}

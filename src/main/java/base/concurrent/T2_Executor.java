package base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T2_Executor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {//5个任务
		    exec.submit(new Runnable() {
		        @Override
		        public void run() {            
		            System.out.println(Thread.currentThread().getName()+" doing task");
		         }
		     });
		}
		exec.shutdown();  //关闭线程池
	}

}

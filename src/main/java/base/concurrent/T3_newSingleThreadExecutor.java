package base.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T3_newSingleThreadExecutor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
		    exec.execute(new Runnable() {//execute方法接收Runnable对象，无返回值
		        @Override
		        public void run() {
		        	System.out.println(Thread.currentThread().getName()+" doing task");
		        }
		    });
		}
		exec.shutdown();
	}

}

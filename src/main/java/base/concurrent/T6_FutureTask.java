package base.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T6_FutureTask {

	public static void main(String[] args) {
		FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println("futureTask is wokring 1+1!");
				return 2;
			}
		});
		Thread t1 = new Thread(futureTask);// 1.可以作为Runnable类型对象使用
		t1.start();
		try {
			System.out.println(futureTask.get());// 2.可以作为Future类型对象得到线程运算返回值
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}

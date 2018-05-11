package base.concurrent;

/**
 * http://www.cnblogs.com/zhrb/p/6372799.html
 * Java多线程之Executor、ExecutorService、Executors、Callable、Future与FutureTask
 * @author Administrator
 *
 */

public class T1_Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	System.out.println(Thread.currentThread().getName()+" doing task");
		    }
		});
		t1.start();
	}

}

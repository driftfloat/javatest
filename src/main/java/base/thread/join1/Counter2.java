package base.thread.join1;

/*
 * http://www.cnblogs.com/aigongsi/archive/2012/04/01/2429166.html
 * java中volatile关键字的含义
 * add join()
 */
public class Counter2 {
	public   static int count = 0;  // volatile
	public static void inc() {
		// 这里延迟1毫秒，使得结果明显
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		count++;
	}

	public static void main(String[] args) throws Exception{
		Thread threads[]=new Thread[1000];
		// 同时启动1000个线程，去进行i++计算，看看实际结果
		for (int i = 0; i < 1000; i++) {
			 threads[i]=new Thread(new Runnable() {
				@Override
				public void run() {
					Counter2.inc();
				}
			});
			threads[i].start(); 
			threads[i].join();
		}
		// 这里每次运行的值都有可能不同,可能为1000
		System.out.println("运行结果:Counter.count=" + Counter2.count);
	}
}
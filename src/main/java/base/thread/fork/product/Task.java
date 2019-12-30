package base.thread.fork.product;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;  
  
//使用Java7提供的Fork/Join框架
//https://blog.csdn.net/zljjava/article/details/52403421

public class Task extends RecursiveAction {  
  
    private static final long serialVersionUID = 1L;  
    // These attributes will determine the block of products this task has to  
    // process.  
    private List<Product> products;  
    private int first;  
    private int last;  
    // store the increment of the price of the products  
    private double increment;  
  
    public Task(List<Product> products, int first, int last, double increment) {  
        super();  
        this.products = products;  
        this.first = first;  
        this.last = last;  
        this.increment = increment;  
    }  
  
    /** 
     * If the difference between the last and first attributes is greater than 
     * or equal to 10, create two new Task objects, one to process the first 
     * half of products and the other to process the second half and execute 
     * them in ForkJoinPool using the invokeAll() method. 
     */  
    @Override  
    protected void compute() {  
        if (last - first < 10) {  
            updatePrices();  
        } else {  
            int middle = (first + last) / 2;  
            System.out.printf("Task: Pending tasks:%s\n", getQueuedTaskCount());  
            Task t1 = new Task(products, first, middle + 1, increment);  
            Task t2 = new Task(products, middle + 1, last, increment);  
            invokeAll(t1, t2);  
        }  
    }  
  
    private void updatePrices() {  
        for (int i = first; i < last; i++) {  
            Product product = products.get(i);  
            product.setPrice(product.getPrice() * (1 + increment));  
        }  
    }  
  
    public static void main(String[] args) {  
        ProductListGenerator productListGenerator = new ProductListGenerator();  
        List<Product> products = productListGenerator.generate(10000);  
        Task task = new Task(products, 0, products.size(), 0.2);  
  
        ForkJoinPool pool = new ForkJoinPool();  
        pool.execute(task);  
  
        do {  
            System.out.printf("Main: Thread Count: %d\n",  
                    pool.getActiveThreadCount());  
            System.out.printf("Main: Thread Steal: %d\n", pool.getStealCount());  
            System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());  
            try {  
                TimeUnit.MILLISECONDS.sleep(5);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        } while (!task.isDone());  
          
        pool.shutdown();  
          
        if(task.isCompletedNormally()) {  
            System.out.printf("Main: The process has completed normally.\n");  
        }  
          
        for(Product product : products) {  
            if(product.getPrice() != 12) {  
                System.out.printf("Product %s: %f\n",product.getName(),product.getPrice());  
            }  
        }  
          
        System.out.println("Main: End of the program.\n");  
    }  
  
}  

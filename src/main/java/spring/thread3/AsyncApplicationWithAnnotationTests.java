package spring.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*  Author: kevin
 *	Date: 2018年6月11日
**/
@RunWith(SpringRunner.class)
@SpringBootTest(classes=AsyncApplicationWithAnnotation.class)
public class AsyncApplicationWithAnnotationTests {
    @Autowired
    private AsyncDemo asyncDemo;

    @Test
    public void contextLoads() throws InterruptedException, ExecutionException {
        asyncDemo.asyncInvokeSimplest();
        asyncDemo.asyncInvokeWithParameter("test");
        Future<String> future = asyncDemo.asyncInvokeReturnFuture(100);
        System.out.println(future.get());
    }
}

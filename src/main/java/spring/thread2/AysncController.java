package spring.thread2;
/*  Author: kevin
 *	Date: 2018年6月10日
**/
import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import spring.thread2.service.AysncService;

@Controller
public class AysncController {

    @Autowired
    AysncService aysncService;


    @RequestMapping("/call")
    @ResponseBody
    public Callable<String> asyncCall() {
        //借助mvcTaskExecutor在另外一个线程调用
        //此时Servlet容器线程已经释放,可以处理其他的请求
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "Async Hello World";
            }
        };
    }

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() {
        //调用aysncService的getAsyncUpdate方法
        //deferredResult被计划任务每五秒钟更新一次
        return aysncService.getAsyncUpdate();
    }

}


package webservice.hello;
/*  Author: kevin
 *	Date: 2018年11月23日
**/
/**
 * Java WebService入门实例
 * https://www.cnblogs.com/ruiati/p/6635453.html
 * 
 * Java WebService接口生成和调用 图文详解
 * https://blog.csdn.net/qazwsxpcm/article/details/70370490/
 * 
 * @author hd001
 *
 */

import webservice.hello.stub.HelloServiceService;

public class HelloClient {
	public static void main(String[] args) { 
        HelloServiceService helloServiceService = new HelloServiceService(); 
        webservice.hello.stub.HelloService helloService = helloServiceService.getHelloServicePort(); 
        System.out.println(helloService.sayHello("你好")); 
    } 
}

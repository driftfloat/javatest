package webservice.hello;
/*  Author: kevin
 *	Date: 2018年11月23日
**/
import javax.jws.WebService;  
import javax.jws.WebMethod;  
import javax.xml.ws.Endpoint;  
  
/**
 * Java WebService入门实例
 * https://www.cnblogs.com/ruiati/p/6635453.html
 * 
 * Java WebService接口生成和调用 图文详解
 * https://blog.csdn.net/qazwsxpcm/article/details/70370490/
 * 
 * 启动HelloService
 * 生成服务端在webservice.stub包下
 * wsimport -p webservice.stub -keep http://localhost:8080/helloService?wsdl
 * 
 * 在dos命令下输入 wsimport -s “src目录” -p “生成类所在包名” -keep “wsdl发布地址” 
示例：wsimport -s t:\src -p webservice.stub -keep http://localhost:8080/helloService?wsdl

 *
 */

@WebService  
public class HelloService {  
      
    @WebMethod  
    public String sayHello(String message){  
        return "Hello ," + message;  
    }  
      
    public static void main(String[] args) {  
        //create and publish an endPoint  
        HelloService hello = new HelloService();  
        Endpoint endPoint = Endpoint.publish("http://localhost:8080/helloService", hello);
        System.out.println("webservice started.");
    }  
}  

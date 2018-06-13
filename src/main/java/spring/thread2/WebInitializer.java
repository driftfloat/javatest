package spring.thread2;
/*  Author: kevin
 *	Date: 2018年6月10日
**/
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
            AnnotationConfigWebApplicationContext ctx = 
                                     new AnnotationConfigWebApplicationContext();  
            ctx.register(DemoMVCConfig.class); 
            //注册spring mvc的DispatcherServlet
            ctx.setServletContext(servletContext);    
            Dynamic servlet = 
                   servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
            servlet.addMapping("/");  
            servlet.setLoadOnStartup(1);
            servlet.setAsyncSupported(true);//此句开启

    }

}

package spring.thread2;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*  Author: kevin
 *	Date: 2018年6月10日
**/
public class DemoMVCConfig extends WebMvcConfigurerAdapter {
	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		configurer.setDefaultTimeout(30 * 1000L); // tomcat默认10秒
		configurer.setTaskExecutor(mvcTaskExecutor());// 所借助的TaskExecutor
	}

	@Bean
	public ThreadPoolTaskExecutor mvcTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setQueueCapacity(100);
		executor.setMaxPoolSize(25);
		return executor;

	}
}

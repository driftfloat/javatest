package javatest.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*  Author: kevin
 *	Date: 2018年11月5日
**/


@Configuration
@PropertySource(value= {"classpath:jdbc.properties"})
//@SpringBootApplication
//@Component
public class TestProperties {
	
	@Value("${jdbc.url}")
    private String jdbcUrl;
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	@Bean
	public TestProperties jdbc() {
		TestProperties t = new TestProperties();
		t.setJdbcUrl(jdbcUrl);
		return t;
	}

//	public static void main(String[] args) {
//		SpringApplication.run(TestProperties.class);
////		TestProperties t 
//		
//	}

}

package spring.property;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	private String password;

	public String getPassword() {
		return password;
	}
	@Value("${password}")
	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-encrypt.xml");
		Main main = context.getBean(Main.class);
		System.out.println("Decrypt password:"+main.getPassword());
	}
}

package spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

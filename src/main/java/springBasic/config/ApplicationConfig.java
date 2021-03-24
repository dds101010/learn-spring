package springBasic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springBasic.service.GreetingService;
import springBasic.service.HelloService;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

	@Value("${app.name}")
	String name;

	@Value("${app.greeting}")
	String greeting;

	@Bean
	public HelloService helloService(GreetingService greetingService) {
		System.out.println("> HelloService bean created");
		return new HelloService(greetingService, greeting, name);
	}

	@Bean
	public GreetingService greetingService () {
		System.out.println("> GreetingService bean created");
		return new GreetingService();
	}
}

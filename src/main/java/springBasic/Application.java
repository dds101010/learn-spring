package springBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springBasic.config.ApplicationConfig;
import springBasic.service.GreetingService;
import springBasic.service.HelloService;

public class Application {
	public static void main (String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloService helloService = context.getBean(HelloService.class);

		helloService.greet();
	}
}

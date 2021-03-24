package springIntermediate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springIntermediate.config.ApplicationConfig;
import springIntermediate.service.HelloService;

public class Application {
	public static void main (String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloService helloService = context.getBean(HelloService.class);

		helloService.greet();
	}
}

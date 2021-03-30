package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springAOP.config.ApplicationConfig;
import springAOP.service.HelloService;
import springAOP.service.TimerService;

public class Application {
	public static void main (String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		HelloService helloService = context.getBean(HelloService.class);
		helloService.greet();

		TimerService timerService = context.getBean(TimerService.class);
		timerService.doStressfulWork();
	}
}

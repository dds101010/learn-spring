package springIntermediate.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@Service
public class HelloService {

	public GreetingService greetingService;

	@Value("${app.greetingNew}")
	public String greeting;
	@Value("${app.name}")
	public String name;

	public HelloService (GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@PostConstruct
	public void init () {
		System.out.println("HelloService - PostConstruct");
	}

	@PreDestroy
	public void destroy () {
		System.out.println("HelloService - PreDestory");
	}

	public void greet () {
		ExecutorService service = Executors.newFixedThreadPool(4);
		IntStream.range(0, 5).forEach(index -> {
			service.submit(() -> {
				System.out.println(greetingService.generate(greeting, name + "-" + index));
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		});
		service.shutdown();
	}
}

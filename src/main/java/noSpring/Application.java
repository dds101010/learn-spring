package noSpring;

import noSpring.service.GreetingService;
import noSpring.service.HelloService;

public class Application {
	public static void main (String[] args) {
		GreetingService greetingService = new GreetingService();
		String greeting = "Hola";
		String name = "Jim";

		HelloService helloService = new HelloService(greetingService, greeting, name);

		helloService.greet();
	}
}

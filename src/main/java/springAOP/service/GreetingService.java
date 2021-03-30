package springAOP.service;

import org.springframework.stereotype.Service;
import springAOP.aspect.Loggable;

@Service
public class GreetingService {

//	@Loggable
	public String generate (String greeting, String name) {
		return greeting + ", " + name + "!";
	}
}

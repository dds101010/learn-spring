package springIntermediate.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String generate (String greeting, String name) {
		return greeting + ", " + name + "!";
	}
}

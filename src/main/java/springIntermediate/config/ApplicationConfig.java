package springIntermediate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springIntermediate.service.GreetingService;
import springIntermediate.service.HelloService;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "springIntermediate.service")
public class ApplicationConfig {
}

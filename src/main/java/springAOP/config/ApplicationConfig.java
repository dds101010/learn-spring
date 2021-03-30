package springAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"springAOP.service", "springAOP.aspect"})
//@ComponentScan(basePackages = "springAOP.*") <-- Also valid
@EnableAspectJAutoProxy
public class ApplicationConfig {
}

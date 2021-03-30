package springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("@annotation(Loggable)")
	public void pointCut() {}

	@Before("pointCut()")
	public void advice(JoinPoint joinPoint) {
		StringBuilder sb = new StringBuilder("Method call: ");
		sb.append(joinPoint.getSignature());
		if (joinPoint.getArgs() != null) {
			sb.append(", [ ");
			Arrays.asList(joinPoint.getArgs()).forEach(e -> sb.append(e).append(", "));
			sb.append("]");
		}
		System.out.println(sb.toString());
	}

	@AfterReturning(value = "pointCut()", returning = "returnValue")
	public void anotherAdvice(JoinPoint joinPoint, Object returnValue) {
		System.out.println("Method " + joinPoint.getSignature().getName() + " returned value " + returnValue);
	}
}

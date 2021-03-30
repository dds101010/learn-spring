package springAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAspect {

	@Pointcut("@annotation(Time)")
	public void pointCut() {}

	@Around(value = "pointCut()")
	public Object advice(ProceedingJoinPoint joinPoint) {
		long start = System.currentTimeMillis();
		long time = 0;
		Object returnValue = null;
		try {
			returnValue = joinPoint.proceed();
			time = System.currentTimeMillis() - start;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			time = System.currentTimeMillis() - start;
		}
		System.out.println("Time taken: " + time + "ms");
		return returnValue;
	}
}

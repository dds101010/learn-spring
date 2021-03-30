package springAOP.service;

import org.springframework.stereotype.Service;
import springAOP.aspect.Time;

import java.util.stream.IntStream;

@Service
public class TimerService {

	@Time
	public long doStressfulWork () {
		return IntStream.range(1, 10000000).filter(i -> i % 2 == 0).mapToDouble(i -> i / 3).count();
	}
}

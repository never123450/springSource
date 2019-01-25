package xwy.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LogAspect {

	private final static Logger LOG = Logger.getLogger(LogAspect.class);

	public void before(JoinPoint joinPoint) {
		LOG.info("before" + joinPoint);
	}

	public void afterReturn(JoinPoint joinPoint) {
		LOG.info("afterReturn" + joinPoint);
	}

	public void after(JoinPoint joinPoint) {
		LOG.info("after" + joinPoint);
	}

	public void afterThrow(JoinPoint joinPoint) {
		LOG.info("afterThrow" + joinPoint);
	}

}

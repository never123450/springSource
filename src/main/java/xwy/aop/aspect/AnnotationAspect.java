package xwy.aop.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


//声明这个类是被springIOC容器来管理的，如果不声明就无法做到
@Component
@Aspect//这个类被声明为是一个需要动态织入到我们的虚拟切面中
public class AnnotationAspect {

	private final static Logger LOG = Logger.getLogger(LogAspect.class);

	//声明切点
	//因为要利用反射机制去读取这个切面中的所有注解信息 
	@Pointcut("execution(*xwy.aop.service..*(..))")
	public void pointcutConfing() {
		
	}
	
	@Before("pointcutConfing()")
	public void before(JoinPoint joinPoint) {
		LOG.info("before" + joinPoint);
	}

	@AfterReturning("pointcutConfing()")
	public void afterReturn(JoinPoint joinPoint) {
		LOG.info("afterReturn" + joinPoint);
	}

	@After("pointcutConfing()")
	public void after(JoinPoint joinPoint) {
		LOG.info("after" + joinPoint);
	}

	@AfterThrowing("pointcutConfing()")
	public void afterThrow(JoinPoint joinPoint) {
		System.out.println("aspect args:"+Arrays.toString(joinPoint.getArgs()));
		System.out.println("aspect methods:"+joinPoint.getKind());
		System.out.println("aspect Signature:"+joinPoint.getSignature());
		System.out.println("aspect getTarget:"+joinPoint.getTarget());//生成代理以后的对象
		System.out.println("aspect getThis:"+joinPoint.getThis());//当前类的本身（通过反射机制去掉用）
		
		LOG.info("afterThrow" + joinPoint);
	}

}

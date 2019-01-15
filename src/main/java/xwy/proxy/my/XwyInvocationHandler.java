package xwy.proxy.my;

import java.lang.reflect.Method;

public interface XwyInvocationHandler {
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable;
}

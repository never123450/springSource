package xwy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用代理
 * @author xwy
 * 2019年01月14日21:26:06
 */
public class MeiPo implements InvocationHandler{
	
	private Person target;

	//获取被代理人的个人资料
	public Object getInstance(Person target) throws Exception{
		this.target = target;
		
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("你的性别是："+this.target.getSex());
		System.out.println("开始进行海选...");
		this.target.findLove();
		method.invoke(this.target, args);
		System.out.println("如果合适的话就准备办事");
		return null;
	}

}
